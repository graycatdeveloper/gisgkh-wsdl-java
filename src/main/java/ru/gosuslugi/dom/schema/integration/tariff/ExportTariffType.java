
package ru.gosuslugi.dom.schema.integration.tariff;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Экспортируемые сведения о тарифе
 * 
 * <p>Java class for exportTariffType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportTariffType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TariffGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}StatusType"/>
 *         <element name="CancelReason" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}String4000Type" minOccurs="0"/>
 *         <choice>
 *           <element name="MunicipalResourceTariff" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}MunicipalResourceTariffType"/>
 *           <element name="ResidentialPremisesMaintenance" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}ResidentialPremisesMaintenanceType"/>
 *           <element name="CapitalRepairTariff" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}CapitalRepairTariffType"/>
 *           <element name="SocialNorm" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}SocialNormType"/>
 *           <element name="ResidentialPremisesUsage" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}ResidentialPremisesUsageType"/>
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
@XmlType(name = "exportTariffType", propOrder = {
    "tariffGUID",
    "status",
    "cancelReason",
    "municipalResourceTariff",
    "residentialPremisesMaintenance",
    "capitalRepairTariff",
    "socialNorm",
    "residentialPremisesUsage"
})
public class ExportTariffType {

    /**
     * Идентификатор тарифа
     * 
     */
    @XmlElement(name = "TariffGUID", required = true)
    protected String tariffGUID;
    /**
     * Статус информации о тарифе
     * 
     */
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "token")
    protected StatusType status;
    /**
     * Причина аннулирования
     * 
     */
    @XmlElement(name = "CancelReason")
    protected String cancelReason;
    /**
     * Тариф на оплату коммунальных ресурсов
     * 
     */
    @XmlElement(name = "MunicipalResourceTariff")
    protected MunicipalResourceTariffType municipalResourceTariff;
    /**
     * Размер платы за содержание жилого помещения
     * 
     */
    @XmlElement(name = "ResidentialPremisesMaintenance")
    protected ResidentialPremisesMaintenanceType residentialPremisesMaintenance;
    /**
     * Минимальный размер взноса на капитальный ремонт
     * 
     */
    @XmlElement(name = "CapitalRepairTariff")
    protected CapitalRepairTariffType capitalRepairTariff;
    /**
     * Социальная норма потребления электрической энергии
     * 
     */
    @XmlElement(name = "SocialNorm")
    protected SocialNormType socialNorm;
    /**
     * Размер платы за пользование жилым помещением
     * 
     */
    @XmlElement(name = "ResidentialPremisesUsage")
    protected ResidentialPremisesUsageType residentialPremisesUsage;

    /**
     * Идентификатор тарифа
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffGUID() {
        return tariffGUID;
    }

    /**
     * Sets the value of the tariffGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTariffGUID()
     */
    public void setTariffGUID(String value) {
        this.tariffGUID = value;
    }

    /**
     * Статус информации о тарифе
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     * @see #getStatus()
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Причина аннулирования
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * Sets the value of the cancelReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCancelReason()
     */
    public void setCancelReason(String value) {
        this.cancelReason = value;
    }

    /**
     * Тариф на оплату коммунальных ресурсов
     * 
     * @return
     *     possible object is
     *     {@link MunicipalResourceTariffType }
     *     
     */
    public MunicipalResourceTariffType getMunicipalResourceTariff() {
        return municipalResourceTariff;
    }

    /**
     * Sets the value of the municipalResourceTariff property.
     * 
     * @param value
     *     allowed object is
     *     {@link MunicipalResourceTariffType }
     *     
     * @see #getMunicipalResourceTariff()
     */
    public void setMunicipalResourceTariff(MunicipalResourceTariffType value) {
        this.municipalResourceTariff = value;
    }

    /**
     * Размер платы за содержание жилого помещения
     * 
     * @return
     *     possible object is
     *     {@link ResidentialPremisesMaintenanceType }
     *     
     */
    public ResidentialPremisesMaintenanceType getResidentialPremisesMaintenance() {
        return residentialPremisesMaintenance;
    }

    /**
     * Sets the value of the residentialPremisesMaintenance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidentialPremisesMaintenanceType }
     *     
     * @see #getResidentialPremisesMaintenance()
     */
    public void setResidentialPremisesMaintenance(ResidentialPremisesMaintenanceType value) {
        this.residentialPremisesMaintenance = value;
    }

    /**
     * Минимальный размер взноса на капитальный ремонт
     * 
     * @return
     *     possible object is
     *     {@link CapitalRepairTariffType }
     *     
     */
    public CapitalRepairTariffType getCapitalRepairTariff() {
        return capitalRepairTariff;
    }

    /**
     * Sets the value of the capitalRepairTariff property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapitalRepairTariffType }
     *     
     * @see #getCapitalRepairTariff()
     */
    public void setCapitalRepairTariff(CapitalRepairTariffType value) {
        this.capitalRepairTariff = value;
    }

    /**
     * Социальная норма потребления электрической энергии
     * 
     * @return
     *     possible object is
     *     {@link SocialNormType }
     *     
     */
    public SocialNormType getSocialNorm() {
        return socialNorm;
    }

    /**
     * Sets the value of the socialNorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocialNormType }
     *     
     * @see #getSocialNorm()
     */
    public void setSocialNorm(SocialNormType value) {
        this.socialNorm = value;
    }

    /**
     * Размер платы за пользование жилым помещением
     * 
     * @return
     *     possible object is
     *     {@link ResidentialPremisesUsageType }
     *     
     */
    public ResidentialPremisesUsageType getResidentialPremisesUsage() {
        return residentialPremisesUsage;
    }

    /**
     * Sets the value of the residentialPremisesUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidentialPremisesUsageType }
     *     
     * @see #getResidentialPremisesUsage()
     */
    public void setResidentialPremisesUsage(ResidentialPremisesUsageType value) {
        this.residentialPremisesUsage = value;
    }

}
