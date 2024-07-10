
package ru.gosuslugi.dom.schema.integration.inspection;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Информация о согласовании проведения проверки с органами прокуратуры (экспорт)
 * 
 * <p>Java class for ExportProsecutorAgreementInformationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportProsecutorAgreementInformationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="NoAgreementInformation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <sequence>
 *           <choice>
 *             <element name="Agreed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *             <element name="Rejected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           </choice>
 *           <sequence>
 *             <element name="ReasonDocType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *             <element name="ReasonDenyType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *             <element name="OrderNumber" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String64Type"/>
 *             <element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *             <element name="DecisionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *             <element name="DecisionPlace" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String64Type" minOccurs="0"/>
 *             <element name="SignerPosition" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String256Type" minOccurs="0"/>
 *             <element name="SignerName" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String256Type" minOccurs="0"/>
 *           </sequence>
 *         </sequence>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportProsecutorAgreementInformationType", propOrder = {
    "noAgreementInformation",
    "agreed",
    "rejected",
    "reasonDocType",
    "reasonDenyType",
    "orderNumber",
    "orderDate",
    "decisionDate",
    "decisionPlace",
    "signerPosition",
    "signerName"
})
public class ExportProsecutorAgreementInformationType {

    /**
     * Нет информации о согласовании
     * 
     */
    @XmlElement(name = "NoAgreementInformation")
    protected Boolean noAgreementInformation;
    /**
     * Согласована
     * 
     */
    @XmlElement(name = "Agreed")
    protected Boolean agreed;
    /**
     * Отказ в согласовании
     * 
     */
    @XmlElement(name = "Rejected")
    protected Boolean rejected;
    /**
     * Тип документа о согласовании проведения проверки.
     * 
     * Обязательно к заполнению, если заполнен Agreed.
     * 
     * НСИ "Тип документа о согласовании проведения проверки"
     * 
     */
    @XmlElement(name = "ReasonDocType")
    protected NsiRef reasonDocType;
    /**
     * Тип основания в отказе проведения проверки.
     * 
     * Обязательно к заполнению, если заполнен Rejected.
     * 
     * НСИ "Тип основания в отказе проведения проверки".
     * 
     */
    @XmlElement(name = "ReasonDenyType")
    protected NsiRef reasonDenyType;
    /**
     * Номер приказа о согласовании (отказе) в проведении проверки
     * 
     */
    @XmlElement(name = "OrderNumber")
    protected String orderNumber;
    /**
     * Дата приказа о согласовании (отказе) в проведении проверки
     * 
     */
    @XmlElement(name = "OrderDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orderDate;
    /**
     * Дата вынесения решения о согласовании (отказе) в проведении проверки
     * 
     */
    @XmlElement(name = "DecisionDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar decisionDate;
    /**
     * Место вынесения решения о согласовании (отказе) в проведении проверки
     * 
     */
    @XmlElement(name = "DecisionPlace")
    protected String decisionPlace;
    /**
     * Должность подписанта
     * 
     */
    @XmlElement(name = "SignerPosition")
    protected String signerPosition;
    /**
     * ФИО подписанта
     * 
     */
    @XmlElement(name = "SignerName")
    protected String signerName;

    /**
     * Нет информации о согласовании
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoAgreementInformation() {
        return noAgreementInformation;
    }

    /**
     * Sets the value of the noAgreementInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNoAgreementInformation()
     */
    public void setNoAgreementInformation(Boolean value) {
        this.noAgreementInformation = value;
    }

    /**
     * Согласована
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAgreed() {
        return agreed;
    }

    /**
     * Sets the value of the agreed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAgreed()
     */
    public void setAgreed(Boolean value) {
        this.agreed = value;
    }

    /**
     * Отказ в согласовании
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRejected() {
        return rejected;
    }

    /**
     * Sets the value of the rejected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isRejected()
     */
    public void setRejected(Boolean value) {
        this.rejected = value;
    }

    /**
     * Тип документа о согласовании проведения проверки.
     * 
     * Обязательно к заполнению, если заполнен Agreed.
     * 
     * НСИ "Тип документа о согласовании проведения проверки"
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getReasonDocType() {
        return reasonDocType;
    }

    /**
     * Sets the value of the reasonDocType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getReasonDocType()
     */
    public void setReasonDocType(NsiRef value) {
        this.reasonDocType = value;
    }

    /**
     * Тип основания в отказе проведения проверки.
     * 
     * Обязательно к заполнению, если заполнен Rejected.
     * 
     * НСИ "Тип основания в отказе проведения проверки".
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getReasonDenyType() {
        return reasonDenyType;
    }

    /**
     * Sets the value of the reasonDenyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getReasonDenyType()
     */
    public void setReasonDenyType(NsiRef value) {
        this.reasonDenyType = value;
    }

    /**
     * Номер приказа о согласовании (отказе) в проведении проверки
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrderNumber()
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }

    /**
     * Дата приказа о согласовании (отказе) в проведении проверки
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getOrderDate()
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
    }

    /**
     * Дата вынесения решения о согласовании (отказе) в проведении проверки
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDecisionDate() {
        return decisionDate;
    }

    /**
     * Sets the value of the decisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDecisionDate()
     */
    public void setDecisionDate(XMLGregorianCalendar value) {
        this.decisionDate = value;
    }

    /**
     * Место вынесения решения о согласовании (отказе) в проведении проверки
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionPlace() {
        return decisionPlace;
    }

    /**
     * Sets the value of the decisionPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDecisionPlace()
     */
    public void setDecisionPlace(String value) {
        this.decisionPlace = value;
    }

    /**
     * Должность подписанта
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignerPosition() {
        return signerPosition;
    }

    /**
     * Sets the value of the signerPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSignerPosition()
     */
    public void setSignerPosition(String value) {
        this.signerPosition = value;
    }

    /**
     * ФИО подписанта
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignerName() {
        return signerName;
    }

    /**
     * Sets the value of the signerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSignerName()
     */
    public void setSignerName(String value) {
        this.signerName = value;
    }

}
