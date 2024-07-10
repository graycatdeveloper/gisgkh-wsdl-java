
package ru.gosuslugi.dom.schema.integration.base;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}HeaderType">
 *       <sequence>
 *         <choice>
 *           <element name="SenderID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *           <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *           <element name="Citizen">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <choice>
 *                     <element name="CitizenPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                     <sequence>
 *                       <element name="SNILS" minOccurs="0">
 *                         <simpleType>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                             <pattern value="\d{11}"/>
 *                           </restriction>
 *                         </simpleType>
 *                       </element>
 *                       <element name="Document" minOccurs="0">
 *                         <complexType>
 *                           <complexContent>
 *                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               <sequence>
 *                                 <element name="DocumentType">
 *                                   <complexType>
 *                                     <complexContent>
 *                                       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         <sequence>
 *                                           <element name="Code">
 *                                             <simpleType>
 *                                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 <maxLength value="20"/>
 *                                                 <pattern value="(A{0,1}\d{1,4}(\.)?)+"/>
 *                                               </restriction>
 *                                             </simpleType>
 *                                           </element>
 *                                           <element name="GUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                                           <element name="Name" minOccurs="0">
 *                                             <simpleType>
 *                                               <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
 *                                                 <maxLength value="1200"/>
 *                                               </restriction>
 *                                             </simpleType>
 *                                           </element>
 *                                         </sequence>
 *                                       </restriction>
 *                                     </complexContent>
 *                                   </complexType>
 *                                 </element>
 *                                 <element name="Series" minOccurs="0">
 *                                   <simpleType>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       <minLength value="1"/>
 *                                       <maxLength value="45"/>
 *                                     </restriction>
 *                                   </simpleType>
 *                                 </element>
 *                                 <element name="Number">
 *                                   <simpleType>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       <minLength value="1"/>
 *                                       <maxLength value="45"/>
 *                                     </restriction>
 *                                   </simpleType>
 *                                 </element>
 *                               </sequence>
 *                             </restriction>
 *                           </complexContent>
 *                         </complexType>
 *                       </element>
 *                     </sequence>
 *                   </choice>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *         </choice>
 *         <element name="IsOperatorSignature" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}ISCreator" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "senderID",
    "orgPPAGUID",
    "citizen",
    "isOperatorSignature",
    "isCreator"
})
@XmlRootElement(name = "RequestHeader")
public class RequestHeader
    extends HeaderType
{

    /**
     * Идентификатор поставщика данных
     * 
     */
    @XmlElement(name = "SenderID")
    protected String senderID;
    /**
     * Идентификатор зарегистрированной организации
     * 
     */
    protected String orgPPAGUID;
    /**
     * Информация о физическом лице
     * 
     */
    @XmlElement(name = "Citizen")
    protected RequestHeader.Citizen citizen;
    /**
     * Используется подпись Оператора ИС
     * 
     */
    @XmlElement(name = "IsOperatorSignature")
    protected Boolean isOperatorSignature;
    /**
     * Сведения об иной ИС, с использованием которой была сформирована информация (589/944/,п.164). Только для запросов размещения информации.
     * 
     */
    @XmlElement(name = "ISCreator")
    protected List<ISCreator> isCreator;

    /**
     * Идентификатор поставщика данных
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderID() {
        return senderID;
    }

    /**
     * Sets the value of the senderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSenderID()
     */
    public void setSenderID(String value) {
        this.senderID = value;
    }

    /**
     * Идентификатор зарегистрированной организации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgPPAGUID() {
        return orgPPAGUID;
    }

    /**
     * Sets the value of the orgPPAGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrgPPAGUID()
     */
    public void setOrgPPAGUID(String value) {
        this.orgPPAGUID = value;
    }

    /**
     * Информация о физическом лице
     * 
     * @return
     *     possible object is
     *     {@link RequestHeader.Citizen }
     *     
     */
    public RequestHeader.Citizen getCitizen() {
        return citizen;
    }

    /**
     * Sets the value of the citizen property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHeader.Citizen }
     *     
     * @see #getCitizen()
     */
    public void setCitizen(RequestHeader.Citizen value) {
        this.citizen = value;
    }

    /**
     * Используется подпись Оператора ИС
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOperatorSignature() {
        return isOperatorSignature;
    }

    /**
     * Sets the value of the isOperatorSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsOperatorSignature()
     */
    public void setIsOperatorSignature(Boolean value) {
        this.isOperatorSignature = value;
    }

    /**
     * Сведения об иной ИС, с использованием которой была сформирована информация (589/944/,п.164). Только для запросов размещения информации.
     * 
     * Gets the value of the isCreator property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isCreator property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getISCreator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ISCreator }
     * </p>
     * 
     * 
     * @return
     *     The value of the isCreator property.
     */
    public List<ISCreator> getISCreator() {
        if (isCreator == null) {
            isCreator = new ArrayList<>();
        }
        return this.isCreator;
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
     *         <element name="CitizenPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <sequence>
     *           <element name="SNILS" minOccurs="0">
     *             <simpleType>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                 <pattern value="\d{11}"/>
     *               </restriction>
     *             </simpleType>
     *           </element>
     *           <element name="Document" minOccurs="0">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="DocumentType">
     *                       <complexType>
     *                         <complexContent>
     *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             <sequence>
     *                               <element name="Code">
     *                                 <simpleType>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     <maxLength value="20"/>
     *                                     <pattern value="(A{0,1}\d{1,4}(\.)?)+"/>
     *                                   </restriction>
     *                                 </simpleType>
     *                               </element>
     *                               <element name="GUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                               <element name="Name" minOccurs="0">
     *                                 <simpleType>
     *                                   <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
     *                                     <maxLength value="1200"/>
     *                                   </restriction>
     *                                 </simpleType>
     *                               </element>
     *                             </sequence>
     *                           </restriction>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                     <element name="Series" minOccurs="0">
     *                       <simpleType>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                           <minLength value="1"/>
     *                           <maxLength value="45"/>
     *                         </restriction>
     *                       </simpleType>
     *                     </element>
     *                     <element name="Number">
     *                       <simpleType>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                           <minLength value="1"/>
     *                           <maxLength value="45"/>
     *                         </restriction>
     *                       </simpleType>
     *                     </element>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *         </sequence>
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
        "citizenPPAGUID",
        "snils",
        "document"
    })
    public static class Citizen {

        /**
         * Идентификатор  физического лица, зарегистрированного в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "CitizenPPAGUID")
        protected String citizenPPAGUID;
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
        @XmlElement(name = "Document")
        protected RequestHeader.Citizen.Document document;

        /**
         * Идентификатор  физического лица, зарегистрированного в ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCitizenPPAGUID() {
            return citizenPPAGUID;
        }

        /**
         * Sets the value of the citizenPPAGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getCitizenPPAGUID()
         */
        public void setCitizenPPAGUID(String value) {
            this.citizenPPAGUID = value;
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
         *     {@link RequestHeader.Citizen.Document }
         *     
         */
        public RequestHeader.Citizen.Document getDocument() {
            return document;
        }

        /**
         * Sets the value of the document property.
         * 
         * @param value
         *     allowed object is
         *     {@link RequestHeader.Citizen.Document }
         *     
         * @see #getDocument()
         */
        public void setDocument(RequestHeader.Citizen.Document value) {
            this.document = value;
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
         *         <element name="DocumentType">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="Code">
         *                     <simpleType>
         *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         <maxLength value="20"/>
         *                         <pattern value="(A{0,1}\d{1,4}(\.)?)+"/>
         *                       </restriction>
         *                     </simpleType>
         *                   </element>
         *                   <element name="GUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *                   <element name="Name" minOccurs="0">
         *                     <simpleType>
         *                       <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
         *                         <maxLength value="1200"/>
         *                       </restriction>
         *                     </simpleType>
         *                   </element>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
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
            "documentType",
            "series",
            "number"
        })
        public static class Document {

            /**
             * Вид документа, удостоверяющего личность (НСИ №95)
             * 
             */
            @XmlElement(name = "DocumentType", required = true)
            protected RequestHeader.Citizen.Document.DocumentType documentType;
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
            @XmlElement(name = "Number", required = true)
            protected String number;

            /**
             * Вид документа, удостоверяющего личность (НСИ №95)
             * 
             * @return
             *     possible object is
             *     {@link RequestHeader.Citizen.Document.DocumentType }
             *     
             */
            public RequestHeader.Citizen.Document.DocumentType getDocumentType() {
                return documentType;
            }

            /**
             * Sets the value of the documentType property.
             * 
             * @param value
             *     allowed object is
             *     {@link RequestHeader.Citizen.Document.DocumentType }
             *     
             * @see #getDocumentType()
             */
            public void setDocumentType(RequestHeader.Citizen.Document.DocumentType value) {
                this.documentType = value;
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
             * <p>Java class for anonymous complex type</p>.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       <sequence>
             *         <element name="Code">
             *           <simpleType>
             *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               <maxLength value="20"/>
             *               <pattern value="(A{0,1}\d{1,4}(\.)?)+"/>
             *             </restriction>
             *           </simpleType>
             *         </element>
             *         <element name="GUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
             *         <element name="Name" minOccurs="0">
             *           <simpleType>
             *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
             *               <maxLength value="1200"/>
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
                "code",
                "guid",
                "name"
            })
            public static class DocumentType {

                /**
                 * Код записи справочника
                 * 
                 */
                @XmlElement(name = "Code", required = true)
                protected String code;
                /**
                 * Идентификатор записи в соответствующем справочнике ГИС ЖКХ
                 * 
                 */
                @XmlElement(name = "GUID", required = true)
                protected String guid;
                /**
                 * Значение
                 * 
                 */
                @XmlElement(name = "Name")
                protected String name;

                /**
                 * Код записи справочника
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getCode()
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Идентификатор записи в соответствующем справочнике ГИС ЖКХ
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
                 * Значение
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getName()
                 */
                public void setName(String value) {
                    this.name = value;
                }

            }

        }

    }

}
