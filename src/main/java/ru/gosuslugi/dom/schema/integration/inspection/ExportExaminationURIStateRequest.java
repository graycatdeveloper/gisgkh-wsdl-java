
package ru.gosuslugi.dom.schema.integration.inspection;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *         <element name="ExaminationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="1000"/>
 *         <element name="URIRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="1000"/>
 *       </choice>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.1.0.8""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "examinationGuid",
    "uriRegistrationNumber"
})
@XmlRootElement(name = "exportExaminationURIStateRequest")
public class ExportExaminationURIStateRequest
    extends BaseType
{

    /**
     * Идентификатор проверки в ГИС ЖКХ.
     * 
     */
    @XmlElement(name = "ExaminationGuid")
    protected List<String> examinationGuid;
    /**
     * Учетный номер проверки в ЕРП.
     * 
     */
    @XmlElement(name = "URIRegistrationNumber")
    protected List<String> uriRegistrationNumber;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Идентификатор проверки в ГИС ЖКХ.
     * 
     * Gets the value of the examinationGuid property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examinationGuid property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExaminationGuid().add(newItem);
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
     *     The value of the examinationGuid property.
     */
    public List<String> getExaminationGuid() {
        if (examinationGuid == null) {
            examinationGuid = new ArrayList<>();
        }
        return this.examinationGuid;
    }

    /**
     * Учетный номер проверки в ЕРП.
     * 
     * Gets the value of the uriRegistrationNumber property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uriRegistrationNumber property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getURIRegistrationNumber().add(newItem);
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
     *     The value of the uriRegistrationNumber property.
     */
    public List<String> getURIRegistrationNumber() {
        if (uriRegistrationNumber == null) {
            uriRegistrationNumber = new ArrayList<>();
        }
        return this.uriRegistrationNumber;
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
            return "11.1.0.8";
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
