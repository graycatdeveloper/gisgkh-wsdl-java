
package ru.gosuslugi.dom.schema.integration.organizations_registry_common;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения об объектах из заявок на делегирование прав
 * 
 * <p>Java class for ObjectsDelegatedAccessRightType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ObjectsDelegatedAccessRightType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AccessRightGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <choice>
 *           <element name="ObjectInfo" maxOccurs="unbounded">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="ObjectGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                     <element name="Type" minOccurs="0">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <maxLength value="1000"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="AllObjects" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectsDelegatedAccessRightType", propOrder = {
    "accessRightGUID",
    "objectInfo",
    "allObjects"
})
public class ObjectsDelegatedAccessRightType {

    /**
     * ИД делегированного права.
     * Можно получить в результате выполнения exportDelegatedAccess
     * 
     */
    @XmlElement(name = "AccessRightGUID", required = true)
    protected String accessRightGUID;
    /**
     * Объект доступа
     * 
     */
    @XmlElement(name = "ObjectInfo")
    protected List<ObjectsDelegatedAccessRightType.ObjectInfo> objectInfo;
    /**
     * Для всех объектов
     * 
     */
    @XmlElement(name = "AllObjects")
    protected Boolean allObjects;

    /**
     * ИД делегированного права.
     * Можно получить в результате выполнения exportDelegatedAccess
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessRightGUID() {
        return accessRightGUID;
    }

    /**
     * Sets the value of the accessRightGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAccessRightGUID()
     */
    public void setAccessRightGUID(String value) {
        this.accessRightGUID = value;
    }

    /**
     * Объект доступа
     * 
     * Gets the value of the objectInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getObjectInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectsDelegatedAccessRightType.ObjectInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the objectInfo property.
     */
    public List<ObjectsDelegatedAccessRightType.ObjectInfo> getObjectInfo() {
        if (objectInfo == null) {
            objectInfo = new ArrayList<>();
        }
        return this.objectInfo;
    }

    /**
     * Для всех объектов
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllObjects() {
        return allObjects;
    }

    /**
     * Sets the value of the allObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAllObjects()
     */
    public void setAllObjects(Boolean value) {
        this.allObjects = value;
    }


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
     *         <element name="ObjectGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="Type" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <maxLength value="1000"/>
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
    @XmlType(name = "", propOrder = {
        "objectGUID",
        "type"
    })
    public static class ObjectInfo {

        /**
         * Перечень объектов
         * 
         */
        @XmlElement(name = "ObjectGUID", required = true)
        protected String objectGUID;
        /**
         * Тип объекта
         * 
         */
        @XmlElement(name = "Type")
        protected String type;

        /**
         * Перечень объектов
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObjectGUID() {
            return objectGUID;
        }

        /**
         * Sets the value of the objectGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getObjectGUID()
         */
        public void setObjectGUID(String value) {
            this.objectGUID = value;
        }

        /**
         * Тип объекта
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

    }

}
