
package ru.gosuslugi.dom.schema.integration.infrastructure_service_async;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import ru.gosuslugi.dom.schema.integration.base.AckRequest;
import ru.gosuslugi.dom.schema.integration.base.GetStateRequest;
import ru.gosuslugi.dom.schema.integration.infrastructure.ExportOKIRequest;
import ru.gosuslugi.dom.schema.integration.infrastructure.GetStateResult;
import ru.gosuslugi.dom.schema.integration.infrastructure.ImportOKIRequest;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebService(name = "InfrastructurePortsTypeAsync", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/infrastructure-service-async/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.infrastructure.ObjectFactory.class,
    ru.gosuslugi.dom.schema.integration.base.ObjectFactory.class,
    ru.gosuslugi.dom.schema.integration.nsi_base.ObjectFactory.class,
    org.w3._2000._09.xmldsig_.ObjectFactory.class
})
public interface InfrastructurePortsTypeAsync {


    /**
     * Импорт информации об ОКИ
     * 
     * @param importOKIRequest
     * @return
     *     returns ru.gosuslugi.dom.schema.integration.base.AckRequest
     * @throws Fault
     */
    @WebMethod(action = "urn:importOKI")
    @WebResult(name = "AckRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/base/", partName = "AckRequest")
    public AckRequest importOKI(
        @WebParam(name = "importOKIRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/infrastructure/", partName = "importOKIRequest")
        ImportOKIRequest importOKIRequest)
        throws Fault
    ;

    /**
     * Экспорт списка ОКИ 
     * 
     * @param exportOKIRequest
     * @return
     *     returns ru.gosuslugi.dom.schema.integration.base.AckRequest
     * @throws Fault
     */
    @WebMethod(action = "urn:exportOKI")
    @WebResult(name = "AckRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/base/", partName = "AckRequest")
    public AckRequest exportOKI(
        @WebParam(name = "exportOKIRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/infrastructure/", partName = "exportOKIRequest")
        ExportOKIRequest exportOKIRequest)
        throws Fault
    ;

    /**
     * Получить статус запроса
     * 
     * @param getStateRequest
     * @return
     *     returns ru.gosuslugi.dom.schema.integration.infrastructure.GetStateResult
     * @throws Fault
     */
    @WebMethod(action = "urn:getState")
    @WebResult(name = "getStateResult", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/infrastructure/", partName = "getStateResult")
    public GetStateResult getState(
        @WebParam(name = "getStateRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/base/", partName = "getStateRequest")
        GetStateRequest getStateRequest)
        throws Fault
    ;

}