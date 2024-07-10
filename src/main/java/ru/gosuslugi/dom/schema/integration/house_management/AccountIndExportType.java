
package ru.gosuslugi.dom.schema.integration.house_management;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.individual_registry_base.FIOExportType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Физическое лицо
 * 
 * <p>Java class for AccountIndExportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AccountIndExportType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/individual-registry-base/}FIOExportType">
 *       <sequence>
 *         <element name="Sex" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="1"/>
 *               <enumeration value="M"/>
 *               <enumeration value="F"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/individual-registry-base/}SNILS"/>
 *           <element name="ID">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="Type" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *                     <element name="Series" minOccurs="0">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <minLength value="1"/>
 *                           <maxLength value="45"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element name="Number" minOccurs="0">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <minLength value="1"/>
 *                           <maxLength value="45"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *         </choice>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountIndExportType", propOrder = {
    "sex",
    "dateOfBirth",
    "snils",
    "id"
})
public class AccountIndExportType
    extends FIOExportType
{

    /**
     * Пол (M- мужской, F-женский)
     * 
     */
    @XmlElement(name = "Sex")
    protected String sex;
    /**
     * Дата рождения
     * 
     */
    @XmlElement(name = "DateOfBirth")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;
    /**
     * СНИЛС
     * 
     */
    @XmlElement(name = "SNILS", namespace = "http://dom.gosuslugi.ru/schema/integration/individual-registry-base/")
    protected String snils;
    /**
     * Удостоверение личности
     * 
     */
    @XmlElement(name = "ID")
    protected AccountIndExportType.ID id;

    /**
     * Пол (M- мужской, F-женский)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSex()
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * Дата рождения
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDateOfBirth()
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * СНИЛС
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNILS() {
        return snils;
    }

    /**
     * Sets the value of the snils property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSNILS()
     */
    public void setSNILS(String value) {
        this.snils = value;
    }

    /**
     * Удостоверение личности
     * 
     * @return
     *     possible object is
     *     {@link AccountIndExportType.ID }
     *     
     */
    public AccountIndExportType.ID getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIndExportType.ID }
     *     
     * @see #getID()
     */
    public void setID(AccountIndExportType.ID value) {
        this.id = value;
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
     *         <element name="Type" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
     *         <element name="Series" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <minLength value="1"/>
     *               <maxLength value="45"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="Number" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <minLength value="1"/>
     *               <maxLength value="45"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
        "type",
        "series",
        "number",
        "issueDate"
    })
    public static class ID {

        /**
         * Документ, удостоверяющий личность  (НСИ 95)
         * 
         */
        @XmlElement(name = "Type")
        protected NsiRef type;
        /**
         * Серия документа
         * 
         */
        @XmlElement(name = "Series")
        protected String series;
        /**
         * Номер документа
         * 
         */
        @XmlElement(name = "Number")
        protected String number;
        /**
         * Дата выдачи документа
         * 
         */
        @XmlElement(name = "IssueDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar issueDate;

        /**
         * Документ, удостоверяющий личность  (НСИ 95)
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getType()
         */
        public void setType(NsiRef value) {
            this.type = value;
        }

        /**
         * Серия документа
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSeries() {
            return series;
        }

        /**
         * Sets the value of the series property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getSeries()
         */
        public void setSeries(String value) {
            this.series = value;
        }

        /**
         * Номер документа
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumber() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getNumber()
         */
        public void setNumber(String value) {
            this.number = value;
        }

        /**
         * Дата выдачи документа
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getIssueDate() {
            return issueDate;
        }

        /**
         * Sets the value of the issueDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getIssueDate()
         */
        public void setIssueDate(XMLGregorianCalendar value) {
            this.issueDate = value;
        }

    }

}
