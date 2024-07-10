
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
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Основные характеристики ПУ
 * 
 * <p>Java class for MeteringDeviceBasicCharacteristicsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MeteringDeviceBasicCharacteristicsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MeteringDeviceNumber">
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
 *         <element name="RemoteMeteringMode" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="RemoteMeteringInfo" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="2000"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="FirstVerificationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="VerificationInterval" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *         <element name="FactorySealDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="TemperatureSensor" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="PressureSensor" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="ConsumedVolume" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <choice>
 *           <element name="CollectiveDevice">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded" minOccurs="0"/>
 *                     <element name="TemperatureSensingElementInfo" minOccurs="0">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <maxLength value="2000"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element name="PressureSensingElementInfo" minOccurs="0">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <maxLength value="2000"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element name="ProjectRegistrationNode" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="100" minOccurs="0"/>
 *                     <element name="Certificate" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="100" minOccurs="0"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="ResidentialPremiseDevice">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="PremiseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
 *                     <element name="AccountGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
 *                     <element name="Certificate" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="100" minOccurs="0"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="NonResidentialPremiseDevice">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="PremiseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
 *                     <element name="AccountGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
 *                     <element name="Certificate" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="100" minOccurs="0"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="ApartmentHouseDevice">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded" minOccurs="0"/>
 *                     <element name="AccountGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
 *                     <element name="Certificate" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="100" minOccurs="0"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="LivingRoomDevice">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="LivingRoomGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
 *                     <element name="AccountGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
 *                     <element name="Certificate" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="100" minOccurs="0"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="CollectiveApartmentDevice">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="PremiseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
 *                     <element name="AccountGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
 *                     <element name="Certificate" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="100" minOccurs="0"/>
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
@XmlType(name = "MeteringDeviceBasicCharacteristicsType", propOrder = {
    "meteringDeviceNumber",
    "meteringDeviceStamp",
    "meteringDeviceModel",
    "installationDate",
    "commissioningDate",
    "remoteMeteringMode",
    "remoteMeteringInfo",
    "firstVerificationDate",
    "verificationInterval",
    "factorySealDate",
    "temperatureSensor",
    "pressureSensor",
    "consumedVolume",
    "collectiveDevice",
    "residentialPremiseDevice",
    "nonResidentialPremiseDevice",
    "apartmentHouseDevice",
    "livingRoomDevice",
    "collectiveApartmentDevice"
})
public class MeteringDeviceBasicCharacteristicsType {

