
package ru.gosuslugi.dom.schema.integration.tariff;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * Тариф на оплату коммунальных ресурсов
 * 
 * <p>Java class for MunicipalResourceTariffType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MunicipalResourceTariffType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/tariff/}TariffCommonType">
 *       <sequence>
 *         <element name="TariffType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="Price" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}MunicipalResourceTariffPriceType" maxOccurs="1000"/>
 *         <choice>
 *           <element name="AllOrganization" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           <element name="RegulatedOrganization" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType"/>
 *         </choice>
 *         <element name="CompaundTariffComponent" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="1000" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MunicipalResourceTariffType", propOrder = {
    "tariffType",
    "price",
    "allOrganization",
    "regulatedOrganization",
    "compaundTariffComponent"
})
public class MunicipalResourceTariffType
    extends TariffCommonType
{

    /**
     * НСИ 268 (Вид тарифа)
     * 
     */
    @XmlElement(name = "TariffType", required = true)
    protected NsiRef tariffType;
    /**
     * Описание дифференцированной цены тарифа. При импорте необходимо присылать все цены тарифа в их актуальном состоянии
     * 
     */
    @XmlElement(name = "Price", required = true)
    protected List<MunicipalResourceTariffPriceType> price;
    /**
     * Для всех организаций, осуществляющих деятельность на указанной территории
     * 
     */
    @XmlElement(name = "AllOrganization")
    protected Boolean allOrganization;
    /**
     * Регулируемая организация
     * 
     */
    @XmlElement(name = "RegulatedOrganization")
    protected RegOrgType regulatedOrganization;
    /**
     * Идентификаторы тарифов - компонентов составного тарифа
     * 
     */
    @XmlElement(name = "CompaundTariffComponent")
    protected List<String> compaundTariffComponent;

    /**
     * НСИ 268 (Вид тарифа)
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getTariffType() {
        return tariffType;
    }

    /**
     * Sets the value of the tariffType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getTariffType()
     */
    public void setTariffType(NsiRef value) {
        this.tariffType = value;
    }

    /**
     * Описание дифференцированной цены тарифа. При импорте необходимо присылать все цены тарифа в их актуальном состоянии
     * 
     * Gets the value of the price property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the price property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MunicipalResourceTariffPriceType }
     * </p>
     * 
     * 
     * @return
     *     The value of the price property.
     */
    public List<MunicipalResourceTariffPriceType> getPrice() {
        if (price == null) {
            price = new ArrayList<>();
        }
        return this.price;
    }

    /**
     * Для всех организаций, осуществляющих деятельность на указанной территории
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllOrganization() {
        return allOrganization;
    }

    /**
     * Sets the value of the allOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAllOrganization()
     */
    public void setAllOrganization(Boolean value) {
        this.allOrganization = value;
    }

    /**
     * Регулируемая организация
     * 
     * @return
     *     possible object is
     *     {@link RegOrgType }
     *     
     */
    public RegOrgType getRegulatedOrganization() {
        return regulatedOrganization;
    }

    /**
     * Sets the value of the regulatedOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegOrgType }
     *     
     * @see #getRegulatedOrganization()
     */
    public void setRegulatedOrganization(RegOrgType value) {
        this.regulatedOrganization = value;
    }

    /**
     * Идентификаторы тарифов - компонентов составного тарифа
     * 
     * Gets the value of the compaundTariffComponent property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compaundTariffComponent property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCompaundTariffComponent().add(newItem);
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
     *     The value of the compaundTariffComponent property.
     */
    public List<String> getCompaundTariffComponent() {
        if (compaundTariffComponent == null) {
            compaundTariffComponent = new ArrayList<>();
        }
        return this.compaundTariffComponent;
    }

}
