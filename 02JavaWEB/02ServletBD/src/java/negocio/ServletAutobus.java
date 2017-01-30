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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Autobus;

/**
 *
 * @author ga.gutierrez
 */
@WebServlet(name = "ServletAutobus", urlPatterns = {"/ServletAutobus"})
public class ServletAutobus extends HttpServlet {

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
            out.println("<title>Servlet ServletAutobus</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletAutobus at " + request.getContextPath() + "</h1>");
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
        
        
        
        try {
            PrintWriter p = response.getWriter();
                   p.println("<h1>Servlet ServletAutobus 1 </h1>");
            ConexionDB DB  =   new ConexionDB();
                   p.println("<h1>Servlet ServletAutobus 2  </h1>");
            
            
            List<Autobus> lista = DB.getAutobuses();
         
            
             p.println("<h1>Servlet ServletAutobus at </h1>");
            
            lista.forEach(autobus ->p.print(autobus));
          
        
            
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
     
        
       Autobus bus = new Autobus();
       
       bus.setNum_autobus(Integer.parseInt(request.getParameter("txtID")));
       bus.setSiglas(request.getParameter("txtSiglas"));
       bus.setModelo(Integer.parseInt(request.getParameter("txtModelo")));
       bus.setCapacidad(Integer.parseInt(request.getParameter("txtCapacidad")));
       bus.setBase(request.getParameter("txtBase"));
    
       ConexionDB c = new ConexionDB();
        try {
            if (c.registraAutobus(bus)){
               response.sendRedirect("/02ServletBD/sucess.html");
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       
        
       // doGet(request, response);
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
