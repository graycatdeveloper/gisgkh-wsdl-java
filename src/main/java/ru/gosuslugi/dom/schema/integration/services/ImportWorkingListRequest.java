
package ru.gosuslugi.dom.schema.integration.services;

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
 *         <element name="ApprovedWorkingListData">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/services/}WorkingListBaseType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                   <element name="WorkListItem" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/services/}WorkingListItemType">
 *                           <sequence>
 *                             <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                           </sequence>
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="CancelWorkingList">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                   <element name="WorkListGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="AnnulledWorkingList">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                   <element name="WorkListGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="ReasonOfAnnulment">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <maxLength value="1000"/>
 *                         <minLength value="1"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </choice>
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
    "approvedWorkingListData",
    "cancelWorkingList",
    "annulledWorkingList"
})
@XmlRootElement(name = "importWorkingListRequest")
public class ImportWorkingListRequest
    extends BaseType
{

    /**
     * Перечень утвержден
     * 
     */
    @XmlElement(name = "ApprovedWorkingListData")
    protected ImportWorkingListRequest.ApprovedWorkingListData approvedWorkingListData;
    /**
     * Идентификатор отмененного перечня
     * 
     */
    @XmlElement(name = "CancelWorkingList")
    protected ImportWorkingListRequest.CancelWorkingList cancelWorkingList;
    /**
     * Идентификатор аннулированного перечня
     * 
     */
    @XmlElement(name = "AnnulledWorkingList")
    protected ImportWorkingListRequest.AnnulledWorkingList annulledWorkingList;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Перечень утвержден
     * 
     * @return
     *     possible object is
     *     {@link ImportWorkingListRequest.ApprovedWorkingListData }
     *     
     */
    public ImportWorkingListRequest.ApprovedWorkingListData getApprovedWorkingListData() {
        return approvedWorkingListData;
    }

    /**
     * Sets the value of the approvedWorkingListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportWorkingListRequest.ApprovedWorkingListData }
     *     
     * @see #getApprovedWorkingListData()
     */
    public void setApprovedWorkingListData(ImportWorkingListRequest.ApprovedWorkingListData value) {
        this.approvedWorkingListData = value;
    }

    /**
     * Идентификатор отмененного перечня
     * 
     * @return
     *     possible object is
     *     {@link ImportWorkingListRequest.CancelWorkingList }
     *     
     */
    public ImportWorkingListRequest.CancelWorkingList getCancelWorkingList() {
        return cancelWorkingList;
    }

    /**
     * Sets the value of the cancelWorkingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportWorkingListRequest.CancelWorkingList }
     *     
     * @see #getCancelWorkingList()
     */
    public void setCancelWorkingList(ImportWorkingListRequest.CancelWorkingList value) {
        this.cancelWorkingList = value;
    }

    /**
     * Идентификатор аннулированного перечня
     * 
     * @return
     *     possible object is
     *     {@link ImportWorkingListRequest.AnnulledWorkingList }
     *     
     */
    public ImportWorkingListRequest.AnnulledWorkingList getAnnulledWorkingList() {
        return annulledWorkingList;
    }

    /**
     * Sets the value of the annulledWorkingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportWorkingListRequest.AnnulledWorkingList }
     *     
     * @see #getAnnulledWorkingList()
     */
    public void setAnnulledWorkingList(ImportWorkingListRequest.AnnulledWorkingList value) {
        this.annulledWorkingList = value;
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
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *         <element name="WorkListGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="ReasonOfAnnulment">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <maxLength value="1000"/>
     *               <minLength value="1"/>
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
        "transportGUID",
        "workListGUID",
        "reasonOfAnnulment"
    })
    public static class AnnulledWorkingList {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Идентификатор перечня
         * 
         */
        @XmlElement(name = "WorkListGUID", required = true)
        protected String workListGUID;
        /**
         * Причина аннулирования
         * 
         */
        @XmlElement(name = "ReasonOfAnnulment", required = true)
        protected String reasonOfAnnulment;

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
         * Идентификатор перечня
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWorkListGUID() {
            return workListGUID;
        }

        /**
         * Sets the value of the workListGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getWorkListGUID()
         */
        public void setWorkListGUID(String value) {
            this.workListGUID = value;
        }

        /**
         * Причина аннулирования
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReasonOfAnnulment() {
            return reasonOfAnnulment;
        }

        /**
         * Sets the value of the reasonOfAnnulment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getReasonOfAnnulment()
         */
        public void setReasonOfAnnulment(String value) {
            this.reasonOfAnnulment = value;
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/services/}WorkingListBaseType">
     *       <sequence>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *         <element name="WorkListItem" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/services/}WorkingListItemType">
     *                 <sequence>
     *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                 </sequence>
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
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
        "workListItem"
    })
    public static class ApprovedWorkingListData
        extends WorkingListBaseType
    {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Работа/услуга перечня
         * 
         */
        @XmlElement(name = "WorkListItem", required = true)
        protected List<ImportWorkingListRequest.ApprovedWorkingListData.WorkListItem> workListItem;

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
         * Работа/услуга перечня
         * 
         * Gets the value of the workListItem property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the workListItem property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getWorkListItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ImportWorkingListRequest.ApprovedWorkingListData.WorkListItem }
         * </p>
         * 
         * 
         * @return
         *     The value of the workListItem property.
         */
        public List<ImportWorkingListRequest.ApprovedWorkingListData.WorkListItem> getWorkListItem() {
            if (workListItem == null) {
                workListItem = new ArrayList<>();
            }
            return this.workListItem;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/services/}WorkingListItemType">
         *       <sequence>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
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
            "transportGUID"
        })
        public static class WorkListItem
            extends WorkingListItemType
        {

            /**
             * Транспортный идентификатор
             * 
             */
            @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
            protected String transportGUID;

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
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *         <element name="WorkListGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
        "workListGUID"
    })
    public static class CancelWorkingList {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Идентификатор перечня
         * 
         */
        @XmlElement(name = "WorkListGUID", required = true)
        protected String workListGUID;

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
         * Идентификатор перечня
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWorkListGUID() {
            return workListGUID;
        }

        /**
         * Sets the value of the workListGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getWorkListGUID()
         */
        public void setWorkListGUID(String value) {
            this.workListGUID = value;
        }

    }

}
