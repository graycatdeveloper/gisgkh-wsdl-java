
package ru.gosuslugi.dom.schema.integration.organizations_registry_common;

import java.util.ArrayList;
import java.util.List;
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
 *         <element name="AccessRequestGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="1000"/>
 *         <sequence>
 *           <element name="Page" minOccurs="0">
 *             <simpleType>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                 <minInclusive value="1"/>
 *               </restriction>
 *             </simpleType>
 *           </element>
 *           <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-common/}AccessRequestStatus" minOccurs="0"/>
 *         </sequence>
 *       </choice>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.2.0.1""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accessRequestGUID",
    "page",
    "status"
})
@XmlRootElement(name = "exportDelegatedAccessRequest")
public class ExportDelegatedAccessRequest
    extends BaseType
{

    /**
     * ИД заявки
     * 
     */
    @XmlElement(name = "AccessRequestGUID")
    protected List<String> accessRequestGUID;
    /**
     * Страница выборки. Возвращается по 100 элементов.
     * 
     */
    @XmlElement(name = "Page")
    protected Integer page;
    /**
     * Статус заявки:
     * Created – Создана
     * Accepted – Принята
     * Declined - Отклонена
     * Revoked - Отозвана
     * Annuled - Аннулирована
     * Closed - Закрыта
     * Preset– Предзаполнена
     * Waiting_approval - На утверждении
     * 
     */
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected AccessRequestStatus status;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * ИД заявки
     * 
     * Gets the value of the accessRequestGUID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessRequestGUID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAccessRequestGUID().add(newItem);
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
     *     The value of the accessRequestGUID property.
     */
    public List<String> getAccessRequestGUID() {
        if (accessRequestGUID == null) {
            accessRequestGUID = new ArrayList<>();
        }
        return this.accessRequestGUID;
    }

    /**
     * Страница выборки. Возвращается по 100 элементов.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getPage()
     */
    public void setPage(Integer value) {
        this.page = value;
    }

    /**
     * Статус заявки:
     * Created – Создана
     * Accepted – Принята
     * Declined - Отклонена
     * Revoked - Отозвана
     * Annuled - Аннулирована
     * Closed - Закрыта
     * Preset– Предзаполнена
     * Waiting_approval - На утверждении
     * 
     * @return
     *     possible object is
     *     {@link AccessRequestStatus }
     *     
     */
    public AccessRequestStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessRequestStatus }
     *     
     * @see #getStatus()
     */
    public void setStatus(AccessRequestStatus value) {
        this.status = value;
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
            return "11.2.0.1";
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
