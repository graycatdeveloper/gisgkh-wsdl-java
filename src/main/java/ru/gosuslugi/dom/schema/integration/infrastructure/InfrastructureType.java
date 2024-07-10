
package ru.gosuslugi.dom.schema.integration.infrastructure;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;
import ru.gosuslugi.dom.schema.integration.base.OKTMORefType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * <p>Java class for InfrastructureType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="InfrastructureType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Name">
 *           <simpleType>
 *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}ShortTextType">
 *               <minLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Base" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="AttachmentList" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         <choice>
 *           <element name="EndManagmentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           <element name="IndefiniteManagement" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         </choice>
 *         <element name="ManagerOKI" type="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}ManagerOKIType" minOccurs="0"/>
 *         <element name="OKIType">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
 *                 <choice minOccurs="0">
 *                   <choice minOccurs="0">
 *                     <element name="WaterIntakeType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *                     <element name="ESubstationType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *                     <element name="PowerPlantType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *                   </choice>
 *                   <element name="FuelType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *                   <element name="GasNetworkType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *                 </choice>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Services" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="unbounded"/>
 *         <element name="OKTMO" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType"/>
 *         <element name="Adress" type="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}ShortTextType" minOccurs="0"/>
 *         <element name="CommissioningYear">
 *           <simpleType>
 *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}YearType">
 *               <minInclusive value="1850"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="IndependentSource" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Deterioration" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}CentesimalType">
 *               <maxInclusive value="100"/>
 *               <totalDigits value="3"/>
 *               <fractionDigits value="1"/>
 *               <minInclusive value="0"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ObjectProperty" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element name="Resources" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}ResourceType">
 *                           <sequence>
 *                             <element name="SetPower" type="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}PowerType" minOccurs="0"/>
 *                             <element name="SitingPower" type="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}PowerType" minOccurs="0"/>
 *                           </sequence>
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <sequence>
 *                     <element name="TransportationResources" maxOccurs="unbounded">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}ResourceType">
 *                             <sequence>
 *                               <element name="VolumeLosses">
 *                                 <simpleType>
 *                                   <restriction base="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}PowerType">
 *                                     <totalDigits value="8"/>
 *                                   </restriction>
 *                                 </simpleType>
 *                               </element>
 *                               <element name="CoolantType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *                             </sequence>
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="NetPieces" maxOccurs="unbounded">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="Name" minOccurs="0">
 *                                 <simpleType>
 *                                   <restriction base="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}ShortTextType">
 *                                     <maxLength value="100"/>
 *                                   </restriction>
 *                                 </simpleType>
 *                               </element>
 *                               <element name="Diameter">
 *                                 <simpleType>
 *                                   <restriction base="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}PowerType">
 *                                     <totalDigits value="8"/>
 *                                     <fractionDigits value="3"/>
 *                                   </restriction>
 *                                 </simpleType>
 *                               </element>
 *                               <element name="Length">
 *                                 <simpleType>
 *                                   <restriction base="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}PowerType">
 *                                     <totalDigits value="8"/>
 *                                     <fractionDigits value="3"/>
 *                                   </restriction>
 *                                 </simpleType>
 *                               </element>
 *                               <element name="NeedReplaced" minOccurs="0">
 *                                 <simpleType>
 *                                   <restriction base="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}PowerType">
 *                                     <totalDigits value="8"/>
 *                                     <fractionDigits value="3"/>
 *                                   </restriction>
 *                                 </simpleType>
 *                               </element>
 *                               <element name="Wearout" type="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}CentesimalType" minOccurs="0"/>
 *                               <element name="PressureType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *                               <element name="VoltageType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="CountAccidents" minOccurs="0">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *                           <maxInclusive value="100"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element name="OKILinks" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="SourceOKI" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
 *                               <element name="ReceiverOKI" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded" minOccurs="0"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                   </sequence>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="AddInfo" type="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType" minOccurs="0"/>
 *         <element name="AttachmentsEnergyEfficiency" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfrastructureType", propOrder = {
    "name",
    "base",
    "attachmentList",
    "endManagmentDate",
    "indefiniteManagement",
    "managerOKI",
    "okiType",
    "services",
    "oktmo",
    "adress",
    "commissioningYear",
    "independentSource",
    "deterioration",
    "objectProperty",
    "addInfo",
    "attachmentsEnergyEfficiency"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.infrastructure.ImportOKIRequest.RKIItem.OKI.class,
    ru.gosuslugi.dom.schema.integration.infrastructure.ExportOKIResultType.OKI.class
})
public class InfrastructureType {

