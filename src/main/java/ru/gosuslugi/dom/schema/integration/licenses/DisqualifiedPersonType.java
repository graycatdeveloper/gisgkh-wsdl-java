
package ru.gosuslugi.dom.schema.integration.licenses;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.individual_registry_base.FIOType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.EntpsType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.LegalType;


/**
 * Сведение о дисквалифицированном лице
 * 
 * <p>Java class for DisqualifiedPersonType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DisqualifiedPersonType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DisqualifiedPerson">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="FIO" type="{http://dom.gosuslugi.ru/schema/integration/individual-registry-base/}FIOType"/>
 *                   <element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   <element name="BirthPlace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="Position" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Org" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <choice>
 *                     <element name="Legal">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}LegalType">
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="Entrp">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}EntpsType">
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                   </choice>
 *                   <element name="LicenseNumber" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}HCSNumberType" minOccurs="0"/>
 *                   <element name="LicenseDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   <element name="LicenseRegOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Judgement">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="DisqualificationBase" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                   <element name="JudgementName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="JudgementDocumentName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="JudgementDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="JudgementDocumentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   <element name="DateFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   <element name="Duration">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="DurationYears">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *                                   <minInclusive value="0"/>
 *                                   <pattern value="\d{1,2}"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="DurationMonths">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *                                   <minInclusive value="0"/>
 *                                   <pattern value="(0?\d)|(1[0-1])"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="DurationDays">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *                                   <minInclusive value="0"/>
 *                                   <pattern value="[0-2]?\d|(30)"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="ExclusionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   <element name="AdditionalInformation" type="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType" minOccurs="0"/>
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
@XmlType(name = "DisqualifiedPersonType", propOrder = {
    "disqualifiedPerson",
    "org",
    "judgement"
})
public class DisqualifiedPersonType {

    /**
     * Информация о дисквалифицированном лице
     * 
     */
    @XmlElement(name = "DisqualifiedPerson", required = true)
    protected DisqualifiedPersonType.DisqualifiedPerson disqualifiedPerson;
    /**
     * Информация об организации, в которой работало дисквалифицированное лицо
     * 
     */
    @XmlElement(name = "Org")
    protected DisqualifiedPersonType.Org org;
    /**
     * Судебное решение о дисквалификации (Информация о дисквалификации)
     * 
     */
    @XmlElement(name = "Judgement", required = true)
    protected DisqualifiedPersonType.Judgement judgement;

    /**
     * Информация о дисквалифицированном лице
     * 
     * @return
     *     possible object is
     *     {@link DisqualifiedPersonType.DisqualifiedPerson }
     *     
     */
    public DisqualifiedPersonType.DisqualifiedPerson getDisqualifiedPerson() {
        return disqualifiedPerson;
    }

    /**
     * Sets the value of the disqualifiedPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisqualifiedPersonType.DisqualifiedPerson }
     *     
     * @see #getDisqualifiedPerson()
     */
    public void setDisqualifiedPerson(DisqualifiedPersonType.DisqualifiedPerson value) {
        this.disqualifiedPerson = value;
    }

    /**
     * Информация об организации, в которой работало дисквалифицированное лицо
     * 
     * @return
     *     possible object is
     *     {@link DisqualifiedPersonType.Org }
     *     
     */
    public DisqualifiedPersonType.Org getOrg() {
        return org;
    }

    /**
     * Sets the value of the org property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisqualifiedPersonType.Org }
     *     
     * @see #getOrg()
     */
    public void setOrg(DisqualifiedPersonType.Org value) {
        this.org = value;
    }

    /**
     * Судебное решение о дисквалификации (Информация о дисквалификации)
     * 
     * @return
     *     possible object is
     *     {@link DisqualifiedPersonType.Judgement }
     *     
     */
    public DisqualifiedPersonType.Judgement getJudgement() {
        return judgement;
    }

    /**
     * Sets the value of the judgement property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisqualifiedPersonType.Judgement }
     *     
     * @see #getJudgement()
     */
    public void setJudgement(DisqualifiedPersonType.Judgement value) {
        this.judgement = value;
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
     *         <element name="FIO" type="{http://dom.gosuslugi.ru/schema/integration/individual-registry-base/}FIOType"/>
     *         <element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="BirthPlace" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="Position" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "fio",
        "dateOfBirth",
        "birthPlace",
        "position"
    })
    public static class DisqualifiedPerson {

        /**
         * ФИО
         * 
         */
        @XmlElement(name = "FIO", required = true)
        protected FIOType fio;
        /**
         * Дата рождения
         * 
         */
        @XmlElement(name = "DateOfBirth", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateOfBirth;
        /**
         * Место рождения
         * 
         */
        @XmlElement(name = "BirthPlace", required = true)
        protected String birthPlace;
        /**
         * Должность
         * 
         */
        @XmlElement(name = "Position", required = true)
        protected String position;

        /**
         * ФИО
         * 
         * @return
         *     possible object is
         *     {@link FIOType }
         *     
         */
        public FIOType getFIO() {
            return fio;
        }

        /**
         * Sets the value of the fio property.
         * 
         * @param value
         *     allowed object is
         *     {@link FIOType }
         *     
         * @see #getFIO()
         */
        public void setFIO(FIOType value) {
            this.fio = value;
        }

        /**
         * Дата рождения
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateOfBirth() {
            return dateOfBirth;
        }

        /**
         * Sets the value of the dateOfBirth property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getDateOfBirth()
         */
        public void setDateOfBirth(XMLGregorianCalendar value) {
            this.dateOfBirth = value;
        }

        /**
         * Место рождения
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBirthPlace() {
            return birthPlace;
        }

        /**
         * Sets the value of the birthPlace property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getBirthPlace()
         */
        public void setBirthPlace(String value) {
            this.birthPlace = value;
        }

        /**
         * Должность
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPosition() {
            return position;
        }

        /**
         * Sets the value of the position property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPosition()
         */
        public void setPosition(String value) {
            this.position = value;
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
     *         <element name="DisqualificationBase" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *         <element name="JudgementName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="JudgementDocumentName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="JudgementDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="JudgementDocumentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="DateFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="Duration">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="DurationYears">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
     *                         <minInclusive value="0"/>
     *                         <pattern value="\d{1,2}"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="DurationMonths">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
     *                         <minInclusive value="0"/>
     *                         <pattern value="(0?\d)|(1[0-1])"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="DurationDays">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
     *                         <minInclusive value="0"/>
     *                         <pattern value="[0-2]?\d|(30)"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="ExclusionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="AdditionalInformation" type="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType" minOccurs="0"/>
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
        "disqualificationBase",
        "judgementName",
        "judgementDocumentName",
        "judgementDocumentNumber",
        "judgementDocumentDate",
        "dateFrom",
        "duration",
        "exclusionDate",
        "additionalInformation"
    })
    public static class Judgement {

        /**
         * Код основание дисквалификации
         * 
         */
        @XmlElement(name = "DisqualificationBase", required = true)
        protected NsiRef disqualificationBase;
        /**
         * Судебный орган
         * 
         */
        @XmlElement(name = "JudgementName", required = true)
        protected String judgementName;
        /**
         * Наименование документа - решение суда
         * 
         */
        @XmlElement(name = "JudgementDocumentName", required = true)
        protected String judgementDocumentName;
        /**
         * Номер документа
         * 
         */
        @XmlElement(name = "JudgementDocumentNumber", required = true)
        protected String judgementDocumentNumber;
        /**
         * Дата судебного документа
         * 
         */
        @XmlElement(name = "JudgementDocumentDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar judgementDocumentDate;
        /**
         * Дисквалифицирован с (Дата вступления в силу решения суда)
         * 
         */
        @XmlElement(name = "DateFrom", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateFrom;
        /**
         * Длительность дисквалификации
         * 
         */
        @XmlElement(name = "Duration", required = true)
        protected DisqualifiedPersonType.Judgement.Duration duration;
        /**
         * Дисквалифицирован по (Плановая дата исключения сведений из реестра)
         * 
         */
        @XmlElement(name = "ExclusionDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar exclusionDate;
        /**
         * Дополнительная информация
         * 
         */
        @XmlElement(name = "AdditionalInformation")
        protected String additionalInformation;

        /**
         * Код основание дисквалификации
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getDisqualificationBase() {
            return disqualificationBase;
        }

        /**
         * Sets the value of the disqualificationBase property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getDisqualificationBase()
         */
        public void setDisqualificationBase(NsiRef value) {
            this.disqualificationBase = value;
        }

        /**
         * Судебный орган
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJudgementName() {
            return judgementName;
        }

        /**
         * Sets the value of the judgementName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getJudgementName()
         */
        public void setJudgementName(String value) {
            this.judgementName = value;
        }

        /**
         * Наименование документа - решение суда
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJudgementDocumentName() {
            return judgementDocumentName;
        }

        /**
         * Sets the value of the judgementDocumentName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getJudgementDocumentName()
         */
        public void setJudgementDocumentName(String value) {
            this.judgementDocumentName = value;
        }

        /**
         * Номер документа
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJudgementDocumentNumber() {
            return judgementDocumentNumber;
        }

        /**
         * Sets the value of the judgementDocumentNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getJudgementDocumentNumber()
         */
        public void setJudgementDocumentNumber(String value) {
            this.judgementDocumentNumber = value;
        }

        /**
         * Дата судебного документа
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getJudgementDocumentDate() {
            return judgementDocumentDate;
        }

        /**
         * Sets the value of the judgementDocumentDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getJudgementDocumentDate()
         */
        public void setJudgementDocumentDate(XMLGregorianCalendar value) {
            this.judgementDocumentDate = value;
        }

        /**
         * Дисквалифицирован с (Дата вступления в силу решения суда)
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateFrom() {
            return dateFrom;
        }

        /**
         * Sets the value of the dateFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getDateFrom()
         */
        public void setDateFrom(XMLGregorianCalendar value) {
            this.dateFrom = value;
        }

        /**
         * Длительность дисквалификации
         * 
         * @return
         *     possible object is
         *     {@link DisqualifiedPersonType.Judgement.Duration }
         *     
         */
        public DisqualifiedPersonType.Judgement.Duration getDuration() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         * 
         * @param value
         *     allowed object is
         *     {@link DisqualifiedPersonType.Judgement.Duration }
         *     
         * @see #getDuration()
         */
        public void setDuration(DisqualifiedPersonType.Judgement.Duration value) {
            this.duration = value;
        }

        /**
         * Дисквалифицирован по (Плановая дата исключения сведений из реестра)
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExclusionDate() {
            return exclusionDate;
        }

        /**
         * Sets the value of the exclusionDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getExclusionDate()
         */
        public void setExclusionDate(XMLGregorianCalendar value) {
            this.exclusionDate = value;
        }

        /**
         * Дополнительная информация
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdditionalInformation() {
            return additionalInformation;
        }

        /**
         * Sets the value of the additionalInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getAdditionalInformation()
         */
        public void setAdditionalInformation(String value) {
            this.additionalInformation = value;
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
         *         <element name="DurationYears">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
         *               <minInclusive value="0"/>
         *               <pattern value="\d{1,2}"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="DurationMonths">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
         *               <minInclusive value="0"/>
         *               <pattern value="(0?\d)|(1[0-1])"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="DurationDays">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
         *               <minInclusive value="0"/>
         *               <pattern value="[0-2]?\d|(30)"/>
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
            "durationYears",
            "durationMonths",
            "durationDays"
        })
        public static class Duration {

            /**
             * Лет (от 0 до 99 включительно)
             * 
             */
            @XmlElement(name = "DurationYears", required = true)
            protected BigInteger durationYears;
            /**
             * Месяцев (от 0 до 11 включительно)
             * 
             */
            @XmlElement(name = "DurationMonths", required = true)
            protected BigInteger durationMonths;
            /**
             * Дней (от 0 до 30 включительно)
             * 
             */
            @XmlElement(name = "DurationDays", required = true)
            protected BigInteger durationDays;

            /**
             * Лет (от 0 до 99 включительно)
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDurationYears() {
                return durationYears;
            }

            /**
             * Sets the value of the durationYears property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             * @see #getDurationYears()
             */
            public void setDurationYears(BigInteger value) {
                this.durationYears = value;
            }

            /**
             * Месяцев (от 0 до 11 включительно)
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDurationMonths() {
                return durationMonths;
            }

            /**
             * Sets the value of the durationMonths property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             * @see #getDurationMonths()
             */
            public void setDurationMonths(BigInteger value) {
                this.durationMonths = value;
            }

            /**
             * Дней (от 0 до 30 включительно)
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDurationDays() {
                return durationDays;
            }

            /**
             * Sets the value of the durationDays property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             * @see #getDurationDays()
             */
            public void setDurationDays(BigInteger value) {
                this.durationDays = value;
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
     *         <choice>
     *           <element name="Legal">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}LegalType">
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="Entrp">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}EntpsType">
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *         </choice>
     *         <element name="LicenseNumber" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}HCSNumberType" minOccurs="0"/>
     *         <element name="LicenseDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         <element name="LicenseRegOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "legal",
        "entrp",
        "licenseNumber",
        "licenseDate",
        "licenseRegOrg"
    })
    public static class Org {

        /**
         * Юридическое лицо
         * 
         */
        @XmlElement(name = "Legal")
        protected DisqualifiedPersonType.Org.Legal legal;
        /**
         * ИП
         * 
         */
        @XmlElement(name = "Entrp")
        protected DisqualifiedPersonType.Org.Entrp entrp;
        /**
         * Номер лицензии
         * 
         */
        @XmlElement(name = "LicenseNumber")
        protected String licenseNumber;
        /**
         * Дата регистрации лицензии
         * 
         */
        @XmlElement(name = "LicenseDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar licenseDate;
        /**
         * Орган государственного жилищного надзора
         * 
         */
        @XmlElement(name = "LicenseRegOrg")
        protected String licenseRegOrg;

        /**
         * Юридическое лицо
         * 
         * @return
         *     possible object is
         *     {@link DisqualifiedPersonType.Org.Legal }
         *     
         */
        public DisqualifiedPersonType.Org.Legal getLegal() {
            return legal;
        }

        /**
         * Sets the value of the legal property.
         * 
         * @param value
         *     allowed object is
         *     {@link DisqualifiedPersonType.Org.Legal }
         *     
         * @see #getLegal()
         */
        public void setLegal(DisqualifiedPersonType.Org.Legal value) {
            this.legal = value;
        }

        /**
         * ИП
         * 
         * @return
         *     possible object is
         *     {@link DisqualifiedPersonType.Org.Entrp }
         *     
         */
        public DisqualifiedPersonType.Org.Entrp getEntrp() {
            return entrp;
        }

        /**
         * Sets the value of the entrp property.
         * 
         * @param value
         *     allowed object is
         *     {@link DisqualifiedPersonType.Org.Entrp }
         *     
         * @see #getEntrp()
         */
        public void setEntrp(DisqualifiedPersonType.Org.Entrp value) {
            this.entrp = value;
        }

        /**
         * Номер лицензии
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLicenseNumber() {
            return licenseNumber;
        }

        /**
         * Sets the value of the licenseNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getLicenseNumber()
         */
        public void setLicenseNumber(String value) {
            this.licenseNumber = value;
        }

        /**
         * Дата регистрации лицензии
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLicenseDate() {
            return licenseDate;
        }

        /**
         * Sets the value of the licenseDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getLicenseDate()
         */
        public void setLicenseDate(XMLGregorianCalendar value) {
            this.licenseDate = value;
        }

        /**
         * Орган государственного жилищного надзора
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLicenseRegOrg() {
            return licenseRegOrg;
        }

        /**
         * Sets the value of the licenseRegOrg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getLicenseRegOrg()
         */
        public void setLicenseRegOrg(String value) {
            this.licenseRegOrg = value;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}EntpsType">
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Entrp
            extends EntpsType
        {


        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}LegalType">
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Legal
            extends LegalType
        {


        }

    }

}
