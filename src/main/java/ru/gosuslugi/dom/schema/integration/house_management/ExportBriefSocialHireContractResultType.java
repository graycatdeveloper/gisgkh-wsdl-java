
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
 * Ответ на запрос экспорта краткой информации о договоре найма
 * 
 * <p>Java class for exportBriefSocialHireContractResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportBriefSocialHireContractResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ContractRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="ContractGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="ContractState" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="NotTakeEffect"/>
 *               <enumeration value="Proceed"/>
 *               <enumeration value="Expired"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ContractNumber">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="255"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="SigningDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="TerminateContract" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}TerminateType">
 *                 <sequence>
 *                   <element name="ReasonRef" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="AnnulmentContract" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}AnnulmentType" minOccurs="0"/>
 *         <element name="Type">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <length value="1"/>
 *               <enumeration value="D"/>
 *               <enumeration value="M"/>
 *               <enumeration value="S"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ObjectAddress" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *                   <element name="ApartmentNumber" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}PremisesNumType" minOccurs="0"/>
 *                   <element name="RoomNumber" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}PremisesNumType" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}orgPPAGUID" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportBriefSocialHireContractResultType", propOrder = {
    "contractRootGUID",
    "contractGUID",
    "contractState",
    "contractNumber",
    "signingDate",
    "terminateContract",
    "annulmentContract",
    "type",
    "objectAddress",
    "orgPPAGUID"
})
public class ExportBriefSocialHireContractResultType {

