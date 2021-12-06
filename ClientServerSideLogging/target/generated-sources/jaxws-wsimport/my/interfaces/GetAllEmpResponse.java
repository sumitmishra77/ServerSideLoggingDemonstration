
package my.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAllEmpResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAllEmpResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="emplist" type="{http://interfaces.my/}employee" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllEmpResponse", propOrder = {
    "emplist"
})
public class GetAllEmpResponse {

    protected List<Employee> emplist;

    /**
     * Gets the value of the emplist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emplist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmplist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Employee }
     * 
     * 
     */
    public List<Employee> getEmplist() {
        if (emplist == null) {
            emplist = new ArrayList<Employee>();
        }
        return this.emplist;
    }

}
