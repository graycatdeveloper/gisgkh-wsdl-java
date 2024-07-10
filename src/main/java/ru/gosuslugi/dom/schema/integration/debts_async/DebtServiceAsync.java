
package ru.gosuslugi.dom.schema.integration.debts_async;

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
@WebServiceClient(name = "DebtServiceAsync", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/debts-async/", wsdlLocation = "http://localhost/")
public class DebtServiceAsync
    extends Service
{

    private static final URL DEBTSERVICEASYNC_WSDL_LOCATION;
    private static final WebServiceException DEBTSERVICEASYNC_EXCEPTION;
    private static final QName DEBTSERVICEASYNC_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/debts-async/", "DebtServiceAsync");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost/");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DEBTSERVICEASYNC_WSDL_LOCATION = url;
        DEBTSERVICEASYNC_EXCEPTION = e;
    }

    public DebtServiceAsync() {
        super(__getWsdlLocation(), DEBTSERVICEASYNC_QNAME);
    }

    public DebtServiceAsync(WebServiceFeature... features) {
        super(__getWsdlLocation(), DEBTSERVICEASYNC_QNAME, features);
    }

    public DebtServiceAsync(URL wsdlLocation) {
        super(wsdlLocation, DEBTSERVICEASYNC_QNAME);
    }

    public DebtServiceAsync(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DEBTSERVICEASYNC_QNAME, features);
    }

    public DebtServiceAsync(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DebtServiceAsync(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DebtPortsTypeAsync
     */
    @WebEndpoint(name = "DebtPortAsync")
    public DebtPortsTypeAsync getDebtPortAsync() {
        return super.getPort(new QName("http://dom.gosuslugi.ru/schema/integration/debts-async/", "DebtPortAsync"), DebtPortsTypeAsync.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DebtPortsTypeAsync
     */
    @WebEndpoint(name = "DebtPortAsync")
    public DebtPortsTypeAsync getDebtPortAsync(WebServiceFeature... features) {
        return super.getPort(new QName("http://dom.gosuslugi.ru/schema/integration/debts-async/", "DebtPortAsync"), DebtPortsTypeAsync.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DEBTSERVICEASYNC_EXCEPTION!= null) {
            throw DEBTSERVICEASYNC_EXCEPTION;
        }
        return DEBTSERVICEASYNC_WSDL_LOCATION;
    }

}
