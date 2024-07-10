
package ru.gosuslugi.dom.schema.integration.base;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MessageGUIDList" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="10000"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "messageGUIDList"
})
@XmlRootElement(name = "getRequestsStateRequest")
public class GetRequestsStateRequest {

    /**
     * Массив идентификаторов сообщений, присвоенных ГИС ЖКХ
     * 
     */
    @XmlElement(name = "MessageGUIDList", required = true)
    protected List<String> messageGUIDList;

    /**
     * Массив идентификаторов сообщений, присвоенных ГИС ЖКХ
     * 
     * Gets the value of the messageGUIDList property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageGUIDList property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMessageGUIDList().add(newItem);
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
     *     The value of the messageGUIDList property.
     */
    public List<String> getMessageGUIDList() {
        if (messageGUIDList == null) {
            messageGUIDList = new ArrayList<>();
        }
        return this.messageGUIDList;
    }

}
