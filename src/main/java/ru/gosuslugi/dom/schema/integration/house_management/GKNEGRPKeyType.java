
package ru.gosuslugi.dom.schema.integration.house_management;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения из ГКН для УО и ОМС
 * 
 * <p>Java class for GKN_EGRP_KeyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GKN_EGRP_KeyType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CadastralNumber"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}No_RSO_GKN_EGRP_Registered"/>
 *         <sequence>
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}NoCadastralNumber" minOccurs="0"/>
 *           <choice minOccurs="0">
 *             <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ConditionalNumber"/>
 *             <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}RightOrEncumbrance" maxOccurs="unbounded"/>
 *           </choice>
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
@XmlType(name = "GKN_EGRP_KeyType", propOrder = {
    "cadastralNumber",
    "noRSOGKNEGRPRegistered",
    "noCadastralNumber",
    "conditionalNumber",
    "rightOrEncumbrance"
})
@XmlSeeAlso({
    HouseBasicUpdateUOType.class,
    HouseBasicUpdateOMSType.class,
    HouseBasicUpdateESPType.class,
    HouseBasicUOType.class,
    ru.gosuslugi.dom.schema.integration.house_management.ApartmentHouseOMSType.BasicCharacteristicts.class,
    ru.gosuslugi.dom.schema.integration.house_management.ApartmentHouseESPType.BasicCharacteristicts.class,
    ru.gosuslugi.dom.schema.integration.house_management.LivingHouseOMSType.BasicCharacteristicts.class,
    BlockUOType.class,
    BlockOMSType.class,
    BlockUpdateUOType.class,
    BlockUpdateOMSType.class,
    PremisesBasicUOType.class,
    PremisesBasicOMSType.class,
    PremisesBasicESPType.class,
    PremisesBasicUpdateUOType.class,
    PremisesBasicUpdateOMSType.class,
    PremisesBasicUpdateESPType.class,
    RoomUOType.class,
    RoomOMSType.class,
    RoomESPType.class,
    RoomUpdateUOType.class,
    RoomUpdateOMSType.class,
    RoomUpdateESPType.class,
    RoomExportType.class
})
public class GKNEGRPKeyType {

    /**
     * Кадастровый номер объекта недвижимости. При указании осуществляется привязка к ГКН и ЕГРП (поиск в ГКН и ЕГРП выполняется по кадастровому номеру). Перечень Субъектов РФ, по которым размещена информация в ГКН/ЕГРП, можно уточнить у Оператора ГИС ЖКХ. Наличие в экспорте указывает на установленную связь с ГКН/ЕГРП по этому элементу.
     * 
     */
    @XmlElement(name = "CadastralNumber")
    protected String cadastralNumber;
    /**
     * Информация об объекте недвижимости из Росреестра не размещена в ГИС ЖКХ. При указании в ГИС ЖКХ не сохраняется информация ни о кадастровом номере, ни о его отсутствии. При изменении объекта, привязанного к ГКН или ЕГРП, выполняется отвязка. Перечень Субъектов РФ, по которым размещена информация в ГКН, можно уточнить у Оператора ГИС ЖКХ.
     * 
     */
    @XmlElement(name = "No_RSO_GKN_EGRP_Registered")
    protected Boolean noRSOGKNEGRPRegistered;
    /**
     * У объекта отсутствует кадастровый номер. При указании в ГИС ЖКХ сохраняется информация об отсутствии кадастрового номера, привязка к ГКН и ЕГРП не выполняется. При изменении объекта, привязанного к ГКН, выполняется отвязка от ГКН и ЕГРП. При изменении объекта, привязанного только к ЕГРП, отвязка не выполняется.
     * 
     */
    @XmlElement(name = "NoCadastralNumber")
    protected Boolean noCadastralNumber;
    /**
     * Условный номер. При указании в ГИС ЖКХ осуществляется привязка к ЕГРП (поиск в ЕГРП выполняется по условному номеру).
     * 
     */
    @XmlElement(name = "ConditionalNumber")
    protected String conditionalNumber;
    /**
     * Регистрационные данные права или ограничения/обременения прав. При указании в ГИС ЖКХ осуществляется привязка к ЕГРП (поиск в ЕГРП по регистрационным данным прав или ограничений/обременений прав).
     * 
     */
    @XmlElement(name = "RightOrEncumbrance")
    protected List<RightOrEncumbrance> rightOrEncumbrance;

    /**
     * Кадастровый номер объекта недвижимости. При указании осуществляется привязка к ГКН и ЕГРП (поиск в ГКН и ЕГРП выполняется по кадастровому номеру). Перечень Субъектов РФ, по которым размещена информация в ГКН/ЕГРП, можно уточнить у Оператора ГИС ЖКХ. Наличие в экспорте указывает на установленную связь с ГКН/ЕГРП по этому элементу.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCadastralNumber() {
        return cadastralNumber;
    }

    /**
     * Sets the value of the cadastralNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCadastralNumber()
     */
    public void setCadastralNumber(String value) {
        this.cadastralNumber = value;
    }

    /**
     * Информация об объекте недвижимости из Росреестра не размещена в ГИС ЖКХ. При указании в ГИС ЖКХ не сохраняется информация ни о кадастровом номере, ни о его отсутствии. При изменении объекта, привязанного к ГКН или ЕГРП, выполняется отвязка. Перечень Субъектов РФ, по которым размещена информация в ГКН, можно уточнить у Оператора ГИС ЖКХ.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoRSOGKNEGRPRegistered() {
        return noRSOGKNEGRPRegistered;
    }

    /**
     * Sets the value of the noRSOGKNEGRPRegistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNoRSOGKNEGRPRegistered()
     */
    public void setNoRSOGKNEGRPRegistered(Boolean value) {
        this.noRSOGKNEGRPRegistered = value;
    }

    /**
     * У объекта отсутствует кадастровый номер. При указании в ГИС ЖКХ сохраняется информация об отсутствии кадастрового номера, привязка к ГКН и ЕГРП не выполняется. При изменении объекта, привязанного к ГКН, выполняется отвязка от ГКН и ЕГРП. При изменении объекта, привязанного только к ЕГРП, отвязка не выполняется.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoCadastralNumber() {
        return noCadastralNumber;
    }

    /**
     * Sets the value of the noCadastralNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNoCadastralNumber()
     */
    public void setNoCadastralNumber(Boolean value) {
        this.noCadastralNumber = value;
    }

    /**
     * Условный номер. При указании в ГИС ЖКХ осуществляется привязка к ЕГРП (поиск в ЕГРП выполняется по условному номеру).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionalNumber() {
        return conditionalNumber;
    }

    /**
     * Sets the value of the conditionalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getConditionalNumber()
     */
    public void setConditionalNumber(String value) {
        this.conditionalNumber = value;
    }

    /**
     * Регистрационные данные права или ограничения/обременения прав. При указании в ГИС ЖКХ осуществляется привязка к ЕГРП (поиск в ЕГРП по регистрационным данным прав или ограничений/обременений прав).
     * 
     * Gets the value of the rightOrEncumbrance property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rightOrEncumbrance property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRightOrEncumbrance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RightOrEncumbrance }
     * </p>
     * 
     * 
     * @return
     *     The value of the rightOrEncumbrance property.
     */
    public List<RightOrEncumbrance> getRightOrEncumbrance() {
        if (rightOrEncumbrance == null) {
            rightOrEncumbrance = new ArrayList<>();
        }
        return this.rightOrEncumbrance;
    }

}
