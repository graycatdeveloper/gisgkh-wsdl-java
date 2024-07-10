
package ru.gosuslugi.dom.schema.integration.tech_conn;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Составной тип. Экспорт заявления на заключение договора о подключении
 * 
 * <p>Java class for exportAgreementApplicationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportAgreementApplicationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Application" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AgreementApplicationType"/>
 *         <element name="Agreement" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AgreementType" minOccurs="0"/>
 *         <element name="Act" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}ActType" maxOccurs="2" minOccurs="0"/>
 *         <element name="InteractionHistory">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="InteractionHistoryMessage" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}InteractionHistoryItemType" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportAgreementApplicationType", propOrder = {
    "application",
    "agreement",
    "act",
    "interactionHistory"
})
public class ExportAgreementApplicationType {

    /**
     * Заявление на заключение договора о подключении
     * 
     */
    @XmlElement(name = "Application", required = true)
    protected AgreementApplicationType application;
    /**
     * Договор о подключении
     * 
     */
    @XmlElement(name = "Agreement")
    protected AgreementType agreement;
    /**
     * Акт по договору
     * 
     */
    @XmlElement(name = "Act")
    protected List<ActType> act;
    /**
     * История взаимодействия
     * 
     */
    @XmlElement(name = "InteractionHistory", required = true)
    protected ExportAgreementApplicationType.InteractionHistory interactionHistory;

    /**
     * Заявление на заключение договора о подключении
     * 
     * @return
     *     possible object is
     *     {@link AgreementApplicationType }
     *     
     */
    public AgreementApplicationType getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementApplicationType }
     *     
     * @see #getApplication()
     */
    public void setApplication(AgreementApplicationType value) {
        this.application = value;
    }

    /**
     * Договор о подключении
     * 
     * @return
     *     possible object is
     *     {@link AgreementType }
     *     
     */
    public AgreementType getAgreement() {
        return agreement;
    }

    /**
     * Sets the value of the agreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementType }
     *     
     * @see #getAgreement()
     */
    public void setAgreement(AgreementType value) {
        this.agreement = value;
    }

    /**
     * Акт по договору
     * 
     * Gets the value of the act property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the act property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActType }
     * </p>
     * 
     * 
     * @return
     *     The value of the act property.
     */
    public List<ActType> getAct() {
        if (act == null) {
            act = new ArrayList<>();
        }
        return this.act;
    }

    /**
     * История взаимодействия
     * 
     * @return
     *     possible object is
     *     {@link ExportAgreementApplicationType.InteractionHistory }
     *     
     */
    public ExportAgreementApplicationType.InteractionHistory getInteractionHistory() {
        return interactionHistory;
    }

    /**
     * Sets the value of the interactionHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportAgreementApplicationType.InteractionHistory }
     *     
     * @see #getInteractionHistory()
     */
    public void setInteractionHistory(ExportAgreementApplicationType.InteractionHistory value) {
        this.interactionHistory = value;
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
     *         <element name="InteractionHistoryMessage" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}InteractionHistoryItemType" maxOccurs="unbounded" minOccurs="0"/>
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
        "interactionHistoryMessage"
    })
    public static class InteractionHistory {

        /**
         * Сообщение в рамках взаимодействия с заявителем
         * 
         */
        @XmlElement(name = "InteractionHistoryMessage")
        protected List<InteractionHistoryItemType> interactionHistoryMessage;

        /**
         * Сообщение в рамках взаимодействия с заявителем
         * 
         * Gets the value of the interactionHistoryMessage property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the interactionHistoryMessage property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getInteractionHistoryMessage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InteractionHistoryItemType }
         * </p>
         * 
         * 
         * @return
         *     The value of the interactionHistoryMessage property.
         */
        public List<InteractionHistoryItemType> getInteractionHistoryMessage() {
            if (interactionHistoryMessage == null) {
                interactionHistoryMessage = new ArrayList<>();
            }
            return this.interactionHistoryMessage;
        }

    }

}
