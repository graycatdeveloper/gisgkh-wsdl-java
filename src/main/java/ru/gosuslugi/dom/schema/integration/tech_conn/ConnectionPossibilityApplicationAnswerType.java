
package ru.gosuslugi.dom.schema.integration.tech_conn;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.SignedAttachmentType;


/**
 * Составной тип. Отправка ответа по заявлению на предоставление информации о возможности подключения к сетям теплоснабжения
 * 
 * <p>Java class for ConnectionPossibilityApplicationAnswerType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ConnectionPossibilityApplicationAnswerType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="ConnectionPossibilityInformationDocument" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded"/>
 *           <element name="ReasonedRefusalDocument" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded"/>
 *         </choice>
 *         <element name="Description" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String500Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionPossibilityApplicationAnswerType", propOrder = {
    "connectionPossibilityInformationDocument",
    "reasonedRefusalDocument",
    "description"
})
public class ConnectionPossibilityApplicationAnswerType {

    /**
     * Документы, содержащие информацию о возможности подключения
     * 
     */
    @XmlElement(name = "ConnectionPossibilityInformationDocument")
    protected List<SignedAttachmentType> connectionPossibilityInformationDocument;
    /**
     * Документы, содержащие мотивированный отказ в выдаче информации о возможности подключения
     * 
     */
    @XmlElement(name = "ReasonedRefusalDocument")
    protected List<SignedAttachmentType> reasonedRefusalDocument;
    /**
     * Текстовое описание ответа (также включается в сообщение для заявителя на ЕПГУ)
     * 
     */
    @XmlElement(name = "Description")
    protected String description;

    /**
     * Документы, содержащие информацию о возможности подключения
     * 
     * Gets the value of the connectionPossibilityInformationDocument property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionPossibilityInformationDocument property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getConnectionPossibilityInformationDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignedAttachmentType }
     * </p>
     * 
     * 
     * @return
     *     The value of the connectionPossibilityInformationDocument property.
     */
    public List<SignedAttachmentType> getConnectionPossibilityInformationDocument() {
        if (connectionPossibilityInformationDocument == null) {
            connectionPossibilityInformationDocument = new ArrayList<>();
        }
        return this.connectionPossibilityInformationDocument;
    }

    /**
     * Документы, содержащие мотивированный отказ в выдаче информации о возможности подключения
     * 
     * Gets the value of the reasonedRefusalDocument property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reasonedRefusalDocument property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getReasonedRefusalDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignedAttachmentType }
     * </p>
     * 
     * 
     * @return
     *     The value of the reasonedRefusalDocument property.
     */
    public List<SignedAttachmentType> getReasonedRefusalDocument() {
        if (reasonedRefusalDocument == null) {
            reasonedRefusalDocument = new ArrayList<>();
        }
        return this.reasonedRefusalDocument;
    }

    /**
     * Текстовое описание ответа (также включается в сообщение для заявителя на ЕПГУ)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDescription()
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
