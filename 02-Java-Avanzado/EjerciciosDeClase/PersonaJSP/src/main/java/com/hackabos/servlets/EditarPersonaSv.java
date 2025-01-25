
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

@WebServlet(name = "EditarPersonaSv", urlPatterns = {"/EditarPersonaSv"})
public class EditarPersonaSv extends HttpServlet {

    ControladoraLogica control = new ControladoraLogica();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Long id = Long.parseLong(request.getParameter("id_persona"));
        Persona per = control.buscarPersona(id);

        HttpSession miSesion = request.getSession();
        miSesion.setAttribute("persona_editar", per);

        response.sendRedirect("editarPersona.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //traemos los datos  modificados de la persona
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");

        //traemos la persona original sin modificar
        Persona pers = (Persona) request.getSession().getAttribute("persona_editar");

        //modificamos los datos originales con los nuevos EN MEMORIA
        pers.setNombre(nombre);
        pers.setApellido(apellido);
        pers.setTelefono(telefono);

        control.editarPersona(pers);

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
