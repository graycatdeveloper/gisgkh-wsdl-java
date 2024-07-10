
package ru.gosuslugi.dom.schema.integration.appeals_service_async;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * Сервис управления обращениями
 * 
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "AppealsServiceAsync", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/appeals-service-async", wsdlLocation = "http://localhost/")
public class AppealsServiceAsync
    extends Service
{

    private static final URL APPEALSSERVICEASYNC_WSDL_LOCATION;
    private static final WebServiceException APPEALSSERVICEASYNC_EXCEPTION;
    private static final QName APPEALSSERVICEASYNC_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/appeals-service-async", "AppealsServiceAsync");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost/");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        APPEALSSERVICEASYNC_WSDL_LOCATION = url;
        APPEALSSERVICEASYNC_EXCEPTION = e;
    }

    public AppealsServiceAsync() {
        super(__getWsdlLocation(), APPEALSSERVICEASYNC_QNAME);
    }

    public AppealsServiceAsync(WebServiceFeature... features) {
        super(__getWsdlLocation(), APPEALSSERVICEASYNC_QNAME, features);
    }

    public AppealsServiceAsync(URL wsdlLocation) {
        super(wsdlLocation, APPEALSSERVICEASYNC_QNAME);
    }

    public AppealsServiceAsync(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, APPEALSSERVICEASYNC_QNAME, features);
    }

    public AppealsServiceAsync(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AppealsServiceAsync(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AppealsAsyncPort
     */
    @WebEndpoint(name = "AppealsAsyncPort")
    public AppealsAsyncPort getAppealsAsyncPort() {
        return super.getPort(new QName("http://dom.gosuslugi.ru/schema/integration/appeals-service-async", "AppealsAsyncPort"), AppealsAsyncPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AppealsAsyncPort
     */
    @WebEndpoint(name = "AppealsAsyncPort")
    public AppealsAsyncPort getAppealsAsyncPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://dom.gosuslugi.ru/schema/integration/appeals-service-async", "AppealsAsyncPort"), AppealsAsyncPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (APPEALSSERVICEASYNC_EXCEPTION!= null) {
            throw APPEALSSERVICEASYNC_EXCEPTION;
        }
        return APPEALSSERVICEASYNC_WSDL_LOCATION;
    }

}
