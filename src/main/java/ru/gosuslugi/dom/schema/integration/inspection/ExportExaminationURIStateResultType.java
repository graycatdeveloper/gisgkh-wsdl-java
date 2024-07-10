
package ru.gosuslugi.dom.schema.integration.inspection;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Статус размещения проверки в ЕРП
 * 
 * <p>Java class for exportExaminationURIStateResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportExaminationURIStateResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ExaminationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <choice>
 *           <element name="ShouldNotBeRegistered" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           <sequence>
 *             <element name="ShouldBeRegistered" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *             <element name="URIRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *             <element name="URIRegistrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *             <element name="URIExaminationState">
 *               <simpleType>
 *                 <restriction base="{http://dom.gosuslugi.ru/schema/integration/inspection/}URIExaminationStateType">
 *                   <enumeration value="Placed"/>
 *                   <enumeration value="NotPlaced"/>
 *                   <enumeration value="Sent"/>
 *                   <enumeration value="NotSent"/>
 *                 </restriction>
 *               </simpleType>
 *             </element>
 *             <element name="ReceievedFromURI" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           </sequence>
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
@XmlType(name = "exportExaminationURIStateResultType", propOrder = {
    "examinationGuid",
    "shouldNotBeRegistered",
    "shouldBeRegistered",
    "uriRegistrationNumber",
    "uriRegistrationDate",
    "uriExaminationState",
    "receievedFromURI"
})
public class ExportExaminationURIStateResultType {

    /**
     * Идентификатор проверки в ГИС ЖКХ.
     * 
     */
    @XmlElement(name = "ExaminationGuid", required = true)
    protected String examinationGuid;
    /**
     * Проверка не должна быть зарегистрирована в Едином реестре проверок.
     * 
     */
    @XmlElement(name = "ShouldNotBeRegistered")
    protected Boolean shouldNotBeRegistered;
    /**
     * Проверка должна быть зарегистрирована в Едином реестре проверок.
     * 
     */
    @XmlElement(name = "ShouldBeRegistered")
    protected Boolean shouldBeRegistered;
    /**
     * Учетный номер проверки.
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
     * Статус размещения проверки в ЕРП:                                         Placed - Размещена                   NotPlaced - Не размещена         Sent - Отправлена                     NotSent - Не отправлена
     * 
     */
    @XmlElement(name = "URIExaminationState")
    protected URIExaminationStateType uriExaminationState;
    /**
     * Учетный номер проверки получен из ЕРП. Факт подтверждения ГИС ЖКХ наличия успешно размещенной проверки в ЕРП с указанным учетным номером
     * 
     */
    @XmlElement(name = "ReceievedFromURI")
    protected Boolean receievedFromURI;

    /**
     * Идентификатор проверки в ГИС ЖКХ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminationGuid() {
        return examinationGuid;
    }

    /**
     * Sets the value of the examinationGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getExaminationGuid()
     */
    public void setExaminationGuid(String value) {
        this.examinationGuid = value;
    }

    /**
     * Проверка не должна быть зарегистрирована в Едином реестре проверок.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShouldNotBeRegistered() {
        return shouldNotBeRegistered;
    }

    /**
     * Sets the value of the shouldNotBeRegistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isShouldNotBeRegistered()
     */
    public void setShouldNotBeRegistered(Boolean value) {
        this.shouldNotBeRegistered = value;
    }

    /**
     * Проверка должна быть зарегистрирована в Едином реестре проверок.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShouldBeRegistered() {
        return shouldBeRegistered;
    }

    /**
     * Sets the value of the shouldBeRegistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isShouldBeRegistered()
     */
    public void setShouldBeRegistered(Boolean value) {
        this.shouldBeRegistered = value;
    }

    /**
     * Учетный номер проверки.
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
     * Статус размещения проверки в ЕРП:                                         Placed - Размещена                   NotPlaced - Не размещена         Sent - Отправлена                     NotSent - Не отправлена
     * 
     * @return
     *     possible object is
     *     {@link URIExaminationStateType }
     *     
     */
    public URIExaminationStateType getURIExaminationState() {
        return uriExaminationState;
    }

    /**
     * Sets the value of the uriExaminationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link URIExaminationStateType }
     *     
     * @see #getURIExaminationState()
     */
    public void setURIExaminationState(URIExaminationStateType value) {
        this.uriExaminationState = value;
    }

    /**
     * Учетный номер проверки получен из ЕРП. Факт подтверждения ГИС ЖКХ наличия успешно размещенной проверки в ЕРП с указанным учетным номером
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReceievedFromURI() {
        return receievedFromURI;
    }

    /**
     * Sets the value of the receievedFromURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isReceievedFromURI()
     */
    public void setReceievedFromURI(Boolean value) {
        this.receievedFromURI = value;
    }

}
