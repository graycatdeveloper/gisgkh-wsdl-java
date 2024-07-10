
package ru.gosuslugi.dom.schema.integration.house_management;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Значение строки данных для объекта ЖФ
 * 
 * <p>Java class for OGFDataValue complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OGFDataValue">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="StringValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="FloatValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         <element name="DateTimeValue" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="IntegerValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="BooleanValue" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="NsiCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="File" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OGFDataValue", propOrder = {
    "stringValue",
    "floatValue",
    "dateTimeValue",
    "integerValue",
    "booleanValue",
    "nsiCode",
    "file"
})
public class OGFDataValue {

    /**
     * Строка
     * 
     */
    @XmlElement(name = "StringValue")
    protected String stringValue;
    /**
     * Вещественное
     * 
     */
    @XmlElement(name = "FloatValue")
    protected BigDecimal floatValue;
    /**
     * Дата
     * 
     */
    @XmlElement(name = "DateTimeValue")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeValue;
    /**
     * Целое
     * 
     */
    @XmlElement(name = "IntegerValue")
    protected Integer integerValue;
    /**
     * Логическое
     * 
     */
    @XmlElement(name = "BooleanValue")
    protected Boolean booleanValue;
    /**
     * Перечислимое (ссылка на код записи справочника)
     * 
     */
    @XmlElement(name = "NsiCode")
    protected String nsiCode;
    /**
     * Файл (ссылка на файл)
     * 
     */
    @XmlElement(name = "File")
    protected String file;

    /**
     * Строка
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * Sets the value of the stringValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStringValue()
     */
    public void setStringValue(String value) {
        this.stringValue = value;
    }

    /**
     * Вещественное
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFloatValue() {
        return floatValue;
    }

    /**
     * Sets the value of the floatValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getFloatValue()
     */
    public void setFloatValue(BigDecimal value) {
        this.floatValue = value;
    }

    /**
     * Дата
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeValue() {
        return dateTimeValue;
    }

    /**
     * Sets the value of the dateTimeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDateTimeValue()
     */
    public void setDateTimeValue(XMLGregorianCalendar value) {
        this.dateTimeValue = value;
    }

    /**
     * Целое
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntegerValue() {
        return integerValue;
    }

    /**
     * Sets the value of the integerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getIntegerValue()
     */
    public void setIntegerValue(Integer value) {
        this.integerValue = value;
    }

    /**
     * Логическое
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBooleanValue() {
        return booleanValue;
    }

    /**
     * Sets the value of the booleanValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isBooleanValue()
     */
    public void setBooleanValue(Boolean value) {
        this.booleanValue = value;
    }

    /**
     * Перечислимое (ссылка на код записи справочника)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNsiCode() {
        return nsiCode;
    }

    /**
     * Sets the value of the nsiCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNsiCode()
     */
    public void setNsiCode(String value) {
        this.nsiCode = value;
    }

    /**
     * Файл (ссылка на файл)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFile()
     */
    public void setFile(String value) {
        this.file = value;
    }

}
