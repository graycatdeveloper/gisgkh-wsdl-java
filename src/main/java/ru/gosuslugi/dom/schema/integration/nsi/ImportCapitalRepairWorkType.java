
package ru.gosuslugi.dom.schema.integration.nsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Элемент справочника виды работ капитального ремонта.
 * 
 * <p>Java class for ImportCapitalRepairWorkType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ImportCapitalRepairWorkType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <sequence>
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *           <element name="ElementGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         </sequence>
 *         <element name="ServiceName" type="{http://dom.gosuslugi.ru/schema/integration/base/}String500Type"/>
 *         <element name="WorkGroupRef" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportCapitalRepairWorkType", propOrder = {
    "transportGUID",
    "elementGuid",
    "serviceName",
    "workGroupRef"
})
public class ImportCapitalRepairWorkType {

    /**
     * Транспортный идентификатор
     * 
     */
    @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String transportGUID;
    /**
     * Идентификатор существующего элемента справочника.
     * 
     */
    @XmlElement(name = "ElementGuid")
    protected String elementGuid;
    /**
     * Наименование вида работ
     * 
     */
    @XmlElement(name = "ServiceName", required = true)
    protected String serviceName;
    /**
     * Ссылка на НСИ "Группа работ" (реестровый номер 218).
     * 
     */
    @XmlElement(name = "WorkGroupRef", required = true)
    protected NsiRef workGroupRef;

    /**
     * Транспортный идентификатор
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportGUID() {
        return transportGUID;
    }

    /**
     * Sets the value of the transportGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTransportGUID()
     */
    public void setTransportGUID(String value) {
        this.transportGUID = value;
    }

    /**
     * Идентификатор существующего элемента справочника.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementGuid() {
        return elementGuid;
    }

    /**
     * Sets the value of the elementGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getElementGuid()
     */
    public void setElementGuid(String value) {
        this.elementGuid = value;
    }

    /**
     * Наименование вида работ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getServiceName()
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Ссылка на НСИ "Группа работ" (реестровый номер 218).
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getWorkGroupRef() {
        return workGroupRef;
    }

    /**
     * Sets the value of the workGroupRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getWorkGroupRef()
     */
    public void setWorkGroupRef(NsiRef value) {
        this.workGroupRef = value;
    }

}
