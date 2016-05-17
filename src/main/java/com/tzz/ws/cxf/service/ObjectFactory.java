
package com.tzz.ws.cxf.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tzz.ws.cxf.service package. 
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

    private final static QName _FindAllOrders_QNAME = new QName("http://service.cxf.ws.tzz.com/", "findAllOrders");
    private final static QName _FindAllOrdersResponse_QNAME = new QName("http://service.cxf.ws.tzz.com/", "findAllOrdersResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tzz.ws.cxf.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindAllOrders }
     * 
     */
    public FindAllOrders createFindAllOrders() {
        return new FindAllOrders();
    }

    /**
     * Create an instance of {@link FindAllOrdersResponse }
     * 
     */
    public FindAllOrdersResponse createFindAllOrdersResponse() {
        return new FindAllOrdersResponse();
    }

    /**
     * Create an instance of {@link Orders }
     * 
     */
    public Orders createOrders() {
        return new Orders();
    }

    /**
     * Create an instance of {@link OrderType }
     * 
     */
    public OrderType createOrderType() {
        return new OrderType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllOrders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxf.ws.tzz.com/", name = "findAllOrders")
    public JAXBElement<FindAllOrders> createFindAllOrders(FindAllOrders value) {
        return new JAXBElement<FindAllOrders>(_FindAllOrders_QNAME, FindAllOrders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxf.ws.tzz.com/", name = "findAllOrdersResponse")
    public JAXBElement<FindAllOrdersResponse> createFindAllOrdersResponse(FindAllOrdersResponse value) {
        return new JAXBElement<FindAllOrdersResponse>(_FindAllOrdersResponse_QNAME, FindAllOrdersResponse.class, null, value);
    }

}
