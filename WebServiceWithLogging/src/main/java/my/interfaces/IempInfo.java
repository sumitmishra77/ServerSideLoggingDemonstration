/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.interfaces;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import my.model.Employee;

/**
 *
 * @author mishr
 */

@WebService
public interface IempInfo {
    @WebMethod
    @WebResult(name="emplist")
    public List<Employee> getAllEmp();
    
    @WebMethod
    @WebResult(name="emplistAfterDelete")
    public List<Employee> deleteEmp(String id);
   
    @WebMethod
    @WebResult(name="emplistAfterSearch")
    public List<Employee> searchEmp(String id);
    
    
    
}

