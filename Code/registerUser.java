/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package migratedSystem.login;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import migratedSystem.json.JSONObject;
import originalSystem.GPC.Login.GestioneUtente;

/**
 *
 * @author johneisenheim
 */
public class registerUser extends HttpServlet {

    private final JSONObject message = new JSONObject();
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
            throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        String name = request.getParameter("nome");
        String surname = request.getParameter("cognome");
        String telephone = request.getParameter("telefono");
        String address = request.getParameter("indirizzo");
        String type = request.getParameter("tipologia");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        GestioneUtente handleuser = new GestioneUtente();
        try {
            int callResult = handleuser.registerUser(name, surname, address, telephone, password, username, type);
            if( callResult == 0){
                message.put("status", 0);
                message.put("message", "Error!");
                response.getWriter().write(message.toString());
            }else if(callResult == 1){
                message.put("status", 1);
                message.put("message", "User authenticated!");
                response.getWriter().write(message.toString());
            }else{
                message.put("status", 1);
                message.put("message", callResult);
                response.getWriter().write(message.toString());
            }
        } catch (SQLException ex) {
            message.put("status", 0);
            message.put("message", ex.toString());
            response.getWriter().write(message.toString());
        } catch (ClassNotFoundException ex) {
            message.put("status", 0);
            message.put("message", ex.toString());
            response.getWriter().write(message.toString());
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