    /**
     * Наименование объекта
     * 
     */
    @XmlElement(name = "Name", required = true)
    protected String name;
    /**
     * Ссылка на НСИ "Основание эксплуатации объекта инфраструктуры" (Реестровый номер 39)
     * 
     */
    @XmlElement(name = "Base", required = true)
    protected NsiRef base;
    /**
     * Основание управления объектом
     * 
     */
    @XmlElement(name = "AttachmentList")
    protected List<AttachmentType> attachmentList;
    /**
     * Окончание управления
     * 
     */
    @XmlElement(name = "EndManagmentDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endManagmentDate;
    /**
     * Бессрочное управление
     * 
     */
    @XmlElement(name = "IndefiniteManagement")
    protected Boolean indefiniteManagement;
    /**
     * Заполняется только ОМС Организация, управляющая ОКИ
     * 
     */
    @XmlElement(name = "ManagerOKI")
    protected ManagerOKIType managerOKI;
    /**
     * Ссылка на НСИ "Вид ОКИ" (реестровый номер 33)
     * 
     */
    @XmlElement(name = "OKIType", required = true)
    protected InfrastructureType.OKIType okiType;
    /**
     * Ссылка на НСИ "Вид коммунальной услуги" (реестровый номер 3)
     * 
     */
    @XmlElement(name = "Services", required = true)
    protected List<NsiRef> services;
    /**
     * ОКТМО
     * 
     */
    @XmlElement(name = "OKTMO", required = true)
    protected OKTMORefType oktmo;
    /**
     * Адрес объекта
     * 
     */
    @XmlElement(name = "Adress")
    protected String adress;
    /**
     * Год ввода в эксплуатацию
     * 
     */
    @XmlElement(name = "CommissioningYear")
    protected short commissioningYear;
    /**
     * Признак автономного источника снабжения
     * 
     */
    @XmlElement(name = "IndependentSource")
    protected Boolean independentSource;
    /**
     * Уровень износа (%)
     * 
     */
    @XmlElement(name = "Deterioration")
    protected BigDecimal deterioration;
    /**
     * Характеристики объекта
     * 
     */
    @XmlElement(name = "ObjectProperty")
    protected InfrastructureType.ObjectProperty objectProperty;
    /**
     * Дополнительная информация
     * 
     */
    @XmlElement(name = "AddInfo")
    protected String addInfo;
    /**
     * Документы, подтверждающие соответствие требованиям энергетической эффективности
     * 
     */
    @XmlElement(name = "AttachmentsEnergyEfficiency")
    protected List<AttachmentType> attachmentsEnergyEfficiency;

    /**
     * Наименование объекта
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ссылка на НСИ "Основание эксплуатации объекта инфраструктуры" (Реестровый номер 39)
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
     * Основание управления объектом
     * 
     * Gets the value of the attachmentList property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentList property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAttachmentList().add(newItem);
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
     *     The value of the attachmentList property.
     */
    public List<AttachmentType> getAttachmentList() {
        if (attachmentList == null) {
            attachmentList = new ArrayList<>();
        }
        return this.attachmentList;
    }

    /**
     * Окончание управления
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndManagmentDate() {
        return endManagmentDate;
    }

    /**
     * Sets the value of the endManagmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEndManagmentDate()
     */
    public void setEndManagmentDate(XMLGregorianCalendar value) {
        this.endManagmentDate = value;
    }

    /**
     * Бессрочное управление
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndefiniteManagement() {
        return indefiniteManagement;
    }

    /**
     * Sets the value of the indefiniteManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIndefiniteManagement()
     */
    public void setIndefiniteManagement(Boolean value) {
        this.indefiniteManagement = value;
    }

    /**
     * Заполняется только ОМС Организация, управляющая ОКИ
     * 
     * @return
     *     possible object is
     *     {@link ManagerOKIType }
     *     
     */
    public ManagerOKIType getManagerOKI() {
        return managerOKI;
    }

    /**
     * Sets the value of the managerOKI property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagerOKIType }
     *     
     * @see #getManagerOKI()
     */
    public void setManagerOKI(ManagerOKIType value) {
        this.managerOKI = value;
    }

    /**
     * Ссылка на НСИ "Вид ОКИ" (реестровый номер 33)
     * 
     * @return
     *     possible object is
     *     {@link InfrastructureType.OKIType }
     *     
     */
    public InfrastructureType.OKIType getOKIType() {
        return okiType;
    }

    /**
     * Sets the value of the okiType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfrastructureType.OKIType }
     *     
     * @see #getOKIType()
     */
    public void setOKIType(InfrastructureType.OKIType value) {
        this.okiType = value;
    }

    /**
     * Ссылка на НСИ "Вид коммунальной услуги" (реестровый номер 3)
     * 
     * Gets the value of the services property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the services property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NsiRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the services property.
     */
    public List<NsiRef> getServices() {
        if (services == null) {
            services = new ArrayList<>();
        }
        return this.services;
    }

    /**
     * ОКТМО
     * 
     * @return
     *     possible object is
     *     {@link OKTMORefType }
     *     
     */
    public OKTMORefType getOKTMO() {
        return oktmo;
    }

    /**
     * Sets the value of the oktmo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OKTMORefType }
     *     
     * @see #getOKTMO()
     */
    public void setOKTMO(OKTMORefType value) {
        this.oktmo = value;
    }

    /**
     * Адрес объекта
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdress() {
        return adress;
    }

    /**
     * Sets the value of the adress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAdress()
     */
    public void setAdress(String value) {
        this.adress = value;
    }

    /**
     * Год ввода в эксплуатацию
     * 
     */
    public short getCommissioningYear() {
        return commissioningYear;
    }

    /**
     * Sets the value of the commissioningYear property.
     * 
     */
    public void setCommissioningYear(short value) {
        this.commissioningYear = value;
    }

    /**
     * Признак автономного источника снабжения
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndependentSource() {
        return independentSource;
    }

    /**
     * Sets the value of the independentSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIndependentSource()
     */
    public void setIndependentSource(Boolean value) {
        this.independentSource = value;
    }

    /**
     * Уровень износа (%)
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeterioration() {
        return deterioration;
    }

    /**
     * Sets the value of the deterioration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getDeterioration()
     */
    public void setDeterioration(BigDecimal value) {
        this.deterioration = value;
    }

    /**
     * Характеристики объекта
     * 
     * @return
     *     possible object is
     *     {@link InfrastructureType.ObjectProperty }
     *     
     */
    public InfrastructureType.ObjectProperty getObjectProperty() {
        return objectProperty;
    }

    /**
     * Sets the value of the objectProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfrastructureType.ObjectProperty }
     *     
     * @see #getObjectProperty()
     */
    public void setObjectProperty(InfrastructureType.ObjectProperty value) {
        this.objectProperty = value;
    }

    /**
     * Дополнительная информация
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddInfo() {
        return addInfo;
    }

    /**
     * Sets the value of the addInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAddInfo()
     */
    public void setAddInfo(String value) {
        this.addInfo = value;
    }

    /**
     * Документы, подтверждающие соответствие требованиям энергетической эффективности
     * 
     * Gets the value of the attachmentsEnergyEfficiency property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentsEnergyEfficiency property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAttachmentsEnergyEfficiency().add(newItem);
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
     *     The value of the attachmentsEnergyEfficiency property.
     */
    public List<AttachmentType> getAttachmentsEnergyEfficiency() {
        if (attachmentsEnergyEfficiency == null) {
            attachmentsEnergyEfficiency = new ArrayList<>();
        }
        return this.attachmentsEnergyEfficiency;
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
     *       <choice minOccurs="0">
     *         <choice minOccurs="0">
     *           <element name="WaterIntakeType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
     *           <element name="ESubstationType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
     *           <element name="PowerPlantType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
     *         </choice>
     *         <element name="FuelType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
     *         <element name="GasNetworkType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
     *       </choice>
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "waterIntakeType",
        "eSubstationType",
        "powerPlantType",
        "fuelType",
        "gasNetworkType"
    })
    public static class OKIType
        extends NsiRef
    {

        /**
         * Ссылка на НСИ "Вид водозаборного сооружения" (реестровый номер 34)
         * 
         */
        @XmlElement(name = "WaterIntakeType")
        protected NsiRef waterIntakeType;
        /**
         * Ссылка на НСИ "Тип электрической подстанции" (реестровый номер 37)
         * 
         */
        @XmlElement(name = "ESubstationType")
        protected NsiRef eSubstationType;
        /**
         * Ссылка на НСИ "Вид электростанции" (реестровый номер 38)
         * 
         */
        @XmlElement(name = "PowerPlantType")
        protected NsiRef powerPlantType;
        /**
         * Ссылка на НСИ "Вид топлива" (реестровый номер 40)
         * 
         */
        @XmlElement(name = "FuelType")
        protected NsiRef fuelType;
        /**
         * Ссылка на НСИ "Тип газораспределительной сети" (реестровый номер 35)
         * 
         */
        @XmlElement(name = "GasNetworkType")
        protected NsiRef gasNetworkType;

        /**
         * Ссылка на НСИ "Вид водозаборного сооружения" (реестровый номер 34)
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getWaterIntakeType() {
            return waterIntakeType;
        }

        /**
         * Sets the value of the waterIntakeType property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getWaterIntakeType()
         */
        public void setWaterIntakeType(NsiRef value) {
            this.waterIntakeType = value;
        }

        /**
         * Ссылка на НСИ "Тип электрической подстанции" (реестровый номер 37)
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getESubstationType() {
            return eSubstationType;
        }

        /**
         * Sets the value of the eSubstationType property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getESubstationType()
         */
        public void setESubstationType(NsiRef value) {
            this.eSubstationType = value;
        }

        /**
         * Ссылка на НСИ "Вид электростанции" (реестровый номер 38)
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getPowerPlantType() {
            return powerPlantType;
        }

        /**
         * Sets the value of the powerPlantType property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getPowerPlantType()
         */
        public void setPowerPlantType(NsiRef value) {
            this.powerPlantType = value;
        }

        /**
         * Ссылка на НСИ "Вид топлива" (реестровый номер 40)
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getFuelType() {
            return fuelType;
        }

        /**
         * Sets the value of the fuelType property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getFuelType()
         */
        public void setFuelType(NsiRef value) {
            this.fuelType = value;
        }

        /**
         * Ссылка на НСИ "Тип газораспределительной сети" (реестровый номер 35)
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getGasNetworkType() {
            return gasNetworkType;
        }

        /**
         * Sets the value of the gasNetworkType property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getGasNetworkType()
         */
        public void setGasNetworkType(NsiRef value) {
            this.gasNetworkType = value;
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
     *         <element name="Resources" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}ResourceType">
     *                 <sequence>
     *                   <element name="SetPower" type="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}PowerType" minOccurs="0"/>
     *                   <element name="SitingPower" type="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}PowerType" minOccurs="0"/>
     *                 </sequence>
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <sequence>
     *           <element name="TransportationResources" maxOccurs="unbounded">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}ResourceType">
     *                   <sequence>
     *                     <element name="VolumeLosses">
     *                       <simpleType>
     *                         <restriction base="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}PowerType">
     *                           <totalDigits value="8"/>
     *                         </restriction>
     *                       </simpleType>
     *                     </element>
     *                     <element name="CoolantType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
     *                   </sequence>
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="NetPieces" maxOccurs="unbounded">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="Name" minOccurs="0">
     *                       <simpleType>
     *                         <restriction base="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}ShortTextType">
     *                           <maxLength value="100"/>
     *                         </restriction>
     *                       </simpleType>
     *                     </element>
     *                     <element name="Diameter">
     *                       <simpleType>
     *                         <restriction base="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}PowerType">
     *                           <totalDigits value="8"/>
     *                           <fractionDigits value="3"/>
     *                         </restriction>
     *                       </simpleType>
     *                     </element>
     *                     <element name="Length">
     *                       <simpleType>
     *                         <restriction base="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}PowerType">
     *                           <totalDigits value="8"/>
     *                           <fractionDigits value="3"/>
     *                         </restriction>
     *                       </simpleType>
     *                     </element>
     *                     <element name="NeedReplaced" minOccurs="0">
     *                       <simpleType>
     *                         <restriction base="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}PowerType">
     *                           <totalDigits value="8"/>
     *                           <fractionDigits value="3"/>
     *                         </restriction>
     *                       </simpleType>
     *                     </element>
     *                     <element name="Wearout" type="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}CentesimalType" minOccurs="0"/>
     *                     <element name="PressureType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
     *                     <element name="VoltageType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="CountAccidents" minOccurs="0">
     *             <simpleType>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
     *                 <maxInclusive value="100"/>
     *               </restriction>
     *             </simpleType>
     *           </element>
     *           <element name="OKILinks" minOccurs="0">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="SourceOKI" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
     *                     <element name="ReceiverOKI" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded" minOccurs="0"/>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
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
    @XmlType(name = "", propOrder = {
        "resources",
        "transportationResources",
        "netPieces",
        "countAccidents",
        "okiLinks"
    })
    public static class ObjectProperty {

