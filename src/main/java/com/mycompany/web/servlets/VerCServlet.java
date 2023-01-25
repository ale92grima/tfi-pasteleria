package com.mycompany.web.servlets;

import java.io.IOException;

import com.mycompany.web.models.acciones_pedido;
import com.mycompany.web.models.pedido_pastel;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/verpedido")
public class VerCServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        int id  = Integer.parseInt(req.getParameter("idpedido"));

        pedido_pastel registro = acciones_pedido.verPedido(id);

        req.setAttribute("p", registro);

        RequestDispatcher respuesta = req.getRequestDispatcher("infopedido.jsp");
        respuesta.forward(req, resp);
    }
}

