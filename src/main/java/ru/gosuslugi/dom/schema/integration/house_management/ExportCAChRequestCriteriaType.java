
package ru.gosuslugi.dom.schema.integration.house_management;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for exportCAChRequestCriteriaType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportCAChRequestCriteriaType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterGUID"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractGUID"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractVersionGUID"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterVersionGUID"/>
 *         <sequence>
 *           <element name="UOGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *           <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *           <element name="SigningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *           <element name="LastVersionOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         </sequence>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportCAChRequestCriteriaType", propOrder = {
    "charterGUID",
    "contractGUID",
    "contractVersionGUID",
    "charterVersionGUID",
    "uoguid",
    "fiasHouseGuid",
    "signingDate",
    "lastVersionOnly"
})
public class ExportCAChRequestCriteriaType {

    /**
     * Корневой идентификатор устава (не меняется от версии к версии)
     * 
     */
    @XmlElement(name = "CharterGUID")
    protected String charterGUID;
    /**
     * Корневой идентификатор договора (не меняется от версии к версии)
     * 
     */
    @XmlElement(name = "ContractGUID")
    protected String contractGUID;
    /**
     * Идентификатор версии договора
     * 
     */
    @XmlElement(name = "ContractVersionGUID")
    protected String contractVersionGUID;
    /**
     * Идентификатор версии устава в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "CharterVersionGUID")
    protected String charterVersionGUID;
    /**
     * Идентификатор УО в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "UOGUID")
    protected String uoguid;
    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     */
    @XmlElement(name = "FIASHouseGuid")
    protected String fiasHouseGuid;
    /**
     * Дата заключения ДУ
     * 
     */
    @XmlElement(name = "SigningDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar signingDate;
    /**
     * Настройка для экспорта только крайней версии ДУ/устава. Если элемент не указан, экспорту подлежат все версии документа
     * 
     */
    @XmlElement(name = "LastVersionOnly")
    protected Boolean lastVersionOnly;

    /**
     * Корневой идентификатор устава (не меняется от версии к версии)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharterGUID() {
        return charterGUID;
    }

    /**
     * Sets the value of the charterGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCharterGUID()
     */
    public void setCharterGUID(String value) {
        this.charterGUID = value;
    }

    /**
     * Корневой идентификатор договора (не меняется от версии к версии)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractGUID() {
        return contractGUID;
    }

    /**
     * Sets the value of the contractGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContractGUID()
     */
    public void setContractGUID(String value) {
        this.contractGUID = value;
    }

    /**
     * Идентификатор версии договора
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractVersionGUID() {
        return contractVersionGUID;
    }

    /**
     * Sets the value of the contractVersionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContractVersionGUID()
     */
    public void setContractVersionGUID(String value) {
        this.contractVersionGUID = value;
    }

    /**
     * Идентификатор версии устава в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharterVersionGUID() {
        return charterVersionGUID;
    }

    /**
     * Sets the value of the charterVersionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCharterVersionGUID()
     */
    public void setCharterVersionGUID(String value) {
        this.charterVersionGUID = value;
    }

    /**
     * Идентификатор УО в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUOGUID() {
        return uoguid;
    }

    /**
     * Sets the value of the uoguid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUOGUID()
     */
    public void setUOGUID(String value) {
        this.uoguid = value;
    }

    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIASHouseGuid() {
        return fiasHouseGuid;
    }

    /**
     * Sets the value of the fiasHouseGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFIASHouseGuid()
     */
    public void setFIASHouseGuid(String value) {
        this.fiasHouseGuid = value;
    }

    /**
     * Дата заключения ДУ
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSigningDate() {
        return signingDate;
    }

    /**
     * Sets the value of the signingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getSigningDate()
     */
    public void setSigningDate(XMLGregorianCalendar value) {
        this.signingDate = value;
    }

    /**
     * Настройка для экспорта только крайней версии ДУ/устава. Если элемент не указан, экспорту подлежат все версии документа
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastVersionOnly() {
        return lastVersionOnly;
    }

    /**
     * Sets the value of the lastVersionOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isLastVersionOnly()
     */
    public void setLastVersionOnly(Boolean value) {
        this.lastVersionOnly = value;
    }

}
