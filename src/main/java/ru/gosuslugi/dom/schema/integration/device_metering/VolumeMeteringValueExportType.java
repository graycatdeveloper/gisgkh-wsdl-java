
package ru.gosuslugi.dom.schema.integration.device_metering;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.YearMonth;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Экспортируемые виды показаний ПУ (тепловая энергия, газ, горячая вода, холодная вода, сточные бытовые воды) (используется при экспорте показаний)
 * 
 * <p>Java class for VolumeMeteringValueExportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VolumeMeteringValueExportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CurrentValue" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/device-metering/}VolumeCurrentMeteringValueExportType">
 *                 <sequence minOccurs="0">
 *                   <element name="Period" type="{http://dom.gosuslugi.ru/schema/integration/base/}YearMonth"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ControlValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}VolumeCurrentMeteringValueExportType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="VerificationValue" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="StartDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   <element name="EndDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   <element name="SealDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   <element name="StartValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}VolumeMeteringValueExportBaseType" maxOccurs="3" minOccurs="0"/>
 *                   <element name="EndValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}VolumeMeteringValueExportBaseType" maxOccurs="3" minOccurs="0"/>
 *                   <choice>
 *                     <element name="PlannedVerification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     <element name="VerificationReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                   </choice>
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
@XmlType(name = "VolumeMeteringValueExportType", propOrder = {
    "currentValue",
    "controlValue",
    "verificationValue"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.device_metering.ExportMeteringDeviceHistoryResultType.VolumeDeviceValue.class
})
public class VolumeMeteringValueExportType {

    /**
     * Объем потребления за период
     * 
     */
    @XmlElement(name = "CurrentValue")
    protected List<VolumeMeteringValueExportType.CurrentValue> currentValue;
    /**
     * Контрольный объем
     * 
     */
    @XmlElement(name = "ControlValue")
    protected List<VolumeCurrentMeteringValueExportType> controlValue;
    /**
     * Данные поверки, ПУ остается прежним
     * 
     */
    @XmlElement(name = "VerificationValue")
    protected List<VolumeMeteringValueExportType.VerificationValue> verificationValue;

    /**
     * Объем потребления за период
     * 
     * Gets the value of the currentValue property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentValue property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCurrentValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VolumeMeteringValueExportType.CurrentValue }
     * </p>
     * 
     * 
     * @return
     *     The value of the currentValue property.
     */
    public List<VolumeMeteringValueExportType.CurrentValue> getCurrentValue() {
        if (currentValue == null) {
            currentValue = new ArrayList<>();
        }
        return this.currentValue;
    }

    /**
     * Контрольный объем
     * 
     * Gets the value of the controlValue property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controlValue property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getControlValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VolumeCurrentMeteringValueExportType }
     * </p>
     * 
     * 
     * @return
     *     The value of the controlValue property.
     */
    public List<VolumeCurrentMeteringValueExportType> getControlValue() {
        if (controlValue == null) {
            controlValue = new ArrayList<>();
        }
        return this.controlValue;
    }

