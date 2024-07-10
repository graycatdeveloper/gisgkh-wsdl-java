
package ru.gosuslugi.dom.schema.integration.base;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.gosuslugi.dom.schema.integration.base package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _ErrorMessage_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/base/", "ErrorMessage");
    private static final QName _TransportGUID_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/base/", "TransportGUID");
    private static final QName _ModificationDate_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/base/", "ModificationDate");
    private static final QName _Month_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/base/", "Month");
    private static final QName _Year_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/base/", "Year");
    private static final QName _OKEI_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/base/", "OKEI");
    private static final QName _OrgPPAGUID_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/base/", "orgPPAGUID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.gosuslugi.dom.schema.integration.base
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestHeader }
     * 
     * @return
     *     the new instance of {@link RequestHeader }
     */
    public RequestHeader createRequestHeader() {
        return new RequestHeader();
    }

    /**
     * Create an instance of {@link AckRequest }
     * 
     * @return
     *     the new instance of {@link AckRequest }
     */
    public AckRequest createAckRequest() {
        return new AckRequest();
    }

    /**
     * Create an instance of {@link RequestHeader.Citizen }
     * 
     * @return
     *     the new instance of {@link RequestHeader.Citizen }
     */
    public RequestHeader.Citizen createRequestHeaderCitizen() {
        return new RequestHeader.Citizen();
    }

    /**
     * Create an instance of {@link RequestHeader.Citizen.Document }
     * 
     * @return
     *     the new instance of {@link RequestHeader.Citizen.Document }
     */
    public RequestHeader.Citizen.Document createRequestHeaderCitizenDocument() {
        return new RequestHeader.Citizen.Document();
    }

    /**
     * Create an instance of {@link CommonResultType }
     * 
     * @return
     *     the new instance of {@link CommonResultType }
     */
    public CommonResultType createCommonResultType() {
        return new CommonResultType();
    }

    /**
     * Create an instance of {@link BaseType }
     * 
     * @return
     *     the new instance of {@link BaseType }
     */
    public BaseType createBaseType() {
        return new BaseType();
    }

    /**
     * Create an instance of {@link BaseAsyncResponseType }
     * 
     * @return
     *     the new instance of {@link BaseAsyncResponseType }
     */
    public BaseAsyncResponseType createBaseAsyncResponseType() {
        return new BaseAsyncResponseType();
    }

    /**
     * Create an instance of {@link ErrorMessageType }
     * 
     * @return
     *     the new instance of {@link ErrorMessageType }
     */
    public ErrorMessageType createErrorMessageType() {
        return new ErrorMessageType();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     * @return
     *     the new instance of {@link HeaderType }
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link ISCreator }
     * 
     * @return
     *     the new instance of {@link ISCreator }
     */
    public ISCreator createISCreator() {
        return new ISCreator();
    }

    /**
     * Create an instance of {@link ISRequestHeader }
     * 
     * @return
     *     the new instance of {@link ISRequestHeader }
     */
    public ISRequestHeader createISRequestHeader() {
        return new ISRequestHeader();
    }

    /**
     * Create an instance of {@link ResultHeader }
     * 
     * @return
     *     the new instance of {@link ResultHeader }
     */
    public ResultHeader createResultHeader() {
        return new ResultHeader();
    }

    /**
     * Create an instance of {@link Attachment }
     * 
     * @return
     *     the new instance of {@link Attachment }
     */
    public Attachment createAttachment() {
        return new Attachment();
    }

    /**
     * Create an instance of {@link Fault }
     * 
     * @return
     *     the new instance of {@link Fault }
     */
    public Fault createFault() {
        return new Fault();
    }

    /**
     * Create an instance of {@link AckRequest.Ack }
     * 
     * @return
     *     the new instance of {@link AckRequest.Ack }
     */
    public AckRequest.Ack createAckRequestAck() {
        return new AckRequest.Ack();
    }

    /**
     * Create an instance of {@link GetStateRequest }
     * 
     * @return
     *     the new instance of {@link GetStateRequest }
     */
    public GetStateRequest createGetStateRequest() {
        return new GetStateRequest();
    }

    /**
     * Create an instance of {@link GetRequestsStateRequest }
     * 
     * @return
     *     the new instance of {@link GetRequestsStateRequest }
     */
    public GetRequestsStateRequest createGetRequestsStateRequest() {
        return new GetRequestsStateRequest();
    }

    /**
     * Create an instance of {@link GetRequestsStateResult }
     * 
     * @return
     *     the new instance of {@link GetRequestsStateResult }
     */
    public GetRequestsStateResult createGetRequestsStateResult() {
        return new GetRequestsStateResult();
    }

    /**
     * Create an instance of {@link ResultType }
     * 
     * @return
     *     the new instance of {@link ResultType }
     */
    public ResultType createResultType() {
        return new ResultType();
    }

    /**
     * Create an instance of {@link AttachmentType }
     * 
     * @return
     *     the new instance of {@link AttachmentType }
     */
    public AttachmentType createAttachmentType() {
        return new AttachmentType();
    }

    /**
     * Create an instance of {@link AttachmentWODescriptionType }
     * 
     * @return
     *     the new instance of {@link AttachmentWODescriptionType }
     */
    public AttachmentWODescriptionType createAttachmentWODescriptionType() {
        return new AttachmentWODescriptionType();
    }

    /**
     * Create an instance of {@link SignedAttachmentType }
     * 
     * @return
     *     the new instance of {@link SignedAttachmentType }
     */
    public SignedAttachmentType createSignedAttachmentType() {
        return new SignedAttachmentType();
    }

    /**
     * Create an instance of {@link YearMonth }
     * 
     * @return
     *     the new instance of {@link YearMonth }
     */
    public YearMonth createYearMonth() {
        return new YearMonth();
    }

    /**
     * Create an instance of {@link Period }
     * 
     * @return
     *     the new instance of {@link Period }
     */
    public Period createPeriod() {
        return new Period();
    }

    /**
     * Create an instance of {@link PeriodOpen }
     * 
     * @return
     *     the new instance of {@link PeriodOpen }
     */
    public PeriodOpen createPeriodOpen() {
        return new PeriodOpen();
    }

    /**
     * Create an instance of {@link RegionType }
     * 
     * @return
     *     the new instance of {@link RegionType }
     */
    public RegionType createRegionType() {
        return new RegionType();
    }

    /**
     * Create an instance of {@link OKTMORefType }
     * 
     * @return
     *     the new instance of {@link OKTMORefType }
     */
    public OKTMORefType createOKTMORefType() {
        return new OKTMORefType();
    }

    /**
     * Create an instance of {@link DocumentPortalType }
     * 
     * @return
     *     the new instance of {@link DocumentPortalType }
     */
    public DocumentPortalType createDocumentPortalType() {
        return new DocumentPortalType();
    }

    /**
     * Create an instance of {@link RequestHeader.Citizen.Document.DocumentType }
     * 
     * @return
     *     the new instance of {@link RequestHeader.Citizen.Document.DocumentType }
     */
    public RequestHeader.Citizen.Document.DocumentType createRequestHeaderCitizenDocumentDocumentType() {
        return new RequestHeader.Citizen.Document.DocumentType();
    }

    /**
     * Create an instance of {@link CommonResultType.Error }
     * 
     * @return
     *     the new instance of {@link CommonResultType.Error }
     */
    public CommonResultType.Error createCommonResultTypeError() {
        return new CommonResultType.Error();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorMessageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErrorMessageType }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/base/", name = "ErrorMessage")
    public JAXBElement<ErrorMessageType> createErrorMessage(ErrorMessageType value) {
        return new JAXBElement<>(_ErrorMessage_QNAME, ErrorMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/base/", name = "TransportGUID")
    public JAXBElement<String> createTransportGUID(String value) {
        return new JAXBElement<>(_TransportGUID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/base/", name = "ModificationDate")
    public JAXBElement<XMLGregorianCalendar> createModificationDate(XMLGregorianCalendar value) {
        return new JAXBElement<>(_ModificationDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/base/", name = "Month")
    public JAXBElement<Integer> createMonth(Integer value) {
        return new JAXBElement<>(_Month_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/base/", name = "Year")
    public JAXBElement<Short> createYear(Short value) {
        return new JAXBElement<>(_Year_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/base/", name = "OKEI")
    public JAXBElement<String> createOKEI(String value) {
        return new JAXBElement<>(_OKEI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/base/", name = "orgPPAGUID")
    public JAXBElement<String> createOrgPPAGUID(String value) {
        return new JAXBElement<>(_OrgPPAGUID_QNAME, String.class, null, value);
    }

}
