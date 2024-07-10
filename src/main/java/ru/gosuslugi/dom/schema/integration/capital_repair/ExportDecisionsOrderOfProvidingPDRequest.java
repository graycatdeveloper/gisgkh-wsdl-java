
package ru.gosuslugi.dom.schema.integration.capital_repair;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseType">
 *       <choice>
 *         <element name="DecisionGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="1000"/>
 *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType" maxOccurs="1000"/>
 *         <sequence>
 *           <element name="DateEffectiveFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           <element name="DateEffectiveTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         </sequence>
 *       </choice>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "decisionGuid",
    "fiasHouseGuid",
    "dateEffectiveFrom",
    "dateEffectiveTo"
})
@XmlRootElement(name = "exportDecisionsOrderOfProvidingPDRequest")
public class ExportDecisionsOrderOfProvidingPDRequest
    extends BaseType
{

    /**
     * Идентификатор решения/информации о порядке представления платежных документов в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "DecisionGuid")
    protected List<String> decisionGuid;
    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     */
    @XmlElement(name = "FIASHouseGuid")
    protected List<String> fiasHouseGuid;
    /**
     * Дата вступления в силу С
     * 
     */
    @XmlElement(name = "DateEffectiveFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateEffectiveFrom;
    /**
     * Дата вступления в силу ПО
     * 
     */
    @XmlElement(name = "DateEffectiveTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateEffectiveTo;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Идентификатор решения/информации о порядке представления платежных документов в ГИС ЖКХ
     * 
     * Gets the value of the decisionGuid property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the decisionGuid property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDecisionGuid().add(newItem);
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
     *     The value of the decisionGuid property.
     */
    public List<String> getDecisionGuid() {
        if (decisionGuid == null) {
            decisionGuid = new ArrayList<>();
        }
        return this.decisionGuid;
    }

    /**
     * Глобальный уникальный идентификатор дома по ФИАС
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
     * Дата вступления в силу С
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateEffectiveFrom() {
        return dateEffectiveFrom;
    }

    /**
     * Sets the value of the dateEffectiveFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDateEffectiveFrom()
     */
    public void setDateEffectiveFrom(XMLGregorianCalendar value) {
        this.dateEffectiveFrom = value;
    }

    /**
     * Дата вступления в силу ПО
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateEffectiveTo() {
        return dateEffectiveTo;
    }

    /**
     * Sets the value of the dateEffectiveTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDateEffectiveTo()
     */
    public void setDateEffectiveTo(XMLGregorianCalendar value) {
        this.dateEffectiveTo = value;
    }

    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVersion()
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
