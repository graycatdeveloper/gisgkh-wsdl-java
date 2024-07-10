
package ru.gosuslugi.dom.schema.integration.device_metering_service_async;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * Асинхронный сервис управления приборами учета и передачей показаний
 * 
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "DeviceMeteringServiceAsync", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/device-metering-service-async/", wsdlLocation = "http://localhost/")
public class DeviceMeteringServiceAsync
    extends Service
{

    private static final URL DEVICEMETERINGSERVICEASYNC_WSDL_LOCATION;
    private static final WebServiceException DEVICEMETERINGSERVICEASYNC_EXCEPTION;
    private static final QName DEVICEMETERINGSERVICEASYNC_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/device-metering-service-async/", "DeviceMeteringServiceAsync");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost/");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DEVICEMETERINGSERVICEASYNC_WSDL_LOCATION = url;
        DEVICEMETERINGSERVICEASYNC_EXCEPTION = e;
    }

    public DeviceMeteringServiceAsync() {
        super(__getWsdlLocation(), DEVICEMETERINGSERVICEASYNC_QNAME);
    }

    public DeviceMeteringServiceAsync(WebServiceFeature... features) {
        super(__getWsdlLocation(), DEVICEMETERINGSERVICEASYNC_QNAME, features);
    }

    public DeviceMeteringServiceAsync(URL wsdlLocation) {
        super(wsdlLocation, DEVICEMETERINGSERVICEASYNC_QNAME);
    }

    public DeviceMeteringServiceAsync(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DEVICEMETERINGSERVICEASYNC_QNAME, features);
    }

    public DeviceMeteringServiceAsync(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DeviceMeteringServiceAsync(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DeviceMeteringPortTypesAsync
     */
    @WebEndpoint(name = "DeviceMeteringPortAsync")
    public DeviceMeteringPortTypesAsync getDeviceMeteringPortAsync() {
        return super.getPort(new QName("http://dom.gosuslugi.ru/schema/integration/device-metering-service-async/", "DeviceMeteringPortAsync"), DeviceMeteringPortTypesAsync.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DeviceMeteringPortTypesAsync
     */
    @WebEndpoint(name = "DeviceMeteringPortAsync")
    public DeviceMeteringPortTypesAsync getDeviceMeteringPortAsync(WebServiceFeature... features) {
        return super.getPort(new QName("http://dom.gosuslugi.ru/schema/integration/device-metering-service-async/", "DeviceMeteringPortAsync"), DeviceMeteringPortTypesAsync.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DEVICEMETERINGSERVICEASYNC_EXCEPTION!= null) {
            throw DEVICEMETERINGSERVICEASYNC_EXCEPTION;
        }
        return DEVICEMETERINGSERVICEASYNC_WSDL_LOCATION;
    }

}
