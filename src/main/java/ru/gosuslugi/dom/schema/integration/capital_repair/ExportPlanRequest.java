
package ru.gosuslugi.dom.schema.integration.capital_repair;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;
import ru.gosuslugi.dom.schema.integration.base.OKTMORefType;


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
 *         <element name="PlanGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <sequence>
 *           <element name="Type">
 *             <simpleType>
 *               <restriction base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}String50Type">
 *                 <enumeration value="Plan"/>
 *                 <enumeration value="MunicipalAddressProgram"/>
 *                 <enumeration value="RegionalAddressProgram"/>
 *               </restriction>
 *             </simpleType>
 *           </element>
 *           <element name="Territory" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType"/>
 *         </sequence>
 *       </choice>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.2.0.10""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "planGuid",
    "type",
    "territory"
})
@XmlRootElement(name = "exportPlanRequest")
public class ExportPlanRequest
    extends BaseType
{

    /**
     * Идентификатор программы/плана в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "PlanGuid")
    protected String planGuid;
    /**
     * Вид программы, Plan - КПР, MunicipalAddressProgram - МАПКР, RegionalAddressProgram - РАПКР
     * 
     */
    @XmlElement(name = "Type")
    protected String type;
    /**
     * Территория реализации программы/плана. Для регионального КПР и РАПКР должно быть прислано ОКТМО уровня региона. Для муниципального КПР и МАПКР должно быть прислано ОКТМО уровня муниципального образования.
     * 
     */
    @XmlElement(name = "Territory")
    protected OKTMORefType territory;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Идентификатор программы/плана в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanGuid() {
        return planGuid;
    }

    /**
     * Sets the value of the planGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPlanGuid()
     */
    public void setPlanGuid(String value) {
        this.planGuid = value;
    }

    /**
     * Вид программы, Plan - КПР, MunicipalAddressProgram - МАПКР, RegionalAddressProgram - РАПКР
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
     * Территория реализации программы/плана. Для регионального КПР и РАПКР должно быть прислано ОКТМО уровня региона. Для муниципального КПР и МАПКР должно быть прислано ОКТМО уровня муниципального образования.
     * 
     * @return
     *     possible object is
     *     {@link OKTMORefType }
     *     
     */
    public OKTMORefType getTerritory() {
        return territory;
    }

    /**
     * Sets the value of the territory property.
     * 
     * @param value
     *     allowed object is
     *     {@link OKTMORefType }
     *     
     * @see #getTerritory()
     */
    public void setTerritory(OKTMORefType value) {
        this.territory = value;
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
        if (version == null) {
            return "11.2.0.10";
        } else {
            return version;
        }
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