        /**
         * Характеристика сетевого объекта. Значения указываются в единицах измерения в соответствии с полем «Единица измерения мощности и присоединенной нагрузки (ссылка на справочник «ОКЕИ»)» справочника «Вид коммунальной услуги».
         * 
         */
        @XmlElement(name = "Resources")
        protected List<InfrastructureType.ObjectProperty.Resources> resources;
        /**
         * Характеристика передачи (транспортировки) коммунальных ресурсов. Значения указываются в единицах измерения в соответствии с полем «Единица измерения мощности и присоединенной нагрузки (ссылка на справочник «ОКЕИ»)» справочника «Вид коммунальной услуги».
         * 
         */
        @XmlElement(name = "TransportationResources")
        protected List<InfrastructureType.ObjectProperty.TransportationResources> transportationResources;
        /**
         * Сведения об участках сети
         * 
         */
        @XmlElement(name = "NetPieces")
        protected List<InfrastructureType.ObjectProperty.NetPieces> netPieces;
        /**
         * Число аварий на 100 км сетей
         * 
         */
        @XmlElement(name = "CountAccidents")
        protected Integer countAccidents;
        /**
         * Ссылки на источники/приемники
         * 
         */
        @XmlElement(name = "OKILinks")
        protected InfrastructureType.ObjectProperty.OKILinks okiLinks;

