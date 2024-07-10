
package ru.gosuslugi.dom.schema.integration.services;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;


/**
 * Тип данных, описывающий реквизитов акта
 * 
 * <p>Java class for ActDetailsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ActDetailsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ActType">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="C"/>
 *               <enumeration value="Q"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ActNumber" type="{http://dom.gosuslugi.ru/schema/integration/base/}String255Type"/>
 *         <element name="ActDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="StartReportingPeriod" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="EndReportingPeriod" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="ActFile" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActDetailsType", propOrder = {
    "actType",
    "actNumber",
    "actDate",
    "startReportingPeriod",
    "endReportingPeriod",
    "actFile"
})
public class ActDetailsType {

    /**
     * Тип акта.
     * Возможные значения: (C)ompleted works - Акт выполненных работ;
     * (Q)uality violation - Акт нарушения качества.
     * 
     */
    @XmlElement(name = "ActType", required = true)
    protected String actType;
    /**
     * Номер акта
     * 
     */
    @XmlElement(name = "ActNumber", required = true)
    protected String actNumber;
    /**
     * Дата заключения
     * 
     */
    @XmlElement(name = "ActDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actDate;
    /**
     * Дата начала отчетного периода.
     * Элемент обязательно заполняется для акта выполненных работ.
     * 
     */
    @XmlElement(name = "StartReportingPeriod")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startReportingPeriod;
    /**
     * Дата окончания отчетного периода.
     * Элемент обязательно заполняется для акта выполненных работ.
     * 
     */
    @XmlElement(name = "EndReportingPeriod")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endReportingPeriod;
    /**
     * Файл акта
     * 
     */
    @XmlElement(name = "ActFile", required = true)
    protected AttachmentType actFile;

    /**
     * Тип акта.
     * Возможные значения: (C)ompleted works - Акт выполненных работ;
     * (Q)uality violation - Акт нарушения качества.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActType() {
        return actType;
    }

    /**
     * Sets the value of the actType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getActType()
     */
    public void setActType(String value) {
        this.actType = value;
    }

    /**
     * Номер акта
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActNumber() {
        return actNumber;
    }

    /**
     * Sets the value of the actNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getActNumber()
     */
    public void setActNumber(String value) {
        this.actNumber = value;
    }

    /**
     * Дата заключения
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActDate() {
        return actDate;
    }

    /**
     * Sets the value of the actDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getActDate()
     */
    public void setActDate(XMLGregorianCalendar value) {
        this.actDate = value;
    }

    /**
     * Дата начала отчетного периода.
     * Элемент обязательно заполняется для акта выполненных работ.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartReportingPeriod() {
        return startReportingPeriod;
    }

    /**
     * Sets the value of the startReportingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getStartReportingPeriod()
     */
    public void setStartReportingPeriod(XMLGregorianCalendar value) {
        this.startReportingPeriod = value;
    }

    /**
     * Дата окончания отчетного периода.
     * Элемент обязательно заполняется для акта выполненных работ.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndReportingPeriod() {
        return endReportingPeriod;
    }

    /**
     * Sets the value of the endReportingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEndReportingPeriod()
     */
    public void setEndReportingPeriod(XMLGregorianCalendar value) {
        this.endReportingPeriod = value;
    }

    /**
     * Файл акта
     * 
     * @return
     *     possible object is
     *     {@link AttachmentType }
     *     
     */
    public AttachmentType getActFile() {
        return actFile;
    }

    /**
     * Sets the value of the actFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentType }
     *     
     * @see #getActFile()
     */
    public void setActFile(AttachmentType value) {
        this.actFile = value;
    }

}
