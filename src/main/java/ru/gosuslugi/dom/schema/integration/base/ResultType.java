
package ru.gosuslugi.dom.schema.integration.base;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Базовый тип ответа на запрос создания, редактирования, удаления
 * 
 * <p>Java class for ResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="TransportGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *           <element name="UpdateGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         </choice>
 *         <choice>
 *           <sequence>
 *             <element name="GUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *             <element name="UpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *             <element name="UniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           </sequence>
 *           <element name="CreateOrUpdateError" type="{http://dom.gosuslugi.ru/schema/integration/base/}ErrorMessageType" maxOccurs="unbounded"/>
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
@XmlType(name = "ResultType", propOrder = {
    "transportGUID",
    "updateGUID",
    "guid",
    "updateDate",
    "uniqueNumber",
    "createOrUpdateError"
})
public class ResultType {

    /**
     * Транспортный идентификатор, определенный постащиком информации
     * 
     */
    @XmlElement(name = "TransportGUID")
    protected String transportGUID;
    /**
     * Идентификатор объекта в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "UpdateGUID")
    protected String updateGUID;
    /**
     * Идентификатор объекта в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "GUID")
    protected String guid;
    /**
     * Дата модификации
     * 
     */
    @XmlElement(name = "UpdateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDate;
    /**
     * Уникальный номер
     * 
     */
    @XmlElement(name = "UniqueNumber")
    protected String uniqueNumber;
    @XmlElement(name = "CreateOrUpdateError")
    protected List<ErrorMessageType> createOrUpdateError;

    /**
     * Транспортный идентификатор, определенный постащиком информации
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
     * Идентификатор объекта в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateGUID() {
        return updateGUID;
    }

    /**
     * Sets the value of the updateGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUpdateGUID()
     */
    public void setUpdateGUID(String value) {
        this.updateGUID = value;
    }

    /**
     * Идентификатор объекта в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGUID() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getGUID()
     */
    public void setGUID(String value) {
        this.guid = value;
    }

    /**
     * Дата модификации
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getUpdateDate()
     */
    public void setUpdateDate(XMLGregorianCalendar value) {
        this.updateDate = value;
    }

    /**
     * Уникальный номер
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueNumber() {
        return uniqueNumber;
    }

    /**
     * Sets the value of the uniqueNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUniqueNumber()
     */
    public void setUniqueNumber(String value) {
        this.uniqueNumber = value;
    }

    /**
     * Gets the value of the createOrUpdateError property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the createOrUpdateError property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCreateOrUpdateError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorMessageType }
     * </p>
     * 
     * 
     * @return
     *     The value of the createOrUpdateError property.
     */
    public List<ErrorMessageType> getCreateOrUpdateError() {
        if (createOrUpdateError == null) {
            createOrUpdateError = new ArrayList<>();
        }
        return this.createOrUpdateError;
    }

}
