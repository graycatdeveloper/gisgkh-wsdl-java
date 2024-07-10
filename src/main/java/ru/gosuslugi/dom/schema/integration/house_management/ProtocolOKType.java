
package ru.gosuslugi.dom.schema.integration.house_management;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;


/**
 * <p>Java class for ProtocolOKType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ProtocolOKType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ProtocolGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
 *         <element name="AttachmentProtocol" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtocolOKType", propOrder = {
    "protocolGUID",
    "attachmentProtocol"
})
public class ProtocolOKType {

    /**
     * Идентификатор в ГИС ЖКХ (ссылка на подсистему голосования)
     * 
     */
    @XmlElement(name = "ProtocolGUID", required = true)
    protected List<String> protocolGUID;
    /**
     * Приложенный документ
     * 
     */
    @XmlElement(name = "AttachmentProtocol")
    protected List<AttachmentType> attachmentProtocol;

    /**
     * Идентификатор в ГИС ЖКХ (ссылка на подсистему голосования)
     * 
     * Gets the value of the protocolGUID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the protocolGUID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getProtocolGUID().add(newItem);
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
     *     The value of the protocolGUID property.
     */
    public List<String> getProtocolGUID() {
        if (protocolGUID == null) {
            protocolGUID = new ArrayList<>();
        }
        return this.protocolGUID;
    }

    /**
     * Приложенный документ
     * 
     * Gets the value of the attachmentProtocol property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentProtocol property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAttachmentProtocol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentType }
     * </p>
     * 
     * 
     * @return
     *     The value of the attachmentProtocol property.
     */
    public List<AttachmentType> getAttachmentProtocol() {
        if (attachmentProtocol == null) {
            attachmentProtocol = new ArrayList<>();
        }
        return this.attachmentProtocol;
    }

}
