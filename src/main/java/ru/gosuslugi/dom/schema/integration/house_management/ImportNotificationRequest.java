
package ru.gosuslugi.dom.schema.integration.house_management;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseType">
 *       <sequence>
 *         <element name="notification" maxOccurs="100">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <sequence>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                     <element name="NotificationGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                   </sequence>
 *                   <choice>
 *                     <element name="Create">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <choice>
 *                                 <element name="Topic">
 *                                   <simpleType>
 *                                     <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
 *                                       <maxLength value="200"/>
 *                                       <minLength value="1"/>
 *                                     </restriction>
 *                                   </simpleType>
 *                                 </element>
 *                                 <element name="TopicNSIRef" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                               </choice>
 *                               <element name="IsImportant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                               <element name="content" minOccurs="0">
 *                                 <simpleType>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     <minLength value="1"/>
 *                                     <maxLength value="5000"/>
 *                                   </restriction>
 *                                 </simpleType>
 *                               </element>
 *                               <choice>
 *                                 <element name="IsAll" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                 <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
 *                                 <element name="RoomOwners">
 *                                   <complexType>
 *                                     <complexContent>
 *                                       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         <choice>
 *                                           <element name="DeptsInforming">
 *                                             <complexType>
 *                                               <complexContent>
 *                                                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                   <sequence>
 *                                                     <element name="Account" maxOccurs="unbounded">
 *                                                       <complexType>
 *                                                         <complexContent>
 *                                                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                             <sequence>
 *                                                               <element name="TotalDebt" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}MoneyPositiveType"/>
 *                                                               <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}UnifiedAccountNumber"/>
 *                                                             </sequence>
 *                                                           </restriction>
 *                                                         </complexContent>
 *                                                       </complexType>
 *                                                     </element>
 *                                                   </sequence>
 *                                                 </restriction>
 *                                               </complexContent>
 *                                             </complexType>
 *                                           </element>
 *                                           <element name="OtherOrganizationSelection">
 *                                             <complexType>
 *                                               <complexContent>
 *                                                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                   <sequence>
 *                                                     <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
 *                                                   </sequence>
 *                                                 </restriction>
 *                                               </complexContent>
 *                                             </complexType>
 *                                           </element>
 *                                           <element name="AccountOpening">
 *                                             <complexType>
 *                                               <complexContent>
 *                                                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                   <sequence>
 *                                                     <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
 *                                                   </sequence>
 *                                                 </restriction>
 *                                               </complexContent>
 *                                             </complexType>
 *                                           </element>
 *                                         </choice>
 *                                       </restriction>
 *                                     </complexContent>
 *                                   </complexType>
 *                                 </element>
 *                                 <element name="SpecialAccountOwner" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType" maxOccurs="unbounded"/>
 *                                 <element name="InspectionAuthority" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType" maxOccurs="unbounded"/>
 *                               </choice>
 *                               <choice>
 *                                 <element name="IsNotLimit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                 <sequence>
 *                                   <element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                   <element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                 </sequence>
 *                               </choice>
 *                               <element name="Attachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *                               <element name="IsShipOff" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                               <element name="IsForPublishToMobileApp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                               <element name="MobileAppData" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="IsShortTopic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                         <element name="IsPin" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                         <element name="url" minOccurs="0">
 *                                           <simpleType>
 *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               <minLength value="1"/>
 *                                               <maxLength value="2000"/>
 *                                             </restriction>
 *                                           </simpleType>
 *                                         </element>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="IsShipOff" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     <element name="DeleteNotification" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DeleteDocType"/>
 *                     <element name="RecallNotification">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="RecallReason" minOccurs="0">
 *                                 <simpleType>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     <minLength value="1"/>
 *                                     <maxLength value="1000"/>
 *                                   </restriction>
 *                                 </simpleType>
 *                               </element>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "notification"
})
@XmlRootElement(name = "importNotificationRequest")
public class ImportNotificationRequest
    extends BaseType
{

    @XmlElement(required = true)
    protected List<ImportNotificationRequest.Notification> notification;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Gets the value of the notification property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notification property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNotification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportNotificationRequest.Notification }
     * </p>
     * 
     * 
     * @return
     *     The value of the notification property.
     */
    public List<ImportNotificationRequest.Notification> getNotification() {
        if (notification == null) {
            notification = new ArrayList<>();
        }
        return this.notification;
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
        return version;
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
     *         <sequence>
     *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *           <element name="NotificationGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *         </sequence>
     *         <choice>
     *           <element name="Create">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <choice>
     *                       <element name="Topic">
     *                         <simpleType>
     *                           <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
     *                             <maxLength value="200"/>
     *                             <minLength value="1"/>
     *                           </restriction>
     *                         </simpleType>
     *                       </element>
     *                       <element name="TopicNSIRef" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *                     </choice>
     *                     <element name="IsImportant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                     <element name="content" minOccurs="0">
     *                       <simpleType>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                           <minLength value="1"/>
     *                           <maxLength value="5000"/>
     *                         </restriction>
     *                       </simpleType>
     *                     </element>
     *                     <choice>
     *                       <element name="IsAll" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                       <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
     *                       <element name="RoomOwners">
     *                         <complexType>
     *                           <complexContent>
     *                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                               <choice>
     *                                 <element name="DeptsInforming">
     *                                   <complexType>
     *                                     <complexContent>
     *                                       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                         <sequence>
     *                                           <element name="Account" maxOccurs="unbounded">
     *                                             <complexType>
     *                                               <complexContent>
     *                                                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                   <sequence>
     *                                                     <element name="TotalDebt" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}MoneyPositiveType"/>
     *                                                     <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}UnifiedAccountNumber"/>
     *                                                   </sequence>
     *                                                 </restriction>
     *                                               </complexContent>
     *                                             </complexType>
     *                                           </element>
     *                                         </sequence>
     *                                       </restriction>
     *                                     </complexContent>
     *                                   </complexType>
     *                                 </element>
     *                                 <element name="OtherOrganizationSelection">
     *                                   <complexType>
     *                                     <complexContent>
     *                                       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                         <sequence>
     *                                           <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
     *                                         </sequence>
     *                                       </restriction>
     *                                     </complexContent>
     *                                   </complexType>
     *                                 </element>
     *                                 <element name="AccountOpening">
     *                                   <complexType>
     *                                     <complexContent>
     *                                       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                         <sequence>
     *                                           <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
     *                                         </sequence>
     *                                       </restriction>
     *                                     </complexContent>
     *                                   </complexType>
     *                                 </element>
     *                               </choice>
     *                             </restriction>
     *                           </complexContent>
     *                         </complexType>
     *                       </element>
     *                       <element name="SpecialAccountOwner" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType" maxOccurs="unbounded"/>
     *                       <element name="InspectionAuthority" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType" maxOccurs="unbounded"/>
     *                     </choice>
     *                     <choice>
     *                       <element name="IsNotLimit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                       <sequence>
     *                         <element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                         <element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                       </sequence>
     *                     </choice>
     *                     <element name="Attachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
     *                     <element name="IsShipOff" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                     <element name="IsForPublishToMobileApp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                     <element name="MobileAppData" minOccurs="0">
     *                       <complexType>
     *                         <complexContent>
     *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             <sequence>
     *                               <element name="IsShortTopic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                               <element name="IsPin" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                               <element name="url" minOccurs="0">
     *                                 <simpleType>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     <minLength value="1"/>
     *                                     <maxLength value="2000"/>
     *                                   </restriction>
     *                                 </simpleType>
     *                               </element>
     *                             </sequence>
     *                           </restriction>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="IsShipOff" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *           <element name="DeleteNotification" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DeleteDocType"/>
     *           <element name="RecallNotification">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="RecallReason" minOccurs="0">
     *                       <simpleType>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                           <minLength value="1"/>
     *                           <maxLength value="1000"/>
     *                         </restriction>
     *                       </simpleType>
     *                     </element>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
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
    @XmlType(name = "", propOrder = {
        "transportGUID",
        "notificationGUID",
        "create",
        "isShipOff",
        "deleteNotification",
        "recallNotification"
    })
    public static class Notification {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Идентификатор новости  в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "NotificationGUID")
        protected String notificationGUID;
        /**
         * Создание, редактирование новости
         * 
         */
        @XmlElement(name = "Create")
        protected ImportNotificationRequest.Notification.Create create;
        /**
         * Направить новость адресатам
         * 
         */
        @XmlElement(name = "IsShipOff")
        protected Boolean isShipOff;
        /**
         * Удаление  новости
         * 
         */
        @XmlElement(name = "DeleteNotification")
        protected DeleteDocType deleteNotification;
        /**
         * Отзыв новости
         * 
         */
        @XmlElement(name = "RecallNotification")
        protected ImportNotificationRequest.Notification.RecallNotification recallNotification;

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
         * Идентификатор новости  в ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNotificationGUID() {
            return notificationGUID;
        }

        /**
         * Sets the value of the notificationGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getNotificationGUID()
         */
        public void setNotificationGUID(String value) {
            this.notificationGUID = value;
        }

        /**
         * Создание, редактирование новости
         * 
         * @return
         *     possible object is
         *     {@link ImportNotificationRequest.Notification.Create }
         *     
         */
        public ImportNotificationRequest.Notification.Create getCreate() {
            return create;
        }

        /**
         * Sets the value of the create property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportNotificationRequest.Notification.Create }
         *     
         * @see #getCreate()
         */
        public void setCreate(ImportNotificationRequest.Notification.Create value) {
            this.create = value;
        }

        /**
         * Направить новость адресатам
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsShipOff() {
            return isShipOff;
        }

        /**
         * Sets the value of the isShipOff property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isIsShipOff()
         */
        public void setIsShipOff(Boolean value) {
            this.isShipOff = value;
        }

        /**
         * Удаление  новости
         * 
         * @return
         *     possible object is
         *     {@link DeleteDocType }
         *     
         */
        public DeleteDocType getDeleteNotification() {
            return deleteNotification;
        }

        /**
         * Sets the value of the deleteNotification property.
         * 
         * @param value
         *     allowed object is
         *     {@link DeleteDocType }
         *     
         * @see #getDeleteNotification()
         */
        public void setDeleteNotification(DeleteDocType value) {
            this.deleteNotification = value;
        }

        /**
         * Отзыв новости
         * 
         * @return
         *     possible object is
         *     {@link ImportNotificationRequest.Notification.RecallNotification }
         *     
         */
        public ImportNotificationRequest.Notification.RecallNotification getRecallNotification() {
            return recallNotification;
        }

        /**
         * Sets the value of the recallNotification property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportNotificationRequest.Notification.RecallNotification }
         *     
         * @see #getRecallNotification()
         */
        public void setRecallNotification(ImportNotificationRequest.Notification.RecallNotification value) {
            this.recallNotification = value;
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
         *         <choice>
         *           <element name="Topic">
         *             <simpleType>
         *               <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
         *                 <maxLength value="200"/>
         *                 <minLength value="1"/>
         *               </restriction>
         *             </simpleType>
         *           </element>
         *           <element name="TopicNSIRef" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
         *         </choice>
         *         <element name="IsImportant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         <element name="content" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <minLength value="1"/>
         *               <maxLength value="5000"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <choice>
         *           <element name="IsAll" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *           <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
         *           <element name="RoomOwners">
         *             <complexType>
         *               <complexContent>
         *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   <choice>
         *                     <element name="DeptsInforming">
         *                       <complexType>
         *                         <complexContent>
         *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             <sequence>
         *                               <element name="Account" maxOccurs="unbounded">
         *                                 <complexType>
         *                                   <complexContent>
         *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                       <sequence>
         *                                         <element name="TotalDebt" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}MoneyPositiveType"/>
         *                                         <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}UnifiedAccountNumber"/>
         *                                       </sequence>
         *                                     </restriction>
         *                                   </complexContent>
         *                                 </complexType>
         *                               </element>
         *                             </sequence>
         *                           </restriction>
         *                         </complexContent>
         *                       </complexType>
         *                     </element>
         *                     <element name="OtherOrganizationSelection">
         *                       <complexType>
         *                         <complexContent>
         *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             <sequence>
         *                               <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
         *                             </sequence>
         *                           </restriction>
         *                         </complexContent>
         *                       </complexType>
         *                     </element>
         *                     <element name="AccountOpening">
         *                       <complexType>
         *                         <complexContent>
         *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             <sequence>
         *                               <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
         *                             </sequence>
         *                           </restriction>
         *                         </complexContent>
         *                       </complexType>
         *                     </element>
         *                   </choice>
         *                 </restriction>
         *               </complexContent>
         *             </complexType>
         *           </element>
         *           <element name="SpecialAccountOwner" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType" maxOccurs="unbounded"/>
         *           <element name="InspectionAuthority" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType" maxOccurs="unbounded"/>
         *         </choice>
         *         <choice>
         *           <element name="IsNotLimit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *           <sequence>
         *             <element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *             <element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *           </sequence>
         *         </choice>
         *         <element name="Attachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
         *         <element name="IsShipOff" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         <element name="IsForPublishToMobileApp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         <element name="MobileAppData" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="IsShortTopic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                   <element name="IsPin" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                   <element name="url" minOccurs="0">
         *                     <simpleType>
         *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         <minLength value="1"/>
         *                         <maxLength value="2000"/>
         *                       </restriction>
         *                     </simpleType>
         *                   </element>
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
        @XmlType(name = "", propOrder = {
            "topic",
            "topicNSIRef",
            "isImportant",
            "content",
            "isAll",
            "fiasHouseGuid",
            "roomOwners",
            "specialAccountOwner",
            "inspectionAuthority",
            "isNotLimit",
            "startDate",
            "endDate",
            "attachment",
            "isShipOff",
            "isForPublishToMobileApp",
            "mobileAppData"
        })
        public static class Create {

            /**
             * Тема
             * 
             */
            @XmlElement(name = "Topic")
            protected String topic;
            /**
             * Тема. Указывается из справочника №364 "Темы новостных сообщений"
             * 
             */
            @XmlElement(name = "TopicNSIRef")
            protected NsiRef topicNSIRef;
            /**
             * Высокая важность новости
             * 
             */
            @XmlElement(name = "IsImportant")
            protected Boolean isImportant;
            /**
             * Текст новости
             * 
             */
            protected String content;
            /**
             * Все дома (в адресатах)
             * 
             */
            @XmlElement(name = "IsAll")
            protected Boolean isAll;
            /**
             * Глобальный уникальный идентификатор дома по ФИАС
             * 
             */
            @XmlElement(name = "FIASHouseGuid")
            protected List<String> fiasHouseGuid;
            /**
             * Собственник помещений в МКД
             * 
             */
            @XmlElement(name = "RoomOwners")
            protected ImportNotificationRequest.Notification.Create.RoomOwners roomOwners;
            /**
             * Идентификатор организации-владельца специального счета
             * 
             */
            @XmlElement(name = "SpecialAccountOwner")
            protected List<RegOrgType> specialAccountOwner;
            /**
             * Идентификатор организации-органа государственного надзора
             * 
             */
            @XmlElement(name = "InspectionAuthority")
            protected List<RegOrgType> inspectionAuthority;
            /**
             * Не ограничено
             * 
             */
            @XmlElement(name = "IsNotLimit")
            protected Boolean isNotLimit;
            /**
             * В период "С"
             * 
             */
            @XmlElement(name = "StartDate")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar startDate;
            /**
             * В период "До"
             * 
             */
            @XmlElement(name = "EndDate")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar endDate;
            /**
             * Документы новости
             * 
             */
            @XmlElement(name = "Attachment")
            protected List<AttachmentType> attachment;
            /**
             * Направить новость адресатам
             * 
             */
            @XmlElement(name = "IsShipOff")
            protected Boolean isShipOff;
            /**
             * Признак "Для публикации в мобильном приложении"
             * 
             */
            @XmlElement(name = "IsForPublishToMobileApp")
            protected Boolean isForPublishToMobileApp;
            /**
             * Информация для новости, публикуемой в мобильном приложении
             * 
             */
            @XmlElement(name = "MobileAppData")
            protected ImportNotificationRequest.Notification.Create.MobileAppData mobileAppData;

            /**
             * Тема
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTopic() {
                return topic;
            }

            /**
             * Sets the value of the topic property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getTopic()
             */
            public void setTopic(String value) {
                this.topic = value;
            }

            /**
             * Тема. Указывается из справочника №364 "Темы новостных сообщений"
             * 
             * @return
             *     possible object is
             *     {@link NsiRef }
             *     
             */
            public NsiRef getTopicNSIRef() {
                return topicNSIRef;
            }

            /**
             * Sets the value of the topicNSIRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link NsiRef }
             *     
             * @see #getTopicNSIRef()
             */
            public void setTopicNSIRef(NsiRef value) {
                this.topicNSIRef = value;
            }

            /**
             * Высокая важность новости
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsImportant() {
                return isImportant;
            }

            /**
             * Sets the value of the isImportant property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isIsImportant()
             */
            public void setIsImportant(Boolean value) {
                this.isImportant = value;
            }

            /**
             * Текст новости
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContent() {
                return content;
            }

            /**
             * Sets the value of the content property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getContent()
             */
            public void setContent(String value) {
                this.content = value;
            }

            /**
             * Все дома (в адресатах)
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsAll() {
                return isAll;
            }

            /**
             * Sets the value of the isAll property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isIsAll()
             */
            public void setIsAll(Boolean value) {
                this.isAll = value;
            }

            /**
             * Глобальный уникальный идентификатор дома по ФИАС
             * 
             * Gets the value of the fiasHouseGuid property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the fiasHouseGuid property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getFIASHouseGuid().add(newItem);
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
             *     The value of the fiasHouseGuid property.
             */
            public List<String> getFIASHouseGuid() {
                if (fiasHouseGuid == null) {
                    fiasHouseGuid = new ArrayList<>();
                }
                return this.fiasHouseGuid;
            }

            /**
             * Собственник помещений в МКД
             * 
             * @return
             *     possible object is
             *     {@link ImportNotificationRequest.Notification.Create.RoomOwners }
             *     
             */
            public ImportNotificationRequest.Notification.Create.RoomOwners getRoomOwners() {
                return roomOwners;
            }

            /**
             * Sets the value of the roomOwners property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportNotificationRequest.Notification.Create.RoomOwners }
             *     
             * @see #getRoomOwners()
             */
            public void setRoomOwners(ImportNotificationRequest.Notification.Create.RoomOwners value) {
                this.roomOwners = value;
            }

            /**
             * Идентификатор организации-владельца специального счета
             * 
             * Gets the value of the specialAccountOwner property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the specialAccountOwner property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getSpecialAccountOwner().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link RegOrgType }
             * </p>
             * 
             * 
             * @return
             *     The value of the specialAccountOwner property.
             */
            public List<RegOrgType> getSpecialAccountOwner() {
                if (specialAccountOwner == null) {
                    specialAccountOwner = new ArrayList<>();
                }
                return this.specialAccountOwner;
            }

            /**
             * Идентификатор организации-органа государственного надзора
             * 
             * Gets the value of the inspectionAuthority property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the inspectionAuthority property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getInspectionAuthority().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link RegOrgType }
             * </p>
             * 
             * 
             * @return
             *     The value of the inspectionAuthority property.
             */
            public List<RegOrgType> getInspectionAuthority() {
                if (inspectionAuthority == null) {
                    inspectionAuthority = new ArrayList<>();
                }
                return this.inspectionAuthority;
            }

            /**
             * Не ограничено
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsNotLimit() {
                return isNotLimit;
            }

            /**
             * Sets the value of the isNotLimit property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isIsNotLimit()
             */
            public void setIsNotLimit(Boolean value) {
                this.isNotLimit = value;
            }

            /**
             * В период "С"
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
             * В период "До"
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
             * Документы новости
             * 
             * Gets the value of the attachment property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the attachment property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getAttachment().add(newItem);
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
             *     The value of the attachment property.
             */
            public List<AttachmentType> getAttachment() {
                if (attachment == null) {
                    attachment = new ArrayList<>();
                }
                return this.attachment;
            }

            /**
             * Направить новость адресатам
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsShipOff() {
                return isShipOff;
            }

            /**
             * Sets the value of the isShipOff property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isIsShipOff()
             */
            public void setIsShipOff(Boolean value) {
                this.isShipOff = value;
            }

            /**
             * Признак "Для публикации в мобильном приложении"
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsForPublishToMobileApp() {
                return isForPublishToMobileApp;
            }

            /**
             * Sets the value of the isForPublishToMobileApp property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isIsForPublishToMobileApp()
             */
            public void setIsForPublishToMobileApp(Boolean value) {
                this.isForPublishToMobileApp = value;
            }

            /**
             * Информация для новости, публикуемой в мобильном приложении
             * 
             * @return
             *     possible object is
             *     {@link ImportNotificationRequest.Notification.Create.MobileAppData }
             *     
             */
            public ImportNotificationRequest.Notification.Create.MobileAppData getMobileAppData() {
                return mobileAppData;
            }

            /**
             * Sets the value of the mobileAppData property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportNotificationRequest.Notification.Create.MobileAppData }
             *     
             * @see #getMobileAppData()
             */
            public void setMobileAppData(ImportNotificationRequest.Notification.Create.MobileAppData value) {
                this.mobileAppData = value;
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
             *         <element name="IsShortTopic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *         <element name="IsPin" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *         <element name="url" minOccurs="0">
             *           <simpleType>
             *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               <minLength value="1"/>
             *               <maxLength value="2000"/>
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
                "isShortTopic",
                "isPin",
                "url"
            })
            public static class MobileAppData {

                /**
                 * Признак, что текст новости не более 500 символов
                 * 
                 */
                @XmlElement(name = "IsShortTopic")
                protected boolean isShortTopic;
                /**
                 * Признак закрепления новостного сообщения в ленте
                 * 
                 */
                @XmlElement(name = "IsPin")
                protected boolean isPin;
                /**
                 * Ссылка для перехода из подробного представления новости на произвольную web-страницу
                 * 
                 */
                protected String url;

                /**
                 * Признак, что текст новости не более 500 символов
                 * 
                 */
                public boolean isIsShortTopic() {
                    return isShortTopic;
                }

                /**
                 * Sets the value of the isShortTopic property.
                 * 
                 */
                public void setIsShortTopic(boolean value) {
                    this.isShortTopic = value;
                }

                /**
                 * Признак закрепления новостного сообщения в ленте
                 * 
                 */
                public boolean isIsPin() {
                    return isPin;
                }

                /**
                 * Sets the value of the isPin property.
                 * 
                 */
                public void setIsPin(boolean value) {
                    this.isPin = value;
                }

                /**
                 * Ссылка для перехода из подробного представления новости на произвольную web-страницу
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUrl() {
                    return url;
                }

                /**
                 * Sets the value of the url property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getUrl()
                 */
                public void setUrl(String value) {
                    this.url = value;
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
             *         <element name="DeptsInforming">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <sequence>
             *                   <element name="Account" maxOccurs="unbounded">
             *                     <complexType>
             *                       <complexContent>
             *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           <sequence>
             *                             <element name="TotalDebt" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}MoneyPositiveType"/>
             *                             <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}UnifiedAccountNumber"/>
             *                           </sequence>
             *                         </restriction>
             *                       </complexContent>
             *                     </complexType>
             *                   </element>
             *                 </sequence>
             *               </restriction>
             *             </complexContent>
             *           </complexType>
             *         </element>
             *         <element name="OtherOrganizationSelection">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <sequence>
             *                   <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
             *                 </sequence>
             *               </restriction>
             *             </complexContent>
             *           </complexType>
             *         </element>
             *         <element name="AccountOpening">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <sequence>
             *                   <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
             *                 </sequence>
             *               </restriction>
             *             </complexContent>
             *           </complexType>
             *         </element>
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
                "deptsInforming",
                "otherOrganizationSelection",
                "accountOpening"
            })
            public static class RoomOwners {

                /**
                 * Необходимость погашения задолженности
                 * 
                 */
                @XmlElement(name = "DeptsInforming")
                protected ImportNotificationRequest.Notification.Create.RoomOwners.DeptsInforming deptsInforming;
                /**
                 * Принятие решения о выборе другой кредитной организации
                 * 
                 */
                @XmlElement(name = "OtherOrganizationSelection")
                protected ImportNotificationRequest.Notification.Create.RoomOwners.OtherOrganizationSelection otherOrganizationSelection;
                /**
                 * Принятие рещшения об открытии нового специального счета
                 * 
                 */
                @XmlElement(name = "AccountOpening")
                protected ImportNotificationRequest.Notification.Create.RoomOwners.AccountOpening accountOpening;

                /**
                 * Необходимость погашения задолженности
                 * 
                 * @return
                 *     possible object is
                 *     {@link ImportNotificationRequest.Notification.Create.RoomOwners.DeptsInforming }
                 *     
                 */
                public ImportNotificationRequest.Notification.Create.RoomOwners.DeptsInforming getDeptsInforming() {
                    return deptsInforming;
                }

                /**
                 * Sets the value of the deptsInforming property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ImportNotificationRequest.Notification.Create.RoomOwners.DeptsInforming }
                 *     
                 * @see #getDeptsInforming()
                 */
                public void setDeptsInforming(ImportNotificationRequest.Notification.Create.RoomOwners.DeptsInforming value) {
                    this.deptsInforming = value;
                }

                /**
                 * Принятие решения о выборе другой кредитной организации
                 * 
                 * @return
                 *     possible object is
                 *     {@link ImportNotificationRequest.Notification.Create.RoomOwners.OtherOrganizationSelection }
                 *     
                 */
                public ImportNotificationRequest.Notification.Create.RoomOwners.OtherOrganizationSelection getOtherOrganizationSelection() {
                    return otherOrganizationSelection;
                }

                /**
                 * Sets the value of the otherOrganizationSelection property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ImportNotificationRequest.Notification.Create.RoomOwners.OtherOrganizationSelection }
                 *     
                 * @see #getOtherOrganizationSelection()
                 */
                public void setOtherOrganizationSelection(ImportNotificationRequest.Notification.Create.RoomOwners.OtherOrganizationSelection value) {
                    this.otherOrganizationSelection = value;
                }

                /**
                 * Принятие рещшения об открытии нового специального счета
                 * 
                 * @return
                 *     possible object is
                 *     {@link ImportNotificationRequest.Notification.Create.RoomOwners.AccountOpening }
                 *     
                 */
                public ImportNotificationRequest.Notification.Create.RoomOwners.AccountOpening getAccountOpening() {
                    return accountOpening;
                }

                /**
                 * Sets the value of the accountOpening property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ImportNotificationRequest.Notification.Create.RoomOwners.AccountOpening }
                 *     
                 * @see #getAccountOpening()
                 */
                public void setAccountOpening(ImportNotificationRequest.Notification.Create.RoomOwners.AccountOpening value) {
                    this.accountOpening = value;
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
                 *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
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
                    "fiasHouseGuid"
                })
                public static class AccountOpening {

                    /**
                     * Глобальный уникальный идентификатор дома по ФИАС
                     * 
                     */
                    @XmlElement(name = "FIASHouseGuid", required = true)
                    protected List<String> fiasHouseGuid;

                    /**
                     * Глобальный уникальный идентификатор дома по ФИАС
                     * 
                     * Gets the value of the fiasHouseGuid property.
                     * 
                     * <p>This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the fiasHouseGuid property.</p>
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * </p>
                     * <pre>
                     * getFIASHouseGuid().add(newItem);
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
                     *     The value of the fiasHouseGuid property.
                     */
                    public List<String> getFIASHouseGuid() {
                        if (fiasHouseGuid == null) {
                            fiasHouseGuid = new ArrayList<>();
                        }
                        return this.fiasHouseGuid;
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
                 *       <sequence>
                 *         <element name="Account" maxOccurs="unbounded">
                 *           <complexType>
                 *             <complexContent>
                 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 <sequence>
                 *                   <element name="TotalDebt" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}MoneyPositiveType"/>
                 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}UnifiedAccountNumber"/>
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
                @XmlType(name = "", propOrder = {
                    "account"
                })
                public static class DeptsInforming {

                    /**
                     * Лицевой счет
                     * 
                     */
                    @XmlElement(name = "Account", required = true)
                    protected List<ImportNotificationRequest.Notification.Create.RoomOwners.DeptsInforming.Account> account;

                    /**
                     * Лицевой счет
                     * 
                     * Gets the value of the account property.
                     * 
                     * <p>This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the account property.</p>
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * </p>
                     * <pre>
                     * getAccount().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ImportNotificationRequest.Notification.Create.RoomOwners.DeptsInforming.Account }
                     * </p>
                     * 
                     * 
                     * @return
                     *     The value of the account property.
                     */
                    public List<ImportNotificationRequest.Notification.Create.RoomOwners.DeptsInforming.Account> getAccount() {
                        if (account == null) {
                            account = new ArrayList<>();
                        }
                        return this.account;
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
                     *         <element name="TotalDebt" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}MoneyPositiveType"/>
                     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}UnifiedAccountNumber"/>
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
                        "totalDebt",
                        "unifiedAccountNumber"
                    })
                    public static class Account {

                        /**
                         * Сумма задолженности
                         * 
                         */
                        @XmlElement(name = "TotalDebt", required = true)
                        protected BigDecimal totalDebt;
                        /**
                         * Единый лицевой счет
                         * 
                         */
                        @XmlElement(name = "UnifiedAccountNumber", namespace = "http://dom.gosuslugi.ru/schema/integration/account-base/", required = true)
                        protected String unifiedAccountNumber;

                        /**
                         * Сумма задолженности
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getTotalDebt() {
                            return totalDebt;
                        }

                        /**
                         * Sets the value of the totalDebt property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         * @see #getTotalDebt()
                         */
                        public void setTotalDebt(BigDecimal value) {
                            this.totalDebt = value;
                        }

                        /**
                         * Единый лицевой счет
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getUnifiedAccountNumber() {
                            return unifiedAccountNumber;
                        }

                        /**
                         * Sets the value of the unifiedAccountNumber property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         * @see #getUnifiedAccountNumber()
                         */
                        public void setUnifiedAccountNumber(String value) {
                            this.unifiedAccountNumber = value;
                        }

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
                 *       <sequence>
                 *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
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
                    "fiasHouseGuid"
                })
                public static class OtherOrganizationSelection {

                    /**
                     * Глобальный уникальный идентификатор дома по ФИАС
                     * 
                     */
                    @XmlElement(name = "FIASHouseGuid", required = true)
                    protected List<String> fiasHouseGuid;

                    /**
                     * Глобальный уникальный идентификатор дома по ФИАС
                     * 
                     * Gets the value of the fiasHouseGuid property.
                     * 
                     * <p>This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the fiasHouseGuid property.</p>
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * </p>
                     * <pre>
                     * getFIASHouseGuid().add(newItem);
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
                     *     The value of the fiasHouseGuid property.
                     */
                    public List<String> getFIASHouseGuid() {
                        if (fiasHouseGuid == null) {
                            fiasHouseGuid = new ArrayList<>();
                        }
                        return this.fiasHouseGuid;
                    }

                }

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
         *       <sequence>
         *         <element name="RecallReason" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <minLength value="1"/>
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
            "recallReason"
        })
        public static class RecallNotification {

            /**
             * Причина отзыва
             * 
             */
            @XmlElement(name = "RecallReason")
            protected String recallReason;

            /**
             * Причина отзыва
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRecallReason() {
                return recallReason;
            }

            /**
             * Sets the value of the recallReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getRecallReason()
             */
            public void setRecallReason(String value) {
                this.recallReason = value;
            }

        }

    }

}
