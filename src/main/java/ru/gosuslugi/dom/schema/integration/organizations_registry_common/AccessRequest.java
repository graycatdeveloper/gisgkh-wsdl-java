
package ru.gosuslugi.dom.schema.integration.organizations_registry_common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Заявка на предоставление доступа
 * 
 * <p>Java class for AccessRequest complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AccessRequest">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AccessRequestGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="Type" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-common/}AccessRequestType"/>
 *         <element name="ApplicationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-common/}AccessRequestStatus"/>
 *         <element name="StatusChangeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="StatusReason" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="1000"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="DelegatedAccessRight" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="AccessRightGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="TerritoryInfo">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <choice>
 *                             <element name="AllTerritories" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             <element name="ExistListOfTerritory" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                           </choice>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="ObjectInfo">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <choice>
 *                             <element name="AllObjects" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             <element name="ExistListOfObjects" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                           </choice>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="IsActual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   <element name="InformationType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="unbounded"/>
 *                 </sequence>
 *               </restriction>
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
@XmlType(name = "AccessRequest", propOrder = {
    "accessRequestGUID",
    "type",
    "applicationDate",
    "startDate",
    "endDate",
    "status",
    "statusChangeDate",
    "statusReason",
    "delegatedAccessRight"
})
public class AccessRequest {

