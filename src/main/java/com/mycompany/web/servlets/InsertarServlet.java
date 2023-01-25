package com.mycompany.web.servlets;

import java.io.IOException;


import com.mycompany.web.models.acciones_pedido;
import com.mycompany.web.models.pedido_pastel;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/nuevopedido")
public class InsertarServlet extends HttpServlet {
   
    @Override

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        String n, t;
        int porc,tot;
     

        n = req.getParameter("cliente");
        t= req.getParameter("tipo");
        porc = Integer.parseInt(req.getParameter("porcion"));
        tot = Integer.parseInt(req.getParameter("total_pagar"));
        

        pedido_pastel nuevoPedido = new pedido_pastel();
     
        nuevoPedido.setNombreCliente(n);
        nuevoPedido.setTipo(t);
        nuevoPedido.setPorciones(porc);
        nuevoPedido.setTotal(tot);

        int estado = acciones_pedido.registrarPedido(nuevoPedido);

        if(estado == 1){
            resp.sendRedirect("exito.jsp");
        }else {
            resp.sendRedirect("error.jsp");
        }
    }

}
 