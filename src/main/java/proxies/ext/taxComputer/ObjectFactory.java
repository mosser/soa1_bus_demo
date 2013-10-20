
package proxies.ext.taxComputer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxies.ext.taxComputer package. 
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

    private final static QName _SimpleResponse_QNAME = new QName("http://external/", "simpleResponse");
    private final static QName _ComplexResponse_QNAME = new QName("http://external/", "complexResponse");
    private final static QName _SimpleTaxRequest_QNAME = new QName("http://external/", "simpleTaxRequest");
    private final static QName _Simple_QNAME = new QName("http://external/", "simple");
    private final static QName _AdvancedTaxRequest_QNAME = new QName("http://external/", "advancedTaxRequest");
    private final static QName _Complex_QNAME = new QName("http://external/", "complex");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxies.ext.taxComputer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AdvancedTaxRequest }
     * 
     */
    public AdvancedTaxRequest createAdvancedTaxRequest() {
        return new AdvancedTaxRequest();
    }

    /**
     * Create an instance of {@link Complex }
     * 
     */
    public Complex createComplex() {
        return new Complex();
    }

    /**
     * Create an instance of {@link SimpleTaxRequest }
     * 
     */
    public SimpleTaxRequest createSimpleTaxRequest() {
        return new SimpleTaxRequest();
    }

    /**
     * Create an instance of {@link Simple }
     * 
     */
    public Simple createSimple() {
        return new Simple();
    }

    /**
     * Create an instance of {@link ComplexResponse }
     * 
     */
    public ComplexResponse createComplexResponse() {
        return new ComplexResponse();
    }

    /**
     * Create an instance of {@link SimpleResponse }
     * 
     */
    public SimpleResponse createSimpleResponse() {
        return new SimpleResponse();
    }

    /**
     * Create an instance of {@link TaxComputation }
     * 
     */
    public TaxComputation createTaxComputation() {
        return new TaxComputation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://external/", name = "simpleResponse")
    public JAXBElement<SimpleResponse> createSimpleResponse(SimpleResponse value) {
        return new JAXBElement<SimpleResponse>(_SimpleResponse_QNAME, SimpleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComplexResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://external/", name = "complexResponse")
    public JAXBElement<ComplexResponse> createComplexResponse(ComplexResponse value) {
        return new JAXBElement<ComplexResponse>(_ComplexResponse_QNAME, ComplexResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleTaxRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://external/", name = "simpleTaxRequest")
    public JAXBElement<SimpleTaxRequest> createSimpleTaxRequest(SimpleTaxRequest value) {
        return new JAXBElement<SimpleTaxRequest>(_SimpleTaxRequest_QNAME, SimpleTaxRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Simple }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://external/", name = "simple")
    public JAXBElement<Simple> createSimple(Simple value) {
        return new JAXBElement<Simple>(_Simple_QNAME, Simple.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdvancedTaxRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://external/", name = "advancedTaxRequest")
    public JAXBElement<AdvancedTaxRequest> createAdvancedTaxRequest(AdvancedTaxRequest value) {
        return new JAXBElement<AdvancedTaxRequest>(_AdvancedTaxRequest_QNAME, AdvancedTaxRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Complex }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://external/", name = "complex")
    public JAXBElement<Complex> createComplex(Complex value) {
        return new JAXBElement<Complex>(_Complex_QNAME, Complex.class, null, value);
    }

}
