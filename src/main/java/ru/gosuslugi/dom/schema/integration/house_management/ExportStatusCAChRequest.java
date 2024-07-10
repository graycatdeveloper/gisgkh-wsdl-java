
package ru.gosuslugi.dom.schema.integration.house_management;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseType">
 *       <sequence>
 *         <element name="Criteria" maxOccurs="100">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <choice>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterGUID"/>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractGUID"/>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractVersionGUID"/>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterVersionGUID"/>
 *                   </choice>
 *                   <element name="ControlObjects" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="IsConflicted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             <element name="IsBlocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="10.0.1.1""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "criteria"
})
@XmlRootElement(name = "exportStatusCAChRequest")
public class ExportStatusCAChRequest
    extends BaseType
{

    @XmlElement(name = "Criteria", required = true)
    protected List<ExportStatusCAChRequest.Criteria> criteria;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Gets the value of the criteria property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criteria property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportStatusCAChRequest.Criteria }
     * </p>
     * 
     * 
     * @return
     *     The value of the criteria property.
     */
    public List<ExportStatusCAChRequest.Criteria> getCriteria() {
        if (criteria == null) {
            criteria = new ArrayList<>();
        }
        return this.criteria;
    }

    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "10.0.1.1";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVersion()
     */
    public void setVersion(String value) {
        this.version = value;
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
     *         <choice>
     *           <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterGUID"/>
     *           <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractGUID"/>
     *           <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractVersionGUID"/>
     *           <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterVersionGUID"/>
     *         </choice>
     *         <element name="ControlObjects" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="IsConflicted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   <element name="IsBlocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "charterGUID",
        "contractGUID",
        "contractVersionGUID",
        "charterVersionGUID",
        "controlObjects"
    })
    public static class Criteria {

        /**
         * Корневой идентификатор устава (не меняется от версии к версии)
         * 
         */
        @XmlElement(name = "CharterGUID")
        protected String charterGUID;
        /**
         * Корневой идентификатор договора (не меняется от версии к версии)
         * 
         */
        @XmlElement(name = "ContractGUID")
        protected String contractGUID;
        /**
         * Идентификатор версии договора
         * 
         */
        @XmlElement(name = "ContractVersionGUID")
        protected String contractVersionGUID;
        /**
         * Идентификатор версии устава в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "CharterVersionGUID")
        protected String charterVersionGUID;
        /**
         * Дополнительные критерии выборки по управляемым объектам
         * 
         */
        @XmlElement(name = "ControlObjects")
        protected ExportStatusCAChRequest.Criteria.ControlObjects controlObjects;

        /**
         * Корневой идентификатор устава (не меняется от версии к версии)
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCharterGUID() {
            return charterGUID;
        }

        /**
         * Sets the value of the charterGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getCharterGUID()
         */
        public void setCharterGUID(String value) {
            this.charterGUID = value;
        }

        /**
         * Корневой идентификатор договора (не меняется от версии к версии)
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContractGUID() {
            return contractGUID;
        }

        /**
         * Sets the value of the contractGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getContractGUID()
         */
        public void setContractGUID(String value) {
            this.contractGUID = value;
        }

        /**
         * Идентификатор версии договора
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContractVersionGUID() {
            return contractVersionGUID;
        }

        /**
         * Sets the value of the contractVersionGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getContractVersionGUID()
         */
        public void setContractVersionGUID(String value) {
            this.contractVersionGUID = value;
        }

        /**
         * Идентификатор версии устава в ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCharterVersionGUID() {
            return charterVersionGUID;
        }

        /**
         * Sets the value of the charterVersionGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getCharterVersionGUID()
         */
        public void setCharterVersionGUID(String value) {
            this.charterVersionGUID = value;
        }

        /**
         * Дополнительные критерии выборки по управляемым объектам
         * 
         * @return
         *     possible object is
         *     {@link ExportStatusCAChRequest.Criteria.ControlObjects }
         *     
         */
        public ExportStatusCAChRequest.Criteria.ControlObjects getControlObjects() {
            return controlObjects;
        }

        /**
         * Sets the value of the controlObjects property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportStatusCAChRequest.Criteria.ControlObjects }
         *     
         * @see #getControlObjects()
         */
        public void setControlObjects(ExportStatusCAChRequest.Criteria.ControlObjects value) {
            this.controlObjects = value;
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
         *         <element name="IsConflicted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         <element name="IsBlocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
            "isConflicted",
            "isBlocked"
        })
        public static class ControlObjects {

            /**
             * Выгружать только с признаком расхождения с Реестром инфомрации об управлении МКД
             * 
             */
            @XmlElement(name = "IsConflicted")
            protected Boolean isConflicted;
            /**
             * Выгружать только с признаком заблокированного дома
             * 
             */
            @XmlElement(name = "IsBlocked")
            protected Boolean isBlocked;

            /**
             * Выгружать только с признаком расхождения с Реестром инфомрации об управлении МКД
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsConflicted() {
                return isConflicted;
            }

            /**
             * Sets the value of the isConflicted property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isIsConflicted()
             */
            public void setIsConflicted(Boolean value) {
                this.isConflicted = value;
            }

            /**
             * Выгружать только с признаком заблокированного дома
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsBlocked() {
                return isBlocked;
            }

            /**
             * Sets the value of the isBlocked property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isIsBlocked()
             */
            public void setIsBlocked(Boolean value) {
                this.isBlocked = value;
            }

        }

    }

}
