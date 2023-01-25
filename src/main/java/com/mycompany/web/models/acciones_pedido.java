package com.mycompany.web.models;


import java.sql.*;



public class acciones_pedido {
    // INGRESAR PEDIDO
public static int registrarPedido(pedido_pastel p){
    int estado = 0;

    try {
        Class.forName("com.mysql.jdbc.Driver"); 
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/pasteleria","root","admin123");

        String query = "INSERT INTO pedido(nombre_cliente,tipo_pastel,porciones,total) VALUES (?,?,?,?)";

        
        String cliente = p.getNombreCliente();
        String tipo = p.getTipo();
        int porcion = p.getPorciones();
        int total_pagar = p.getTotal();

        PreparedStatement pst = conexion.prepareStatement(query);
        
        pst.setString(1, cliente);
        pst.setString(2, tipo);
        pst.setInt(3, porcion);
        pst.setInt(4, total_pagar);

        estado = pst.executeUpdate();

        conexion.close();


    } catch (Exception e){
        System.out.println(e);
        System.out.println("Algo salío mal :(");
    }

    return estado;
}


//CONSULTAR PEDIDO POR ID


public static pedido_pastel verPedido (int idAConsultar){
    
    pedido_pastel pedidoADevolver = new pedido_pastel();

    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/pasteleria","root","admin123");

        String query = "SELECT * FROM pedido WHERE id_pedido=?";

        PreparedStatement pst = conexion.prepareStatement(query);
        
        pst.setInt(1, idAConsultar);

        ResultSet consultaPedido = pst.executeQuery();

        if (consultaPedido.next()){
            pedidoADevolver.setId(consultaPedido.getInt(1));
            pedidoADevolver.setNombreCliente(consultaPedido.getString(2));
            pedidoADevolver.setTipo(consultaPedido.getString(3));
            pedidoADevolver.setPorciones(consultaPedido.getInt(4));
            pedidoADevolver.setTotal(consultaPedido.getInt(5));
            conexion.close();
        }
    } catch (Exception e){
        System.out.println(e);
        System.out.println("Error!!!");
    }

    return pedidoADevolver;
}    
}