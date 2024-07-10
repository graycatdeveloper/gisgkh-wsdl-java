
package ru.gosuslugi.dom.schema.integration.inspection;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Плановая проверка (пункт плана проверок) - экспорт
 * 
 * <p>Java class for exportPlannedExaminationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportPlannedExaminationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NumberInPlan">
 *           <simpleType>
 *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/inspection/}NumberType">
 *               <totalDigits value="3"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="URIRegistrationNumber" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <pattern value="\d{1,18}"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="URIRegistrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="Subject" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ScheduledExaminationSubjectInPlanInfoType"/>
 *         <element name="RegulatoryAuthorityInformation">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="FunctionRegistryNumber" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}FunctionRegistryNumberType" minOccurs="0"/>
 *                   <element name="AuthorizedPersons" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
 *                   <element name="InvolvedExperts" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="OversightActivitiesRef" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *         <element name="PlannedExaminationInfo">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Objective" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type"/>
 *                   <element name="Base" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *                   <element name="AdditionalInfoAboutExamBase" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
 *                   <element name="LastExaminationEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   <element name="MonthFrom" type="{http://dom.gosuslugi.ru/schema/integration/base/}MonthType"/>
 *                   <element name="YearFrom" type="{http://dom.gosuslugi.ru/schema/integration/base/}YearType"/>
 *                   <element name="Duration">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="WorkDays" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *                                   <minInclusive value="0"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="WorkHours" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *                                   <minInclusive value="0"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="ExaminationForm" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                   <element name="CooperationWith" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2048Type" minOccurs="0"/>
 *                   <element name="ProsecutorAgreementInformation" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
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
@XmlType(name = "exportPlannedExaminationType", propOrder = {
    "numberInPlan",
    "uriRegistrationNumber",
    "uriRegistrationDate",
    "subject",
    "regulatoryAuthorityInformation",
    "oversightActivitiesRef",
    "plannedExaminationInfo"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.inspection.ExportInspectionPlanResultType.PlannedExamination.PlannedExaminationInfo.class
})
public class ExportPlannedExaminationType {

    /**
     * Номер проверки в плане
     * 
     */
    @XmlElement(name = "NumberInPlan")
    protected int numberInPlan;
    /**
     * Учетный номер проверки в едином реестре проверок
     * 
     */
    @XmlElement(name = "URIRegistrationNumber")
    protected String uriRegistrationNumber;
    /**
     * Дата присвоения учетного номера проверки
     * 
     */
    @XmlElement(name = "URIRegistrationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar uriRegistrationDate;
    /**
     * Субъект проверки.
     * 
     */
    @XmlElement(name = "Subject", required = true)
    protected ScheduledExaminationSubjectInPlanInfoType subject;
    /**
     * Информация об органе контроля
     * 
     */
    @XmlElement(name = "RegulatoryAuthorityInformation", required = true)
    protected ExportPlannedExaminationType.RegulatoryAuthorityInformation regulatoryAuthorityInformation;
    /**
     * Вид осуществления контрольной деятельности. НСИ
     * 
     */
    @XmlElement(name = "OversightActivitiesRef")
    protected NsiRef oversightActivitiesRef;
    /**
     * Описание проверки
     * 
     */
    @XmlElement(name = "PlannedExaminationInfo", required = true)
    protected ExportPlannedExaminationType.PlannedExaminationInfo plannedExaminationInfo;

    /**
     * Номер проверки в плане
     * 
     */
    public int getNumberInPlan() {
        return numberInPlan;
    }

    /**
     * Sets the value of the numberInPlan property.
     * 
     */
    public void setNumberInPlan(int value) {
        this.numberInPlan = value;
    }

    /**
     * Учетный номер проверки в едином реестре проверок
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURIRegistrationNumber() {
        return uriRegistrationNumber;
    }

    /**
     * Sets the value of the uriRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getURIRegistrationNumber()
     */
    public void setURIRegistrationNumber(String value) {
        this.uriRegistrationNumber = value;
    }

    /**
     * Дата присвоения учетного номера проверки
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getURIRegistrationDate() {
        return uriRegistrationDate;
    }

    /**
     * Sets the value of the uriRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getURIRegistrationDate()
     */
    public void setURIRegistrationDate(XMLGregorianCalendar value) {
        this.uriRegistrationDate = value;
    }

    /**
     * Субъект проверки.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledExaminationSubjectInPlanInfoType }
     *     
     */
    public ScheduledExaminationSubjectInPlanInfoType getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledExaminationSubjectInPlanInfoType }
     *     
     * @see #getSubject()
     */
    public void setSubject(ScheduledExaminationSubjectInPlanInfoType value) {
        this.subject = value;
    }

    /**
     * Информация об органе контроля
     * 
     * @return
     *     possible object is
     *     {@link ExportPlannedExaminationType.RegulatoryAuthorityInformation }
     *     
     */
    public ExportPlannedExaminationType.RegulatoryAuthorityInformation getRegulatoryAuthorityInformation() {
        return regulatoryAuthorityInformation;
    }

    /**
     * Sets the value of the regulatoryAuthorityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportPlannedExaminationType.RegulatoryAuthorityInformation }
     *     
     * @see #getRegulatoryAuthorityInformation()
     */
    public void setRegulatoryAuthorityInformation(ExportPlannedExaminationType.RegulatoryAuthorityInformation value) {
        this.regulatoryAuthorityInformation = value;
    }

    /**
     * Вид осуществления контрольной деятельности. НСИ
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getOversightActivitiesRef() {
        return oversightActivitiesRef;
    }

    /**
     * Sets the value of the oversightActivitiesRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getOversightActivitiesRef()
     */
    public void setOversightActivitiesRef(NsiRef value) {
        this.oversightActivitiesRef = value;
    }

    /**
     * Описание проверки
     * 
     * @return
     *     possible object is
     *     {@link ExportPlannedExaminationType.PlannedExaminationInfo }
     *     
     */
    public ExportPlannedExaminationType.PlannedExaminationInfo getPlannedExaminationInfo() {
        return plannedExaminationInfo;
    }

    /**
     * Sets the value of the plannedExaminationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportPlannedExaminationType.PlannedExaminationInfo }
     *     
     * @see #getPlannedExaminationInfo()
     */
    public void setPlannedExaminationInfo(ExportPlannedExaminationType.PlannedExaminationInfo value) {
        this.plannedExaminationInfo = value;
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
     *         <element name="Objective" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type"/>
     *         <element name="Base" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
     *         <element name="AdditionalInfoAboutExamBase" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
     *         <element name="LastExaminationEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         <element name="MonthFrom" type="{http://dom.gosuslugi.ru/schema/integration/base/}MonthType"/>
     *         <element name="YearFrom" type="{http://dom.gosuslugi.ru/schema/integration/base/}YearType"/>
     *         <element name="Duration">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="WorkDays" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}double">
     *                         <minInclusive value="0"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="WorkHours" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}double">
     *                         <minInclusive value="0"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="ExaminationForm" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *         <element name="CooperationWith" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2048Type" minOccurs="0"/>
     *         <element name="ProsecutorAgreementInformation" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
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
        "objective",
        "base",
        "additionalInfoAboutExamBase",
        "lastExaminationEndDate",
        "monthFrom",
        "yearFrom",
        "duration",
        "examinationForm",
        "cooperationWith",
        "prosecutorAgreementInformation"
    })
    public static class PlannedExaminationInfo {

        /**
         * Цель проведения проверки.
         * 
         */
        @XmlElement(name = "Objective", required = true)
        protected String objective;
        /**
         * Основание проведения проверки. НСИ "Основание проведения проверки" (реестровый номер 68).
         * 
         */
        @XmlElement(name = "Base")
        protected NsiRef base;
        /**
         * Дополнительная информация об основаниях проведения проверки.
         * 
         */
        @XmlElement(name = "AdditionalInfoAboutExamBase")
        protected String additionalInfoAboutExamBase;
        /**
         * Дата окончания последней проверки.
         * 
         */
        @XmlElement(name = "LastExaminationEndDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar lastExaminationEndDate;
        /**
         * Месяц начала проверки
         * 
         */
        @XmlElement(name = "MonthFrom")
        protected int monthFrom;
        /**
         * Год начала проверки
         * 
         */
        @XmlElement(name = "YearFrom")
        protected short yearFrom;
        /**
         * Срок проведения плановой проверки
         * 
         */
        @XmlElement(name = "Duration", required = true)
        protected ExportPlannedExaminationType.PlannedExaminationInfo.Duration duration;
        /**
         * Форма проведеня проверки. НСИ "Форма проведения проверки" (реестровый номер 71).
         * 
         */
        @XmlElement(name = "ExaminationForm", required = true)
        protected NsiRef examinationForm;
        /**
         * Орган государственного надзора (контроля) и/или орган муниципального контроля,  с которым  проверка проводится совместно.
         * 
         */
        @XmlElement(name = "CooperationWith")
        protected String cooperationWith;
        /**
         * Информация о согласовании проведения проверки с органами прокуратуры
         * 
         */
        @XmlElement(name = "ProsecutorAgreementInformation")
        protected String prosecutorAgreementInformation;

        /**
         * Цель проведения проверки.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObjective() {
            return objective;
        }

        /**
         * Sets the value of the objective property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getObjective()
         */
        public void setObjective(String value) {
            this.objective = value;
        }

        /**
         * Основание проведения проверки. НСИ "Основание проведения проверки" (реестровый номер 68).
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getBase() {
            return base;
        }

        /**
         * Sets the value of the base property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getBase()
         */
        public void setBase(NsiRef value) {
            this.base = value;
        }

        /**
         * Дополнительная информация об основаниях проведения проверки.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdditionalInfoAboutExamBase() {
            return additionalInfoAboutExamBase;
        }

        /**
         * Sets the value of the additionalInfoAboutExamBase property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getAdditionalInfoAboutExamBase()
         */
        public void setAdditionalInfoAboutExamBase(String value) {
            this.additionalInfoAboutExamBase = value;
        }

        /**
         * Дата окончания последней проверки.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastExaminationEndDate() {
            return lastExaminationEndDate;
        }

        /**
         * Sets the value of the lastExaminationEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getLastExaminationEndDate()
         */
        public void setLastExaminationEndDate(XMLGregorianCalendar value) {
            this.lastExaminationEndDate = value;
        }

        /**
         * Месяц начала проверки
         * 
         */
        public int getMonthFrom() {
            return monthFrom;
        }

        /**
         * Sets the value of the monthFrom property.
         * 
         */
        public void setMonthFrom(int value) {
            this.monthFrom = value;
        }

        /**
         * Год начала проверки
         * 
         */
        public short getYearFrom() {
            return yearFrom;
        }

        /**
         * Sets the value of the yearFrom property.
         * 
         */
        public void setYearFrom(short value) {
            this.yearFrom = value;
        }

        /**
         * Срок проведения плановой проверки
         * 
         * @return
         *     possible object is
         *     {@link ExportPlannedExaminationType.PlannedExaminationInfo.Duration }
         *     
         */
        public ExportPlannedExaminationType.PlannedExaminationInfo.Duration getDuration() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportPlannedExaminationType.PlannedExaminationInfo.Duration }
         *     
         * @see #getDuration()
         */
        public void setDuration(ExportPlannedExaminationType.PlannedExaminationInfo.Duration value) {
            this.duration = value;
        }

        /**
         * Форма проведеня проверки. НСИ "Форма проведения проверки" (реестровый номер 71).
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getExaminationForm() {
            return examinationForm;
        }

        /**
         * Sets the value of the examinationForm property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getExaminationForm()
         */
        public void setExaminationForm(NsiRef value) {
            this.examinationForm = value;
        }

        /**
         * Орган государственного надзора (контроля) и/или орган муниципального контроля,  с которым  проверка проводится совместно.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCooperationWith() {
            return cooperationWith;
        }

        /**
         * Sets the value of the cooperationWith property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getCooperationWith()
         */
        public void setCooperationWith(String value) {
            this.cooperationWith = value;
        }

        /**
         * Информация о согласовании проведения проверки с органами прокуратуры
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProsecutorAgreementInformation() {
            return prosecutorAgreementInformation;
        }

        /**
         * Sets the value of the prosecutorAgreementInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getProsecutorAgreementInformation()
         */
        public void setProsecutorAgreementInformation(String value) {
            this.prosecutorAgreementInformation = value;
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
         *         <element name="WorkDays" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}double">
         *               <minInclusive value="0"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="WorkHours" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}double">
         *               <minInclusive value="0"/>
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
            "workDays",
            "workHours"
        })
        public static class Duration {

            /**
             * рабочих дней
             * 
             */
            @XmlElement(name = "WorkDays")
            protected Double workDays;
            /**
             * рабочих часов (для МСП и МКП)
             * 
             */
            @XmlElement(name = "WorkHours")
            protected Double workHours;

            /**
             * рабочих дней
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getWorkDays() {
                return workDays;
            }

            /**
             * Sets the value of the workDays property.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             * @see #getWorkDays()
             */
            public void setWorkDays(Double value) {
                this.workDays = value;
            }

            /**
             * рабочих часов (для МСП и МКП)
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getWorkHours() {
                return workHours;
            }

            /**
             * Sets the value of the workHours property.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             * @see #getWorkHours()
             */
            public void setWorkHours(Double value) {
                this.workHours = value;
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
     *         <element name="FunctionRegistryNumber" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}FunctionRegistryNumberType" minOccurs="0"/>
     *         <element name="AuthorizedPersons" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
     *         <element name="InvolvedExperts" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
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
        "functionRegistryNumber",
        "authorizedPersons",
        "involvedExperts"
    })
    public static class RegulatoryAuthorityInformation {

        /**
         * Реестровый номер функции органа жилищного надзора в системе «Федеральный реестр государственных и муниципальных услуг»
         * 
         */
        @XmlElement(name = "FunctionRegistryNumber")
        protected String functionRegistryNumber;
        /**
         * ФИО и должность лиц, уполномоченных на проведение проверки
         * 
         */
        @XmlElement(name = "AuthorizedPersons")
        protected String authorizedPersons;
        /**
         * ФИО и должность экспертов, привлекаемых к проведению проверки
         * 
         */
        @XmlElement(name = "InvolvedExperts")
        protected String involvedExperts;

        /**
         * Реестровый номер функции органа жилищного надзора в системе «Федеральный реестр государственных и муниципальных услуг»
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFunctionRegistryNumber() {
            return functionRegistryNumber;
        }

        /**
         * Sets the value of the functionRegistryNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getFunctionRegistryNumber()
         */
        public void setFunctionRegistryNumber(String value) {
            this.functionRegistryNumber = value;
        }

        /**
         * ФИО и должность лиц, уполномоченных на проведение проверки
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthorizedPersons() {
            return authorizedPersons;
        }

        /**
         * Sets the value of the authorizedPersons property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getAuthorizedPersons()
         */
        public void setAuthorizedPersons(String value) {
            this.authorizedPersons = value;
        }

        /**
         * ФИО и должность экспертов, привлекаемых к проведению проверки
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvolvedExperts() {
            return involvedExperts;
        }

        /**
         * Sets the value of the involvedExperts property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getInvolvedExperts()
         */
        public void setInvolvedExperts(String value) {
            this.involvedExperts = value;
        }

    }

}
