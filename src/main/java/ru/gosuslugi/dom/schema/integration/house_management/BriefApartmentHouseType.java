
package ru.gosuslugi.dom.schema.integration.house_management;

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
 * Краткая информация о многоквартирном доме
 * 
 * <p>Java class for BriefApartmentHouseType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BriefApartmentHouseType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HCSHouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *         <element name="FIASHouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType" minOccurs="0"/>
 *         <element name="HouseUniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="Entrance" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BriefEntranceType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ResidentialPremises" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BriefResidentialPremisesType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NonResidentialPremises" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BriefNonResidentialPremisesType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="HouseManagementType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *         <element name="TerminationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="AnnulmentReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *         <element name="AnnulmentInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DemolishionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="DemolishionReason" type="{http://dom.gosuslugi.ru/schema/integration/base/}String500Type" minOccurs="0"/>
 *         <element name="IsAsyncProcessed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ExportHostelData" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}ExportHostelDataType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BriefApartmentHouseType", propOrder = {
    "hcsHouseGUID",
    "fiasHouseGUID",
    "houseUniqueNumber",
    "modificationDate",
    "entrance",
    "residentialPremises",
    "nonResidentialPremises",
    "houseManagementType",
    "terminationDate",
    "annulmentReason",
    "annulmentInfo",
    "demolishionDate",
    "demolishionReason",
    "isAsyncProcessed",
    "exportHostelData"
})
public class BriefApartmentHouseType {

