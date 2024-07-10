
package ru.gosuslugi.dom.schema.integration.tech_conn;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.SignedAttachmentType;


/**
 * Составной тип. Отправка ответа по заявлению на предоставление технических условий подключения
 * 
 * <p>Java class for TechnicalSpecificationApplicationAnswerType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TechnicalSpecificationApplicationAnswerType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="TechnicalSpecificationDocument" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded"/>
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
@XmlType(name = "TechnicalSpecificationApplicationAnswerType", propOrder = {
    "technicalSpecificationDocument",
    "reasonedRefusalDocument",
    "description"
})
public class TechnicalSpecificationApplicationAnswerType {

    /**
     * Документы, содержащие технические условия подключения
     * 
     */
    @XmlElement(name = "TechnicalSpecificationDocument")
    protected List<SignedAttachmentType> technicalSpecificationDocument;
    /**
     * Документы, содержащие мотивированный отказ в выдаче технических условий подключения
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
     * Документы, содержащие технические условия подключения
     * 
     * Gets the value of the technicalSpecificationDocument property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalSpecificationDocument property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTechnicalSpecificationDocument().add(newItem);
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
     *     The value of the technicalSpecificationDocument property.
     */
    public List<SignedAttachmentType> getTechnicalSpecificationDocument() {
        if (technicalSpecificationDocument == null) {
            technicalSpecificationDocument = new ArrayList<>();
        }
        return this.technicalSpecificationDocument;
    }

    /**
     * Документы, содержащие мотивированный отказ в выдаче технических условий подключения
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
