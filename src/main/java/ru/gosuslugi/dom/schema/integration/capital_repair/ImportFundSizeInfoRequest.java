
package ru.gosuslugi.dom.schema.integration.capital_repair;

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
 *         <element name="importFundSizeInfo" maxOccurs="1000">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="FundSizeInfoGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                   <choice>
 *                     <element name="LoadFundSizeInfo" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}FundSizeInfoType"/>
 *                     <element name="CancelFundSizeInfo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="12.0.0.1""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "importFundSizeInfo"
})
@XmlRootElement(name = "importFundSizeInfoRequest")
public class ImportFundSizeInfoRequest
    extends BaseType
{

    /**
     * Импорт информации о размере фондов капитального ремонта (Создание/внесение изменений/аннулирование)
     * 
     */
    @XmlElement(required = true)
    protected List<ImportFundSizeInfoRequest.ImportFundSizeInfo> importFundSizeInfo;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Импорт информации о размере фондов капитального ремонта (Создание/внесение изменений/аннулирование)
     * 
     * Gets the value of the importFundSizeInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importFundSizeInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportFundSizeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportFundSizeInfoRequest.ImportFundSizeInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the importFundSizeInfo property.
     */
    public List<ImportFundSizeInfoRequest.ImportFundSizeInfo> getImportFundSizeInfo() {
        if (importFundSizeInfo == null) {
            importFundSizeInfo = new ArrayList<>();
        }
        return this.importFundSizeInfo;
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
            return "12.0.0.1";
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
     *         <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="FundSizeInfoGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *         <choice>
     *           <element name="LoadFundSizeInfo" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}FundSizeInfoType"/>
     *           <element name="CancelFundSizeInfo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    @XmlType(name = "", propOrder = {
        "transportGuid",
        "fundSizeInfoGuid",
        "loadFundSizeInfo",
        "cancelFundSizeInfo"
    })
    public static class ImportFundSizeInfo {

        /**
         * Транспортный идентификатор  для выполнения операции со сведениями об информации о размере фондов капитального ремонта
         * 
         */
        @XmlElement(name = "TransportGuid", required = true)
        protected String transportGuid;
        /**
         * Идентификатор информации о размере фондов капитального ремонта
         * 
         */
        @XmlElement(name = "FundSizeInfoGuid")
        protected String fundSizeInfoGuid;
        /**
         * Создание/Внесение изменений в информацию о размере фонда, с последующим размещением в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "LoadFundSizeInfo")
        protected FundSizeInfoType loadFundSizeInfo;
        /**
         * Аннулировать запись
         * 
         */
        @XmlElement(name = "CancelFundSizeInfo")
        protected Boolean cancelFundSizeInfo;

        /**
         * Транспортный идентификатор  для выполнения операции со сведениями об информации о размере фондов капитального ремонта
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransportGuid() {
            return transportGuid;
        }

        /**
         * Sets the value of the transportGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTransportGuid()
         */
        public void setTransportGuid(String value) {
            this.transportGuid = value;
        }

        /**
         * Идентификатор информации о размере фондов капитального ремонта
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFundSizeInfoGuid() {
            return fundSizeInfoGuid;
        }

        /**
         * Sets the value of the fundSizeInfoGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getFundSizeInfoGuid()
         */
        public void setFundSizeInfoGuid(String value) {
            this.fundSizeInfoGuid = value;
        }

        /**
         * Создание/Внесение изменений в информацию о размере фонда, с последующим размещением в ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link FundSizeInfoType }
         *     
         */
        public FundSizeInfoType getLoadFundSizeInfo() {
            return loadFundSizeInfo;
        }

        /**
         * Sets the value of the loadFundSizeInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link FundSizeInfoType }
         *     
         * @see #getLoadFundSizeInfo()
         */
        public void setLoadFundSizeInfo(FundSizeInfoType value) {
            this.loadFundSizeInfo = value;
        }

        /**
         * Аннулировать запись
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCancelFundSizeInfo() {
            return cancelFundSizeInfo;
        }

        /**
         * Sets the value of the cancelFundSizeInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isCancelFundSizeInfo()
         */
        public void setCancelFundSizeInfo(Boolean value) {
            this.cancelFundSizeInfo = value;
        }

    }

}
