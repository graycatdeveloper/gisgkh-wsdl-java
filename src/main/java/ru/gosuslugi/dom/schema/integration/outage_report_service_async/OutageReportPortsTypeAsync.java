
package ru.gosuslugi.dom.schema.integration.outage_report_service_async;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import ru.gosuslugi.dom.schema.integration.base.AckRequest;
import ru.gosuslugi.dom.schema.integration.base.GetStateRequest;
import ru.gosuslugi.dom.schema.integration.outage_report.ExportOutageReportRequest;
import ru.gosuslugi.dom.schema.integration.outage_report.GetStateResult;
import ru.gosuslugi.dom.schema.integration.outage_report.ImportOutageReportRequest;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebService(name = "OutageReportPortsTypeAsync", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/outage-report-service-async/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.outage_report.ObjectFactory.class,
    ru.gosuslugi.dom.schema.integration.base.ObjectFactory.class,
    ru.gosuslugi.dom.schema.integration.nsi_base.ObjectFactory.class,
    org.w3._2000._09.xmldsig_.ObjectFactory.class,
    ru.gosuslugi.dom.schema.integration.organizations_base.ObjectFactory.class
})
public interface OutageReportPortsTypeAsync {


    /**
     * Импорт о сведений о перерывах в предоставлении коммунальных услуг
     * 
     * @param importOutageReportRequest
     * @return
     *     returns ru.gosuslugi.dom.schema.integration.base.AckRequest
     * @throws Fault
     */
    @WebMethod(action = "urn:importOutageReport")
    @WebResult(name = "AckRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/base/", partName = "AckRequest")
    public AckRequest importOutageReport(
        @WebParam(name = "importOutageReportRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/outage-report/", partName = "importOutageReportRequest")
        ImportOutageReportRequest importOutageReportRequest)
        throws Fault
    ;

    /**
     * Получить статус обработки запроса
     * 
     * @param getRequestState
     * @return
     *     returns ru.gosuslugi.dom.schema.integration.outage_report.GetStateResult
     * @throws Fault
     */
    @WebMethod(action = "urn:getState")
    @WebResult(name = "getStateResult", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/outage-report/", partName = "getRequestStateResult")
    public GetStateResult getState(
        @WebParam(name = "getStateRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/base/", partName = "getRequestState")
        GetStateRequest getRequestState)
        throws Fault
    ;

    /**
     * Экспорт сведений о перерывах в предоставлении коммунальных услуг
     * 
     * @param exportOutageReportRequest
     * @return
     *     returns ru.gosuslugi.dom.schema.integration.base.AckRequest
     * @throws Fault
     */
    @WebMethod(action = "urn:exportOutageReport")
    @WebResult(name = "AckRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/base/", partName = "AckRequest")
    public AckRequest exportOutageReport(
        @WebParam(name = "exportOutageReportRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/outage-report/", partName = "exportOutageReportRequest")
        ExportOutageReportRequest exportOutageReportRequest)
        throws Fault
    ;

}
