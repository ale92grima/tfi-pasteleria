package com.mycompany.web.models;
import java.io.Serializable;

public class pedido_pastel implements Serializable{
   
    private int id,porciones,total;
    private String nombre_cliente,tipo_pastel;

    //metodo constructor

        public pedido_pastel(){

        }
    //metodos get y set id
    
        public int getId(){
            return id;
        }
        public void setId(int nuevoId){
            this.id = nuevoId;
        }
    //metodos get y set cliente
        public String getNombreCliente(){
            return nombre_cliente;
        }
        public void setNombreCliente(String nuevoCliente){
            this.nombre_cliente = nuevoCliente;
        }
     //metodos get y set tipo pastel
        public String getTipo(){
            return tipo_pastel;
        }
        public void setTipo(String nuevoTipo){
            this.tipo_pastel = nuevoTipo;
        }
    //metodos get y set porciones
      public int getPorciones(){
        return porciones;
      }
      public void setPorciones(int nuevasPorciones){
        this.porciones = nuevasPorciones;
      }
      
    //metodos get y set total
       public int getTotal(){
        return total;
       }
        public void setTotal(int nuevoTotal){
        this.total = nuevoTotal;
       }
}