        /**
         * Характеристика сетевого объекта. Значения указываются в единицах измерения в соответствии с полем «Единица измерения мощности и присоединенной нагрузки (ссылка на справочник «ОКЕИ»)» справочника «Вид коммунальной услуги».
         * 
         * Gets the value of the resources property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the resources property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getResources().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InfrastructureType.ObjectProperty.Resources }
         * </p>
         * 
         * 
         * @return
         *     The value of the resources property.
         */
        public List<InfrastructureType.ObjectProperty.Resources> getResources() {
            if (resources == null) {
                resources = new ArrayList<>();
            }
            return this.resources;
        }

        /**
         * Характеристика передачи (транспортировки) коммунальных ресурсов. Значения указываются в единицах измерения в соответствии с полем «Единица измерения мощности и присоединенной нагрузки (ссылка на справочник «ОКЕИ»)» справочника «Вид коммунальной услуги».
         * 
         * Gets the value of the transportationResources property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the transportationResources property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getTransportationResources().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InfrastructureType.ObjectProperty.TransportationResources }
         * </p>
         * 
         * 
         * @return
         *     The value of the transportationResources property.
         */
        public List<InfrastructureType.ObjectProperty.TransportationResources> getTransportationResources() {
            if (transportationResources == null) {
                transportationResources = new ArrayList<>();
            }
            return this.transportationResources;
        }

