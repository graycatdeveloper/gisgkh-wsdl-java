
package ru.gosuslugi.dom.schema.integration.outage_report_service_async;

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
@WebServiceClient(name = "OutageReportServiceAsync", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/outage-report-service-async/", wsdlLocation = "http://localhost/")
public class OutageReportServiceAsync
    extends Service
{

    private static final URL OUTAGEREPORTSERVICEASYNC_WSDL_LOCATION;
    private static final WebServiceException OUTAGEREPORTSERVICEASYNC_EXCEPTION;
    private static final QName OUTAGEREPORTSERVICEASYNC_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/outage-report-service-async/", "OutageReportServiceAsync");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost/");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        OUTAGEREPORTSERVICEASYNC_WSDL_LOCATION = url;
        OUTAGEREPORTSERVICEASYNC_EXCEPTION = e;
    }

    public OutageReportServiceAsync() {
        super(__getWsdlLocation(), OUTAGEREPORTSERVICEASYNC_QNAME);
    }

    public OutageReportServiceAsync(WebServiceFeature... features) {
        super(__getWsdlLocation(), OUTAGEREPORTSERVICEASYNC_QNAME, features);
    }

    public OutageReportServiceAsync(URL wsdlLocation) {
        super(wsdlLocation, OUTAGEREPORTSERVICEASYNC_QNAME);
    }

    public OutageReportServiceAsync(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, OUTAGEREPORTSERVICEASYNC_QNAME, features);
    }

    public OutageReportServiceAsync(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OutageReportServiceAsync(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns OutageReportPortsTypeAsync
     */
    @WebEndpoint(name = "OutageReportPortAsync")
    public OutageReportPortsTypeAsync getOutageReportPortAsync() {
        return super.getPort(new QName("http://dom.gosuslugi.ru/schema/integration/outage-report-service-async/", "OutageReportPortAsync"), OutageReportPortsTypeAsync.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OutageReportPortsTypeAsync
     */
    @WebEndpoint(name = "OutageReportPortAsync")
    public OutageReportPortsTypeAsync getOutageReportPortAsync(WebServiceFeature... features) {
        return super.getPort(new QName("http://dom.gosuslugi.ru/schema/integration/outage-report-service-async/", "OutageReportPortAsync"), OutageReportPortsTypeAsync.class, features);
    }

    private static URL __getWsdlLocation() {
        if (OUTAGEREPORTSERVICEASYNC_EXCEPTION!= null) {
            throw OUTAGEREPORTSERVICEASYNC_EXCEPTION;
        }
        return OUTAGEREPORTSERVICEASYNC_WSDL_LOCATION;
    }

}