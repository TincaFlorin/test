package com.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet simplu pentru testarea compilării și deployment-ului Jenkins.
 * Afișează un mesaj "Hello Jenkins!" pe interfața web la URL-ul /hello.
 */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
    
    // ID de serializare, necesar pentru Servlet
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Setează tipul de conținut al răspunsului la HTML
        response.setContentType("text/html");
        
        // Scrie conținutul HTML (interfața web)
        response.getWriter().println("<!DOCTYPE html>");
        response.getWriter().println("<html>");
        response.getWriter().println("<head><title>Jenkins Test</title></head>");
        response.getWriter().println("<body style='font-family: Arial; text-align: center; margin-top: 50px;'>");
        response.getWriter().println("<h1 style='color: #2c3e50;'>✅ Jenkins Build Successful!</h1>");
        response.getWriter().println("<h2 style='color: #3498db;'>Hello from the compiled Java Web Interface!</h2>");
        response.getWriter().println("<p>This confirms compilation, packaging, and deployment are working.</p>");
        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }
}
