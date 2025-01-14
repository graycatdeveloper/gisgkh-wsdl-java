
package ru.gosuslugi.dom.schema.integration.payment;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.gosuslugi.dom.schema.integration.payment package. 
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

    private static final QName _Purpose_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/payment/", "Purpose");
    private static final QName _PDServiceName_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/payment/", "PDServiceName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.gosuslugi.dom.schema.integration.payment
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ImportNotificationsOfOrderExecutionRequest }
     * 
     * @return
     *     the new instance of {@link ImportNotificationsOfOrderExecutionRequest }
     */
    public ImportNotificationsOfOrderExecutionRequest createImportNotificationsOfOrderExecutionRequest() {
        return new ImportNotificationsOfOrderExecutionRequest();
    }

    /**
     * Create an instance of {@link ExportPaymentDocumentDetailsRequest }
     * 
     * @return
     *     the new instance of {@link ExportPaymentDocumentDetailsRequest }
     */
    public ExportPaymentDocumentDetailsRequest createExportPaymentDocumentDetailsRequest() {
        return new ExportPaymentDocumentDetailsRequest();
    }

    /**
     * Create an instance of {@link ImportSupplierNotificationsOfOrderExecutionRequest }
     * 
     * @return
     *     the new instance of {@link ImportSupplierNotificationsOfOrderExecutionRequest }
     */
    public ImportSupplierNotificationsOfOrderExecutionRequest createImportSupplierNotificationsOfOrderExecutionRequest() {
        return new ImportSupplierNotificationsOfOrderExecutionRequest();
    }

    /**
     * Create an instance of {@link GetStateResult }
     * 
     * @return
     *     the new instance of {@link GetStateResult }
     */
    public GetStateResult createGetStateResult() {
        return new GetStateResult();
    }

    /**
     * Create an instance of {@link Service }
     * 
     * @return
     *     the new instance of {@link Service }
     */
    public Service createService() {
        return new Service();
    }

    /**
     * Create an instance of {@link SupplierNotificationOfOrderExecutionType }
     * 
     * @return
     *     the new instance of {@link SupplierNotificationOfOrderExecutionType }
     */
    public SupplierNotificationOfOrderExecutionType createSupplierNotificationOfOrderExecutionType() {
        return new SupplierNotificationOfOrderExecutionType();
    }

    /**
     * Create an instance of {@link Service.ExecutorInformation }
     * 
     * @return
     *     the new instance of {@link Service.ExecutorInformation }
     */
    public Service.ExecutorInformation createServiceExecutorInformation() {
        return new Service.ExecutorInformation();
    }

    /**
     * Create an instance of {@link PaymentDocumentDetailsType }
     * 
     * @return
     *     the new instance of {@link PaymentDocumentDetailsType }
     */
    public PaymentDocumentDetailsType createPaymentDocumentDetailsType() {
        return new PaymentDocumentDetailsType();
    }

    /**
     * Create an instance of {@link PaymentDocumentDetailsType.ExecutorInformation }
     * 
     * @return
     *     the new instance of {@link PaymentDocumentDetailsType.ExecutorInformation }
     */
    public PaymentDocumentDetailsType.ExecutorInformation createPaymentDocumentDetailsTypeExecutorInformation() {
        return new PaymentDocumentDetailsType.ExecutorInformation();
    }

    /**
     * Create an instance of {@link PaymentDocumentDetailsType.ConsumerInformation }
     * 
     * @return
     *     the new instance of {@link PaymentDocumentDetailsType.ConsumerInformation }
     */
    public PaymentDocumentDetailsType.ConsumerInformation createPaymentDocumentDetailsTypeConsumerInformation() {
        return new PaymentDocumentDetailsType.ConsumerInformation();
    }

    /**
     * Create an instance of {@link GetStateResult.ExportPaymentDocumentDetailsResult }
     * 
     * @return
     *     the new instance of {@link GetStateResult.ExportPaymentDocumentDetailsResult }
     */
    public GetStateResult.ExportPaymentDocumentDetailsResult createGetStateResultExportPaymentDocumentDetailsResult() {
        return new GetStateResult.ExportPaymentDocumentDetailsResult();
    }

    /**
     * Create an instance of {@link ExportPaymentDocumentDetailsRequest.AmountRequired }
     * 
     * @return
     *     the new instance of {@link ExportPaymentDocumentDetailsRequest.AmountRequired }
     */
    public ExportPaymentDocumentDetailsRequest.AmountRequired createExportPaymentDocumentDetailsRequestAmountRequired() {
        return new ExportPaymentDocumentDetailsRequest.AmountRequired();
    }

    /**
     * Create an instance of {@link ImportNotificationsOfOrderExecutionRequest.NotificationOfOrderExecutionType }
     * 
     * @return
     *     the new instance of {@link ImportNotificationsOfOrderExecutionRequest.NotificationOfOrderExecutionType }
     */
    public ImportNotificationsOfOrderExecutionRequest.NotificationOfOrderExecutionType createImportNotificationsOfOrderExecutionRequestNotificationOfOrderExecutionType() {
        return new ImportNotificationsOfOrderExecutionRequest.NotificationOfOrderExecutionType();
    }

    /**
     * Create an instance of {@link ImportNotificationsOfOrderExecutionRequest.NotificationOfOrderExecution139Type }
     * 
     * @return
     *     the new instance of {@link ImportNotificationsOfOrderExecutionRequest.NotificationOfOrderExecution139Type }
     */
    public ImportNotificationsOfOrderExecutionRequest.NotificationOfOrderExecution139Type createImportNotificationsOfOrderExecutionRequestNotificationOfOrderExecution139Type() {
        return new ImportNotificationsOfOrderExecutionRequest.NotificationOfOrderExecution139Type();
    }

    /**
     * Create an instance of {@link ImportNotificationsOfOrderExecutionCancellationRequest }
     * 
     * @return
     *     the new instance of {@link ImportNotificationsOfOrderExecutionCancellationRequest }
     */
    public ImportNotificationsOfOrderExecutionCancellationRequest createImportNotificationsOfOrderExecutionCancellationRequest() {
        return new ImportNotificationsOfOrderExecutionCancellationRequest();
    }

    /**
     * Create an instance of {@link ImportSupplierNotificationsOfOrderExecutionRequest.SupplierNotificationOfOrderExecution }
     * 
     * @return
     *     the new instance of {@link ImportSupplierNotificationsOfOrderExecutionRequest.SupplierNotificationOfOrderExecution }
     */
    public ImportSupplierNotificationsOfOrderExecutionRequest.SupplierNotificationOfOrderExecution createImportSupplierNotificationsOfOrderExecutionRequestSupplierNotificationOfOrderExecution() {
        return new ImportSupplierNotificationsOfOrderExecutionRequest.SupplierNotificationOfOrderExecution();
    }

    /**
     * Create an instance of {@link Individual }
     * 
     * @return
     *     the new instance of {@link Individual }
     */
    public Individual createIndividual() {
        return new Individual();
    }

    /**
     * Create an instance of {@link PaymentDocument }
     * 
     * @return
     *     the new instance of {@link PaymentDocument }
     */
    public PaymentDocument createPaymentDocument() {
        return new PaymentDocument();
    }

    /**
     * Create an instance of {@link SupplierNotificationOfOrderExecutionType.OrderPeriod }
     * 
     * @return
     *     the new instance of {@link SupplierNotificationOfOrderExecutionType.OrderPeriod }
     */
    public SupplierNotificationOfOrderExecutionType.OrderPeriod createSupplierNotificationOfOrderExecutionTypeOrderPeriod() {
        return new SupplierNotificationOfOrderExecutionType.OrderPeriod();
    }

    /**
     * Create an instance of {@link Service.ExecutorInformation.Legal }
     * 
     * @return
     *     the new instance of {@link Service.ExecutorInformation.Legal }
     */
    public Service.ExecutorInformation.Legal createServiceExecutorInformationLegal() {
        return new Service.ExecutorInformation.Legal();
    }

    /**
     * Create an instance of {@link Service.ExecutorInformation.PaymentInformation }
     * 
     * @return
     *     the new instance of {@link Service.ExecutorInformation.PaymentInformation }
     */
    public Service.ExecutorInformation.PaymentInformation createServiceExecutorInformationPaymentInformation() {
        return new Service.ExecutorInformation.PaymentInformation();
    }

    /**
     * Create an instance of {@link PaymentDocumentDetailsType.ExecutorInformation.Legal }
     * 
     * @return
     *     the new instance of {@link PaymentDocumentDetailsType.ExecutorInformation.Legal }
     */
    public PaymentDocumentDetailsType.ExecutorInformation.Legal createPaymentDocumentDetailsTypeExecutorInformationLegal() {
        return new PaymentDocumentDetailsType.ExecutorInformation.Legal();
    }

    /**
     * Create an instance of {@link PaymentDocumentDetailsType.ExecutorInformation.PaymentInformation }
     * 
     * @return
     *     the new instance of {@link PaymentDocumentDetailsType.ExecutorInformation.PaymentInformation }
     */
    public PaymentDocumentDetailsType.ExecutorInformation.PaymentInformation createPaymentDocumentDetailsTypeExecutorInformationPaymentInformation() {
        return new PaymentDocumentDetailsType.ExecutorInformation.PaymentInformation();
    }

    /**
     * Create an instance of {@link PaymentDocumentDetailsType.ConsumerInformation.Entpr }
     * 
     * @return
     *     the new instance of {@link PaymentDocumentDetailsType.ConsumerInformation.Entpr }
     */
    public PaymentDocumentDetailsType.ConsumerInformation.Entpr createPaymentDocumentDetailsTypeConsumerInformationEntpr() {
        return new PaymentDocumentDetailsType.ConsumerInformation.Entpr();
    }

    /**
     * Create an instance of {@link PaymentDocumentDetailsType.ConsumerInformation.Legal }
     * 
     * @return
     *     the new instance of {@link PaymentDocumentDetailsType.ConsumerInformation.Legal }
     */
    public PaymentDocumentDetailsType.ConsumerInformation.Legal createPaymentDocumentDetailsTypeConsumerInformationLegal() {
        return new PaymentDocumentDetailsType.ConsumerInformation.Legal();
    }

    /**
     * Create an instance of {@link PaymentDocumentDetailsType.ConsumerInformation.Address }
     * 
     * @return
     *     the new instance of {@link PaymentDocumentDetailsType.ConsumerInformation.Address }
     */
    public PaymentDocumentDetailsType.ConsumerInformation.Address createPaymentDocumentDetailsTypeConsumerInformationAddress() {
        return new PaymentDocumentDetailsType.ConsumerInformation.Address();
    }

    /**
     * Create an instance of {@link GetStateResult.ExportPaymentDocumentDetailsResult.Charge }
     * 
     * @return
     *     the new instance of {@link GetStateResult.ExportPaymentDocumentDetailsResult.Charge }
     */
    public GetStateResult.ExportPaymentDocumentDetailsResult.Charge createGetStateResultExportPaymentDocumentDetailsResultCharge() {
        return new GetStateResult.ExportPaymentDocumentDetailsResult.Charge();
    }

    /**
     * Create an instance of {@link ExportPaymentDocumentDetailsRequest.AmountRequired.Legal }
     * 
     * @return
     *     the new instance of {@link ExportPaymentDocumentDetailsRequest.AmountRequired.Legal }
     */
    public ExportPaymentDocumentDetailsRequest.AmountRequired.Legal createExportPaymentDocumentDetailsRequestAmountRequiredLegal() {
        return new ExportPaymentDocumentDetailsRequest.AmountRequired.Legal();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/payment/", name = "Purpose")
    public JAXBElement<String> createPurpose(String value) {
        return new JAXBElement<>(_Purpose_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/payment/", name = "PDServiceName")
    public JAXBElement<String> createPDServiceName(String value) {
        return new JAXBElement<>(_PDServiceName_QNAME, String.class, null, value);
    }

}
