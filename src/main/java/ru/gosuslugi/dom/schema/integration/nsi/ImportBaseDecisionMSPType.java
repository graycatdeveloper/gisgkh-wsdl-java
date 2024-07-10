
package ru.gosuslugi.dom.schema.integration.nsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Элемент справочника оснований принятия решений.
 * 
 * <p>Java class for importBaseDecisionMSPType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="importBaseDecisionMSPType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <sequence>
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *           <element name="ElementGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         </sequence>
 *         <element name="DecisionName" type="{http://dom.gosuslugi.ru/schema/integration/base/}String500Type"/>
 *         <element name="DecisionType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="IsAppliedToSubsidiaries" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="IsAppliedToRefundOfCharges" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "importBaseDecisionMSPType", propOrder = {
    "transportGUID",
    "elementGuid",
    "decisionName",
    "decisionType",
    "isAppliedToSubsidiaries",
    "isAppliedToRefundOfCharges"
})
public class ImportBaseDecisionMSPType {

    /**
     * Транспортный идентификатор
     * 
     */
    @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String transportGUID;
    /**
     * Идентификатор существующего элемента справочника.
     * 
     */
    @XmlElement(name = "ElementGuid")
    protected String elementGuid;
    /**
     * Наименование основания принятия решения
     * 
     */
    @XmlElement(name = "DecisionName", required = true)
    protected String decisionName;
    /**
     * Ссылка на НСИ "Тип решения о мерах социальной поддержки гражданина" (реестровый номер 301)
     * 
     */
    @XmlElement(name = "DecisionType", required = true)
    protected NsiRef decisionType;
    /**
     * Применяется для субсидий
     * 
     */
    @XmlElement(name = "IsAppliedToSubsidiaries")
    protected boolean isAppliedToSubsidiaries;
    /**
     * Применяется для компенсации расходов
     * 
     */
    @XmlElement(name = "IsAppliedToRefundOfCharges")
    protected boolean isAppliedToRefundOfCharges;

    /**
     * Транспортный идентификатор
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportGUID() {
        return transportGUID;
    }

    /**
     * Sets the value of the transportGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTransportGUID()
     */
    public void setTransportGUID(String value) {
        this.transportGUID = value;
    }

    /**
     * Идентификатор существующего элемента справочника.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementGuid() {
        return elementGuid;
    }

    /**
     * Sets the value of the elementGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getElementGuid()
     */
    public void setElementGuid(String value) {
        this.elementGuid = value;
    }

    /**
     * Наименование основания принятия решения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionName() {
        return decisionName;
    }

    /**
     * Sets the value of the decisionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDecisionName()
     */
    public void setDecisionName(String value) {
        this.decisionName = value;
    }

    /**
     * Ссылка на НСИ "Тип решения о мерах социальной поддержки гражданина" (реестровый номер 301)
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getDecisionType() {
        return decisionType;
    }

    /**
     * Sets the value of the decisionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getDecisionType()
     */
    public void setDecisionType(NsiRef value) {
        this.decisionType = value;
    }

    /**
     * Применяется для субсидий
     * 
     */
    public boolean isIsAppliedToSubsidiaries() {
        return isAppliedToSubsidiaries;
    }

    /**
     * Sets the value of the isAppliedToSubsidiaries property.
     * 
     */
    public void setIsAppliedToSubsidiaries(boolean value) {
        this.isAppliedToSubsidiaries = value;
    }

    /**
     * Применяется для компенсации расходов
     * 
     */
    public boolean isIsAppliedToRefundOfCharges() {
        return isAppliedToRefundOfCharges;
    }

    /**
     * Sets the value of the isAppliedToRefundOfCharges property.
     * 
     */
    public void setIsAppliedToRefundOfCharges(boolean value) {
        this.isAppliedToRefundOfCharges = value;
    }

}