    /**
     * Заводской (серийный) номер ПУ
     * 
     */
    @XmlElement(name = "MeteringDeviceNumber", required = true)
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
     * Поле обязательно, если вид ПУ отличен от "Коллективный (общедомовой)"
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
    protected boolean remoteMeteringMode;
    /**
     * Информация о наличии возможности дистанционного снятия показаний ПУ указанием наименования установленной системы (обязательно для заполнения, если tns:RemoteMeteringMode = true, в противном случае поле не обрабатывается при импорте)
     * 
     */
    @XmlElement(name = "RemoteMeteringInfo")
    protected String remoteMeteringInfo;
    /**
     * Дата последней поверки (поле обязательно для заполнения, если ПУ - коллективный (общедомовой))
     * 
     */
    @XmlElement(name = "FirstVerificationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstVerificationDate;
    /**
     * Межповерочный интервал (НСИ 16)  (поле обязательно для заполнения, если ПУ - коллективный (общедомовой))
     * 
     */
    @XmlElement(name = "VerificationInterval")
    protected NsiRef verificationInterval;
    /**
     * Дата опломбирования ПУ заводом- изготовителем (обязательно для заполнения при импорте)
     * 
     */
    @XmlElement(name = "FactorySealDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar factorySealDate;
    /**
     * Наличие датчиков температры
     * 
     */
    @XmlElement(name = "TemperatureSensor")
    protected boolean temperatureSensor;
    /**
     * Наличие датчиков давления
     * 
     */
    @XmlElement(name = "PressureSensor")
    protected boolean pressureSensor;
    /**
     * Признак «ПУ предоставляет объем потребленного КР»
     * 
     */
    @XmlElement(name = "ConsumedVolume")
    protected Boolean consumedVolume;
    /**
     * Характеристики общедомового ПУ (тип прибора учета = "Коллективный (общедомовой)")
     * 
     */
    @XmlElement(name = "CollectiveDevice")
    protected MeteringDeviceBasicCharacteristicsType.CollectiveDevice collectiveDevice;
    /**
     * Характеристики ИПУ жилого помещения (тип прибора учета = "Индивидуальный")
     * 
     */
    @XmlElement(name = "ResidentialPremiseDevice")
    protected MeteringDeviceBasicCharacteristicsType.ResidentialPremiseDevice residentialPremiseDevice;
    /**
     * Характеристики ИПУ нежилого помещения (тип прибора учета = "Индивидуальный")
     * 
     */
    @XmlElement(name = "NonResidentialPremiseDevice")
    protected MeteringDeviceBasicCharacteristicsType.NonResidentialPremiseDevice nonResidentialPremiseDevice;
    /**
     * Характеристики ИПУ жилого дома (тип прибора учета = "Индивидуальный", тип дома = "Жилой")
     * 
     */
    @XmlElement(name = "ApartmentHouseDevice")
    protected MeteringDeviceBasicCharacteristicsType.ApartmentHouseDevice apartmentHouseDevice;
    /**
     * Характеристики комнатного ИПУ (тип прибора учета = "Комнатный")
     * 
     */
    @XmlElement(name = "LivingRoomDevice")
    protected MeteringDeviceBasicCharacteristicsType.LivingRoomDevice livingRoomDevice;
    /**
     * Характеристики общеквартирного ПУ (для квартир коммунального заселения) (тип прибора учета = "Общий (квартирный)")
     * 
     */
    @XmlElement(name = "CollectiveApartmentDevice")
    protected MeteringDeviceBasicCharacteristicsType.CollectiveApartmentDevice collectiveApartmentDevice;

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
     * Поле обязательно, если вид ПУ отличен от "Коллективный (общедомовой)"
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
     */
    public boolean isRemoteMeteringMode() {
        return remoteMeteringMode;
    }

    /**
     * Sets the value of the remoteMeteringMode property.
     * 
     */
    public void setRemoteMeteringMode(boolean value) {
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
     * Дата последней поверки (поле обязательно для заполнения, если ПУ - коллективный (общедомовой))
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
     * Межповерочный интервал (НСИ 16)  (поле обязательно для заполнения, если ПУ - коллективный (общедомовой))
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getVerificationInterval() {
        return verificationInterval;
    }

    /**
     * Sets the value of the verificationInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getVerificationInterval()
     */
    public void setVerificationInterval(NsiRef value) {
        this.verificationInterval = value;
    }

    /**
     * Дата опломбирования ПУ заводом- изготовителем (обязательно для заполнения при импорте)
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
     * Наличие датчиков температры
     * 
     */
    public boolean isTemperatureSensor() {
        return temperatureSensor;
    }

    /**
     * Sets the value of the temperatureSensor property.
     * 
     */
    public void setTemperatureSensor(boolean value) {
        this.temperatureSensor = value;
    }

    /**
     * Наличие датчиков давления
     * 
     */
    public boolean isPressureSensor() {
        return pressureSensor;
    }

    /**
     * Sets the value of the pressureSensor property.
     * 
     */
    public void setPressureSensor(boolean value) {
        this.pressureSensor = value;
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
     * Характеристики общедомового ПУ (тип прибора учета = "Коллективный (общедомовой)")
     * 
     * @return
     *     possible object is
     *     {@link MeteringDeviceBasicCharacteristicsType.CollectiveDevice }
     *     
     */
    public MeteringDeviceBasicCharacteristicsType.CollectiveDevice getCollectiveDevice() {
        return collectiveDevice;
    }

    /**
     * Sets the value of the collectiveDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeteringDeviceBasicCharacteristicsType.CollectiveDevice }
     *     
     * @see #getCollectiveDevice()
     */
    public void setCollectiveDevice(MeteringDeviceBasicCharacteristicsType.CollectiveDevice value) {
        this.collectiveDevice = value;
    }

    /**
     * Характеристики ИПУ жилого помещения (тип прибора учета = "Индивидуальный")
     * 
     * @return
     *     possible object is
     *     {@link MeteringDeviceBasicCharacteristicsType.ResidentialPremiseDevice }
     *     
     */
    public MeteringDeviceBasicCharacteristicsType.ResidentialPremiseDevice getResidentialPremiseDevice() {
        return residentialPremiseDevice;
    }

    /**
     * Sets the value of the residentialPremiseDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeteringDeviceBasicCharacteristicsType.ResidentialPremiseDevice }
     *     
     * @see #getResidentialPremiseDevice()
     */
    public void setResidentialPremiseDevice(MeteringDeviceBasicCharacteristicsType.ResidentialPremiseDevice value) {
        this.residentialPremiseDevice = value;
    }

    /**
     * Характеристики ИПУ нежилого помещения (тип прибора учета = "Индивидуальный")
     * 
     * @return
     *     possible object is
     *     {@link MeteringDeviceBasicCharacteristicsType.NonResidentialPremiseDevice }
     *     
     */
    public MeteringDeviceBasicCharacteristicsType.NonResidentialPremiseDevice getNonResidentialPremiseDevice() {
        return nonResidentialPremiseDevice;
    }

    /**
     * Sets the value of the nonResidentialPremiseDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeteringDeviceBasicCharacteristicsType.NonResidentialPremiseDevice }
     *     
     * @see #getNonResidentialPremiseDevice()
     */
    public void setNonResidentialPremiseDevice(MeteringDeviceBasicCharacteristicsType.NonResidentialPremiseDevice value) {
        this.nonResidentialPremiseDevice = value;
    }

    /**
     * Характеристики ИПУ жилого дома (тип прибора учета = "Индивидуальный", тип дома = "Жилой")
     * 
     * @return
     *     possible object is
     *     {@link MeteringDeviceBasicCharacteristicsType.ApartmentHouseDevice }
     *     
     */
    public MeteringDeviceBasicCharacteristicsType.ApartmentHouseDevice getApartmentHouseDevice() {
        return apartmentHouseDevice;
    }

    /**
     * Sets the value of the apartmentHouseDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeteringDeviceBasicCharacteristicsType.ApartmentHouseDevice }
     *     
     * @see #getApartmentHouseDevice()
     */
    public void setApartmentHouseDevice(MeteringDeviceBasicCharacteristicsType.ApartmentHouseDevice value) {
        this.apartmentHouseDevice = value;
    }

    /**
     * Характеристики комнатного ИПУ (тип прибора учета = "Комнатный")
     * 
     * @return
     *     possible object is
     *     {@link MeteringDeviceBasicCharacteristicsType.LivingRoomDevice }
     *     
     */
    public MeteringDeviceBasicCharacteristicsType.LivingRoomDevice getLivingRoomDevice() {
        return livingRoomDevice;
    }

    /**
     * Sets the value of the livingRoomDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeteringDeviceBasicCharacteristicsType.LivingRoomDevice }
     *     
     * @see #getLivingRoomDevice()
     */
    public void setLivingRoomDevice(MeteringDeviceBasicCharacteristicsType.LivingRoomDevice value) {
        this.livingRoomDevice = value;
    }

    /**
     * Характеристики общеквартирного ПУ (для квартир коммунального заселения) (тип прибора учета = "Общий (квартирный)")
     * 
     * @return
     *     possible object is
     *     {@link MeteringDeviceBasicCharacteristicsType.CollectiveApartmentDevice }
     *     
     */
    public MeteringDeviceBasicCharacteristicsType.CollectiveApartmentDevice getCollectiveApartmentDevice() {
        return collectiveApartmentDevice;
    }

    /**
     * Sets the value of the collectiveApartmentDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeteringDeviceBasicCharacteristicsType.CollectiveApartmentDevice }
     *     
     * @see #getCollectiveApartmentDevice()
     */
    public void setCollectiveApartmentDevice(MeteringDeviceBasicCharacteristicsType.CollectiveApartmentDevice value) {
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
     *       <sequence>
     *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded" minOccurs="0"/>
     *         <element name="AccountGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
     *         <element name="Certificate" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="100" minOccurs="0"/>
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
        "fiasHouseGuid",
        "accountGUID",
        "certificate"
    })
    public static class ApartmentHouseDevice {

        /**
         * Глобальный уникальный идентификатор дома по ФИАС (при импорте обязательно для заполнения тогда и только тогда, когда отсутствует корневой элемент FIASHouseGuid)
         * 
         */
        @XmlElement(name = "FIASHouseGuid")
        protected List<String> fiasHouseGuid;
        /**
         * Идентификатор ЛС
         * 
         */
        @XmlElement(name = "AccountGUID", required = true)
        protected List<String> accountGUID;
        /**
         * Электронный образ акта ввода узла учета в эксплуатацию
         * 
         */
        @XmlElement(name = "Certificate")
        protected List<AttachmentType> certificate;

        /**
         * Глобальный уникальный идентификатор дома по ФИАС (при импорте обязательно для заполнения тогда и только тогда, когда отсутствует корневой элемент FIASHouseGuid)
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
         * Идентификатор ЛС
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
     *         <element name="AccountGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
     *         <element name="Certificate" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="100" minOccurs="0"/>
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
        "premiseGUID",
        "accountGUID",
        "certificate"
    })
    public static class CollectiveApartmentDevice {

        /**
         * Идентификатор жилого помещения
         * 
         */
        @XmlElement(name = "PremiseGUID", required = true)
        protected List<String> premiseGUID;
        /**
         * Идентификатор ЛС
         * 
         */
        @XmlElement(name = "AccountGUID", required = true)
        protected List<String> accountGUID;
        /**
         * Электронный образ акта ввода узла учета в эксплуатацию
         * 
         */
        @XmlElement(name = "Certificate")
        protected List<AttachmentType> certificate;

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

        /**
         * Идентификатор ЛС
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
     *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded" minOccurs="0"/>
     *         <element name="TemperatureSensingElementInfo" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <maxLength value="2000"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="PressureSensingElementInfo" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <maxLength value="2000"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="ProjectRegistrationNode" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="100" minOccurs="0"/>
     *         <element name="Certificate" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="100" minOccurs="0"/>
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
        "fiasHouseGuid",
        "temperatureSensingElementInfo",
        "pressureSensingElementInfo",
        "projectRegistrationNode",
        "certificate"
    })
    public static class CollectiveDevice {

        /**
         * Глобальный уникальный идентификатор дома по ФИАС (при импорте обязательно для заполнения тогда и только тогда, когда отсутствует корневой элемент FIASHouseGuid)
         * 
         */
        @XmlElement(name = "FIASHouseGuid")
        protected List<String> fiasHouseGuid;
        /**
         * Информация о наличии датчиков температуры с указанием их местоположения на узле учета (обязательно для заполнения, если tns:TemperatureSensor = true, в противном случае поле не обрабатывается при импорте)
         * 
         */
        @XmlElement(name = "TemperatureSensingElementInfo")
        protected String temperatureSensingElementInfo;
        /**
         * Информация о наличии датчиков давления с указанием их местоположения на узле учета (обязательно для заполнения, если tns:PressureSensor = true, в противном случае поле не обрабатывается при импорте)
         * 
         */
        @XmlElement(name = "PressureSensingElementInfo")
        protected String pressureSensingElementInfo;
        /**
         * Электронный образ проекта узла учета
         * 
         */
        @XmlElement(name = "ProjectRegistrationNode")
        protected List<AttachmentType> projectRegistrationNode;
        /**
         * Электронный образ акта ввода узла учета в эксплуатацию
         * 
         */
        @XmlElement(name = "Certificate")
        protected List<AttachmentType> certificate;

        /**
         * Глобальный уникальный идентификатор дома по ФИАС (при импорте обязательно для заполнения тогда и только тогда, когда отсутствует корневой элемент FIASHouseGuid)
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
         * Информация о наличии датчиков температуры с указанием их местоположения на узле учета (обязательно для заполнения, если tns:TemperatureSensor = true, в противном случае поле не обрабатывается при импорте)
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTemperatureSensingElementInfo() {
            return temperatureSensingElementInfo;
        }

        /**
         * Sets the value of the temperatureSensingElementInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTemperatureSensingElementInfo()
         */
        public void setTemperatureSensingElementInfo(String value) {
            this.temperatureSensingElementInfo = value;
        }

        /**
         * Информация о наличии датчиков давления с указанием их местоположения на узле учета (обязательно для заполнения, если tns:PressureSensor = true, в противном случае поле не обрабатывается при импорте)
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPressureSensingElementInfo() {
            return pressureSensingElementInfo;
        }

        /**
         * Sets the value of the pressureSensingElementInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPressureSensingElementInfo()
         */
        public void setPressureSensingElementInfo(String value) {
            this.pressureSensingElementInfo = value;
        }

        /**
         * Электронный образ проекта узла учета
         * 
         * Gets the value of the projectRegistrationNode property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the projectRegistrationNode property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getProjectRegistrationNode().add(newItem);
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
         *     The value of the projectRegistrationNode property.
         */
        public List<AttachmentType> getProjectRegistrationNode() {
            if (projectRegistrationNode == null) {
                projectRegistrationNode = new ArrayList<>();
            }
            return this.projectRegistrationNode;
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
     *         <element name="AccountGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
     *         <element name="Certificate" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="100" minOccurs="0"/>
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
        "livingRoomGUID",
        "accountGUID",
        "certificate"
    })
    public static class LivingRoomDevice {

        /**
         * Идентификатор комнаты
         * 
         */
        @XmlElement(name = "LivingRoomGUID", required = true)
        protected List<String> livingRoomGUID;
        /**
         * Идентификатор ЛС
         * 
         */
        @XmlElement(name = "AccountGUID", required = true)
        protected List<String> accountGUID;
        /**
         * Электронный образ акта ввода узла учета в эксплуатацию
         * 
         */
        @XmlElement(name = "Certificate")
        protected List<AttachmentType> certificate;

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

        /**
         * Идентификатор ЛС
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
     *         <element name="AccountGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
     *         <element name="Certificate" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="100" minOccurs="0"/>
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
        "premiseGUID",
        "accountGUID",
        "certificate"
    })
    public static class NonResidentialPremiseDevice {

        /**
         * Идентификатор помещения (тип = нежилое помещение)
         * 
         */
        @XmlElement(name = "PremiseGUID", required = true)
        protected List<String> premiseGUID;
        /**
         * Идентификатор ЛС
         * 
         */
        @XmlElement(name = "AccountGUID", required = true)
        protected List<String> accountGUID;
        /**
         * Электронный образ акта ввода узла учета в эксплуатацию
         * 
         */
        @XmlElement(name = "Certificate")
        protected List<AttachmentType> certificate;

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

        /**
         * Идентификатор ЛС
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
     *         <element name="AccountGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
     *         <element name="Certificate" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="100" minOccurs="0"/>
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
        "premiseGUID",
        "accountGUID",
        "certificate"
    })
    public static class ResidentialPremiseDevice {

        /**
         * Идентификатор помещения (тип = жилое помещение)
         * 
         */
        @XmlElement(name = "PremiseGUID", required = true)
        protected List<String> premiseGUID;
        /**
         * Идентификатор ЛС
         * 
         */
        @XmlElement(name = "AccountGUID", required = true)
        protected List<String> accountGUID;
        /**
         * Электронный образ акта ввода узла учета в эксплуатацию
         * 
         */
        @XmlElement(name = "Certificate")
        protected List<AttachmentType> certificate;

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

        /**
         * Идентификатор ЛС
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

    }

}
