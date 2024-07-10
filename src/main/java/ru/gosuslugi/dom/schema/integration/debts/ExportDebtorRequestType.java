
package ru.gosuslugi.dom.schema.integration.debts;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Тип данных, описывающий критерии экспорта сведений о гражданине, у которого имеется задолженность, подтвержденная судебным актом
 * 
 * <p>Java class for ExportDebtorRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportDebtorRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="INN" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <pattern value="\d{12}"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="SNILS" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <pattern value="\d{11}"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="IdentityDocument" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Type" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                   <element name="Series" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <minLength value="1"/>
 *                         <maxLength value="45"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="Number">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <minLength value="1"/>
 *                         <maxLength value="45"/>
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
@XmlType(name = "ExportDebtorRequestType", propOrder = {
    "inn",
    "snils",
    "identityDocument"
})
public class ExportDebtorRequestType {

    /**
     * ИНН
     * 
     */
    @XmlElement(name = "INN")
    protected String inn;
    /**
     * СНИЛС
     * 
     */
    @XmlElement(name = "SNILS")
    protected String snils;
    /**
     * Документ, удостоверяющий личность
     * 
     */
    @XmlElement(name = "IdentityDocument")
    protected ExportDebtorRequestType.IdentityDocument identityDocument;

    /**
     * ИНН
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINN() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getINN()
     */
    public void setINN(String value) {
        this.inn = value;
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
     * Документ, удостоверяющий личность
     * 
     * @return
     *     possible object is
     *     {@link ExportDebtorRequestType.IdentityDocument }
     *     
     */
    public ExportDebtorRequestType.IdentityDocument getIdentityDocument() {
        return identityDocument;
    }

    /**
     * Sets the value of the identityDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDebtorRequestType.IdentityDocument }
     *     
     * @see #getIdentityDocument()
     */
    public void setIdentityDocument(ExportDebtorRequestType.IdentityDocument value) {
        this.identityDocument = value;
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
     *         <element name="Type" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *         <element name="Series" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <minLength value="1"/>
     *               <maxLength value="45"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="Number">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <minLength value="1"/>
     *               <maxLength value="45"/>
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
        "type",
        "series",
        "number"
    })
    public static class IdentityDocument {

        /**
         * Вид документа. Ссылка на НСИ "Документ, удостоверяющий личность" (реестровый номер 95)
         * 
         */
        @XmlElement(name = "Type", required = true)
        protected NsiRef type;
        /**
         * Серия документа, удостоверяющего личность
         * 
         */
        @XmlElement(name = "Series")
        protected String series;
        /**
         * Номер документа, удостоверяющего личность
         * 
         */
        @XmlElement(name = "Number", required = true)
        protected String number;

        /**
         * Вид документа. Ссылка на НСИ "Документ, удостоверяющий личность" (реестровый номер 95)
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
         * Серия документа, удостоверяющего личность
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
         * Номер документа, удостоверяющего личность
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

    }

}
