/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import my.interfaces.Employee;
import my.services.EmpInfoImplService;
import my.services.IempInfo;

/**
 *
 * @author mishr
 */
@WebServlet(name = "MySearchServlet", urlPatterns = {"/MySearchServlet"})
public class MySearchServlet extends HttpServlet {

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
       PrintWriter out = response.getWriter();
                 EmpInfoImplService info= new EmpInfoImplService ();
                 IempInfo empInfo=info.getEmpInfoImplPort();
                 List<Employee> empList=empInfo.searchEmp(request.getParameter("id"));
                 String display;
                         if(empList.isEmpty()){
                           display="No Result" ; 
                         } 
                         
                         else{
                 
                display ="<table border='1'><tr><th>EmpNo<th>Name</th><th>JobTitle</th></tr>";
             for(Employee emp: empList){
                 display+="<tr><td>"+emp.getEmpNo()+"</td><td>"+emp.getEmpName()+"</td><td>"+emp.getJobTitle()+"</td></tr>";
             }
             display+="</table> ";
                         }
             
               request.setAttribute("list",display);
                String url="/searchresult.jsp";
		RequestDispatcher rd=request.getRequestDispatcher(url);
		rd.forward(request,response);
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
