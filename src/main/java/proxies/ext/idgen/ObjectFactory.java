
package proxies.ext.idgen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxies.ext.idgen package. 
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

    private final static QName _Build_QNAME = new QName("http://external/", "build");
    private final static QName _BuildResponse_QNAME = new QName("http://external/", "buildResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxies.ext.idgen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuildResponse }
     * 
     */
    public BuildResponse createBuildResponse() {
        return new BuildResponse();
    }

    /**
     * Create an instance of {@link Build }
     * 
     */
    public Build createBuild() {
        return new Build();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Build }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://external/", name = "build")
    public JAXBElement<Build> createBuild(Build value) {
        return new JAXBElement<Build>(_Build_QNAME, Build.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://external/", name = "buildResponse")
    public JAXBElement<BuildResponse> createBuildResponse(BuildResponse value) {
        return new JAXBElement<BuildResponse>(_BuildResponse_QNAME, BuildResponse.class, null, value);
    }

}
