/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.model;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author mishr
 */
@XmlRootElement(name="employee")
@XmlType(propOrder={"empNo","empName","jobTitle"})

public class EmployeeXML {
    private String empNo;
    private String empName;
    private String jobTitle;
   

    public EmployeeXML(){
        
    }


    public EmployeeXML(String empNo, String empName, String jobTitle) {
        this.empNo = empNo;
        this.empName = empName;
        this.jobTitle = jobTitle;
     
    }
    
    
    

    /**
     * @return the empNo
     */
    @XmlElement(name = "ID")
    public String getEmpNo() {
        return empNo;
    }

    /**
     * @param empNo the empNo to set
     */
    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    /**
     * @return the empName
     */
     @XmlElement(name="name")
    public String getEmpName() {
        return empName;
    }

    /**
     * @param empName the empName to set
     */
     
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    /**
     * @return the jobTitle
     */
    @XmlElement(name="title")
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * @param jobTitle the jobTitle to set
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "EmployeeXML{" + "empNo=" + empNo + ", empName=" + empName + ", jobTitle=" + jobTitle + '}';
    }
    
    
    
    }
  