
package ru.gosuslugi.dom.schema.integration.house_management;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


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
 *         <element name="RegistrationNumber">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="45"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="RegistrationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="PremisesNum" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}PremisesNumType" minOccurs="0"/>
 *         <element name="TotalArea" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}PremisesAreaType" minOccurs="0"/>
 *         <element name="PropertyType" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element name="ShareProperty" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   <element name="IndividualProperty" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   <element name="JointProperty" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ShareSize" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Numerator">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         <minInclusive value="1"/>
 *                         <maxInclusive value="100"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="Denumerator">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         <maxInclusive value="100"/>
 *                         <minInclusive value="1"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
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
@XmlType(name = "", propOrder = {
    "registrationNumber",
    "registrationDate",
    "premisesNum",
    "totalArea",
    "propertyType",
    "shareSize"
})
@XmlRootElement(name = "exportPropertyDetails")
public class ExportPropertyDetails {

    /**
     * Номер государственной регистрации
     * 
     */
    @XmlElement(name = "RegistrationNumber", required = true)
    protected String registrationNumber;
    /**
     * Дата государственной регистрации
     * 
     */
    @XmlElement(name = "RegistrationDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar registrationDate;
    /**
     * Номер помещения
     * 
     */
    @XmlElement(name = "PremisesNum")
    protected String premisesNum;
    /**
     * Общая площадь помещения
     * 
     */
    @XmlElement(name = "TotalArea")
    protected BigDecimal totalArea;
    /**
     * Вид собственности
     * 
     */
    @XmlElement(name = "PropertyType")
    protected ExportPropertyDetails.PropertyType propertyType;
    /**
     * Размер доли, принадлежащей собственнику.
     * Заполняется, если "Вид собственности"="Долевая"
     * 
     */
    @XmlElement(name = "ShareSize")
    protected ExportPropertyDetails.ShareSize shareSize;

    /**
     * Номер государственной регистрации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRegistrationNumber()
     */
    public void setRegistrationNumber(String value) {
        this.registrationNumber = value;
    }

    /**
     * Дата государственной регистрации
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getRegistrationDate()
     */
    public void setRegistrationDate(XMLGregorianCalendar value) {
        this.registrationDate = value;
    }

    /**
     * Номер помещения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremisesNum() {
        return premisesNum;
    }

    /**
     * Sets the value of the premisesNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPremisesNum()
     */
    public void setPremisesNum(String value) {
        this.premisesNum = value;
    }

    /**
     * Общая площадь помещения
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalArea() {
        return totalArea;
    }

    /**
     * Sets the value of the totalArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotalArea()
     */
    public void setTotalArea(BigDecimal value) {
        this.totalArea = value;
    }

    /**
     * Вид собственности
     * 
     * @return
     *     possible object is
     *     {@link ExportPropertyDetails.PropertyType }
     *     
     */
    public ExportPropertyDetails.PropertyType getPropertyType() {
        return propertyType;
    }

    /**
     * Sets the value of the propertyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportPropertyDetails.PropertyType }
     *     
     * @see #getPropertyType()
     */
    public void setPropertyType(ExportPropertyDetails.PropertyType value) {
        this.propertyType = value;
    }

    /**
     * Размер доли, принадлежащей собственнику.
     * Заполняется, если "Вид собственности"="Долевая"
     * 
     * @return
     *     possible object is
     *     {@link ExportPropertyDetails.ShareSize }
     *     
     */
    public ExportPropertyDetails.ShareSize getShareSize() {
        return shareSize;
    }

    /**
     * Sets the value of the shareSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportPropertyDetails.ShareSize }
     *     
     * @see #getShareSize()
     */
    public void setShareSize(ExportPropertyDetails.ShareSize value) {
        this.shareSize = value;
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
     *       <choice>
     *         <element name="ShareProperty" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         <element name="IndividualProperty" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         <element name="JointProperty" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *       </choice>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "shareProperty",
        "individualProperty",
        "jointProperty"
    })
    public static class PropertyType {

        /**
         * Долевая
         * 
         */
        @XmlElement(name = "ShareProperty")
        protected Boolean shareProperty;
        /**
         * Индивидуальная
         * 
         */
        @XmlElement(name = "IndividualProperty")
        protected Boolean individualProperty;
        /**
         * Совместная
         * 
         */
        @XmlElement(name = "JointProperty", defaultValue = "true")
        protected Boolean jointProperty;

        /**
         * Долевая
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShareProperty() {
            return shareProperty;
        }

        /**
         * Sets the value of the shareProperty property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isShareProperty()
         */
        public void setShareProperty(Boolean value) {
            this.shareProperty = value;
        }

        /**
         * Индивидуальная
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIndividualProperty() {
            return individualProperty;
        }

        /**
         * Sets the value of the individualProperty property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isIndividualProperty()
         */
        public void setIndividualProperty(Boolean value) {
            this.individualProperty = value;
        }

        /**
         * Совместная
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isJointProperty() {
            return jointProperty;
        }

        /**
         * Sets the value of the jointProperty property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isJointProperty()
         */
        public void setJointProperty(Boolean value) {
            this.jointProperty = value;
        }

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
     *         <element name="Numerator">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               <minInclusive value="1"/>
     *               <maxInclusive value="100"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="Denumerator">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               <maxInclusive value="100"/>
     *               <minInclusive value="1"/>
     *             </restriction>
     *           </simpleType>
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
    @XmlType(name = "", propOrder = {
        "numerator",
        "denumerator"
    })
    public static class ShareSize {

        /**
         * Доля собственности. Размер доли (Числитель)
         * 
         */
        @XmlElement(name = "Numerator")
        protected int numerator;
        /**
         * Доля собственности. Размер доли (Знаменатель)
         * 
         */
        @XmlElement(name = "Denumerator")
        protected int denumerator;

        /**
         * Доля собственности. Размер доли (Числитель)
         * 
         */
        public int getNumerator() {
            return numerator;
        }

        /**
         * Sets the value of the numerator property.
         * 
         */
        public void setNumerator(int value) {
            this.numerator = value;
        }

        /**
         * Доля собственности. Размер доли (Знаменатель)
         * 
         */
        public int getDenumerator() {
            return denumerator;
        }

        /**
         * Sets the value of the denumerator property.
         * 
         */
        public void setDenumerator(int value) {
            this.denumerator = value;
        }

    }

}
