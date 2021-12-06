
package my.interfaces;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the my.interfaces package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeleteEmp_QNAME = new QName("http://interfaces.my/", "deleteEmp");
    private final static QName _DeleteEmpResponse_QNAME = new QName("http://interfaces.my/", "deleteEmpResponse");
    private final static QName _SearchEmpResponse_QNAME = new QName("http://interfaces.my/", "searchEmpResponse");
    private final static QName _GetAllEmpResponse_QNAME = new QName("http://interfaces.my/", "getAllEmpResponse");
    private final static QName _GetAllEmp_QNAME = new QName("http://interfaces.my/", "getAllEmp");
    private final static QName _SearchEmp_QNAME = new QName("http://interfaces.my/", "searchEmp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: my.interfaces
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteEmp }
     * 
     */
    public DeleteEmp createDeleteEmp() {
        return new DeleteEmp();
    }

    /**
     * Create an instance of {@link SearchEmpResponse }
     * 
     */
    public SearchEmpResponse createSearchEmpResponse() {
        return new SearchEmpResponse();
    }

    /**
     * Create an instance of {@link DeleteEmpResponse }
     * 
     */
    public DeleteEmpResponse createDeleteEmpResponse() {
        return new DeleteEmpResponse();
    }

    /**
     * Create an instance of {@link GetAllEmpResponse }
     * 
     */
    public GetAllEmpResponse createGetAllEmpResponse() {
        return new GetAllEmpResponse();
    }

    /**
     * Create an instance of {@link GetAllEmp }
     * 
     */
    public GetAllEmp createGetAllEmp() {
        return new GetAllEmp();
    }

    /**
     * Create an instance of {@link SearchEmp }
     * 
     */
    public SearchEmp createSearchEmp() {
        return new SearchEmp();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "deleteEmp")
    public JAXBElement<DeleteEmp> createDeleteEmp(DeleteEmp value) {
        return new JAXBElement<DeleteEmp>(_DeleteEmp_QNAME, DeleteEmp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "deleteEmpResponse")
    public JAXBElement<DeleteEmpResponse> createDeleteEmpResponse(DeleteEmpResponse value) {
        return new JAXBElement<DeleteEmpResponse>(_DeleteEmpResponse_QNAME, DeleteEmpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchEmpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "searchEmpResponse")
    public JAXBElement<SearchEmpResponse> createSearchEmpResponse(SearchEmpResponse value) {
        return new JAXBElement<SearchEmpResponse>(_SearchEmpResponse_QNAME, SearchEmpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEmpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "getAllEmpResponse")
    public JAXBElement<GetAllEmpResponse> createGetAllEmpResponse(GetAllEmpResponse value) {
        return new JAXBElement<GetAllEmpResponse>(_GetAllEmpResponse_QNAME, GetAllEmpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEmp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "getAllEmp")
    public JAXBElement<GetAllEmp> createGetAllEmp(GetAllEmp value) {
        return new JAXBElement<GetAllEmp>(_GetAllEmp_QNAME, GetAllEmp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchEmp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "searchEmp")
    public JAXBElement<SearchEmp> createSearchEmp(SearchEmp value) {
        return new JAXBElement<SearchEmp>(_SearchEmp_QNAME, SearchEmp.class, null, value);
    }

}