    /**
     * Идентификатор договора социального наймам в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "ContractRootGUID", required = true)
    protected String contractRootGUID;
    /**
     * Идентификатор версии договора социального наймам в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "ContractGUID", required = true)
    protected String contractGUID;
    /**
     * Состояние договора. Заполняется для договора в статусе "Утвержден"
     * 
     */
    @XmlElement(name = "ContractState")
    protected String contractState;
    /**
     * Номер договора
     * 
     */
    @XmlElement(name = "ContractNumber", required = true)
    protected String contractNumber;
    /**
     * Дата заключения
     * 
     */
    @XmlElement(name = "SigningDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar signingDate;
    /**
     * Информация о расторжении
     * 
     */
    @XmlElement(name = "TerminateContract")
    protected ExportBriefSocialHireContractResultType.TerminateContract terminateContract;
    /**
     * Аннулирование
     * 
     */
    @XmlElement(name = "AnnulmentContract")
    protected AnnulmentType annulmentContract;
    /**
     * Тип:
     * (D)WELLING_APARTMENT - Договор социального найма жилого помещения
     * STATE_(M)UNICIPAL_FUND - Договор найма жилого помещения государственного или муниципального жилищного фонда
     * (S)OCIAL_FUND - Договор найма жилого помещения жилищного фонда социального использования
     * 
     */
    @XmlElement(name = "Type", required = true)
    protected String type;
    /**
     * Данные об объекте жилищного фонда
     * 
     */
    @XmlElement(name = "ObjectAddress")
    protected List<ExportBriefSocialHireContractResultType.ObjectAddress> objectAddress;
    /**
     * Идентификатор зарегистрированной организации заключившей договор (первая сторона договора)
     * 
     */
    @XmlElement(namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected String orgPPAGUID;

    /**
     * Идентификатор договора социального наймам в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractRootGUID() {
        return contractRootGUID;
    }

    /**
     * Sets the value of the contractRootGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContractRootGUID()
     */
    public void setContractRootGUID(String value) {
        this.contractRootGUID = value;
    }

    /**
     * Идентификатор версии договора социального наймам в ГИС ЖКХ
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
     * Состояние договора. Заполняется для договора в статусе "Утвержден"
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractState() {
        return contractState;
    }

    /**
     * Sets the value of the contractState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContractState()
     */
    public void setContractState(String value) {
        this.contractState = value;
    }

    /**
     * Номер договора
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContractNumber()
     */
    public void setContractNumber(String value) {
        this.contractNumber = value;
    }

    /**
     * Дата заключения
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
     * Информация о расторжении
     * 
     * @return
     *     possible object is
     *     {@link ExportBriefSocialHireContractResultType.TerminateContract }
     *     
     */
    public ExportBriefSocialHireContractResultType.TerminateContract getTerminateContract() {
        return terminateContract;
    }

    /**
     * Sets the value of the terminateContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportBriefSocialHireContractResultType.TerminateContract }
     *     
     * @see #getTerminateContract()
     */
    public void setTerminateContract(ExportBriefSocialHireContractResultType.TerminateContract value) {
        this.terminateContract = value;
    }

    /**
     * Аннулирование
     * 
     * @return
     *     possible object is
     *     {@link AnnulmentType }
     *     
     */
    public AnnulmentType getAnnulmentContract() {
        return annulmentContract;
    }

    /**
     * Sets the value of the annulmentContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnulmentType }
     *     
     * @see #getAnnulmentContract()
     */
    public void setAnnulmentContract(AnnulmentType value) {
        this.annulmentContract = value;
    }

    /**
     * Тип:
     * (D)WELLING_APARTMENT - Договор социального найма жилого помещения
     * STATE_(M)UNICIPAL_FUND - Договор найма жилого помещения государственного или муниципального жилищного фонда
     * (S)OCIAL_FUND - Договор найма жилого помещения жилищного фонда социального использования
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getType()
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Данные об объекте жилищного фонда
     * 
     * Gets the value of the objectAddress property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectAddress property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getObjectAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportBriefSocialHireContractResultType.ObjectAddress }
     * </p>
     * 
     * 
     * @return
     *     The value of the objectAddress property.
     */
    public List<ExportBriefSocialHireContractResultType.ObjectAddress> getObjectAddress() {
        if (objectAddress == null) {
            objectAddress = new ArrayList<>();
        }
        return this.objectAddress;
    }

    /**
     * Идентификатор зарегистрированной организации заключившей договор (первая сторона договора)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgPPAGUID() {
        return orgPPAGUID;
    }

    /**
     * Sets the value of the orgPPAGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrgPPAGUID()
     */
    public void setOrgPPAGUID(String value) {
        this.orgPPAGUID = value;
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
     *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
     *         <element name="ApartmentNumber" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}PremisesNumType" minOccurs="0"/>
     *         <element name="RoomNumber" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}PremisesNumType" minOccurs="0"/>
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
        "apartmentNumber",
        "roomNumber"
    })
    public static class ObjectAddress {

        /**
         * Адрес дома
         * Глобальный уникальный идентификатор дома по ФИАС
         * 
         */
        @XmlElement(name = "FIASHouseGuid", required = true)
        protected String fiasHouseGuid;
        /**
         * Номер квартиры (помещения)
         * 
         */
        @XmlElement(name = "ApartmentNumber")
        protected String apartmentNumber;
        /**
         * Номер комнаты (указывается в случае квартиры коммунального заселения)
         * 
         */
        @XmlElement(name = "RoomNumber")
        protected String roomNumber;

        /**
         * Адрес дома
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
         * Номер квартиры (помещения)
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApartmentNumber() {
            return apartmentNumber;
        }

        /**
         * Sets the value of the apartmentNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getApartmentNumber()
         */
        public void setApartmentNumber(String value) {
            this.apartmentNumber = value;
        }

        /**
         * Номер комнаты (указывается в случае квартиры коммунального заселения)
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomNumber() {
            return roomNumber;
        }

        /**
         * Sets the value of the roomNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getRoomNumber()
         */
        public void setRoomNumber(String value) {
            this.roomNumber = value;
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}TerminateType">
     *       <sequence>
     *         <element name="ReasonRef" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
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
        "reasonRef"
    })
    public static class TerminateContract
        extends TerminateType
    {

        /**
         * Ссылка на НСИ "54	Причина расторжения договора" (реестровый номер 54)
         * 
         */
        @XmlElement(name = "ReasonRef", required = true)
        protected NsiRef reasonRef;

        /**
         * Ссылка на НСИ "54	Причина расторжения договора" (реестровый номер 54)
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getReasonRef() {
            return reasonRef;
        }

        /**
         * Sets the value of the reasonRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getReasonRef()
         */
        public void setReasonRef(NsiRef value) {
            this.reasonRef = value;
        }

    }

}
