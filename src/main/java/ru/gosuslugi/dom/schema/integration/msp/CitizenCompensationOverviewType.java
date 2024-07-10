
package ru.gosuslugi.dom.schema.integration.msp;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Общие сведения о гражданине, получающем компенсации расходов
 * 
 * <p>Java class for CitizenCompensationOverviewType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CitizenCompensationOverviewType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/msp/}MSPIndType">
 *       <sequence>
 *         <element name="Address" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *         <element name="ApartmentNumber" type="{http://dom.gosuslugi.ru/schema/integration/msp/}String36Type" minOccurs="0"/>
 *         <element name="FlatNumber" type="{http://dom.gosuslugi.ru/schema/integration/msp/}String36Type" minOccurs="0"/>
 *         <element name="RegistrationType">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               <enumeration value="Permanent"/>
 *               <enumeration value="Temporary"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Category" type="{http://dom.gosuslugi.ru/schema/integration/msp/}CitizenCompensationCategoryType" maxOccurs="1000" minOccurs="0"/>
 *         <element name="Decision" type="{http://dom.gosuslugi.ru/schema/integration/msp/}DecisionType" maxOccurs="1000" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CitizenCompensationOverviewType", propOrder = {
    "address",
    "apartmentNumber",
    "flatNumber",
    "registrationType",
    "category",
    "decision"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.msp.ExportCitizenCompensationType.Overview.class
})
public class CitizenCompensationOverviewType
    extends MSPIndType
{

    /**
     * Адрес жилого помещения, по которому предоставляется компенсация расходов. Глобальный уникальный идентификатор дома по ФИАС
     * 
     */
    @XmlElement(name = "Address", required = true)
    protected String address;
    /**
     * Номер квартиры
     * 
     */
    @XmlElement(name = "ApartmentNumber")
    protected String apartmentNumber;
    /**
     * Номер комнаты
     * 
     */
    @XmlElement(name = "FlatNumber")
    protected String flatNumber;
    /**
     * Тип регистрации в жилом помещении. Требуется указать одно из двух значений: Permanent - по месту жительства, Temporary - по месту пребывания
     * 
     */
    @XmlElement(name = "RegistrationType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String registrationType;
    /**
     * Категории. При импорте должна быть указана хотя бы одна категория
     * 
     */
    @XmlElement(name = "Category")
    protected List<CitizenCompensationCategoryType> category;
    /**
     * Решения. При импорте обязательно должно быть хотя бы одно решение о предоставлении
     * 
     */
    @XmlElement(name = "Decision")
    protected List<DecisionType> decision;

    /**
     * Адрес жилого помещения, по которому предоставляется компенсация расходов. Глобальный уникальный идентификатор дома по ФИАС
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAddress()
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Номер квартиры
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
     * Номер комнаты
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlatNumber() {
        return flatNumber;
    }

    /**
     * Sets the value of the flatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFlatNumber()
     */
    public void setFlatNumber(String value) {
        this.flatNumber = value;
    }

    /**
     * Тип регистрации в жилом помещении. Требуется указать одно из двух значений: Permanent - по месту жительства, Temporary - по месту пребывания
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationType() {
        return registrationType;
    }

    /**
     * Sets the value of the registrationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRegistrationType()
     */
    public void setRegistrationType(String value) {
        this.registrationType = value;
    }

    /**
     * Категории. При импорте должна быть указана хотя бы одна категория
     * 
     * Gets the value of the category property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the category property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CitizenCompensationCategoryType }
     * </p>
     * 
     * 
     * @return
     *     The value of the category property.
     */
    public List<CitizenCompensationCategoryType> getCategory() {
        if (category == null) {
            category = new ArrayList<>();
        }
        return this.category;
    }

    /**
     * Решения. При импорте обязательно должно быть хотя бы одно решение о предоставлении
     * 
     * Gets the value of the decision property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the decision property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDecision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DecisionType }
     * </p>
     * 
     * 
     * @return
     *     The value of the decision property.
     */
    public List<DecisionType> getDecision() {
        if (decision == null) {
            decision = new ArrayList<>();
        }
        return this.decision;
    }

}
