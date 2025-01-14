
package ru.gosuslugi.dom.schema.integration.rvuo_service_async;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "RvuoServiceAsync", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/rvuo-service-async/", wsdlLocation = "http://localhost/")
public class RvuoServiceAsync
    extends Service
{

    private static final URL RVUOSERVICEASYNC_WSDL_LOCATION;
    private static final WebServiceException RVUOSERVICEASYNC_EXCEPTION;
    private static final QName RVUOSERVICEASYNC_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/rvuo-service-async/", "RvuoServiceAsync");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost/");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RVUOSERVICEASYNC_WSDL_LOCATION = url;
        RVUOSERVICEASYNC_EXCEPTION = e;
    }

    public RvuoServiceAsync() {
        super(__getWsdlLocation(), RVUOSERVICEASYNC_QNAME);
    }

    public RvuoServiceAsync(WebServiceFeature... features) {
        super(__getWsdlLocation(), RVUOSERVICEASYNC_QNAME, features);
    }

    public RvuoServiceAsync(URL wsdlLocation) {
        super(wsdlLocation, RVUOSERVICEASYNC_QNAME);
    }

    public RvuoServiceAsync(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RVUOSERVICEASYNC_QNAME, features);
    }

    public RvuoServiceAsync(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RvuoServiceAsync(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RvuoPortsTypeAsync
     */
    @WebEndpoint(name = "RvuoPortAsync")
    public RvuoPortsTypeAsync getRvuoPortAsync() {
        return super.getPort(new QName("http://dom.gosuslugi.ru/schema/integration/rvuo-service-async/", "RvuoPortAsync"), RvuoPortsTypeAsync.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RvuoPortsTypeAsync
     */
    @WebEndpoint(name = "RvuoPortAsync")
    public RvuoPortsTypeAsync getRvuoPortAsync(WebServiceFeature... features) {
        return super.getPort(new QName("http://dom.gosuslugi.ru/schema/integration/rvuo-service-async/", "RvuoPortAsync"), RvuoPortsTypeAsync.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RVUOSERVICEASYNC_EXCEPTION!= null) {
            throw RVUOSERVICEASYNC_EXCEPTION;
        }
        return RVUOSERVICEASYNC_WSDL_LOCATION;
    }

}
