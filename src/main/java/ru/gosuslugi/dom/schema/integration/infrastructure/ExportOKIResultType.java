
package ru.gosuslugi.dom.schema.integration.infrastructure;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Ответ на экспорт ОКИ
 * 
 * <p>Java class for exportOKIResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportOKIResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OKIGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="CodeOKI" type="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}CodeOKIType"/>
 *         <element name="OKI">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}InfrastructureType">
 *               </extension>
 *             </complexContent>
 *           </complexType>
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
@XmlType(name = "exportOKIResultType", propOrder = {
    "okiGuid",
    "codeOKI",
    "oki"
})
public class ExportOKIResultType {

    /**
     * Идентификатор ОКИ
     * 
     */
    @XmlElement(name = "OKIGuid", required = true)
    protected String okiGuid;
    /**
     * Реестровый номер в РКИ
     * 
     */
    @XmlElement(name = "CodeOKI", required = true)
    protected String codeOKI;
    /**
     * ОКИ
     * 
     */
    @XmlElement(name = "OKI", required = true)
    protected ExportOKIResultType.OKI oki;

    /**
     * Идентификатор ОКИ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKIGuid() {
        return okiGuid;
    }

    /**
     * Sets the value of the okiGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOKIGuid()
     */
    public void setOKIGuid(String value) {
        this.okiGuid = value;
    }

    /**
     * Реестровый номер в РКИ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeOKI() {
        return codeOKI;
    }

    /**
     * Sets the value of the codeOKI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCodeOKI()
     */
    public void setCodeOKI(String value) {
        this.codeOKI = value;
    }

    /**
     * ОКИ
     * 
     * @return
     *     possible object is
     *     {@link ExportOKIResultType.OKI }
     *     
     */
    public ExportOKIResultType.OKI getOKI() {
        return oki;
    }

    /**
     * Sets the value of the oki property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportOKIResultType.OKI }
     *     
     * @see #getOKI()
     */
    public void setOKI(ExportOKIResultType.OKI value) {
        this.oki = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}InfrastructureType">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OKI
        extends InfrastructureType
    {


    }

}
