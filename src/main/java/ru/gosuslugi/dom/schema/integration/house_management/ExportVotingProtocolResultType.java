
package ru.gosuslugi.dom.schema.integration.house_management;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Ответ на запрос экспорта протоколов ОСС
 * 
 * <p>Java class for exportVotingProtocolResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportVotingProtocolResultType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ProtocolExportType">
 *       <sequence>
 *         <element name="StatusProtocol">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="Created"/>
 *               <enumeration value="Posted"/>
 *               <enumeration value="Edited"/>
 *               <enumeration value="Annuled"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="VotingProtocolGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="RootProtocolGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <element name="StatusVersionProtocol">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="Created"/>
 *               <enumeration value="Posted"/>
 *               <enumeration value="Edited"/>
 *               <enumeration value="Annuled"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="VersionNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="VersionDateModification" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="VersionDatePlacement" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportVotingProtocolResultType", propOrder = {
    "statusProtocol",
    "votingProtocolGUID",
    "rootProtocolGUID",
    "statusVersionProtocol",
    "versionNumber",
    "versionDateModification",
    "versionDatePlacement"
})
public class ExportVotingProtocolResultType
    extends ProtocolExportType
{

    /**
     * Статус протокола ОСС
     * Допустимые значения:
     * -Created-создан
     * -Posted-Размещен
     * -Edited-На изменении
     * -Annuled-Аннулирован
     * 
     */
    @XmlElement(name = "StatusProtocol", required = true)
    protected String statusProtocol;
    /**
     * Идентификатор версии протокола голосования
     * 
     */
    @XmlElement(name = "VotingProtocolGUID", required = true)
    protected String votingProtocolGUID;
    /**
     * Корневой идентификатор протокола голосования
     * 
     */
    @XmlElement(name = "RootProtocolGUID")
    protected String rootProtocolGUID;
    /**
     * Статус версии протокола ОСС
     * Допустимые значения:
     * -Created-создан
     * -Posted-Размещен
     * -Edited-На изменении
     * -Annuled-Аннулирован
     * 
     */
    @XmlElement(name = "StatusVersionProtocol", required = true)
    protected String statusVersionProtocol;
    /**
     * Номер версии протокола
     * 
     */
    @XmlElement(name = "VersionNumber")
    protected int versionNumber;
    /**
     * Дата и время последнего изменения версии протокола
     * 
     */
    @XmlElement(name = "VersionDateModification")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar versionDateModification;
    /**
     * Дата и время размещения версии протокола
     * 
     */
    @XmlElement(name = "VersionDatePlacement")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar versionDatePlacement;

    /**
     * Статус протокола ОСС
     * Допустимые значения:
     * -Created-создан
     * -Posted-Размещен
     * -Edited-На изменении
     * -Annuled-Аннулирован
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusProtocol() {
        return statusProtocol;
    }

    /**
     * Sets the value of the statusProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStatusProtocol()
     */
    public void setStatusProtocol(String value) {
        this.statusProtocol = value;
    }

    /**
     * Идентификатор версии протокола голосования
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVotingProtocolGUID() {
        return votingProtocolGUID;
    }

    /**
     * Sets the value of the votingProtocolGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVotingProtocolGUID()
     */
    public void setVotingProtocolGUID(String value) {
        this.votingProtocolGUID = value;
    }

    /**
     * Корневой идентификатор протокола голосования
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootProtocolGUID() {
        return rootProtocolGUID;
    }

    /**
     * Sets the value of the rootProtocolGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRootProtocolGUID()
     */
    public void setRootProtocolGUID(String value) {
        this.rootProtocolGUID = value;
    }

    /**
     * Статус версии протокола ОСС
     * Допустимые значения:
     * -Created-создан
     * -Posted-Размещен
     * -Edited-На изменении
     * -Annuled-Аннулирован
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusVersionProtocol() {
        return statusVersionProtocol;
    }

    /**
     * Sets the value of the statusVersionProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStatusVersionProtocol()
     */
    public void setStatusVersionProtocol(String value) {
        this.statusVersionProtocol = value;
    }

    /**
     * Номер версии протокола
     * 
     */
    public int getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     */
    public void setVersionNumber(int value) {
        this.versionNumber = value;
    }

    /**
     * Дата и время последнего изменения версии протокола
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVersionDateModification() {
        return versionDateModification;
    }

    /**
     * Sets the value of the versionDateModification property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getVersionDateModification()
     */
    public void setVersionDateModification(XMLGregorianCalendar value) {
        this.versionDateModification = value;
    }

    /**
     * Дата и время размещения версии протокола
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVersionDatePlacement() {
        return versionDatePlacement;
    }

    /**
     * Sets the value of the versionDatePlacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getVersionDatePlacement()
     */
    public void setVersionDatePlacement(XMLGregorianCalendar value) {
        this.versionDatePlacement = value;
    }

}
