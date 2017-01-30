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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Avion;
import model.automovil;

/**
 *
 * @author ga.gutierrez
 */
@WebServlet(name = "ServetVehiculo", urlPatterns = {"/ServetVehiculo"})
public class ServetVehiculo extends HttpServlet {

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
            out.println("<title>Servlet ServetVehiculo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServetVehiculo at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
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
        
        String tipo1  = request.getParameter("tipoVehiculo");
        int tipo=1;
        
         switch (tipo) {
                case 1:
                     Avion avi = new Avion(Integer.parseInt(request.getParameter("txtCapacidadGas")), 
                                            Integer.parseInt(request.getParameter("txtAsientos")),
                                            Integer.parseInt(request.getParameter("txtLlantas")), 
                                            Integer.parseInt(request.getParameter("txtID")), 
                                            request.getParameter("tipoVehiculo"), 
                                            Integer.parseInt(request.getParameter("txtNumAlas")),
                                            request.getParameter("txtTimon"));
                          
                     ConexionDB c = new ConexionDB();
      
        {
            try {
                if (c.ArmaCad(avi, 1)){
                    
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ServetVehiculo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ServetVehiculo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
               
//                     automovil a = new automovil(Integer.parseInt(request.getParameter("txtCapacidadGas")),
//                                                 Integer.parseInt(request.getParameter("txtAsientos")), 
//                                                 Integer.parseInt(request.getParameter("txtLlantas")), 
//                                                 Integer.parseInt(request.getParameter("txtID")),
//                                                 Integer.parseInt(request.getParameter("txtID")) ,
//                                                 Integer.parseInt(request.getParameter("txtID")), 
//                                                  request.getParameter(""));
// 
                break;        
         }
         
         
        
        
        
        
        
        
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
