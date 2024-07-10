
package ru.gosuslugi.dom.schema.integration.tech_conn;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Составной тип. Экспорт заявления на получение акта по договору
 * 
 * <p>Java class for exportActApplicationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportActApplicationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Application" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}ActApplicationType"/>
 *         <element name="Act" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}ActType" minOccurs="0"/>
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
@XmlType(name = "exportActApplicationType", propOrder = {
    "application",
    "act",
    "interactionHistory"
})
public class ExportActApplicationType {

    /**
     * Заявление на получение акта по договору
     * 
     */
    @XmlElement(name = "Application", required = true)
    protected ActApplicationType application;
    /**
     * Акт по договору
     * 
     */
    @XmlElement(name = "Act")
    protected ActType act;
    /**
     * История взаимодействия
     * 
     */
    @XmlElement(name = "InteractionHistory", required = true)
    protected ExportActApplicationType.InteractionHistory interactionHistory;

    /**
     * Заявление на получение акта по договору
     * 
     * @return
     *     possible object is
     *     {@link ActApplicationType }
     *     
     */
    public ActApplicationType getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActApplicationType }
     *     
     * @see #getApplication()
     */
    public void setApplication(ActApplicationType value) {
        this.application = value;
    }

    /**
     * Акт по договору
     * 
     * @return
     *     possible object is
     *     {@link ActType }
     *     
     */
    public ActType getAct() {
        return act;
    }

    /**
     * Sets the value of the act property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActType }
     *     
     * @see #getAct()
     */
    public void setAct(ActType value) {
        this.act = value;
    }

    /**
     * История взаимодействия
     * 
     * @return
     *     possible object is
     *     {@link ExportActApplicationType.InteractionHistory }
     *     
     */
    public ExportActApplicationType.InteractionHistory getInteractionHistory() {
        return interactionHistory;
    }

    /**
     * Sets the value of the interactionHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportActApplicationType.InteractionHistory }
     *     
     * @see #getInteractionHistory()
     */
    public void setInteractionHistory(ExportActApplicationType.InteractionHistory value) {
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