    /**
     * ИД заявки
     * 
     */
    @XmlElement(name = "AccessRequestGUID", required = true)
    protected String accessRequestGUID;
    /**
     * Тип заявки
     * 
     */
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected AccessRequestType type;
    /**
     * Дата подачи
     * 
     */
    @XmlElement(name = "ApplicationDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar applicationDate;
    /**
     * Дата начала
     * 
     */
    @XmlElement(name = "StartDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    /**
     * Дата окончания
     * 
     */
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
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
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected AccessRequestStatus status;
    /**
     * Дата статуса
     * 
     */
    @XmlElement(name = "StatusChangeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar statusChangeDate;
    /**
     * Причина статуса
     * 
     */
    @XmlElement(name = "StatusReason")
    protected String statusReason;
    /**
     * Делегированное право доступа
     * 
     */
    @XmlElement(name = "DelegatedAccessRight")
    protected List<AccessRequest.DelegatedAccessRight> delegatedAccessRight;

    /**
     * ИД заявки
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessRequestGUID() {
        return accessRequestGUID;
    }

    /**
     * Sets the value of the accessRequestGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAccessRequestGUID()
     */
    public void setAccessRequestGUID(String value) {
        this.accessRequestGUID = value;
    }

    /**
     * Тип заявки
     * 
     * @return
     *     possible object is
     *     {@link AccessRequestType }
     *     
     */
    public AccessRequestType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessRequestType }
     *     
     * @see #getType()
     */
    public void setType(AccessRequestType value) {
        this.type = value;
    }

    /**
     * Дата подачи
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplicationDate() {
        return applicationDate;
    }

    /**
     * Sets the value of the applicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getApplicationDate()
     */
    public void setApplicationDate(XMLGregorianCalendar value) {
        this.applicationDate = value;
    }

    /**
     * Дата начала
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getStartDate()
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Дата окончания
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEndDate()
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
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
     * Дата статуса
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusChangeDate() {
        return statusChangeDate;
    }

    /**
     * Sets the value of the statusChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getStatusChangeDate()
     */
    public void setStatusChangeDate(XMLGregorianCalendar value) {
        this.statusChangeDate = value;
    }

    /**
     * Причина статуса
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusReason() {
        return statusReason;
    }

    /**
     * Sets the value of the statusReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStatusReason()
     */
    public void setStatusReason(String value) {
        this.statusReason = value;
    }

    /**
     * Делегированное право доступа
     * 
     * Gets the value of the delegatedAccessRight property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the delegatedAccessRight property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDelegatedAccessRight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessRequest.DelegatedAccessRight }
     * </p>
     * 
     * 
     * @return
     *     The value of the delegatedAccessRight property.
     */
    public List<AccessRequest.DelegatedAccessRight> getDelegatedAccessRight() {
        if (delegatedAccessRight == null) {
            delegatedAccessRight = new ArrayList<>();
        }
        return this.delegatedAccessRight;
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
     *         <element name="AccessRightGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="TerritoryInfo">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <choice>
     *                   <element name="AllTerritories" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   <element name="ExistListOfTerritory" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                 </choice>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="ObjectInfo">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <choice>
     *                   <element name="AllObjects" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   <element name="ExistListOfObjects" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                 </choice>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="IsActual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         <element name="InformationType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="unbounded"/>
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
        "accessRightGUID",
        "territoryInfo",
        "objectInfo",
        "isActual",
        "informationType"
    })
    public static class DelegatedAccessRight {

        /**
         * ИД делегированного права
         * 
         */
        @XmlElement(name = "AccessRightGUID", required = true)
        protected String accessRightGUID;
        /**
         * Территориальная принадлежность
         * 
         */
        @XmlElement(name = "TerritoryInfo", required = true)
        protected AccessRequest.DelegatedAccessRight.TerritoryInfo territoryInfo;
        /**
         * Объекты доступа
         * 
         */
        @XmlElement(name = "ObjectInfo", required = true)
        protected AccessRequest.DelegatedAccessRight.ObjectInfo objectInfo;
        /**
         * Признак актуальности
         * 
         */
        @XmlElement(name = "IsActual")
        protected boolean isActual;
        /**
         * Код из справочника 291 - "Виды информации"
         * 
         */
        @XmlElement(name = "InformationType", required = true)
        protected List<NsiRef> informationType;

        /**
         * ИД делегированного права
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
         * Территориальная принадлежность
         * 
         * @return
         *     possible object is
         *     {@link AccessRequest.DelegatedAccessRight.TerritoryInfo }
         *     
         */
        public AccessRequest.DelegatedAccessRight.TerritoryInfo getTerritoryInfo() {
            return territoryInfo;
        }

        /**
         * Sets the value of the territoryInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link AccessRequest.DelegatedAccessRight.TerritoryInfo }
         *     
         * @see #getTerritoryInfo()
         */
        public void setTerritoryInfo(AccessRequest.DelegatedAccessRight.TerritoryInfo value) {
            this.territoryInfo = value;
        }

        /**
         * Объекты доступа
         * 
         * @return
         *     possible object is
         *     {@link AccessRequest.DelegatedAccessRight.ObjectInfo }
         *     
         */
        public AccessRequest.DelegatedAccessRight.ObjectInfo getObjectInfo() {
            return objectInfo;
        }

        /**
         * Sets the value of the objectInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link AccessRequest.DelegatedAccessRight.ObjectInfo }
         *     
         * @see #getObjectInfo()
         */
        public void setObjectInfo(AccessRequest.DelegatedAccessRight.ObjectInfo value) {
            this.objectInfo = value;
        }

        /**
         * Признак актуальности
         * 
         */
        public boolean isIsActual() {
            return isActual;
        }

        /**
         * Sets the value of the isActual property.
         * 
         */
        public void setIsActual(boolean value) {
            this.isActual = value;
        }

        /**
         * Код из справочника 291 - "Виды информации"
         * 
         * Gets the value of the informationType property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the informationType property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getInformationType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NsiRef }
         * </p>
         * 
         * 
         * @return
         *     The value of the informationType property.
         */
        public List<NsiRef> getInformationType() {
            if (informationType == null) {
                informationType = new ArrayList<>();
            }
            return this.informationType;
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
         *       <choice>
         *         <element name="AllObjects" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         <element name="ExistListOfObjects" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *       </choice>
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "allObjects",
            "existListOfObjects"
        })
        public static class ObjectInfo {

            /**
             * Для всех объектов
             * 
             */
            @XmlElement(name = "AllObjects")
            protected Boolean allObjects;
            /**
             * если = "true", то по виду информации имеется список объектов, по которым предоставлен доступ. Для получения списка можно воспользоваться запросом exportObjectsDelegatedAccess
             * 
             */
            @XmlElement(name = "ExistListOfObjects")
            protected Boolean existListOfObjects;

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
             * если = "true", то по виду информации имеется список объектов, по которым предоставлен доступ. Для получения списка можно воспользоваться запросом exportObjectsDelegatedAccess
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isExistListOfObjects() {
                return existListOfObjects;
            }

            /**
             * Sets the value of the existListOfObjects property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isExistListOfObjects()
             */
            public void setExistListOfObjects(Boolean value) {
                this.existListOfObjects = value;
            }

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
         *       <choice>
         *         <element name="AllTerritories" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         <element name="ExistListOfTerritory" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *       </choice>
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "allTerritories",
            "existListOfTerritory"
        })
        public static class TerritoryInfo {

            /**
             * Для всех территорий
             * 
             */
            @XmlElement(name = "AllTerritories")
            protected Boolean allTerritories;
            /**
             * если = "true", то по виду информации имеется список территорий, по которым предоставлен доступ. Для получения списка можно воспользоваться запросом exportTerritoryDelegatedAccess
             * 
             */
            @XmlElement(name = "ExistListOfTerritory")
            protected Boolean existListOfTerritory;

            /**
             * Для всех территорий
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isAllTerritories() {
                return allTerritories;
            }

            /**
             * Sets the value of the allTerritories property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isAllTerritories()
             */
            public void setAllTerritories(Boolean value) {
                this.allTerritories = value;
            }

            /**
             * если = "true", то по виду информации имеется список территорий, по которым предоставлен доступ. Для получения списка можно воспользоваться запросом exportTerritoryDelegatedAccess
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isExistListOfTerritory() {
                return existListOfTerritory;
            }

            /**
             * Sets the value of the existListOfTerritory property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isExistListOfTerritory()
             */
            public void setExistListOfTerritory(Boolean value) {
                this.existListOfTerritory = value;
            }

        }

    }

}
