
package ru.gosuslugi.dom.schema.integration.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


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
 *         <element name="QualityAssessment" maxOccurs="100">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                   <choice>
 *                     <element name="PlacingQualityAssessment">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="reportingPeriodGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                               <element name="Works" maxOccurs="unbounded">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="Work">
 *                                           <complexType>
 *                                             <complexContent>
 *                                               <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
 *                                               </extension>
 *                                             </complexContent>
 *                                           </complexType>
 *                                         </element>
 *                                         <element name="WorkType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                                         <element name="DayCount" minOccurs="0">
 *                                           <simpleType>
 *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                                               <minInclusive value="1"/>
 *                                               <maxInclusive value="31"/>
 *                                             </restriction>
 *                                           </simpleType>
 *                                         </element>
 *                                         <element name="Cost" minOccurs="0">
 *                                           <simpleType>
 *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                               <totalDigits value="10"/>
 *                                               <fractionDigits value="2"/>
 *                                               <minInclusive value="0"/>
 *                                             </restriction>
 *                                           </simpleType>
 *                                         </element>
 *                                         <element name="Act" maxOccurs="unbounded">
 *                                           <complexType>
 *                                             <complexContent>
 *                                               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 <choice>
 *                                                   <element name="AddAct" type="{http://dom.gosuslugi.ru/schema/integration/services/}ActDetailsType"/>
 *                                                   <element name="ActGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                                                 </choice>
 *                                               </restriction>
 *                                             </complexContent>
 *                                           </complexType>
 *                                         </element>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="AnnulmentQualityAssessment">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="reportingPeriodGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="13.3.0.0""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "qualityAssessment"
})
@XmlRootElement(name = "importQualityAssessmentRequest")
public class ImportQualityAssessmentRequest
    extends BaseType
{

    /**
     * Оценка качества
     * 
     */
    @XmlElement(name = "QualityAssessment", required = true)
    protected List<ImportQualityAssessmentRequest.QualityAssessment> qualityAssessment;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Оценка качества
     * 
     * Gets the value of the qualityAssessment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualityAssessment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getQualityAssessment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportQualityAssessmentRequest.QualityAssessment }
     * </p>
     * 
     * 
     * @return
     *     The value of the qualityAssessment property.
     */
    public List<ImportQualityAssessmentRequest.QualityAssessment> getQualityAssessment() {
        if (qualityAssessment == null) {
            qualityAssessment = new ArrayList<>();
        }
        return this.qualityAssessment;
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
            return "13.3.0.0";
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
     *           <element name="PlacingQualityAssessment">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="reportingPeriodGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                     <element name="Works" maxOccurs="unbounded">
     *                       <complexType>
     *                         <complexContent>
     *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             <sequence>
     *                               <element name="Work">
     *                                 <complexType>
     *                                   <complexContent>
     *                                     <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
     *                                     </extension>
     *                                   </complexContent>
     *                                 </complexType>
     *                               </element>
     *                               <element name="WorkType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *                               <element name="DayCount" minOccurs="0">
     *                                 <simpleType>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
     *                                     <minInclusive value="1"/>
     *                                     <maxInclusive value="31"/>
     *                                   </restriction>
     *                                 </simpleType>
     *                               </element>
     *                               <element name="Cost" minOccurs="0">
     *                                 <simpleType>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                     <totalDigits value="10"/>
     *                                     <fractionDigits value="2"/>
     *                                     <minInclusive value="0"/>
     *                                   </restriction>
     *                                 </simpleType>
     *                               </element>
     *                               <element name="Act" maxOccurs="unbounded">
     *                                 <complexType>
     *                                   <complexContent>
     *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       <choice>
     *                                         <element name="AddAct" type="{http://dom.gosuslugi.ru/schema/integration/services/}ActDetailsType"/>
     *                                         <element name="ActGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                                       </choice>
     *                                     </restriction>
     *                                   </complexContent>
     *                                 </complexType>
     *                               </element>
     *                             </sequence>
     *                           </restriction>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="AnnulmentQualityAssessment">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="reportingPeriodGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
        "placingQualityAssessment",
        "annulmentQualityAssessment"
    })
    public static class QualityAssessment {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Размещение и изменение информации об оценке качества
         * 
         */
        @XmlElement(name = "PlacingQualityAssessment")
        protected ImportQualityAssessmentRequest.QualityAssessment.PlacingQualityAssessment placingQualityAssessment;
        /**
         * Аннулирование информации об оценке качества
         * 
         */
        @XmlElement(name = "AnnulmentQualityAssessment")
        protected ImportQualityAssessmentRequest.QualityAssessment.AnnulmentQualityAssessment annulmentQualityAssessment;

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
         * Размещение и изменение информации об оценке качества
         * 
         * @return
         *     possible object is
         *     {@link ImportQualityAssessmentRequest.QualityAssessment.PlacingQualityAssessment }
         *     
         */
        public ImportQualityAssessmentRequest.QualityAssessment.PlacingQualityAssessment getPlacingQualityAssessment() {
            return placingQualityAssessment;
        }

        /**
         * Sets the value of the placingQualityAssessment property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportQualityAssessmentRequest.QualityAssessment.PlacingQualityAssessment }
         *     
         * @see #getPlacingQualityAssessment()
         */
        public void setPlacingQualityAssessment(ImportQualityAssessmentRequest.QualityAssessment.PlacingQualityAssessment value) {
            this.placingQualityAssessment = value;
        }

        /**
         * Аннулирование информации об оценке качества
         * 
         * @return
         *     possible object is
         *     {@link ImportQualityAssessmentRequest.QualityAssessment.AnnulmentQualityAssessment }
         *     
         */
        public ImportQualityAssessmentRequest.QualityAssessment.AnnulmentQualityAssessment getAnnulmentQualityAssessment() {
            return annulmentQualityAssessment;
        }

        /**
         * Sets the value of the annulmentQualityAssessment property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportQualityAssessmentRequest.QualityAssessment.AnnulmentQualityAssessment }
         *     
         * @see #getAnnulmentQualityAssessment()
         */
        public void setAnnulmentQualityAssessment(ImportQualityAssessmentRequest.QualityAssessment.AnnulmentQualityAssessment value) {
            this.annulmentQualityAssessment = value;
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
         *         <element name="reportingPeriodGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
            "reportingPeriodGuid"
        })
        public static class AnnulmentQualityAssessment {

            /**
             * Ссылка на период отчётности о выполненных работах/услугах
             * 
             */
            @XmlElement(required = true)
            protected String reportingPeriodGuid;

            /**
             * Ссылка на период отчётности о выполненных работах/услугах
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReportingPeriodGuid() {
                return reportingPeriodGuid;
            }

            /**
             * Sets the value of the reportingPeriodGuid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getReportingPeriodGuid()
             */
            public void setReportingPeriodGuid(String value) {
                this.reportingPeriodGuid = value;
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
         *         <element name="reportingPeriodGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *         <element name="Works" maxOccurs="unbounded">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="Work">
         *                     <complexType>
         *                       <complexContent>
         *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
         *                         </extension>
         *                       </complexContent>
         *                     </complexType>
         *                   </element>
         *                   <element name="WorkType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
         *                   <element name="DayCount" minOccurs="0">
         *                     <simpleType>
         *                       <restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
         *                         <minInclusive value="1"/>
         *                         <maxInclusive value="31"/>
         *                       </restriction>
         *                     </simpleType>
         *                   </element>
         *                   <element name="Cost" minOccurs="0">
         *                     <simpleType>
         *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                         <totalDigits value="10"/>
         *                         <fractionDigits value="2"/>
         *                         <minInclusive value="0"/>
         *                       </restriction>
         *                     </simpleType>
         *                   </element>
         *                   <element name="Act" maxOccurs="unbounded">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <choice>
         *                             <element name="AddAct" type="{http://dom.gosuslugi.ru/schema/integration/services/}ActDetailsType"/>
         *                             <element name="ActGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *                           </choice>
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
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "reportingPeriodGuid",
            "works"
        })
        public static class PlacingQualityAssessment {

            /**
             * Ссылка на период отчётности о выполненных работах/услугах
             * 
             */
            @XmlElement(required = true)
            protected String reportingPeriodGuid;
            /**
             * Работы, включенные в оценку качества за период
             * 
             */
            @XmlElement(name = "Works", required = true)
            protected List<ImportQualityAssessmentRequest.QualityAssessment.PlacingQualityAssessment.Works> works;

            /**
             * Ссылка на период отчётности о выполненных работах/услугах
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReportingPeriodGuid() {
                return reportingPeriodGuid;
            }

            /**
             * Sets the value of the reportingPeriodGuid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getReportingPeriodGuid()
             */
            public void setReportingPeriodGuid(String value) {
                this.reportingPeriodGuid = value;
            }

            /**
             * Работы, включенные в оценку качества за период
             * 
             * Gets the value of the works property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the works property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getWorks().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ImportQualityAssessmentRequest.QualityAssessment.PlacingQualityAssessment.Works }
             * </p>
             * 
             * 
             * @return
             *     The value of the works property.
             */
            public List<ImportQualityAssessmentRequest.QualityAssessment.PlacingQualityAssessment.Works> getWorks() {
                if (works == null) {
                    works = new ArrayList<>();
                }
                return this.works;
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
             *         <element name="Work">
             *           <complexType>
             *             <complexContent>
             *               <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
             *               </extension>
             *             </complexContent>
             *           </complexType>
             *         </element>
             *         <element name="WorkType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
             *         <element name="DayCount" minOccurs="0">
             *           <simpleType>
             *             <restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
             *               <minInclusive value="1"/>
             *               <maxInclusive value="31"/>
             *             </restriction>
             *           </simpleType>
             *         </element>
             *         <element name="Cost" minOccurs="0">
             *           <simpleType>
             *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *               <totalDigits value="10"/>
             *               <fractionDigits value="2"/>
             *               <minInclusive value="0"/>
             *             </restriction>
             *           </simpleType>
             *         </element>
             *         <element name="Act" maxOccurs="unbounded">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <choice>
             *                   <element name="AddAct" type="{http://dom.gosuslugi.ru/schema/integration/services/}ActDetailsType"/>
             *                   <element name="ActGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
             *                 </choice>
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
                "work",
                "workType",
                "dayCount",
                "cost",
                "act"
            })
            public static class Works {

                /**
                 * Ссылка на работу (услугу) в справочнике видов работ и услуг для организации (НСИ 59)
                 * 
                 */
                @XmlElement(name = "Work", required = true)
                protected ImportQualityAssessmentRequest.QualityAssessment.PlacingQualityAssessment.Works.Work work;
                /**
                 * Ссылка на вид работы (услуги) в справочнике видов работ и услуг (НСИ 56)
                 * 
                 */
                @XmlElement(name = "WorkType", required = true)
                protected NsiRef workType;
                /**
                 * Количество дней, в течение которых выполнялась (оказывалась) работа (услуга) ненадлежащего качества. 
                 * Элемент доступен и обязателен для заполнения, если по данной работе имеется акт нарушения качества.
                 * 
                 */
                @XmlElement(name = "DayCount")
                protected Integer dayCount;
                /**
                 * Стоимость в составе ежемесячной платы за содержание и ремонт жилого помещения (рублей)
                 * 
                 */
                @XmlElement(name = "Cost")
                protected BigDecimal cost;
                /**
                 * Акт нарушения качества или превышения установленной продолжительности перерыва в оказании услуги или выполнении работы/Акт выполненных работ
                 * 
                 */
                @XmlElement(name = "Act", required = true)
                protected List<ImportQualityAssessmentRequest.QualityAssessment.PlacingQualityAssessment.Works.Act> act;

                /**
                 * Ссылка на работу (услугу) в справочнике видов работ и услуг для организации (НСИ 59)
                 * 
                 * @return
                 *     possible object is
                 *     {@link ImportQualityAssessmentRequest.QualityAssessment.PlacingQualityAssessment.Works.Work }
                 *     
                 */
                public ImportQualityAssessmentRequest.QualityAssessment.PlacingQualityAssessment.Works.Work getWork() {
                    return work;
                }

                /**
                 * Sets the value of the work property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ImportQualityAssessmentRequest.QualityAssessment.PlacingQualityAssessment.Works.Work }
                 *     
                 * @see #getWork()
                 */
                public void setWork(ImportQualityAssessmentRequest.QualityAssessment.PlacingQualityAssessment.Works.Work value) {
                    this.work = value;
                }

                /**
                 * Ссылка на вид работы (услуги) в справочнике видов работ и услуг (НСИ 56)
                 * 
                 * @return
                 *     possible object is
                 *     {@link NsiRef }
                 *     
                 */
                public NsiRef getWorkType() {
                    return workType;
                }

                /**
                 * Sets the value of the workType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link NsiRef }
                 *     
                 * @see #getWorkType()
                 */
                public void setWorkType(NsiRef value) {
                    this.workType = value;
                }

                /**
                 * Количество дней, в течение которых выполнялась (оказывалась) работа (услуга) ненадлежащего качества. 
                 * Элемент доступен и обязателен для заполнения, если по данной работе имеется акт нарушения качества.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getDayCount() {
                    return dayCount;
                }

                /**
                 * Sets the value of the dayCount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 * @see #getDayCount()
                 */
                public void setDayCount(Integer value) {
                    this.dayCount = value;
                }

                /**
                 * Стоимость в составе ежемесячной платы за содержание и ремонт жилого помещения (рублей)
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getCost() {
                    return cost;
                }

                /**
                 * Sets the value of the cost property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 * @see #getCost()
                 */
                public void setCost(BigDecimal value) {
                    this.cost = value;
                }

                /**
                 * Акт нарушения качества или превышения установленной продолжительности перерыва в оказании услуги или выполнении работы/Акт выполненных работ
                 * 
                 * Gets the value of the act property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the act property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getAct().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ImportQualityAssessmentRequest.QualityAssessment.PlacingQualityAssessment.Works.Act }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the act property.
                 */
                public List<ImportQualityAssessmentRequest.QualityAssessment.PlacingQualityAssessment.Works.Act> getAct() {
                    if (act == null) {
                        act = new ArrayList<>();
                    }
                    return this.act;
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
                 *         <element name="AddAct" type="{http://dom.gosuslugi.ru/schema/integration/services/}ActDetailsType"/>
                 *         <element name="ActGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
                    "addAct",
                    "actGUID"
                })
                public static class Act {

                    /**
                     * Добавление нового акта
                     * 
                     */
                    @XmlElement(name = "AddAct")
                    protected ActDetailsType addAct;
                    /**
                     * Идентификатор акта. Заполняется при указании акта, размещенного в Системе.
                     * 
                     */
                    @XmlElement(name = "ActGUID")
                    protected String actGUID;

                    /**
                     * Добавление нового акта
                     * 
                     * @return
                     *     possible object is
                     *     {@link ActDetailsType }
                     *     
                     */
                    public ActDetailsType getAddAct() {
                        return addAct;
                    }

                    /**
                     * Sets the value of the addAct property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ActDetailsType }
                     *     
                     * @see #getAddAct()
                     */
                    public void setAddAct(ActDetailsType value) {
                        this.addAct = value;
                    }

                    /**
                     * Идентификатор акта. Заполняется при указании акта, размещенного в Системе.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getActGUID() {
                        return actGUID;
                    }

                    /**
                     * Sets the value of the actGUID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     * @see #getActGUID()
                     */
                    public void setActGUID(String value) {
                        this.actGUID = value;
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
                 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
                 *     </extension>
                 *   </complexContent>
                 * </complexType>
                 * }</pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Work
                    extends NsiRef
                {


                }

            }

        }

    }

}
