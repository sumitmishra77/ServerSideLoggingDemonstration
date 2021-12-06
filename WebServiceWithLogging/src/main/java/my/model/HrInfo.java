/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.model;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author mishr
 */
@XmlRootElement(name="webserviceRequest")
@XmlType(propOrder={"methodName","parameter","employee"})
public class HrInfo {
  //  
    
    
     private List<EmployeeXML> employee;
    
    private String methodName;
   
    private String parameter;
    
   
    
   

    /**
     * @return the methodName
     */
     @XmlElement(name="method")
    public String getMethodName() {
        return methodName;
    }

    /**
     * @param methodName the methodName to set
     */
    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    /**
     * @return the parameter
     */
     @XmlElement(name="parameter")
    public String getParameter() {
        return parameter;
    }

    /**
     * @param parameter the parameter to set
     */
    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    /**
     * @return the employee
     */
    @XmlElementWrapper(name="response")
    @XmlElement(name="employee")
    public List<EmployeeXML> getEmployee() {
        return employee;
    }

    /**
     * @param employee the employee to set
     */
    public void setEmployee(List<EmployeeXML> employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "HrInfo{" + "methodName=" + methodName + ", parameter=" + parameter + ", employee=" + employee + '}';
    }

    
    

   
    
    
}

