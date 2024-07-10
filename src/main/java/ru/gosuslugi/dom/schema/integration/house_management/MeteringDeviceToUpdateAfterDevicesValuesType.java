
package ru.gosuslugi.dom.schema.integration.house_management;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;
import ru.gosuslugi.dom.schema.integration.metering_device_base.OneRateMeteringValueBaseType;


/**
 * Тип для редактирования ПУ после начала внесения показаний
 * 
 * <p>Java class for MeteringDeviceToUpdateAfterDevicesValuesType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MeteringDeviceToUpdateAfterDevicesValuesType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MeteringDeviceNumber" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="50"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="MeteringDeviceStamp" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="100"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="MeteringDeviceModel" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="100"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="InstallationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="CommissioningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="RemoteMeteringMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="RemoteMeteringInfo" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="2000"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="TemperatureSensor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="PressureSensor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="CollectiveDevice" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="TemperatureSensorInformation" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <maxLength value="2000"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="PressureSensorInformation" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <maxLength value="2000"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="AccountGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Certificate" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="100" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element name="MunicipalResourceNotEnergy" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}OneRateMeteringValueBaseType" maxOccurs="3"/>
 *           <element name="MunicipalResourceEnergy" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}MunicipalResourceElectricUpdateType"/>
 *         </choice>
 *         <element name="FirstVerificationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="FactorySealDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="ConsumedVolume" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element name="NotLinkedWithMetering" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           <element name="LinkedWithMetering">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="InstallationPlace">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <enumeration value="in"/>
 *                           <enumeration value="out"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element name="LinkedMeteringDeviceVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringDeviceGUIDType" maxOccurs="10" minOccurs="0"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *         </choice>
 *         <element name="AddressChatacteristicts" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element name="ResidentialPremiseDevice">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="PremiseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="NonResidentialPremiseDevice">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="PremiseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="ApartmentHouseDevice">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <choice>
 *                             <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
 *                             <element name="isChangeToFIASHouseGuid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                           </choice>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="CollectiveDevice">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <choice>
 *                             <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
 *                             <element name="isChangeToFIASHouseGuid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                           </choice>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="LivingRoomDevice">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="LivingRoomGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="CollectiveApartmentDevice">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="PremiseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
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
@XmlType(name = "MeteringDeviceToUpdateAfterDevicesValuesType", propOrder = {
    "meteringDeviceNumber",
    "meteringDeviceStamp",
    "meteringDeviceModel",
    "installationDate",
    "commissioningDate",
    "remoteMeteringMode",
    "remoteMeteringInfo",
    "temperatureSensor",
    "pressureSensor",
    "collectiveDevice",
    "accountGUID",
    "certificate",
    "municipalResourceNotEnergy",
    "municipalResourceEnergy",
    "firstVerificationDate",
    "factorySealDate",
    "consumedVolume",
    "notLinkedWithMetering",
    "linkedWithMetering",
    "addressChatacteristicts"
})
public class MeteringDeviceToUpdateAfterDevicesValuesType {

    /**
     * Заводской (серийный) номер ПУ
     * 
     */
    @XmlElement(name = "MeteringDeviceNumber")
    protected String meteringDeviceNumber;
    /**
     * Марка ПУ (обязательно для заполнения при импорте)
     * 
     */
    @XmlElement(name = "MeteringDeviceStamp")
    protected String meteringDeviceStamp;
    /**
     * Модель ПУ (обязательно для заполнения при импорте)
     * 
     */
    @XmlElement(name = "MeteringDeviceModel")
    protected String meteringDeviceModel;
    /**
     * Дата установки
     * 
     */
    @XmlElement(name = "InstallationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar installationDate;
    /**
     * Дата ввода в эксплуатацию
     * 
     */
    @XmlElement(name = "CommissioningDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar commissioningDate;
    /**
     * Наличие возможности дистанционного снятия показаний
     * 
     */
    @XmlElement(name = "RemoteMeteringMode")
    protected Boolean remoteMeteringMode;
    /**
     * Информация о наличии возможности дистанционного снятия показаний ПУ указанием наименования установленной системы (обязательно для заполнения, если tns:RemoteMeteringMode = true, в противном случае поле не обрабатывается при импорте)
     * 
     */
    @XmlElement(name = "RemoteMeteringInfo")
    protected String remoteMeteringInfo;
    /**
     * Наличие датчиков температры
     * 
     */
    @XmlElement(name = "TemperatureSensor")
    protected Boolean temperatureSensor;
    /**
     * Наличие датчиков давления
     * 
     */
    @XmlElement(name = "PressureSensor")
    protected Boolean pressureSensor;
    /**
     * Характеристики общедомового ПУ (значение справочника "Тип прибора учета" = коллективный (общедомомвой))
     * 
     */
    @XmlElement(name = "CollectiveDevice")
    protected MeteringDeviceToUpdateAfterDevicesValuesType.CollectiveDevice collectiveDevice;
    /**
     * В случае изменения лицевых счетов необходимо прислать их актуальный перечень (данные будут полностью заменены)
     * 
     */
    @XmlElement(name = "AccountGUID")
    protected List<String> accountGUID;
    /**
     * Электронный образ акта ввода узла учета в эксплуатацию
     * 
     */
    @XmlElement(name = "Certificate")
    protected List<AttachmentType> certificate;
    /**
     * Данные об изменении базовых показаний. Коммунальный ресурс (тепловая энергия, газ, горячая вода, холодная вода, сточные бытовые воды) должен быть указан тот же, что и при создании ПУ
     * 
     */
    @XmlElement(name = "MunicipalResourceNotEnergy")
    protected List<OneRateMeteringValueBaseType> municipalResourceNotEnergy;
    /**
     * Данные об изменении базовых показаний ПУ электрической энергии. Необходимо прислать все актуальные базовые показания в соответсвии с видом ПУ по количеству тарифов (даже если требуется отредактировать только одно показание).
     * 
     */
    @XmlElement(name = "MunicipalResourceEnergy")
    protected MunicipalResourceElectricUpdateType municipalResourceEnergy;
    /**
     * Дата последней поверки (поле можно редактировать после начала внесения показаний, но запрещено к редактированию после внесения первой поверки)
     * 
     */
    @XmlElement(name = "FirstVerificationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstVerificationDate;
    /**
     * Дата опломбирования ПУ заводом-изготовителем
     * 
     */
    @XmlElement(name = "FactorySealDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar factorySealDate;
    /**
     * Признак «ПУ предоставляет объем потребленного КР»
     * 
     */
    @XmlElement(name = "ConsumedVolume")
    protected Boolean consumedVolume;
    /**
     * Объем ресурса(ов) определяется только с помощью текущего ПУ (связей с другими ПУ нет)
     * 
     */
    @XmlElement(name = "NotLinkedWithMetering")
    protected Boolean notLinkedWithMetering;
    /**
     * Объем ресурса(ов) определяется с помощью нескольких приборов учета
     * 
     */
    @XmlElement(name = "LinkedWithMetering")
    protected MeteringDeviceToUpdateAfterDevicesValuesType.LinkedWithMetering linkedWithMetering;
    /**
     * Изменение адреса установленного ПУ
     * 
     */
    @XmlElement(name = "AddressChatacteristicts")
    protected MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts addressChatacteristicts;

    /**
     * Заводской (серийный) номер ПУ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeteringDeviceNumber() {
        return meteringDeviceNumber;
    }

    /**
     * Sets the value of the meteringDeviceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMeteringDeviceNumber()
     */
    public void setMeteringDeviceNumber(String value) {
        this.meteringDeviceNumber = value;
    }

    /**
     * Марка ПУ (обязательно для заполнения при импорте)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeteringDeviceStamp() {
        return meteringDeviceStamp;
    }

    /**
     * Sets the value of the meteringDeviceStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMeteringDeviceStamp()
     */
    public void setMeteringDeviceStamp(String value) {
        this.meteringDeviceStamp = value;
    }

    /**
     * Модель ПУ (обязательно для заполнения при импорте)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeteringDeviceModel() {
        return meteringDeviceModel;
    }

    /**
     * Sets the value of the meteringDeviceModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMeteringDeviceModel()
     */
    public void setMeteringDeviceModel(String value) {
        this.meteringDeviceModel = value;
    }

    /**
     * Дата установки
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInstallationDate() {
        return installationDate;
    }

    /**
     * Sets the value of the installationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getInstallationDate()
     */
    public void setInstallationDate(XMLGregorianCalendar value) {
        this.installationDate = value;
    }

    /**
     * Дата ввода в эксплуатацию
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommissioningDate() {
        return commissioningDate;
    }

    /**
     * Sets the value of the commissioningDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getCommissioningDate()
     */
    public void setCommissioningDate(XMLGregorianCalendar value) {
        this.commissioningDate = value;
    }

    /**
     * Наличие возможности дистанционного снятия показаний
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoteMeteringMode() {
        return remoteMeteringMode;
    }

    /**
     * Sets the value of the remoteMeteringMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isRemoteMeteringMode()
     */
    public void setRemoteMeteringMode(Boolean value) {
        this.remoteMeteringMode = value;
    }

    /**
     * Информация о наличии возможности дистанционного снятия показаний ПУ указанием наименования установленной системы (обязательно для заполнения, если tns:RemoteMeteringMode = true, в противном случае поле не обрабатывается при импорте)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteMeteringInfo() {
        return remoteMeteringInfo;
    }

    /**
     * Sets the value of the remoteMeteringInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRemoteMeteringInfo()
     */
    public void setRemoteMeteringInfo(String value) {
        this.remoteMeteringInfo = value;
    }

    /**
     * Наличие датчиков температры
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTemperatureSensor() {
        return temperatureSensor;
    }

    /**
     * Sets the value of the temperatureSensor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isTemperatureSensor()
     */
    public void setTemperatureSensor(Boolean value) {
        this.temperatureSensor = value;
    }

    /**
     * Наличие датчиков давления
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPressureSensor() {
        return pressureSensor;
    }

    /**
     * Sets the value of the pressureSensor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isPressureSensor()
     */
    public void setPressureSensor(Boolean value) {
        this.pressureSensor = value;
    }

    /**
     * Характеристики общедомового ПУ (значение справочника "Тип прибора учета" = коллективный (общедомомвой))
     * 
     * @return
     *     possible object is
     *     {@link MeteringDeviceToUpdateAfterDevicesValuesType.CollectiveDevice }
     *     
     */
    public MeteringDeviceToUpdateAfterDevicesValuesType.CollectiveDevice getCollectiveDevice() {
        return collectiveDevice;
    }

    /**
     * Sets the value of the collectiveDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeteringDeviceToUpdateAfterDevicesValuesType.CollectiveDevice }
     *     
     * @see #getCollectiveDevice()
     */
    public void setCollectiveDevice(MeteringDeviceToUpdateAfterDevicesValuesType.CollectiveDevice value) {
        this.collectiveDevice = value;
    }

    /**
     * В случае изменения лицевых счетов необходимо прислать их актуальный перечень (данные будут полностью заменены)
     * 
     * Gets the value of the accountGUID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountGUID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAccountGUID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the accountGUID property.
     */
    public List<String> getAccountGUID() {
        if (accountGUID == null) {
            accountGUID = new ArrayList<>();
        }
        return this.accountGUID;
    }

    /**
     * Электронный образ акта ввода узла учета в эксплуатацию
     * 
     * Gets the value of the certificate property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificate property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCertificate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentType }
     * </p>
     * 
     * 
     * @return
     *     The value of the certificate property.
     */
    public List<AttachmentType> getCertificate() {
        if (certificate == null) {
            certificate = new ArrayList<>();
        }
        return this.certificate;
    }

    /**
     * Данные об изменении базовых показаний. Коммунальный ресурс (тепловая энергия, газ, горячая вода, холодная вода, сточные бытовые воды) должен быть указан тот же, что и при создании ПУ
     * 
     * Gets the value of the municipalResourceNotEnergy property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the municipalResourceNotEnergy property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMunicipalResourceNotEnergy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OneRateMeteringValueBaseType }
     * </p>
     * 
     * 
     * @return
     *     The value of the municipalResourceNotEnergy property.
     */
    public List<OneRateMeteringValueBaseType> getMunicipalResourceNotEnergy() {
        if (municipalResourceNotEnergy == null) {
            municipalResourceNotEnergy = new ArrayList<>();
        }
        return this.municipalResourceNotEnergy;
    }

    /**
     * Данные об изменении базовых показаний ПУ электрической энергии. Необходимо прислать все актуальные базовые показания в соответсвии с видом ПУ по количеству тарифов (даже если требуется отредактировать только одно показание).
     * 
     * @return
     *     possible object is
     *     {@link MunicipalResourceElectricUpdateType }
     *     
     */
    public MunicipalResourceElectricUpdateType getMunicipalResourceEnergy() {
        return municipalResourceEnergy;
    }

    /**
     * Sets the value of the municipalResourceEnergy property.
     * 
     * @param value
     *     allowed object is
     *     {@link MunicipalResourceElectricUpdateType }
     *     
     * @see #getMunicipalResourceEnergy()
     */
    public void setMunicipalResourceEnergy(MunicipalResourceElectricUpdateType value) {
        this.municipalResourceEnergy = value;
    }

    /**
     * Дата последней поверки (поле можно редактировать после начала внесения показаний, но запрещено к редактированию после внесения первой поверки)
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstVerificationDate() {
        return firstVerificationDate;
    }

    /**
     * Sets the value of the firstVerificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getFirstVerificationDate()
     */
    public void setFirstVerificationDate(XMLGregorianCalendar value) {
        this.firstVerificationDate = value;
    }

    /**
     * Дата опломбирования ПУ заводом-изготовителем
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFactorySealDate() {
        return factorySealDate;
    }

    /**
     * Sets the value of the factorySealDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getFactorySealDate()
     */
    public void setFactorySealDate(XMLGregorianCalendar value) {
        this.factorySealDate = value;
    }

    /**
     * Признак «ПУ предоставляет объем потребленного КР»
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsumedVolume() {
        return consumedVolume;
    }

    /**
     * Sets the value of the consumedVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isConsumedVolume()
     */
    public void setConsumedVolume(Boolean value) {
        this.consumedVolume = value;
    }

    /**
     * Объем ресурса(ов) определяется только с помощью текущего ПУ (связей с другими ПУ нет)
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotLinkedWithMetering() {
        return notLinkedWithMetering;
    }

    /**
     * Sets the value of the notLinkedWithMetering property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNotLinkedWithMetering()
     */
    public void setNotLinkedWithMetering(Boolean value) {
        this.notLinkedWithMetering = value;
    }

    /**
     * Объем ресурса(ов) определяется с помощью нескольких приборов учета
     * 
     * @return
     *     possible object is
     *     {@link MeteringDeviceToUpdateAfterDevicesValuesType.LinkedWithMetering }
     *     
     */
    public MeteringDeviceToUpdateAfterDevicesValuesType.LinkedWithMetering getLinkedWithMetering() {
        return linkedWithMetering;
    }

    /**
     * Sets the value of the linkedWithMetering property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeteringDeviceToUpdateAfterDevicesValuesType.LinkedWithMetering }
     *     
     * @see #getLinkedWithMetering()
     */
    public void setLinkedWithMetering(MeteringDeviceToUpdateAfterDevicesValuesType.LinkedWithMetering value) {
        this.linkedWithMetering = value;
    }

    /**
     * Изменение адреса установленного ПУ
     * 
     * @return
     *     possible object is
     *     {@link MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts }
     *     
     */
    public MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts getAddressChatacteristicts() {
        return addressChatacteristicts;
    }

    /**
     * Sets the value of the addressChatacteristicts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts }
     *     
     * @see #getAddressChatacteristicts()
     */
    public void setAddressChatacteristicts(MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts value) {
        this.addressChatacteristicts = value;
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
     *         <element name="ResidentialPremiseDevice">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="PremiseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="NonResidentialPremiseDevice">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="PremiseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="ApartmentHouseDevice">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <choice>
     *                   <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
     *                   <element name="isChangeToFIASHouseGuid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                 </choice>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="CollectiveDevice">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <choice>
     *                   <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
     *                   <element name="isChangeToFIASHouseGuid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                 </choice>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="LivingRoomDevice">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="LivingRoomGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="CollectiveApartmentDevice">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="PremiseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
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
        "residentialPremiseDevice",
        "nonResidentialPremiseDevice",
        "apartmentHouseDevice",
        "collectiveDevice",
        "livingRoomDevice",
        "collectiveApartmentDevice"
    })
    public static class AddressChatacteristicts {

        /**
         * Характеристики ИПУ жилого помещения (тип прибора учета = "Индивидуальный")
         * 
         */
        @XmlElement(name = "ResidentialPremiseDevice")
        protected MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.ResidentialPremiseDevice residentialPremiseDevice;
        /**
         * Характеристики ИПУ нежилого помещения (тип прибора учета = "Индивидуальный")
         * 
         */
        @XmlElement(name = "NonResidentialPremiseDevice")
        protected MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.NonResidentialPremiseDevice nonResidentialPremiseDevice;
        /**
         * Характеристики ИПУ жилого дома (тип прибора учета = "Индивидуальный", тип дома = "Жилой")
         * 
         */
        @XmlElement(name = "ApartmentHouseDevice")
        protected MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.ApartmentHouseDevice apartmentHouseDevice;
        /**
         * Характеристики общедомового ПУ (тип прибора учета = "Коллективный (общедомовой)")
         * 
         */
        @XmlElement(name = "CollectiveDevice")
        protected MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.CollectiveDevice collectiveDevice;
        /**
         * Характеристики комнатного ИПУ (тип прибора учета = "Комнатный"
         * 
         */
        @XmlElement(name = "LivingRoomDevice")
        protected MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.LivingRoomDevice livingRoomDevice;
        /**
         * Характеристики общеквартирного ПУ (для квартир коммунального заселения) (тип прибора учета = "Общий (квартирный)")
         * 
         */
        @XmlElement(name = "CollectiveApartmentDevice")
        protected MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.CollectiveApartmentDevice collectiveApartmentDevice;

        /**
         * Характеристики ИПУ жилого помещения (тип прибора учета = "Индивидуальный")
         * 
         * @return
         *     possible object is
         *     {@link MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.ResidentialPremiseDevice }
         *     
         */
        public MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.ResidentialPremiseDevice getResidentialPremiseDevice() {
            return residentialPremiseDevice;
        }

        /**
         * Sets the value of the residentialPremiseDevice property.
         * 
         * @param value
         *     allowed object is
         *     {@link MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.ResidentialPremiseDevice }
         *     
         * @see #getResidentialPremiseDevice()
         */
        public void setResidentialPremiseDevice(MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.ResidentialPremiseDevice value) {
            this.residentialPremiseDevice = value;
        }

        /**
         * Характеристики ИПУ нежилого помещения (тип прибора учета = "Индивидуальный")
         * 
         * @return
         *     possible object is
         *     {@link MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.NonResidentialPremiseDevice }
         *     
         */
        public MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.NonResidentialPremiseDevice getNonResidentialPremiseDevice() {
            return nonResidentialPremiseDevice;
        }

        /**
         * Sets the value of the nonResidentialPremiseDevice property.
         * 
         * @param value
         *     allowed object is
         *     {@link MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.NonResidentialPremiseDevice }
         *     
         * @see #getNonResidentialPremiseDevice()
         */
        public void setNonResidentialPremiseDevice(MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.NonResidentialPremiseDevice value) {
            this.nonResidentialPremiseDevice = value;
        }

        /**
         * Характеристики ИПУ жилого дома (тип прибора учета = "Индивидуальный", тип дома = "Жилой")
         * 
         * @return
         *     possible object is
         *     {@link MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.ApartmentHouseDevice }
         *     
         */
        public MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.ApartmentHouseDevice getApartmentHouseDevice() {
            return apartmentHouseDevice;
        }

        /**
         * Sets the value of the apartmentHouseDevice property.
         * 
         * @param value
         *     allowed object is
         *     {@link MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.ApartmentHouseDevice }
         *     
         * @see #getApartmentHouseDevice()
         */
        public void setApartmentHouseDevice(MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.ApartmentHouseDevice value) {
            this.apartmentHouseDevice = value;
        }

        /**
         * Характеристики общедомового ПУ (тип прибора учета = "Коллективный (общедомовой)")
         * 
         * @return
         *     possible object is
         *     {@link MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.CollectiveDevice }
         *     
         */
        public MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.CollectiveDevice getCollectiveDevice() {
            return collectiveDevice;
        }

        /**
         * Sets the value of the collectiveDevice property.
         * 
         * @param value
         *     allowed object is
         *     {@link MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.CollectiveDevice }
         *     
         * @see #getCollectiveDevice()
         */
        public void setCollectiveDevice(MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.CollectiveDevice value) {
            this.collectiveDevice = value;
        }

        /**
         * Характеристики комнатного ИПУ (тип прибора учета = "Комнатный"
         * 
         * @return
         *     possible object is
         *     {@link MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.LivingRoomDevice }
         *     
         */
        public MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.LivingRoomDevice getLivingRoomDevice() {
            return livingRoomDevice;
        }

        /**
         * Sets the value of the livingRoomDevice property.
         * 
         * @param value
         *     allowed object is
         *     {@link MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.LivingRoomDevice }
         *     
         * @see #getLivingRoomDevice()
         */
        public void setLivingRoomDevice(MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.LivingRoomDevice value) {
            this.livingRoomDevice = value;
        }

        /**
         * Характеристики общеквартирного ПУ (для квартир коммунального заселения) (тип прибора учета = "Общий (квартирный)")
         * 
         * @return
         *     possible object is
         *     {@link MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.CollectiveApartmentDevice }
         *     
         */
        public MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.CollectiveApartmentDevice getCollectiveApartmentDevice() {
            return collectiveApartmentDevice;
        }

        /**
         * Sets the value of the collectiveApartmentDevice property.
         * 
         * @param value
         *     allowed object is
         *     {@link MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.CollectiveApartmentDevice }
         *     
         * @see #getCollectiveApartmentDevice()
         */
        public void setCollectiveApartmentDevice(MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.CollectiveApartmentDevice value) {
            this.collectiveApartmentDevice = value;
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
         *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
         *         <element name="isChangeToFIASHouseGuid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
            "fiasHouseGuid",
            "isChangeToFIASHouseGuid"
        })
        public static class ApartmentHouseDevice {

            /**
             * Глобальный уникальный идентификатор дома по ФИАС, который необходимо установить в качестве адреса ПУ   (не должен указываться при наличии tns:importMeteringDeviceDataRequest/tns:FIASHouseGuid)
             * 
             */
            @XmlElement(name = "FIASHouseGuid")
            protected List<String> fiasHouseGuid;
            /**
             * Признак "Изменить адрес ПУ на адрес дома, указанный в tns:importMeteringDeviceDataRequest/tns:FIASHouseGuid?"
             * 
             */
            protected Boolean isChangeToFIASHouseGuid;

            /**
             * Глобальный уникальный идентификатор дома по ФИАС, который необходимо установить в качестве адреса ПУ   (не должен указываться при наличии tns:importMeteringDeviceDataRequest/tns:FIASHouseGuid)
             * 
             * Gets the value of the fiasHouseGuid property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the fiasHouseGuid property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getFIASHouseGuid().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * </p>
             * 
             * 
             * @return
             *     The value of the fiasHouseGuid property.
             */
            public List<String> getFIASHouseGuid() {
                if (fiasHouseGuid == null) {
                    fiasHouseGuid = new ArrayList<>();
                }
                return this.fiasHouseGuid;
            }

            /**
             * Признак "Изменить адрес ПУ на адрес дома, указанный в tns:importMeteringDeviceDataRequest/tns:FIASHouseGuid?"
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsChangeToFIASHouseGuid() {
                return isChangeToFIASHouseGuid;
            }

            /**
             * Sets the value of the isChangeToFIASHouseGuid property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isIsChangeToFIASHouseGuid()
             */
            public void setIsChangeToFIASHouseGuid(Boolean value) {
                this.isChangeToFIASHouseGuid = value;
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
         *         <element name="PremiseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
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
            "premiseGUID"
        })
        public static class CollectiveApartmentDevice {

            /**
             * Идентификатор жилого помещения
             * 
             */
            @XmlElement(name = "PremiseGUID", required = true)
            protected List<String> premiseGUID;

            /**
             * Идентификатор жилого помещения
             * 
             * Gets the value of the premiseGUID property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the premiseGUID property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getPremiseGUID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * </p>
             * 
             * 
             * @return
             *     The value of the premiseGUID property.
             */
            public List<String> getPremiseGUID() {
                if (premiseGUID == null) {
                    premiseGUID = new ArrayList<>();
                }
                return this.premiseGUID;
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
         *       <choice>
         *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
         *         <element name="isChangeToFIASHouseGuid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
            "fiasHouseGuid",
            "isChangeToFIASHouseGuid"
        })
        public static class CollectiveDevice {

            /**
             * Глобальный уникальный идентификатор дома по ФИАС, который необходимо установить в качестве адреса ПУ   (не должен указываться при наличии tns:importMeteringDeviceDataRequest/tns:FIASHouseGuid)
             * 
             */
            @XmlElement(name = "FIASHouseGuid")
            protected List<String> fiasHouseGuid;
            /**
             * Признак "Изменить адрес ПУ на адрес дома указанного в tns:importMeteringDeviceDataRequest/ tns:FIASHouseGuid?"
             * 
             */
            protected Boolean isChangeToFIASHouseGuid;

            /**
             * Глобальный уникальный идентификатор дома по ФИАС, который необходимо установить в качестве адреса ПУ   (не должен указываться при наличии tns:importMeteringDeviceDataRequest/tns:FIASHouseGuid)
             * 
             * Gets the value of the fiasHouseGuid property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the fiasHouseGuid property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getFIASHouseGuid().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * </p>
             * 
             * 
             * @return
             *     The value of the fiasHouseGuid property.
             */
            public List<String> getFIASHouseGuid() {
                if (fiasHouseGuid == null) {
                    fiasHouseGuid = new ArrayList<>();
                }
                return this.fiasHouseGuid;
            }

            /**
             * Признак "Изменить адрес ПУ на адрес дома указанного в tns:importMeteringDeviceDataRequest/ tns:FIASHouseGuid?"
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsChangeToFIASHouseGuid() {
                return isChangeToFIASHouseGuid;
            }

            /**
             * Sets the value of the isChangeToFIASHouseGuid property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isIsChangeToFIASHouseGuid()
             */
            public void setIsChangeToFIASHouseGuid(Boolean value) {
                this.isChangeToFIASHouseGuid = value;
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
         *         <element name="LivingRoomGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
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
            "livingRoomGUID"
        })
        public static class LivingRoomDevice {

            /**
             * Идентификатор комнаты
             * 
             */
            @XmlElement(name = "LivingRoomGUID", required = true)
            protected List<String> livingRoomGUID;

            /**
             * Идентификатор комнаты
             * 
             * Gets the value of the livingRoomGUID property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the livingRoomGUID property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getLivingRoomGUID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * </p>
             * 
             * 
             * @return
             *     The value of the livingRoomGUID property.
             */
            public List<String> getLivingRoomGUID() {
                if (livingRoomGUID == null) {
                    livingRoomGUID = new ArrayList<>();
                }
                return this.livingRoomGUID;
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
         *         <element name="PremiseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
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
            "premiseGUID"
        })
        public static class NonResidentialPremiseDevice {

            /**
             * Идентификатор помещения (тип = нежилое помещение)
             * 
             */
            @XmlElement(name = "PremiseGUID", required = true)
            protected List<String> premiseGUID;

            /**
             * Идентификатор помещения (тип = нежилое помещение)
             * 
             * Gets the value of the premiseGUID property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the premiseGUID property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getPremiseGUID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * </p>
             * 
             * 
             * @return
             *     The value of the premiseGUID property.
             */
            public List<String> getPremiseGUID() {
                if (premiseGUID == null) {
                    premiseGUID = new ArrayList<>();
                }
                return this.premiseGUID;
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
         *         <element name="PremiseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
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
            "premiseGUID"
        })
        public static class ResidentialPremiseDevice {

            /**
             * Идентификатор помещения (тип = жилое помещение)
             * 
             */
            @XmlElement(name = "PremiseGUID", required = true)
            protected List<String> premiseGUID;

            /**
             * Идентификатор помещения (тип = жилое помещение)
             * 
             * Gets the value of the premiseGUID property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the premiseGUID property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getPremiseGUID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * </p>
             * 
             * 
             * @return
             *     The value of the premiseGUID property.
             */
            public List<String> getPremiseGUID() {
                if (premiseGUID == null) {
                    premiseGUID = new ArrayList<>();
                }
                return this.premiseGUID;
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
     *         <element name="TemperatureSensorInformation" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <maxLength value="2000"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="PressureSensorInformation" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <maxLength value="2000"/>
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
        "temperatureSensorInformation",
        "pressureSensorInformation"
    })
    public static class CollectiveDevice {

        /**
         * Информация о наличии датчиков температуры с указанием их местоположения на узле учета (обязательно для заполнения, если tns:TemperatureSensor = true, в противном случае поле не обрабатывается при импорте)
         * 
         */
        @XmlElement(name = "TemperatureSensorInformation")
        protected String temperatureSensorInformation;
        /**
         * Информация о наличии датчиков давления с указанием их местоположения на узле учета (обязательно для заполнения, если tns:PressureSensor = true, в противном случае поле не обрабатывается при импорте)
         * 
         */
        @XmlElement(name = "PressureSensorInformation")
        protected String pressureSensorInformation;

        /**
         * Информация о наличии датчиков температуры с указанием их местоположения на узле учета (обязательно для заполнения, если tns:TemperatureSensor = true, в противном случае поле не обрабатывается при импорте)
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTemperatureSensorInformation() {
            return temperatureSensorInformation;
        }

        /**
         * Sets the value of the temperatureSensorInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTemperatureSensorInformation()
         */
        public void setTemperatureSensorInformation(String value) {
            this.temperatureSensorInformation = value;
        }

        /**
         * Информация о наличии датчиков давления с указанием их местоположения на узле учета (обязательно для заполнения, если tns:PressureSensor = true, в противном случае поле не обрабатывается при импорте)
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPressureSensorInformation() {
            return pressureSensorInformation;
        }

        /**
         * Sets the value of the pressureSensorInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPressureSensorInformation()
         */
        public void setPressureSensorInformation(String value) {
            this.pressureSensorInformation = value;
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
     *         <element name="InstallationPlace">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <enumeration value="in"/>
     *               <enumeration value="out"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="LinkedMeteringDeviceVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringDeviceGUIDType" maxOccurs="10" minOccurs="0"/>
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
        "installationPlace",
        "linkedMeteringDeviceVersionGUID"
    })
    public static class LinkedWithMetering {

        /**
         * Место установки текущего прибора учета. Возможные значения: in - На входе/На подающем трубопроводе, out - На выходе/На обратном трубопроводе. Если прибор учета измеряет электрическую энергию, то ПУ устанавливается на входе/на выходе; если прибор учета измеряет коммунальный ресурс, отличный от электрической энергии, то ПУ устанавливается на подающем трубопроводе / на обратном трубопроводе
         * 
         */
        @XmlElement(name = "InstallationPlace", required = true)
        protected String installationPlace;
        /**
         * Идентификатор версии ПУ, заведенного в ГИС ЖКХ, с которым требуется установить связь текущего ПУ
         * 
         */
        @XmlElement(name = "LinkedMeteringDeviceVersionGUID")
        protected List<String> linkedMeteringDeviceVersionGUID;

        /**
         * Место установки текущего прибора учета. Возможные значения: in - На входе/На подающем трубопроводе, out - На выходе/На обратном трубопроводе. Если прибор учета измеряет электрическую энергию, то ПУ устанавливается на входе/на выходе; если прибор учета измеряет коммунальный ресурс, отличный от электрической энергии, то ПУ устанавливается на подающем трубопроводе / на обратном трубопроводе
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInstallationPlace() {
            return installationPlace;
        }

        /**
         * Sets the value of the installationPlace property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getInstallationPlace()
         */
        public void setInstallationPlace(String value) {
            this.installationPlace = value;
        }

        /**
         * Идентификатор версии ПУ, заведенного в ГИС ЖКХ, с которым требуется установить связь текущего ПУ
         * 
         * Gets the value of the linkedMeteringDeviceVersionGUID property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the linkedMeteringDeviceVersionGUID property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getLinkedMeteringDeviceVersionGUID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * </p>
         * 
         * 
         * @return
         *     The value of the linkedMeteringDeviceVersionGUID property.
         */
        public List<String> getLinkedMeteringDeviceVersionGUID() {
            if (linkedMeteringDeviceVersionGUID == null) {
                linkedMeteringDeviceVersionGUID = new ArrayList<>();
            }
            return this.linkedMeteringDeviceVersionGUID;
        }

    }

}
