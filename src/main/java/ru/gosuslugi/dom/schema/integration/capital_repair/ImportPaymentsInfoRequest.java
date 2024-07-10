
package ru.gosuslugi.dom.schema.integration.capital_repair;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseType">
 *       <sequence>
 *         <element name="ContractGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="importPaymentInfo" maxOccurs="1000">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="PaymentInfoGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                   <choice>
 *                     <element name="LoadPaymentInfo" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}PaymentInfoType"/>
 *                     <element name="CancelPaymentInfo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.0.0.1""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contractGuid",
    "importPaymentInfo"
})
@XmlRootElement(name = "importPaymentsInfoRequest")
public class ImportPaymentsInfoRequest
    extends BaseType
{

    /**
     * Идентификатор договора в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "ContractGuid", required = true)
    protected String contractGuid;
    /**
     * Импортируемые сведения
     * 
     */
    @XmlElement(required = true)
    protected List<ImportPaymentsInfoRequest.ImportPaymentInfo> importPaymentInfo;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Идентификатор договора в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractGuid() {
        return contractGuid;
    }

    /**
     * Sets the value of the contractGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContractGuid()
     */
    public void setContractGuid(String value) {
        this.contractGuid = value;
    }

    /**
     * Импортируемые сведения
     * 
     * Gets the value of the importPaymentInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importPaymentInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportPaymentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportPaymentsInfoRequest.ImportPaymentInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the importPaymentInfo property.
     */
    public List<ImportPaymentsInfoRequest.ImportPaymentInfo> getImportPaymentInfo() {
        if (importPaymentInfo == null) {
            importPaymentInfo = new ArrayList<>();
        }
        return this.importPaymentInfo;
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
            return "11.0.0.1";
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
     *       <sequence>
     *         <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="PaymentInfoGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *         <choice>
     *           <element name="LoadPaymentInfo" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}PaymentInfoType"/>
     *           <element name="CancelPaymentInfo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         </choice>
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
        "transportGuid",
        "paymentInfoGuid",
        "loadPaymentInfo",
        "cancelPaymentInfo"
    })
    public static class ImportPaymentInfo {

        /**
         * Транспортный идентификатор для выполнения операции со сведениями об оплате
         * 
         */
        @XmlElement(name = "TransportGuid", required = true)
        protected String transportGuid;
        /**
         * Идентификатор сведений об оплате в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "PaymentInfoGuid")
        protected String paymentInfoGuid;
        /**
         * Создание/Изменение сведений об оплате. При редактировании оплаты необходимо присылать всю актуальную информацию по ней, в том числе присылать актуальный список работ из оплаты
         * 
         */
        @XmlElement(name = "LoadPaymentInfo")
        protected PaymentInfoType loadPaymentInfo;
        /**
         * Аннулирование сведений об оплате
         * 
         */
        @XmlElement(name = "CancelPaymentInfo")
        protected Boolean cancelPaymentInfo;

        /**
         * Транспортный идентификатор для выполнения операции со сведениями об оплате
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransportGuid() {
            return transportGuid;
        }

        /**
         * Sets the value of the transportGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTransportGuid()
         */
        public void setTransportGuid(String value) {
            this.transportGuid = value;
        }

        /**
         * Идентификатор сведений об оплате в ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentInfoGuid() {
            return paymentInfoGuid;
        }

        /**
         * Sets the value of the paymentInfoGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPaymentInfoGuid()
         */
        public void setPaymentInfoGuid(String value) {
            this.paymentInfoGuid = value;
        }

        /**
         * Создание/Изменение сведений об оплате. При редактировании оплаты необходимо присылать всю актуальную информацию по ней, в том числе присылать актуальный список работ из оплаты
         * 
         * @return
         *     possible object is
         *     {@link PaymentInfoType }
         *     
         */
        public PaymentInfoType getLoadPaymentInfo() {
            return loadPaymentInfo;
        }

        /**
         * Sets the value of the loadPaymentInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentInfoType }
         *     
         * @see #getLoadPaymentInfo()
         */
        public void setLoadPaymentInfo(PaymentInfoType value) {
            this.loadPaymentInfo = value;
        }

        /**
         * Аннулирование сведений об оплате
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCancelPaymentInfo() {
            return cancelPaymentInfo;
        }

        /**
         * Sets the value of the cancelPaymentInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isCancelPaymentInfo()
         */
        public void setCancelPaymentInfo(Boolean value) {
            this.cancelPaymentInfo = value;
        }

    }

}
