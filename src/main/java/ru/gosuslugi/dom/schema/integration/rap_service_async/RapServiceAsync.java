
package ru.gosuslugi.dom.schema.integration.rap_service_async;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * Асинхронный сервис работы с административными правонарушениями
 * 
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "RapServiceAsync", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/rap-service-async/", wsdlLocation = "http://localhost/")
public class RapServiceAsync
    extends Service
{

    private static final URL RAPSERVICEASYNC_WSDL_LOCATION;
    private static final WebServiceException RAPSERVICEASYNC_EXCEPTION;
    private static final QName RAPSERVICEASYNC_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/rap-service-async/", "RapServiceAsync");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost/");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RAPSERVICEASYNC_WSDL_LOCATION = url;
        RAPSERVICEASYNC_EXCEPTION = e;
    }

    public RapServiceAsync() {
        super(__getWsdlLocation(), RAPSERVICEASYNC_QNAME);
    }

    public RapServiceAsync(WebServiceFeature... features) {
        super(__getWsdlLocation(), RAPSERVICEASYNC_QNAME, features);
    }

    public RapServiceAsync(URL wsdlLocation) {
        super(wsdlLocation, RAPSERVICEASYNC_QNAME);
    }

    public RapServiceAsync(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RAPSERVICEASYNC_QNAME, features);
    }

    public RapServiceAsync(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RapServiceAsync(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RapPortAsync
     */
    @WebEndpoint(name = "RapPortAsync")
    public RapPortAsync getRapPortAsync() {
        return super.getPort(new QName("http://dom.gosuslugi.ru/schema/integration/rap-service-async/", "RapPortAsync"), RapPortAsync.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RapPortAsync
     */
    @WebEndpoint(name = "RapPortAsync")
    public RapPortAsync getRapPortAsync(WebServiceFeature... features) {
        return super.getPort(new QName("http://dom.gosuslugi.ru/schema/integration/rap-service-async/", "RapPortAsync"), RapPortAsync.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RAPSERVICEASYNC_EXCEPTION!= null) {
            throw RAPSERVICEASYNC_EXCEPTION;
        }
        return RAPSERVICEASYNC_WSDL_LOCATION;
    }

}
