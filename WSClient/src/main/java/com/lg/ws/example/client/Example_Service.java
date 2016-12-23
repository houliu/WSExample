
package com.lg.ws.example.client;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Example", targetNamespace = "http://www.wslg.com/wstest", wsdlLocation = "http://localhost:8080/hello?wsdl")
public class Example_Service
    extends Service
{

    private final static URL EXAMPLE_WSDL_LOCATION;
    private final static WebServiceException EXAMPLE_EXCEPTION;
    private final static QName EXAMPLE_QNAME = new QName("http://www.wslg.com/wstest", "Example");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/hello?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EXAMPLE_WSDL_LOCATION = url;
        EXAMPLE_EXCEPTION = e;
    }

    public Example_Service() {
        super(__getWsdlLocation(), EXAMPLE_QNAME);
    }

    public Example_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), EXAMPLE_QNAME, features);
    }

    public Example_Service(URL wsdlLocation) {
        super(wsdlLocation, EXAMPLE_QNAME);
    }

    public Example_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EXAMPLE_QNAME, features);
    }

    public Example_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Example_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Example
     */
    @WebEndpoint(name = "ExamplePort")
    public Example getExamplePort() {
        return super.getPort(new QName("http://www.wslg.com/wstest", "ExamplePort"), Example.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Example
     */
    @WebEndpoint(name = "ExamplePort")
    public Example getExamplePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.wslg.com/wstest", "ExamplePort"), Example.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EXAMPLE_EXCEPTION!= null) {
            throw EXAMPLE_EXCEPTION;
        }
        return EXAMPLE_WSDL_LOCATION;
    }

}
