
package ru.gosuslugi.dom.schema.integration.capital_repair;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Экспортируемый договор, сведения об оплате, акт на выполнение работ (оказание услуг) по капитальному ремонту
 * 
 * <p>Java class for exportFullContractType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportFullContractType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Contract" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}exportContractType"/>
 *         <element name="Certificate" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}exportCertificateType" maxOccurs="1000" minOccurs="0"/>
 *         <element name="PaymentInfo" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}exportPaymentInfoType" maxOccurs="1000" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportFullContractType", propOrder = {
    "contract",
    "certificate",
    "paymentInfo"
})
public class ExportFullContractType {

    /**
     * Договор
     * 
     */
    @XmlElement(name = "Contract", required = true)
    protected ExportContractType contract;
    /**
     * Акт
     * 
     */
    @XmlElement(name = "Certificate")
    protected List<ExportCertificateType> certificate;
    /**
     * Сведения об оплате
     * 
     */
    @XmlElement(name = "PaymentInfo")
    protected List<ExportPaymentInfoType> paymentInfo;

    /**
     * Договор
     * 
     * @return
     *     possible object is
     *     {@link ExportContractType }
     *     
     */
    public ExportContractType getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportContractType }
     *     
     * @see #getContract()
     */
    public void setContract(ExportContractType value) {
        this.contract = value;
    }

    /**
     * Акт
     * 
     * Gets the value of the certificate property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificate property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCertificate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportCertificateType }
     * </p>
     * 
     * 
     * @return
     *     The value of the certificate property.
     */
    public List<ExportCertificateType> getCertificate() {
        if (certificate == null) {
            certificate = new ArrayList<>();
        }
        return this.certificate;
    }

    /**
     * Сведения об оплате
     * 
     * Gets the value of the paymentInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPaymentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportPaymentInfoType }
     * </p>
     * 
     * 
     * @return
     *     The value of the paymentInfo property.
     */
    public List<ExportPaymentInfoType> getPaymentInfo() {
        if (paymentInfo == null) {
            paymentInfo = new ArrayList<>();
        }
        return this.paymentInfo;
    }

}
