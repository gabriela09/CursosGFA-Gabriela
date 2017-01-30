/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import db.ConexionDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Autobus;
import model.Avion;
import model.Motocicleta;
import model.Vehiculo;

/**
 *
 * @author ga.gutierrez
 */
@WebServlet(name = "ServletBuscar", urlPatterns = {"/ServletBuscar"})
public class ServletBuscar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletBuscar</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletBuscar at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // processRequest(request, response);

        try {
            PrintWriter p = response.getWriter();

            ConexionDB DB = new ConexionDB();
            String tipo;
            Vehiculo vh;

            vh = DB.BuscarVehiculo(Integer.parseInt(request.getParameter("txtID")));

            p.println("<!DOCTYPE html>");
            p.println("<html>");
            p.println("<head>");
            p.println("<title>Servlet ServletBuscar</title>");
            p.println("</head>");
            p.println("<body><table><tr><td>");
            p.println(vh.imprimir(vh));

            if ("AVION".equals(vh.getTipoVehiculo())) {
                p.println("<h1><tr><td>Numero de alas :</td><td> " + ((Avion) vh).getNumeroAlas() + "</td></tr></h1>");
                p.println("<h1><tr><td>Tipo de timon:</td><td> " + ((Avion) vh).getTipoTimon() + "</td></tr></h1>");
            } else if ("MOTOCICLETA".equals(vh.getTipoVehiculo())) {
                p.println("<h1><tr><td>Numero de parillas :</td><td> " + ((Motocicleta) vh).getNum_Parillas() + "</td></tr></h1>");
            }

            p.println("</body>");
            p.println("</html>");

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
