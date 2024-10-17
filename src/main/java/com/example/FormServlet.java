package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet("/form")
public class FormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Ingresa tu nombre</h1>");
        out.println("<form action='display' method='GET'>");
        out.println("Nombre: <input type='text' name='nombre'><br>");
        out.println("<input type='submit' value='Enviar'>");
        out.println("</form>");
        out.println("</body></html>");
    }
}