    /**
     * Данные поверки, ПУ остается прежним
     * 
     * Gets the value of the verificationValue property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verificationValue property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVerificationValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VolumeMeteringValueExportType.VerificationValue }
     * </p>
     * 
     * 
     * @return
     *     The value of the verificationValue property.
     */
    public List<VolumeMeteringValueExportType.VerificationValue> getVerificationValue() {
        if (verificationValue == null) {
            verificationValue = new ArrayList<>();
        }
        return this.verificationValue;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/device-metering/}VolumeCurrentMeteringValueExportType">
     *       <sequence minOccurs="0">
     *         <element name="Period" type="{http://dom.gosuslugi.ru/schema/integration/base/}YearMonth"/>
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
        "period"
    })
    public static class CurrentValue
        extends VolumeCurrentMeteringValueExportType
    {

        /**
         * Период, к которому относятся показания
         * 
         */
        @XmlElement(name = "Period")
        protected YearMonth period;

        /**
         * Период, к которому относятся показания
         * 
         * @return
         *     possible object is
         *     {@link YearMonth }
         *     
         */
        public YearMonth getPeriod() {
            return period;
        }

        /**
         * Sets the value of the period property.
         * 
         * @param value
         *     allowed object is
         *     {@link YearMonth }
         *     
         * @see #getPeriod()
         */
        public void setPeriod(YearMonth value) {
            this.period = value;
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
     *         <element name="StartDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="EndDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="SealDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="StartValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}VolumeMeteringValueExportBaseType" maxOccurs="3" minOccurs="0"/>
     *         <element name="EndValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}VolumeMeteringValueExportBaseType" maxOccurs="3" minOccurs="0"/>
     *         <choice>
     *           <element name="PlannedVerification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *           <element name="VerificationReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
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
        "startDateValue",
        "endDateValue",
        "sealDate",
        "startValue",
        "endValue",
        "plannedVerification",
        "verificationReason"
    })
    public static class VerificationValue {

        /**
         * Дата начала поверки
         * 
         */
        @XmlElement(name = "StartDateValue", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar startDateValue;
        /**
         * Дата окончания поверки
         * 
         */
        @XmlElement(name = "EndDateValue", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar endDateValue;
        /**
         * Дата опломбиролвания ПУ  после поверки
         * 
         */
        @XmlElement(name = "SealDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar sealDate;
        /**
         * Объем на начало поверки
         * 
         */
        @XmlElement(name = "StartValue")
        protected List<VolumeMeteringValueExportBaseType> startValue;
        /**
         * Объем на окончание поверки
         * 
         */
        @XmlElement(name = "EndValue")
        protected List<VolumeMeteringValueExportBaseType> endValue;
        /**
         * Признак плановой поверки
         * 
         */
        @XmlElement(name = "PlannedVerification")
        protected Boolean plannedVerification;
        /**
         * Причина выхода ПУ из строя (НСИ 224). Вносится при неплановой поверке.
         * 
         */
        @XmlElement(name = "VerificationReason")
        protected NsiRef verificationReason;

        /**
         * Дата начала поверки
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartDateValue() {
            return startDateValue;
        }

        /**
         * Sets the value of the startDateValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getStartDateValue()
         */
        public void setStartDateValue(XMLGregorianCalendar value) {
            this.startDateValue = value;
        }

        /**
         * Дата окончания поверки
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEndDateValue() {
            return endDateValue;
        }

        /**
         * Sets the value of the endDateValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getEndDateValue()
         */
        public void setEndDateValue(XMLGregorianCalendar value) {
            this.endDateValue = value;
        }

        /**
         * Дата опломбиролвания ПУ  после поверки
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSealDate() {
            return sealDate;
        }

        /**
         * Sets the value of the sealDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getSealDate()
         */
        public void setSealDate(XMLGregorianCalendar value) {
            this.sealDate = value;
        }

        /**
         * Объем на начало поверки
         * 
         * Gets the value of the startValue property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the startValue property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getStartValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VolumeMeteringValueExportBaseType }
         * </p>
         * 
         * 
         * @return
         *     The value of the startValue property.
         */
        public List<VolumeMeteringValueExportBaseType> getStartValue() {
            if (startValue == null) {
                startValue = new ArrayList<>();
            }
            return this.startValue;
        }

        /**
         * Объем на окончание поверки
         * 
         * Gets the value of the endValue property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the endValue property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getEndValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VolumeMeteringValueExportBaseType }
         * </p>
         * 
         * 
         * @return
         *     The value of the endValue property.
         */
        public List<VolumeMeteringValueExportBaseType> getEndValue() {
            if (endValue == null) {
                endValue = new ArrayList<>();
            }
            return this.endValue;
        }

        /**
         * Признак плановой поверки
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPlannedVerification() {
            return plannedVerification;
        }

        /**
         * Sets the value of the plannedVerification property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isPlannedVerification()
         */
        public void setPlannedVerification(Boolean value) {
            this.plannedVerification = value;
        }

        /**
         * Причина выхода ПУ из строя (НСИ 224). Вносится при неплановой поверке.
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getVerificationReason() {
            return verificationReason;
        }

        /**
         * Sets the value of the verificationReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getVerificationReason()
         */
        public void setVerificationReason(NsiRef value) {
            this.verificationReason = value;
        }

    }

}
