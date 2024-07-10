
package ru.gosuslugi.dom.schema.integration.volume_quality;

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
 * Составной тип. Информация о перерывах
 * 
 * <p>Java class for IntervalType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IntervalType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StartDateAndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="EndDateAndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="MunicipalService" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="RatedResource" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *         <element name="IntervalReason">
 *           <simpleType>
 *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}String1000Type">
 *               <minLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="AddressObject" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}AddressObjectType">
 *                 <sequence>
 *                   <element name="NotFromContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 </sequence>
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
@XmlType(name = "IntervalType", propOrder = {
    "startDateAndTime",
    "endDateAndTime",
    "municipalService",
    "ratedResource",
    "intervalReason",
    "addressObject"
})
public class IntervalType {

    /**
     * Дата и время начала перерыва
     * 
     */
    @XmlElement(name = "StartDateAndTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateAndTime;
    /**
     * Дата и время окончания перерыва
     * 
     */
    @XmlElement(name = "EndDateAndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateAndTime;
    /**
     * Вид коммунальной услуги. Код для интеграции 3
     * 
     */
    @XmlElement(name = "MunicipalService", required = true)
    protected NsiRef municipalService;
    /**
     * Вид тарифицируемого ресурса. Код для интеграции 239.             Не заполняется только, если  «Вид коммунальной услуги» = «Обращение с твердыми коммунальными отходами». Для остальных видов КУ поле обязательно для заполнения.
     * 
     */
    @XmlElement(name = "RatedResource")
    protected NsiRef ratedResource;
    /**
     * Причина перерыва
     * 
     */
    @XmlElement(name = "IntervalReason", required = true)
    protected String intervalReason;
    /**
     * Объект жилищного фонда
     * 
     */
    @XmlElement(name = "AddressObject", required = true)
    protected List<IntervalType.AddressObject> addressObject;

    /**
     * Дата и время начала перерыва
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateAndTime() {
        return startDateAndTime;
    }

    /**
     * Sets the value of the startDateAndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getStartDateAndTime()
     */
    public void setStartDateAndTime(XMLGregorianCalendar value) {
        this.startDateAndTime = value;
    }

    /**
     * Дата и время окончания перерыва
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDateAndTime() {
        return endDateAndTime;
    }

    /**
     * Sets the value of the endDateAndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEndDateAndTime()
     */
    public void setEndDateAndTime(XMLGregorianCalendar value) {
        this.endDateAndTime = value;
    }

    /**
     * Вид коммунальной услуги. Код для интеграции 3
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getMunicipalService() {
        return municipalService;
    }

    /**
     * Sets the value of the municipalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getMunicipalService()
     */
    public void setMunicipalService(NsiRef value) {
        this.municipalService = value;
    }

    /**
     * Вид тарифицируемого ресурса. Код для интеграции 239.             Не заполняется только, если  «Вид коммунальной услуги» = «Обращение с твердыми коммунальными отходами». Для остальных видов КУ поле обязательно для заполнения.
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getRatedResource() {
        return ratedResource;
    }

    /**
     * Sets the value of the ratedResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getRatedResource()
     */
    public void setRatedResource(NsiRef value) {
        this.ratedResource = value;
    }

    /**
     * Причина перерыва
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntervalReason() {
        return intervalReason;
    }

    /**
     * Sets the value of the intervalReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIntervalReason()
     */
    public void setIntervalReason(String value) {
        this.intervalReason = value;
    }

    /**
     * Объект жилищного фонда
     * 
     * Gets the value of the addressObject property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressObject property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAddressObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntervalType.AddressObject }
     * </p>
     * 
     * 
     * @return
     *     The value of the addressObject property.
     */
    public List<IntervalType.AddressObject> getAddressObject() {
        if (addressObject == null) {
            addressObject = new ArrayList<>();
        }
        return this.addressObject;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}AddressObjectType">
     *       <sequence>
     *         <element name="NotFromContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "notFromContract"
    })
    public static class AddressObject
        extends AddressObjectType
    {

        /**
         * Помещение/блок или комната не из договора (основания).                         Присылается, если импортируется помещение/блок или комната, отсутствующее в указанном основании
         * 
         */
        @XmlElement(name = "NotFromContract")
        protected Boolean notFromContract;

        /**
         * Помещение/блок или комната не из договора (основания).                         Присылается, если импортируется помещение/блок или комната, отсутствующее в указанном основании
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNotFromContract() {
            return notFromContract;
        }

        /**
         * Sets the value of the notFromContract property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isNotFromContract()
         */
        public void setNotFromContract(Boolean value) {
            this.notFromContract = value;
        }

    }

}
