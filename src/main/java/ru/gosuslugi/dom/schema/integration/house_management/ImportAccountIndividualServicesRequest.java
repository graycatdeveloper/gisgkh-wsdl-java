
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
 *       <choice>
 *         <element name="IndividualService" maxOccurs="1000">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}AccountIndividualServiceType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                   <choice>
 *                     <element name="AccountGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}AccountIndividualServiceGUID"/>
 *                   </choice>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="DeleteIndividualService" maxOccurs="1000">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}AccountIndividualServiceGUID"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </choice>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.0.0.1""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "individualService",
    "deleteIndividualService"
})
@XmlRootElement(name = "importAccountIndividualServicesRequest")
public class ImportAccountIndividualServicesRequest
    extends BaseType
{

    /**
     * Создание/обновление индивидуальной услуги ЛС
     * AccountGUID - для создания индивидуальной услуги ЛС
     * IndividualServiceGUID - для обновления индивидуальной услуги ЛС
     * 
     */
    @XmlElement(name = "IndividualService")
    protected List<ImportAccountIndividualServicesRequest.IndividualService> individualService;
    /**
     * Удаление индивидуальной услуги
     * 
     */
    @XmlElement(name = "DeleteIndividualService")
    protected List<ImportAccountIndividualServicesRequest.DeleteIndividualService> deleteIndividualService;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Создание/обновление индивидуальной услуги ЛС
     * AccountGUID - для создания индивидуальной услуги ЛС
     * IndividualServiceGUID - для обновления индивидуальной услуги ЛС
     * 
     * Gets the value of the individualService property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the individualService property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIndividualService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportAccountIndividualServicesRequest.IndividualService }
     * </p>
     * 
     * 
     * @return
     *     The value of the individualService property.
     */
    public List<ImportAccountIndividualServicesRequest.IndividualService> getIndividualService() {
        if (individualService == null) {
            individualService = new ArrayList<>();
        }
        return this.individualService;
    }

    /**
     * Удаление индивидуальной услуги
     * 
     * Gets the value of the deleteIndividualService property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deleteIndividualService property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDeleteIndividualService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportAccountIndividualServicesRequest.DeleteIndividualService }
     * </p>
     * 
     * 
     * @return
     *     The value of the deleteIndividualService property.
     */
    public List<ImportAccountIndividualServicesRequest.DeleteIndividualService> getDeleteIndividualService() {
        if (deleteIndividualService == null) {
            deleteIndividualService = new ArrayList<>();
        }
        return this.deleteIndividualService;
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
            return "11.0.0.1";
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
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}AccountIndividualServiceGUID"/>
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
        "transportGUID",
        "accountIndividualServiceGUID"
    })
    public static class DeleteIndividualService {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Идентификатор индивидуальной услуги ЛС
         * 
         */
        @XmlElement(name = "AccountIndividualServiceGUID", required = true)
        protected String accountIndividualServiceGUID;

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
         * Идентификатор индивидуальной услуги ЛС
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountIndividualServiceGUID() {
            return accountIndividualServiceGUID;
        }

        /**
         * Sets the value of the accountIndividualServiceGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getAccountIndividualServiceGUID()
         */
        public void setAccountIndividualServiceGUID(String value) {
            this.accountIndividualServiceGUID = value;
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}AccountIndividualServiceType">
     *       <sequence>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *         <choice>
     *           <element name="AccountGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *           <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}AccountIndividualServiceGUID"/>
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
    @XmlType(name = "", propOrder = {
        "transportGUID",
        "accountGUID",
        "accountIndividualServiceGUID"
    })
    public static class IndividualService
        extends AccountIndividualServiceType
    {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Идентификатор ЛС в ГИС ЖКХ (при обновлении данных ЛС)
         * 
         */
        @XmlElement(name = "AccountGUID")
        protected String accountGUID;
        /**
         * Идентификатор индивидуальной услуги ЛС
         * 
         */
        @XmlElement(name = "AccountIndividualServiceGUID")
        protected String accountIndividualServiceGUID;

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
         * Идентификатор ЛС в ГИС ЖКХ (при обновлении данных ЛС)
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountGUID() {
            return accountGUID;
        }

        /**
         * Sets the value of the accountGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getAccountGUID()
         */
        public void setAccountGUID(String value) {
            this.accountGUID = value;
        }

        /**
         * Идентификатор индивидуальной услуги ЛС
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountIndividualServiceGUID() {
            return accountIndividualServiceGUID;
        }

        /**
         * Sets the value of the accountIndividualServiceGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getAccountIndividualServiceGUID()
         */
        public void setAccountIndividualServiceGUID(String value) {
            this.accountIndividualServiceGUID = value;
        }

    }

}
