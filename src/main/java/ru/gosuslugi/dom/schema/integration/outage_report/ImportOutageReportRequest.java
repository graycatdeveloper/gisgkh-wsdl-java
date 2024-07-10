
package ru.gosuslugi.dom.schema.integration.outage_report;

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
 *         <element name="OutageReport" maxOccurs="100">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                   <choice>
 *                     <element name="PlacingOutageReport">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="OutageReportData" type="{http://dom.gosuslugi.ru/schema/integration/outage-report/}OutageReportType"/>
 *                               <element name="OutageReportObjects">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <extension base="{http://dom.gosuslugi.ru/schema/integration/outage-report/}OutageReportObjectType">
 *                                     </extension>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="EditOutageReport">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="OutageReportGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                               <element name="OutageReportData" type="{http://dom.gosuslugi.ru/schema/integration/outage-report/}OutageReportType"/>
 *                               <element name="OutageReportObjects">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <extension base="{http://dom.gosuslugi.ru/schema/integration/outage-report/}OutageReportObjectType">
 *                                     </extension>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="AnnulmentOutageReport">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="OutageReportGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                               <element name="AnnulmentReason">
 *                                 <simpleType>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     <minLength value="1"/>
 *                                     <maxLength value="1000"/>
 *                                   </restriction>
 *                                 </simpleType>
 *                               </element>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="13.2.2.0""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "outageReport"
})
@XmlRootElement(name = "importOutageReportRequest")
public class ImportOutageReportRequest
    extends BaseType
{

    /**
     * Сведения о перерывах в предоставлении коммунальных услуг
     * 
     */
    @XmlElement(name = "OutageReport", required = true)
    protected List<ImportOutageReportRequest.OutageReport> outageReport;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Сведения о перерывах в предоставлении коммунальных услуг
     * 
     * Gets the value of the outageReport property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outageReport property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOutageReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportOutageReportRequest.OutageReport }
     * </p>
     * 
     * 
     * @return
     *     The value of the outageReport property.
     */
    public List<ImportOutageReportRequest.OutageReport> getOutageReport() {
        if (outageReport == null) {
            outageReport = new ArrayList<>();
        }
        return this.outageReport;
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
            return "13.2.2.0";
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
     *         <choice>
     *           <element name="PlacingOutageReport">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="OutageReportData" type="{http://dom.gosuslugi.ru/schema/integration/outage-report/}OutageReportType"/>
     *                     <element name="OutageReportObjects">
     *                       <complexType>
     *                         <complexContent>
     *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/outage-report/}OutageReportObjectType">
     *                           </extension>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="EditOutageReport">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="OutageReportGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                     <element name="OutageReportData" type="{http://dom.gosuslugi.ru/schema/integration/outage-report/}OutageReportType"/>
     *                     <element name="OutageReportObjects">
     *                       <complexType>
     *                         <complexContent>
     *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/outage-report/}OutageReportObjectType">
     *                           </extension>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="AnnulmentOutageReport">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="OutageReportGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                     <element name="AnnulmentReason">
     *                       <simpleType>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                           <minLength value="1"/>
     *                           <maxLength value="1000"/>
     *                         </restriction>
     *                       </simpleType>
     *                     </element>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
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
        "transportGUID",
        "placingOutageReport",
        "editOutageReport",
        "annulmentOutageReport"
    })
    public static class OutageReport {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Размещение сведений о перерывах в предоставлении коммунальных услуг
         * 
         */
        @XmlElement(name = "PlacingOutageReport")
        protected ImportOutageReportRequest.OutageReport.PlacingOutageReport placingOutageReport;
        /**
         * Редактирование сведений о перерывах в предоставлении коммунальных услуг
         * 
         */
        @XmlElement(name = "EditOutageReport")
        protected ImportOutageReportRequest.OutageReport.EditOutageReport editOutageReport;
        /**
         * Аннулирование сведений о перерывах в предоставлении коммунальных услуг
         * 
         */
        @XmlElement(name = "AnnulmentOutageReport")
        protected ImportOutageReportRequest.OutageReport.AnnulmentOutageReport annulmentOutageReport;

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
         * Размещение сведений о перерывах в предоставлении коммунальных услуг
         * 
         * @return
         *     possible object is
         *     {@link ImportOutageReportRequest.OutageReport.PlacingOutageReport }
         *     
         */
        public ImportOutageReportRequest.OutageReport.PlacingOutageReport getPlacingOutageReport() {
            return placingOutageReport;
        }

        /**
         * Sets the value of the placingOutageReport property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportOutageReportRequest.OutageReport.PlacingOutageReport }
         *     
         * @see #getPlacingOutageReport()
         */
        public void setPlacingOutageReport(ImportOutageReportRequest.OutageReport.PlacingOutageReport value) {
            this.placingOutageReport = value;
        }

        /**
         * Редактирование сведений о перерывах в предоставлении коммунальных услуг
         * 
         * @return
         *     possible object is
         *     {@link ImportOutageReportRequest.OutageReport.EditOutageReport }
         *     
         */
        public ImportOutageReportRequest.OutageReport.EditOutageReport getEditOutageReport() {
            return editOutageReport;
        }

        /**
         * Sets the value of the editOutageReport property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportOutageReportRequest.OutageReport.EditOutageReport }
         *     
         * @see #getEditOutageReport()
         */
        public void setEditOutageReport(ImportOutageReportRequest.OutageReport.EditOutageReport value) {
            this.editOutageReport = value;
        }

        /**
         * Аннулирование сведений о перерывах в предоставлении коммунальных услуг
         * 
         * @return
         *     possible object is
         *     {@link ImportOutageReportRequest.OutageReport.AnnulmentOutageReport }
         *     
         */
        public ImportOutageReportRequest.OutageReport.AnnulmentOutageReport getAnnulmentOutageReport() {
            return annulmentOutageReport;
        }

        /**
         * Sets the value of the annulmentOutageReport property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportOutageReportRequest.OutageReport.AnnulmentOutageReport }
         *     
         * @see #getAnnulmentOutageReport()
         */
        public void setAnnulmentOutageReport(ImportOutageReportRequest.OutageReport.AnnulmentOutageReport value) {
            this.annulmentOutageReport = value;
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
         *         <element name="OutageReportGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *         <element name="AnnulmentReason">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <minLength value="1"/>
         *               <maxLength value="1000"/>
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
            "outageReportGUID",
            "annulmentReason"
        })
        public static class AnnulmentOutageReport {

            /**
             * Уникальный идентификатор  сведений о перерыве в предоставлении коммунальных услуг
             * 
             */
            @XmlElement(name = "OutageReportGUID", required = true)
            protected String outageReportGUID;
            /**
             * Причина аннулирования сведений о перерыве в предоставлении коммунальных услуг
             * 
             */
            @XmlElement(name = "AnnulmentReason", required = true)
            protected String annulmentReason;

            /**
             * Уникальный идентификатор  сведений о перерыве в предоставлении коммунальных услуг
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOutageReportGUID() {
                return outageReportGUID;
            }

            /**
             * Sets the value of the outageReportGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getOutageReportGUID()
             */
            public void setOutageReportGUID(String value) {
                this.outageReportGUID = value;
            }

            /**
             * Причина аннулирования сведений о перерыве в предоставлении коммунальных услуг
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAnnulmentReason() {
                return annulmentReason;
            }

            /**
             * Sets the value of the annulmentReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getAnnulmentReason()
             */
            public void setAnnulmentReason(String value) {
                this.annulmentReason = value;
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
         *         <element name="OutageReportGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *         <element name="OutageReportData" type="{http://dom.gosuslugi.ru/schema/integration/outage-report/}OutageReportType"/>
         *         <element name="OutageReportObjects">
         *           <complexType>
         *             <complexContent>
         *               <extension base="{http://dom.gosuslugi.ru/schema/integration/outage-report/}OutageReportObjectType">
         *               </extension>
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
            "outageReportGUID",
            "outageReportData",
            "outageReportObjects"
        })
        public static class EditOutageReport {

            /**
             * Уникальный идентификатор  сведений о перерыве в предоставлении коммунальных услуг
             * 
             */
            @XmlElement(name = "OutageReportGUID", required = true)
            protected String outageReportGUID;
            /**
             * Cведения о перерыве в предоставлении коммунальных услуг
             * 
             */
            @XmlElement(name = "OutageReportData", required = true)
            protected OutageReportType outageReportData;
            /**
             * Список объектов жилого фонда, по которым планируется перерыв в предоставлении коммунальных услуг
             * 
             */
            @XmlElement(name = "OutageReportObjects", required = true)
            protected ImportOutageReportRequest.OutageReport.EditOutageReport.OutageReportObjects outageReportObjects;

            /**
             * Уникальный идентификатор  сведений о перерыве в предоставлении коммунальных услуг
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOutageReportGUID() {
                return outageReportGUID;
            }

            /**
             * Sets the value of the outageReportGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getOutageReportGUID()
             */
            public void setOutageReportGUID(String value) {
                this.outageReportGUID = value;
            }

            /**
             * Cведения о перерыве в предоставлении коммунальных услуг
             * 
             * @return
             *     possible object is
             *     {@link OutageReportType }
             *     
             */
            public OutageReportType getOutageReportData() {
                return outageReportData;
            }

            /**
             * Sets the value of the outageReportData property.
             * 
             * @param value
             *     allowed object is
             *     {@link OutageReportType }
             *     
             * @see #getOutageReportData()
             */
            public void setOutageReportData(OutageReportType value) {
                this.outageReportData = value;
            }

            /**
             * Список объектов жилого фонда, по которым планируется перерыв в предоставлении коммунальных услуг
             * 
             * @return
             *     possible object is
             *     {@link ImportOutageReportRequest.OutageReport.EditOutageReport.OutageReportObjects }
             *     
             */
            public ImportOutageReportRequest.OutageReport.EditOutageReport.OutageReportObjects getOutageReportObjects() {
                return outageReportObjects;
            }

            /**
             * Sets the value of the outageReportObjects property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportOutageReportRequest.OutageReport.EditOutageReport.OutageReportObjects }
             *     
             * @see #getOutageReportObjects()
             */
            public void setOutageReportObjects(ImportOutageReportRequest.OutageReport.EditOutageReport.OutageReportObjects value) {
                this.outageReportObjects = value;
            }


            /**
             * <p>Java class for anonymous complex type</p>.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/outage-report/}OutageReportObjectType">
             *     </extension>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class OutageReportObjects
                extends OutageReportObjectType
            {


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
         *         <element name="OutageReportData" type="{http://dom.gosuslugi.ru/schema/integration/outage-report/}OutageReportType"/>
         *         <element name="OutageReportObjects">
         *           <complexType>
         *             <complexContent>
         *               <extension base="{http://dom.gosuslugi.ru/schema/integration/outage-report/}OutageReportObjectType">
         *               </extension>
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
            "outageReportData",
            "outageReportObjects"
        })
        public static class PlacingOutageReport {

            /**
             * Cведения о перерыве в предоставлении коммунальных услуг
             * 
             */
            @XmlElement(name = "OutageReportData", required = true)
            protected OutageReportType outageReportData;
            /**
             * Список объектов жилого фонда, по которым планируется перерыв в предоставлении коммунальных услуг
             * 
             */
            @XmlElement(name = "OutageReportObjects", required = true)
            protected ImportOutageReportRequest.OutageReport.PlacingOutageReport.OutageReportObjects outageReportObjects;

            /**
             * Cведения о перерыве в предоставлении коммунальных услуг
             * 
             * @return
             *     possible object is
             *     {@link OutageReportType }
             *     
             */
            public OutageReportType getOutageReportData() {
                return outageReportData;
            }

            /**
             * Sets the value of the outageReportData property.
             * 
             * @param value
             *     allowed object is
             *     {@link OutageReportType }
             *     
             * @see #getOutageReportData()
             */
            public void setOutageReportData(OutageReportType value) {
                this.outageReportData = value;
            }

            /**
             * Список объектов жилого фонда, по которым планируется перерыв в предоставлении коммунальных услуг
             * 
             * @return
             *     possible object is
             *     {@link ImportOutageReportRequest.OutageReport.PlacingOutageReport.OutageReportObjects }
             *     
             */
            public ImportOutageReportRequest.OutageReport.PlacingOutageReport.OutageReportObjects getOutageReportObjects() {
                return outageReportObjects;
            }

            /**
             * Sets the value of the outageReportObjects property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportOutageReportRequest.OutageReport.PlacingOutageReport.OutageReportObjects }
             *     
             * @see #getOutageReportObjects()
             */
            public void setOutageReportObjects(ImportOutageReportRequest.OutageReport.PlacingOutageReport.OutageReportObjects value) {
                this.outageReportObjects = value;
            }


            /**
             * <p>Java class for anonymous complex type</p>.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/outage-report/}OutageReportObjectType">
             *     </extension>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class OutageReportObjects
                extends OutageReportObjectType
            {


            }

        }

    }

}
