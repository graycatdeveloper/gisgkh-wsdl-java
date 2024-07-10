
package ru.gosuslugi.dom.schema.integration.outage_report;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Тип данных, описывающий сведения о перерыве в предоставлении коммунальных услуг
 * 
 * <p>Java class for OutageReportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OutageReportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OutageKind" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="OutageType" type="{http://dom.gosuslugi.ru/schema/integration/outage-report/}OutageTypeType"/>
 *         <element name="ServiceCodes">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ServiceCode" type="{http://dom.gosuslugi.ru/schema/integration/outage-report/}ServiceCodeType" maxOccurs="7"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="OutageReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="OutageReasonText" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="3000"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="AdditionalInfo" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="5000"/>
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
@XmlType(name = "OutageReportType", propOrder = {
    "outageKind",
    "outageType",
    "serviceCodes",
    "startDate",
    "endDate",
    "outageReason",
    "outageReasonText",
    "additionalInfo"
})
public class OutageReportType {

    /**
     * Вид перерыва. Указываются значения из справочника №361 "Вид перерыва в предоставлении коммунальных услуг". В текущей реализации сервиса, должен быть указан вид перерыва 1 = "Плановый".
     * 
     */
    @XmlElement(name = "OutageKind", required = true)
    protected NsiRef outageKind;
    /**
     * Тип перерыва. Возможные значения:
     * PAUSE - Перерыв в предоставлении коммунальной услуги;
     * LIMITATION - Ограничение в предоставлении коммунальной услуги;
     * SUSPENSION - Приостановление предоставления коммунальной услуги.
     * 
     */
    @XmlElement(name = "OutageType", required = true)
    @XmlSchemaType(name = "string")
    protected OutageTypeType outageType;
    /**
     * Список кодов вида коммунальной услуги
     * 
     */
    @XmlElement(name = "ServiceCodes", required = true)
    protected OutageReportType.ServiceCodes serviceCodes;
    /**
     * Дата и время начала перерыва
     * 
     */
    @XmlElement(name = "StartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    /**
     * Дата и время окончания перерыва
     * 
     */
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    /**
     * Причина перерыва. Указываются значения из справочника №360 "Причины перерывов в предоставлении коммунальных услуг", для которых в атрибуте «Вид перерыва» указано значение «Плановый»
     * 
     */
    @XmlElement(name = "OutageReason", required = true)
    protected NsiRef outageReason;
    /**
     * Текст причины перерыва. Обязательно заполнен, если в атрибуте "Причина перерыва" указано значение 3 "Иная"
     * 
     */
    @XmlElement(name = "OutageReasonText")
    protected String outageReasonText;
    /**
     * Дополнительная информация
     * 
     */
    @XmlElement(name = "AdditionalInfo")
    protected String additionalInfo;

    /**
     * Вид перерыва. Указываются значения из справочника №361 "Вид перерыва в предоставлении коммунальных услуг". В текущей реализации сервиса, должен быть указан вид перерыва 1 = "Плановый".
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getOutageKind() {
        return outageKind;
    }

    /**
     * Sets the value of the outageKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getOutageKind()
     */
    public void setOutageKind(NsiRef value) {
        this.outageKind = value;
    }

    /**
     * Тип перерыва. Возможные значения:
     * PAUSE - Перерыв в предоставлении коммунальной услуги;
     * LIMITATION - Ограничение в предоставлении коммунальной услуги;
     * SUSPENSION - Приостановление предоставления коммунальной услуги.
     * 
     * @return
     *     possible object is
     *     {@link OutageTypeType }
     *     
     */
    public OutageTypeType getOutageType() {
        return outageType;
    }

    /**
     * Sets the value of the outageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageTypeType }
     *     
     * @see #getOutageType()
     */
    public void setOutageType(OutageTypeType value) {
        this.outageType = value;
    }

    /**
     * Список кодов вида коммунальной услуги
     * 
     * @return
     *     possible object is
     *     {@link OutageReportType.ServiceCodes }
     *     
     */
    public OutageReportType.ServiceCodes getServiceCodes() {
        return serviceCodes;
    }

    /**
     * Sets the value of the serviceCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageReportType.ServiceCodes }
     *     
     * @see #getServiceCodes()
     */
    public void setServiceCodes(OutageReportType.ServiceCodes value) {
        this.serviceCodes = value;
    }

    /**
     * Дата и время начала перерыва
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getStartDate()
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Дата и время окончания перерыва
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEndDate()
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Причина перерыва. Указываются значения из справочника №360 "Причины перерывов в предоставлении коммунальных услуг", для которых в атрибуте «Вид перерыва» указано значение «Плановый»
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getOutageReason() {
        return outageReason;
    }

    /**
     * Sets the value of the outageReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getOutageReason()
     */
    public void setOutageReason(NsiRef value) {
        this.outageReason = value;
    }

    /**
     * Текст причины перерыва. Обязательно заполнен, если в атрибуте "Причина перерыва" указано значение 3 "Иная"
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutageReasonText() {
        return outageReasonText;
    }

    /**
     * Sets the value of the outageReasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOutageReasonText()
     */
    public void setOutageReasonText(String value) {
        this.outageReasonText = value;
    }

    /**
     * Дополнительная информация
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAdditionalInfo()
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
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
     *         <element name="ServiceCode" type="{http://dom.gosuslugi.ru/schema/integration/outage-report/}ServiceCodeType" maxOccurs="7"/>
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
        "serviceCode"
    })
    public static class ServiceCodes {

        /**
         * Код вида коммунальной услуги. Возможные значения: 
         *  1 - Холодное водоснабжение; 
         *  2 - Горячее водоснабжение;
         *  3 - Отведение сточных вод; 
         *  4 – Электроснабжение; 
         *  5 – Газоснабжение; 
         *  6 – Отопление; 
         *  7 – Обращение с твердыми коммунальными отходами.
         * 
         */
        @XmlElement(name = "ServiceCode", type = Byte.class)
        protected List<Byte> serviceCode;

        /**
         * Код вида коммунальной услуги. Возможные значения: 
         *  1 - Холодное водоснабжение; 
         *  2 - Горячее водоснабжение;
         *  3 - Отведение сточных вод; 
         *  4 – Электроснабжение; 
         *  5 – Газоснабжение; 
         *  6 – Отопление; 
         *  7 – Обращение с твердыми коммунальными отходами.
         * 
         * Gets the value of the serviceCode property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceCode property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getServiceCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Byte }
         * </p>
         * 
         * 
         * @return
         *     The value of the serviceCode property.
         */
        public List<Byte> getServiceCode() {
            if (serviceCode == null) {
                serviceCode = new ArrayList<>();
            }
            return this.serviceCode;
        }

    }

}
