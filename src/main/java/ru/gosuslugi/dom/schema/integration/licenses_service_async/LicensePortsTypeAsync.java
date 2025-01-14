
package ru.gosuslugi.dom.schema.integration.licenses_service_async;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import ru.gosuslugi.dom.schema.integration.base.AckRequest;
import ru.gosuslugi.dom.schema.integration.base.GetStateRequest;
import ru.gosuslugi.dom.schema.integration.licenses.ExportActualLicenseStateRequest;
import ru.gosuslugi.dom.schema.integration.licenses.ExportDisqualifiedPersonRequest;
import ru.gosuslugi.dom.schema.integration.licenses.ExportLicenseRequest;
import ru.gosuslugi.dom.schema.integration.licenses.GetStateResult;
import ru.gosuslugi.dom.schema.integration.licenses.ImportLicenseEntryRequest;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebService(name = "LicensePortsTypeAsync", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/licenses-service-async/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.licenses.ObjectFactory.class,
    ru.gosuslugi.dom.schema.integration.base.ObjectFactory.class,
    ru.gosuslugi.dom.schema.integration.nsi_base.ObjectFactory.class,
    ru.gosuslugi.dom.schema.integration.organizations_registry_base.ObjectFactory.class,
    org.w3._2000._09.xmldsig_.ObjectFactory.class,
    ru.gosuslugi.dom.schema.integration.individual_registry_base.ObjectFactory.class,
    ru.gosuslugi.dom.schema.integration.organizations_base.ObjectFactory.class
})
public interface LicensePortsTypeAsync {


    /**
     * Экспорт сведений из реестра лицензий (старый формат)
     * 
     * @param exportLicenseRequest
     * @return
     *     returns ru.gosuslugi.dom.schema.integration.base.AckRequest
     * @throws Fault
     */
    @WebMethod(action = "urn:exportLicense")
    @WebResult(name = "AckRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/base/", partName = "AckRequest")
    public AckRequest exportLicense(
        @WebParam(name = "exportLicenseRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/licenses/", partName = "exportLicenseRequest")
        ExportLicenseRequest exportLicenseRequest)
        throws Fault
    ;

    /**
     * Экспорт сведений из реестра дисквалифицированных лиц
     * 
     * @param exportDisqualifiedPersonRequest
     * @return
     *     returns ru.gosuslugi.dom.schema.integration.base.AckRequest
     * @throws Fault
     */
    @WebMethod(action = "urn:exportDisqualifiedPerson")
    @WebResult(name = "AckRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/base/", partName = "AckRequest")
    public AckRequest exportDisqualifiedPerson(
        @WebParam(name = "exportDisqualifiedPersonRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/licenses/", partName = "exportDisqualifiedPersonRequest")
        ExportDisqualifiedPersonRequest exportDisqualifiedPersonRequest)
        throws Fault
    ;

    /**
     * 
     * @param getStateRequest
     * @return
     *     returns ru.gosuslugi.dom.schema.integration.licenses.GetStateResult
     * @throws Fault
     */
    @WebMethod(action = "urn:getState")
    @WebResult(name = "getStateResult", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/licenses/", partName = "getStateResult")
    public GetStateResult getState(
        @WebParam(name = "getStateRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/base/", partName = "getStateRequest")
        GetStateRequest getStateRequest)
        throws Fault
    ;

    /**
     * Экспорт сведений из реестра лицензий (по реестровой модели)
     * 
     * @param exportActualLicenseStateRequest
     * @return
     *     returns ru.gosuslugi.dom.schema.integration.base.AckRequest
     * @throws Fault
     */
    @WebMethod(action = "urn:exportActualLicenseState")
    @WebResult(name = "AckRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/base/", partName = "AckRequest")
    public AckRequest exportActualLicenseState(
        @WebParam(name = "exportActualLicenseStateRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/licenses/", partName = "exportActualLicenseStateRequest")
        ExportActualLicenseStateRequest exportActualLicenseStateRequest)
        throws Fault
    ;

    /**
     * Импорт реестровых записей
     * 
     * @param importLicenseEntryRequest
     * @return
     *     returns ru.gosuslugi.dom.schema.integration.base.AckRequest
     * @throws Fault
     */
    @WebMethod(action = "urn:importLicenseEntry")
    @WebResult(name = "AckRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/base/", partName = "AckRequest")
    public AckRequest importLicenseEntry(
        @WebParam(name = "importLicenseEntryRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/licenses/", partName = "importLicenseEntryRequest")
        ImportLicenseEntryRequest importLicenseEntryRequest)
        throws Fault
    ;

}
