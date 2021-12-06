/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.services;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.HandlerChain;
import javax.jws.WebService;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import my.model.Employee;
import my.model.EmployeeXML;
import my.model.HrInfo;

/**
 *
 * @author mishr
 */
@WebService(endpointInterface="my.interfaces.IempInfo")
@HandlerChain(file = "EmpInfoImplService_handler.xml")
public class EmpInfoImpl {
    
      
    
    public List<Employee> getAllEmp(){
        List<Employee> empInfo= new ArrayList<>();
        
        try {
                                   
            Connection con=getConnection();
            Statement stmt= con.createStatement();
            String query="Select * from emp";
            System.out.println("******************************************************");
            ResultSet rs= stmt.executeQuery(query);
            while(rs.next()){
                String empno=rs.getString("Empno");
                  String ename=rs.getString("Ename");
                  String job=rs.getString("Job");
                 empInfo.add(new Employee(empno,ename,job));
            }
            rs.close();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EmpInfoImpl.class.getName()).log(Level.SEVERE, null, ex);
          
            
        }
        
        
          writeToXML("getAllEmp","null",empInfo) ; 
        
        
        
        
        return empInfo;
    }
    
    
    
     public List<Employee> deleteEmp(String id){
         
        List<Employee> empInfo= new ArrayList<>();
        
        try {
                                   
            Connection con=getConnection();
            Statement stmt= con.createStatement();
            
           
            System.out.println("******************************************************");
            
             
            String query="Select * from emp where Empno="+id;
            ResultSet rs= stmt.executeQuery(query); 
            while(rs.next()){
                String empno=rs.getString("Empno");
                 String ename=rs.getString("Ename");
                 String job=rs.getString("Job");
                 empInfo.add(new Employee(empno,ename,job));
            }
            rs.close();
             query= "delete from emp where Empno="+id;
             int rows=stmt.executeUpdate(query);
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EmpInfoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        writeToXML("deleteEmp",id,empInfo) ; 
        
        return empInfo;
     }
     
     
     public List<Employee> searchEmp(String id){
         
          
        List<Employee> empInfo= new ArrayList<>();
        
        try {
                                   
            Connection con=getConnection();
            Statement stmt= con.createStatement();
           
           
            System.out.println("******************************************************");
                       
            String  query="Select * from emp where Empno="+id;
            ResultSet rs= stmt.executeQuery(query); 
            while(rs.next()){
                String empno=rs.getString("Empno");
                 String ename=rs.getString("Ename");
                 String job=rs.getString("Job");
                 empInfo.add(new Employee(empno,ename,job));
            }
            rs.close();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EmpInfoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        writeToXML("searchEmp",id,empInfo) ; 
        return empInfo;
         
     }
    
    private Connection getConnection(){                     
        
        Connection con=null;
        System.out.println("Before loading Driver");
        try {
           Class.forName("com.mysql.cj.jdbc.Driver"); 
            String db_URL,db_Username,db_Password;
            db_URL="jdbc:mysql://localhost:3306/mar4?zeroDateTimeBehavior=CONVERT_TO_NULL&useSSL=false";
            db_Username="root";
            db_Password="1234";
            con=DriverManager.getConnection(db_URL,db_Username,db_Password);
        } catch (SQLException |ClassNotFoundException ex) {
            Logger.getLogger(EmpInfoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
            return con;
    }
    
    
    private void writeToXML(String name,String param,List<Employee> list){
        
                HrInfo hrInfo= new HrInfo();
                List<EmployeeXML> empListXML= new ArrayList<>();
                  for(Employee emp: list){
                      empListXML.add(new EmployeeXML(emp.getEmpNo(),emp.getEmpName(),emp.getJobTitle()) );
                  }  
                  hrInfo.setEmployee(empListXML);
                  hrInfo.setMethodName(name);
                  hrInfo.setParameter(param);
                  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd--HH-mm-ss");
                     String stamp=   dtf.format( LocalDateTime.now())+"_.xml";
                
                         
                         try{
            JAXBContext context = JAXBContext.newInstance(HrInfo.class);
            Marshaller marshaller = context.createMarshaller();
             String file="C:\\Users\\mishr\\Documents\\Humber\\semester-4\\Enterprise_App\\Week-4\\ServerSideLogging\\WebServiceWithLogging\\src\\test"+stamp;
             
            marshaller.marshal(hrInfo, new FileOutputStream(file));
            // marshaller.marshal(hrInfo, System.out);
        
        
               
        } catch (JAXBException |FileNotFoundException ex) {                 
            Logger.getLogger(EmpInfoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

}
    
}

