
package ru.gosuslugi.dom.schema.integration.payment;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseAsyncResponseType;
import ru.gosuslugi.dom.schema.integration.base.CommonResultType;
import ru.gosuslugi.dom.schema.integration.base.ErrorMessageType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseAsyncResponseType">
 *       <choice minOccurs="0">
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}ErrorMessage"/>
 *         <element name="ImportResult" type="{http://dom.gosuslugi.ru/schema/integration/base/}CommonResultType" maxOccurs="unbounded"/>
 *         <element name="exportPaymentDocumentDetailsResult">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element name="Charge">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element ref="{http://dom.gosuslugi.ru/schema/integration/payment/}PaymentDocument" maxOccurs="unbounded" minOccurs="0"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/payment/}Service" maxOccurs="unbounded"/>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </choice>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="10.0.1.1""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "errorMessage",
    "importResult",
    "exportPaymentDocumentDetailsResult"
})
@XmlRootElement(name = "getStateResult")
public class GetStateResult
    extends BaseAsyncResponseType
{

    /**
     * Описание ошибок контролей или бизнес-процесса
     * 
     */
    @XmlElement(name = "ErrorMessage", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected ErrorMessageType errorMessage;
    @XmlElement(name = "ImportResult")
    protected List<CommonResultType> importResult;
    /**
     * Ответ на запрос экспорта реквизитов и сведений о платежных документах
     * 
     */
    protected GetStateResult.ExportPaymentDocumentDetailsResult exportPaymentDocumentDetailsResult;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Описание ошибок контролей или бизнес-процесса
     * 
     * @return
     *     possible object is
     *     {@link ErrorMessageType }
     *     
     */
    public ErrorMessageType getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorMessageType }
     *     
     * @see #getErrorMessage()
     */
    public void setErrorMessage(ErrorMessageType value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the importResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommonResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the importResult property.
     */
    public List<CommonResultType> getImportResult() {
        if (importResult == null) {
            importResult = new ArrayList<>();
        }
        return this.importResult;
    }

    /**
     * Ответ на запрос экспорта реквизитов и сведений о платежных документах
     * 
     * @return
     *     possible object is
     *     {@link GetStateResult.ExportPaymentDocumentDetailsResult }
     *     
     */
    public GetStateResult.ExportPaymentDocumentDetailsResult getExportPaymentDocumentDetailsResult() {
        return exportPaymentDocumentDetailsResult;
    }

    /**
     * Sets the value of the exportPaymentDocumentDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetStateResult.ExportPaymentDocumentDetailsResult }
     *     
     * @see #getExportPaymentDocumentDetailsResult()
     */
    public void setExportPaymentDocumentDetailsResult(GetStateResult.ExportPaymentDocumentDetailsResult value) {
        this.exportPaymentDocumentDetailsResult = value;
    }

    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "10.0.1.1";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVersion()
     */
    public void setVersion(String value) {
        this.version = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <choice>
     *         <element name="Charge">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/payment/}PaymentDocument" maxOccurs="unbounded" minOccurs="0"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/payment/}Service" maxOccurs="unbounded"/>
     *       </choice>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "charge",
        "service"
    })
    public static class ExportPaymentDocumentDetailsResult {

        /**
         * Сведения о начислении (для поиска по номерам лицевых счетов и адресу)
         * 
         */
        @XmlElement(name = "Charge")
        protected GetStateResult.ExportPaymentDocumentDetailsResult.Charge charge;
        /**
         * Сведния об ИЖКУ (при отсутствии начислений)
         * 
         */
        @XmlElement(name = "Service")
        protected List<Service> service;

        /**
         * Сведения о начислении (для поиска по номерам лицевых счетов и адресу)
         * 
         * @return
         *     possible object is
         *     {@link GetStateResult.ExportPaymentDocumentDetailsResult.Charge }
         *     
         */
        public GetStateResult.ExportPaymentDocumentDetailsResult.Charge getCharge() {
            return charge;
        }

        /**
         * Sets the value of the charge property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetStateResult.ExportPaymentDocumentDetailsResult.Charge }
         *     
         * @see #getCharge()
         */
        public void setCharge(GetStateResult.ExportPaymentDocumentDetailsResult.Charge value) {
            this.charge = value;
        }

        /**
         * Сведния об ИЖКУ (при отсутствии начислений)
         * 
         * Gets the value of the service property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the service property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Service }
         * </p>
         * 
         * 
         * @return
         *     The value of the service property.
         */
        public List<Service> getService() {
            if (service == null) {
                service = new ArrayList<>();
            }
            return this.service;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       <sequence>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/payment/}PaymentDocument" maxOccurs="unbounded" minOccurs="0"/>
         *       </sequence>
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "paymentDocument"
        })
        public static class Charge {

            /**
             * Сведения о платежном документе
             * 
             */
            @XmlElement(name = "PaymentDocument")
            protected List<PaymentDocument> paymentDocument;

            /**
             * Сведения о платежном документе
             * 
             * Gets the value of the paymentDocument property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the paymentDocument property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getPaymentDocument().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PaymentDocument }
             * </p>
             * 
             * 
             * @return
             *     The value of the paymentDocument property.
             */
            public List<PaymentDocument> getPaymentDocument() {
                if (paymentDocument == null) {
                    paymentDocument = new ArrayList<>();
                }
                return this.paymentDocument;
            }

        }

    }

}