    /**
     * Уникальный идентификатор адреса дома, присвоенный ГИС ЖКХ
     * 
     */
    @XmlElement(name = "HCSHouseGUID", required = true)
    protected String hcsHouseGUID;
    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     */
    @XmlElement(name = "FIASHouseGUID")
    protected String fiasHouseGUID;
    /**
     * Уникальный номер дома
     * 
     */
    @XmlElement(name = "HouseUniqueNumber", required = true)
    protected String houseUniqueNumber;
    /**
     * Дата модификации данных дома
     * 
     */
    @XmlElement(name = "ModificationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modificationDate;
    /**
     * Подъезд
     * 
     */
    @XmlElement(name = "Entrance")
    protected List<BriefEntranceType> entrance;
    /**
     * Жилое помещение
     * 
     */
    @XmlElement(name = "ResidentialPremises")
    protected List<BriefResidentialPremisesType> residentialPremises;
    /**
     * Нежилое помещение
     * 
     */
    @XmlElement(name = "NonResidentialPremises")
    protected List<BriefNonResidentialPremisesType> nonResidentialPremises;
    /**
     * Cпособ управления домом (НСИ 25).
     * 
     */
    @XmlElement(name = "HouseManagementType")
    protected NsiRef houseManagementType;
    /**
     * Дата аннулирования объекта в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "TerminationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar terminationDate;
    /**
     * Причина аннулирования объекта жилищного фонда (НСИ 330)
     * 
     */
    @XmlElement(name = "AnnulmentReason")
    protected NsiRef annulmentReason;
    /**
     * Причина аннулирования.Дополнительная информация
     * 
     */
    @XmlElement(name = "AnnulmentInfo")
    protected String annulmentInfo;
    /**
     * Дата сноса
     * 
     */
    @XmlElement(name = "DemolishionDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar demolishionDate;
    /**
     * Основание сноса (описание)
     * 
     */
    @XmlElement(name = "DemolishionReason")
    protected String demolishionReason;
    /**
     * Признак асинхронной обработки - для дома запущена процедура аннулирования или сохранения информации о сносе
     * 
     */
    @XmlElement(name = "IsAsyncProcessed")
    protected Boolean isAsyncProcessed;
    /**
     * Данные общежития
     * 
     */
    @XmlElement(name = "ExportHostelData")
    protected ExportHostelDataType exportHostelData;

    /**
     * Уникальный идентификатор адреса дома, присвоенный ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHCSHouseGUID() {
        return hcsHouseGUID;
    }

    /**
     * Sets the value of the hcsHouseGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getHCSHouseGUID()
     */
    public void setHCSHouseGUID(String value) {
        this.hcsHouseGUID = value;
    }

    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIASHouseGUID() {
        return fiasHouseGUID;
    }

    /**
     * Sets the value of the fiasHouseGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFIASHouseGUID()
     */
    public void setFIASHouseGUID(String value) {
        this.fiasHouseGUID = value;
    }

    /**
     * Уникальный номер дома
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseUniqueNumber() {
        return houseUniqueNumber;
    }

    /**
     * Sets the value of the houseUniqueNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getHouseUniqueNumber()
     */
    public void setHouseUniqueNumber(String value) {
        this.houseUniqueNumber = value;
    }

    /**
     * Дата модификации данных дома
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModificationDate() {
        return modificationDate;
    }

    /**
     * Sets the value of the modificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getModificationDate()
     */
    public void setModificationDate(XMLGregorianCalendar value) {
        this.modificationDate = value;
    }

    /**
     * Подъезд
     * 
     * Gets the value of the entrance property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entrance property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEntrance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BriefEntranceType }
     * </p>
     * 
     * 
     * @return
     *     The value of the entrance property.
     */
    public List<BriefEntranceType> getEntrance() {
        if (entrance == null) {
            entrance = new ArrayList<>();
        }
        return this.entrance;
    }

    /**
     * Жилое помещение
     * 
     * Gets the value of the residentialPremises property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the residentialPremises property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getResidentialPremises().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BriefResidentialPremisesType }
     * </p>
     * 
     * 
     * @return
     *     The value of the residentialPremises property.
     */
    public List<BriefResidentialPremisesType> getResidentialPremises() {
        if (residentialPremises == null) {
            residentialPremises = new ArrayList<>();
        }
        return this.residentialPremises;
    }

    /**
     * Нежилое помещение
     * 
     * Gets the value of the nonResidentialPremises property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonResidentialPremises property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNonResidentialPremises().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BriefNonResidentialPremisesType }
     * </p>
     * 
     * 
     * @return
     *     The value of the nonResidentialPremises property.
     */
    public List<BriefNonResidentialPremisesType> getNonResidentialPremises() {
        if (nonResidentialPremises == null) {
            nonResidentialPremises = new ArrayList<>();
        }
        return this.nonResidentialPremises;
    }

    /**
     * Cпособ управления домом (НСИ 25).
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getHouseManagementType() {
        return houseManagementType;
    }

    /**
     * Sets the value of the houseManagementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getHouseManagementType()
     */
    public void setHouseManagementType(NsiRef value) {
        this.houseManagementType = value;
    }

    /**
     * Дата аннулирования объекта в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerminationDate() {
        return terminationDate;
    }

    /**
     * Sets the value of the terminationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getTerminationDate()
     */
    public void setTerminationDate(XMLGregorianCalendar value) {
        this.terminationDate = value;
    }

    /**
     * Причина аннулирования объекта жилищного фонда (НСИ 330)
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getAnnulmentReason() {
        return annulmentReason;
    }

    /**
     * Sets the value of the annulmentReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getAnnulmentReason()
     */
    public void setAnnulmentReason(NsiRef value) {
        this.annulmentReason = value;
    }

    /**
     * Причина аннулирования.Дополнительная информация
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnulmentInfo() {
        return annulmentInfo;
    }

    /**
     * Sets the value of the annulmentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAnnulmentInfo()
     */
    public void setAnnulmentInfo(String value) {
        this.annulmentInfo = value;
    }

    /**
     * Дата сноса
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDemolishionDate() {
        return demolishionDate;
    }

    /**
     * Sets the value of the demolishionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDemolishionDate()
     */
    public void setDemolishionDate(XMLGregorianCalendar value) {
        this.demolishionDate = value;
    }

    /**
     * Основание сноса (описание)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDemolishionReason() {
        return demolishionReason;
    }

    /**
     * Sets the value of the demolishionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDemolishionReason()
     */
    public void setDemolishionReason(String value) {
        this.demolishionReason = value;
    }

    /**
     * Признак асинхронной обработки - для дома запущена процедура аннулирования или сохранения информации о сносе
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAsyncProcessed() {
        return isAsyncProcessed;
    }

    /**
     * Sets the value of the isAsyncProcessed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsAsyncProcessed()
     */
    public void setIsAsyncProcessed(Boolean value) {
        this.isAsyncProcessed = value;
    }

    /**
     * Данные общежития
     * 
     * @return
     *     possible object is
     *     {@link ExportHostelDataType }
     *     
     */
    public ExportHostelDataType getExportHostelData() {
        return exportHostelData;
    }

    /**
     * Sets the value of the exportHostelData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportHostelDataType }
     *     
     * @see #getExportHostelData()
     */
    public void setExportHostelData(ExportHostelDataType value) {
        this.exportHostelData = value;
    }

}