        /**
         * Сведения об участках сети
         * 
         * Gets the value of the netPieces property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the netPieces property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getNetPieces().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InfrastructureType.ObjectProperty.NetPieces }
         * </p>
         * 
         * 
         * @return
         *     The value of the netPieces property.
         */
        public List<InfrastructureType.ObjectProperty.NetPieces> getNetPieces() {
            if (netPieces == null) {
                netPieces = new ArrayList<>();
            }
            return this.netPieces;
        }

        /**
         * Число аварий на 100 км сетей
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCountAccidents() {
            return countAccidents;
        }

        /**
         * Sets the value of the countAccidents property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         * @see #getCountAccidents()
         */
        public void setCountAccidents(Integer value) {
            this.countAccidents = value;
        }

        /**
         * Ссылки на источники/приемники
         * 
         * @return
         *     possible object is
         *     {@link InfrastructureType.ObjectProperty.OKILinks }
         *     
         */
        public InfrastructureType.ObjectProperty.OKILinks getOKILinks() {
            return okiLinks;
        }

        /**
         * Sets the value of the okiLinks property.
         * 
         * @param value
         *     allowed object is
         *     {@link InfrastructureType.ObjectProperty.OKILinks }
         *     
         * @see #getOKILinks()
         */
        public void setOKILinks(InfrastructureType.ObjectProperty.OKILinks value) {
            this.okiLinks = value;
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
         *         <element name="Name" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}ShortTextType">
         *               <maxLength value="100"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="Diameter">
         *           <simpleType>
         *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}PowerType">
         *               <totalDigits value="8"/>
         *               <fractionDigits value="3"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="Length">
         *           <simpleType>
         *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}PowerType">
         *               <totalDigits value="8"/>
         *               <fractionDigits value="3"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="NeedReplaced" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}PowerType">
         *               <totalDigits value="8"/>
         *               <fractionDigits value="3"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="Wearout" type="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}CentesimalType" minOccurs="0"/>
         *         <element name="PressureType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
         *         <element name="VoltageType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
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
            "name",
            "diameter",
            "length",
            "needReplaced",
            "wearout",
            "pressureType",
            "voltageType"
        })
        public static class NetPieces {

            /**
             * Наименование участка
             * 
             */
            @XmlElement(name = "Name")
            protected String name;
            /**
             * Диаметр(мм)
             * 
             */
            @XmlElement(name = "Diameter", required = true)
            protected BigDecimal diameter;
            /**
             * Протяженность(км)
             * 
             */
            @XmlElement(name = "Length", required = true)
            protected BigDecimal length;
            /**
             * Нуждается в замене(км)
             * 
             */
            @XmlElement(name = "NeedReplaced")
            protected BigDecimal needReplaced;
            /**
             * Износ(%)
             * 
             */
            @XmlElement(name = "Wearout")
            protected BigDecimal wearout;
            /**
             * Ссылка на НСИ "Уровень давления газопровода" (реестровый номер 36 )
             * 
             */
            @XmlElement(name = "PressureType")
            protected NsiRef pressureType;
            /**
             * Ссылка на НСИ "Уровень напряжения" (реестровый номер 45 )
             * 
             */
            @XmlElement(name = "VoltageType")
            protected NsiRef voltageType;

            /**
             * Наименование участка
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getName()
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Диаметр(мм)
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDiameter() {
                return diameter;
            }

            /**
             * Sets the value of the diameter property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getDiameter()
             */
            public void setDiameter(BigDecimal value) {
                this.diameter = value;
            }

            /**
             * Протяженность(км)
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLength() {
                return length;
            }

            /**
             * Sets the value of the length property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getLength()
             */
            public void setLength(BigDecimal value) {
                this.length = value;
            }

            /**
             * Нуждается в замене(км)
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getNeedReplaced() {
                return needReplaced;
            }

            /**
             * Sets the value of the needReplaced property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getNeedReplaced()
             */
            public void setNeedReplaced(BigDecimal value) {
                this.needReplaced = value;
            }

            /**
             * Износ(%)
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getWearout() {
                return wearout;
            }

            /**
             * Sets the value of the wearout property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getWearout()
             */
            public void setWearout(BigDecimal value) {
                this.wearout = value;
            }

            /**
             * Ссылка на НСИ "Уровень давления газопровода" (реестровый номер 36 )
             * 
             * @return
             *     possible object is
             *     {@link NsiRef }
             *     
             */
            public NsiRef getPressureType() {
                return pressureType;
            }

            /**
             * Sets the value of the pressureType property.
             * 
             * @param value
             *     allowed object is
             *     {@link NsiRef }
             *     
             * @see #getPressureType()
             */
            public void setPressureType(NsiRef value) {
                this.pressureType = value;
            }

            /**
             * Ссылка на НСИ "Уровень напряжения" (реестровый номер 45 )
             * 
             * @return
             *     possible object is
             *     {@link NsiRef }
             *     
             */
            public NsiRef getVoltageType() {
                return voltageType;
            }

            /**
             * Sets the value of the voltageType property.
             * 
             * @param value
             *     allowed object is
             *     {@link NsiRef }
             *     
             * @see #getVoltageType()
             */
            public void setVoltageType(NsiRef value) {
                this.voltageType = value;
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
         *         <element name="SourceOKI" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
         *         <element name="ReceiverOKI" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded" minOccurs="0"/>
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
            "sourceOKI",
            "receiverOKI"
        })
        public static class OKILinks {

            /**
             * Cсылка на источник Идентификатор ОКИ в ГИС ЖКХ
             * 
             */
            @XmlElement(name = "SourceOKI", required = true)
            protected List<String> sourceOKI;
            /**
             * Идентификатор ОКИ в ГИС ЖКХ
             * 
             */
            @XmlElement(name = "ReceiverOKI")
            protected List<String> receiverOKI;

            /**
             * Cсылка на источник Идентификатор ОКИ в ГИС ЖКХ
             * 
             * Gets the value of the sourceOKI property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the sourceOKI property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getSourceOKI().add(newItem);
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
             *     The value of the sourceOKI property.
             */
            public List<String> getSourceOKI() {
                if (sourceOKI == null) {
                    sourceOKI = new ArrayList<>();
                }
                return this.sourceOKI;
            }

            /**
             * Идентификатор ОКИ в ГИС ЖКХ
             * 
             * Gets the value of the receiverOKI property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the receiverOKI property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getReceiverOKI().add(newItem);
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
             *     The value of the receiverOKI property.
             */
            public List<String> getReceiverOKI() {
                if (receiverOKI == null) {
                    receiverOKI = new ArrayList<>();
                }
                return this.receiverOKI;
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}ResourceType">
         *       <sequence>
         *         <element name="SetPower" type="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}PowerType" minOccurs="0"/>
         *         <element name="SitingPower" type="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}PowerType" minOccurs="0"/>
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
            "setPower",
            "sitingPower"
        })
        public static class Resources
            extends ResourceType
        {

            /**
             * Установленная мощность.Значение указывается в единицах измерения в соответствии с полем "Единица измерения ссылка на справочник «ОКЕИ»" справочника "Вид коммунального ресурса"
             * 
             */
            @XmlElement(name = "SetPower")
            protected BigDecimal setPower;
            /**
             * Распологаемая мощность. Значение указывается в единицах измерения в соответствии с полем "Единица измерения ссылка на справочник «ОКЕИ»" справочника "Вид коммунального ресурса"
             * 
             */
            @XmlElement(name = "SitingPower")
            protected BigDecimal sitingPower;

            /**
             * Установленная мощность.Значение указывается в единицах измерения в соответствии с полем "Единица измерения ссылка на справочник «ОКЕИ»" справочника "Вид коммунального ресурса"
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSetPower() {
                return setPower;
            }

            /**
             * Sets the value of the setPower property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getSetPower()
             */
            public void setSetPower(BigDecimal value) {
                this.setPower = value;
            }

            /**
             * Распологаемая мощность. Значение указывается в единицах измерения в соответствии с полем "Единица измерения ссылка на справочник «ОКЕИ»" справочника "Вид коммунального ресурса"
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSitingPower() {
                return sitingPower;
            }

            /**
             * Sets the value of the sitingPower property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getSitingPower()
             */
            public void setSitingPower(BigDecimal value) {
                this.sitingPower = value;
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}ResourceType">
         *       <sequence>
         *         <element name="VolumeLosses">
         *           <simpleType>
         *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}PowerType">
         *               <totalDigits value="8"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="CoolantType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
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
            "volumeLosses",
            "coolantType"
        })
        public static class TransportationResources
            extends ResourceType
        {

            /**
             * Объем потерь. Значение указывается в единицах измерения в соответствии с полем «Единица измерения (ссылка на справочник «ОКЕИ»)» справочника «Вид коммунальной услуги»
             * 
             */
            @XmlElement(name = "VolumeLosses", required = true)
            protected BigDecimal volumeLosses;
            /**
             * Ссылка на НСИ "Вид теплоносителя" (реестровый номер 41)
             * 
             */
            @XmlElement(name = "CoolantType")
            protected NsiRef coolantType;

            /**
             * Объем потерь. Значение указывается в единицах измерения в соответствии с полем «Единица измерения (ссылка на справочник «ОКЕИ»)» справочника «Вид коммунальной услуги»
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getVolumeLosses() {
                return volumeLosses;
            }

            /**
             * Sets the value of the volumeLosses property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getVolumeLosses()
             */
            public void setVolumeLosses(BigDecimal value) {
                this.volumeLosses = value;
            }

            /**
             * Ссылка на НСИ "Вид теплоносителя" (реестровый номер 41)
             * 
             * @return
             *     possible object is
             *     {@link NsiRef }
             *     
             */
            public NsiRef getCoolantType() {
                return coolantType;
            }

            /**
             * Sets the value of the coolantType property.
             * 
             * @param value
             *     allowed object is
             *     {@link NsiRef }
             *     
             * @see #getCoolantType()
             */
            public void setCoolantType(NsiRef value) {
                this.coolantType = value;
            }

        }

    }

}
