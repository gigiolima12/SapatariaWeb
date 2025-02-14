package com.sapataria.web;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SapatariaServlet") // URL do Servlet
public class SapatariaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public SapatariaServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Bem-vindo à Sapataria Zaz Traz!</h2>");
        out.println("<form action='SapatariaServlet' method='POST'>");
        out.println("Digite seu nome: <input type='text' name='nome' />");
        out.println("<input type='submit' value='Enviar' />");
        out.println("</form>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String nome = request.getParameter("nome"); // Captura o nome enviado pelo usuário

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Olá, " + nome + "! Bem-vindo à Sapataria Zaz Traz.</h2>");
        out.println("</body></html>");
    }
}
