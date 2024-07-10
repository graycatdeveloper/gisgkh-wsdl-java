
package ru.gosuslugi.dom.schema.integration.house_management;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Сведения о коммунальном ресурсе ПУ (электроэнергия, тепловая энергия, газ, горячая вода, холодная вода, сточные бытовые воды)
 * 
 * <p>Java class for DeviceMunicipalResourceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DeviceMunicipalResourceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MunicipalResource" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="Unit" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="112"/>
 *               <enumeration value="113"/>
 *               <enumeration value="233"/>
 *               <enumeration value="245"/>
 *               <enumeration value="246"/>
 *               <enumeration value="271"/>
 *               <enumeration value="A056"/>
 *               <enumeration value="A058"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="TariffCount" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               <minInclusive value="1"/>
 *               <maxInclusive value="3"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="TransformationRatio" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <fractionDigits value="4"/>
 *               <minExclusive value="0"/>
 *               <maxInclusive value="9999999999.9999"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceMunicipalResourceType", propOrder = {
    "municipalResource",
    "unit",
    "tariffCount",
    "transformationRatio"
})
public class DeviceMunicipalResourceType {

    /**
     * Коммунальный ресурс (электроэнергия, тепловая энергия, газ, горячая вода, холодная вода, сточные бытовые воды)  (НСИ 2)
     * 
     */
    @XmlElement(name = "MunicipalResource", required = true)
    protected NsiRef municipalResource;
    /**
     * Код единицы измерения показаний ПУ по КР
     * 
     */
    @XmlElement(name = "Unit")
    protected String unit;
    /**
     * Количество тарифов ПУ (1, 2 или 3). Заполняется только для КР - электроэнергия
     * 
     */
    @XmlElement(name = "TariffCount")
    protected Integer tariffCount;
    /**
     * Коэффициент трансформации. Может заполняться только для КР электроэнергия
     * 
     */
    @XmlElement(name = "TransformationRatio")
    protected BigDecimal transformationRatio;

    /**
     * Коммунальный ресурс (электроэнергия, тепловая энергия, газ, горячая вода, холодная вода, сточные бытовые воды)  (НСИ 2)
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getMunicipalResource() {
        return municipalResource;
    }

    /**
     * Sets the value of the municipalResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getMunicipalResource()
     */
    public void setMunicipalResource(NsiRef value) {
        this.municipalResource = value;
    }

    /**
     * Код единицы измерения показаний ПУ по КР
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUnit()
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Количество тарифов ПУ (1, 2 или 3). Заполняется только для КР - электроэнергия
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTariffCount() {
        return tariffCount;
    }

    /**
     * Sets the value of the tariffCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getTariffCount()
     */
    public void setTariffCount(Integer value) {
        this.tariffCount = value;
    }

    /**
     * Коэффициент трансформации. Может заполняться только для КР электроэнергия
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransformationRatio() {
        return transformationRatio;
    }

    /**
     * Sets the value of the transformationRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTransformationRatio()
     */
    public void setTransformationRatio(BigDecimal value) {
        this.transformationRatio = value;
    }

}
