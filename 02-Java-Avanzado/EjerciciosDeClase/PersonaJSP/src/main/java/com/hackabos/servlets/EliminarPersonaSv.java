
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


@WebServlet(name = "EliminarPersonaSv", urlPatterns = {"/EliminarPersonaSv"})
public class EliminarPersonaSv extends HttpServlet {

    ControladoraLogica control = new ControladoraLogica();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Long id = Long.parseLong(request.getParameter("id_persona"));
        //buscar a la persona en la bd por la id

        Persona persona = control.buscarPersona(id);
        String apellido = persona.getApellido();
        control.eliminarPersona(id);

        //un get para traer su apellido        
        List<Persona> listaPersonas = control.buscarPorApellido(apellido);
        HttpSession miSesion = request.getSession();
        miSesion.setAttribute("listaPersonas", listaPersonas);

        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
