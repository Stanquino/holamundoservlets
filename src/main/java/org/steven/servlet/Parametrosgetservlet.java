package org.steven.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servletParametro")
public class Parametrosgetservlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Seteo el tipo de contenido que me a devolver el servidor
        resp.setContentType("text/html");
        PrintWriter out= resp.getWriter();
        String nombre = req.getParameter("saludo");

        out.print("<html>");
        out.print("<head>");
        out.print("<meta charset=\"UTF-8\">");
        out.print("HOLA " + nombre +" BIENVENIDO");
        out.print("</body>");
        out.print("</html>");
    }
}
