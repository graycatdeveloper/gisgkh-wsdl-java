
package ru.gosuslugi.dom.schema.integration.licenses_service_async;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * Асинхронный сервис управления экспортом лицензий и дисквалифицированных лиц
 * 
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "LicenseServiceAsync", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/licenses-service-async/", wsdlLocation = "http://localhost/")
public class LicenseServiceAsync
    extends Service
{

    private static final URL LICENSESERVICEASYNC_WSDL_LOCATION;
    private static final WebServiceException LICENSESERVICEASYNC_EXCEPTION;
    private static final QName LICENSESERVICEASYNC_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/licenses-service-async/", "LicenseServiceAsync");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost/");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LICENSESERVICEASYNC_WSDL_LOCATION = url;
        LICENSESERVICEASYNC_EXCEPTION = e;
    }

    public LicenseServiceAsync() {
        super(__getWsdlLocation(), LICENSESERVICEASYNC_QNAME);
    }

    public LicenseServiceAsync(WebServiceFeature... features) {
        super(__getWsdlLocation(), LICENSESERVICEASYNC_QNAME, features);
    }

    public LicenseServiceAsync(URL wsdlLocation) {
        super(wsdlLocation, LICENSESERVICEASYNC_QNAME);
    }

    public LicenseServiceAsync(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LICENSESERVICEASYNC_QNAME, features);
    }

    public LicenseServiceAsync(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LicenseServiceAsync(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LicensePortsTypeAsync
     */
    @WebEndpoint(name = "LicensesPortAsync")
    public LicensePortsTypeAsync getLicensesPortAsync() {
        return super.getPort(new QName("http://dom.gosuslugi.ru/schema/integration/licenses-service-async/", "LicensesPortAsync"), LicensePortsTypeAsync.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LicensePortsTypeAsync
     */
    @WebEndpoint(name = "LicensesPortAsync")
    public LicensePortsTypeAsync getLicensesPortAsync(WebServiceFeature... features) {
        return super.getPort(new QName("http://dom.gosuslugi.ru/schema/integration/licenses-service-async/", "LicensesPortAsync"), LicensePortsTypeAsync.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LICENSESERVICEASYNC_EXCEPTION!= null) {
            throw LICENSESERVICEASYNC_EXCEPTION;
        }
        return LICENSESERVICEASYNC_WSDL_LOCATION;
    }

}
