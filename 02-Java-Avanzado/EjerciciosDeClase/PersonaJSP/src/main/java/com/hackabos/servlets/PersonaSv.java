
package com.hackabos.servlets;

import com.hackaboss.logica.ControladoraLogica;
import com.hackaboss.logica.Persona;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "PersonaSv", urlPatterns = {"/PersonaSv"})
public class PersonaSv extends HttpServlet {
    
    ControladoraLogica control = new ControladoraLogica();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String busquedaApellido = request.getParameter("busquedaApellido");
        
        List<Persona> listaPersonas = control.buscarPorApellido(busquedaApellido);
        HttpSession miSesion = request.getSession();
        miSesion.setAttribute("listaPersonas", listaPersonas);
        
        response.sendRedirect("index.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        
        control.crearPersona(nombre, apellido, telefono);
        
        //cuando termina el alta nos redirige de nuevo a index
        response.sendRedirect("index.jsp");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
