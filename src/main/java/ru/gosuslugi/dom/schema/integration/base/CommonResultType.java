
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
 * Результат выполнения C_UD
 * 
 * <p>Java class for CommonResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CommonResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <element name="TransportGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <choice>
 *           <sequence>
 *             <element name="UniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *             <element name="UpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *           </sequence>
 *           <element name="Error" maxOccurs="unbounded">
 *             <complexType>
 *               <complexContent>
 *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}ErrorMessageType">
 *                 </extension>
 *               </complexContent>
 *             </complexType>
 *           </element>
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
@XmlType(name = "CommonResultType", propOrder = {
    "guid",
    "transportGUID",
    "uniqueNumber",
    "updateDate",
    "error"
})
public class CommonResultType {

    /**
     * Идентификатор создаваемой/изменяемой сущности
     * 
     */
    @XmlElement(name = "GUID")
    protected String guid;
    /**
     * Транспортный идентификатор
     * 
     */
    @XmlElement(name = "TransportGUID", required = true)
    protected String transportGUID;
    /**
     * Уникальный реестровый номер
     * 
     */
    @XmlElement(name = "UniqueNumber")
    protected String uniqueNumber;
    /**
     * Дата модификации
     * 
     */
    @XmlElement(name = "UpdateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDate;
    /**
     * Описание ошибки
     * 
     */
    @XmlElement(name = "Error")
    protected List<CommonResultType.Error> error;

    /**
     * Идентификатор создаваемой/изменяемой сущности
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
     * Уникальный реестровый номер
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
     * Описание ошибки
     * 
     * Gets the value of the error property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommonResultType.Error }
     * </p>
     * 
     * 
     * @return
     *     The value of the error property.
     */
    public List<CommonResultType.Error> getError() {
        if (error == null) {
            error = new ArrayList<>();
        }
        return this.error;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}ErrorMessageType">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Error
        extends ErrorMessageType
    {


    }

}
