
package ru.gosuslugi.dom.schema.integration.house_management;

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
 *       <sequence>
 *         <sequence>
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *         </sequence>
 *         <choice>
 *           <element name="PlacingCharter">
 *             <complexType>
 *               <complexContent>
 *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterType">
 *                   <sequence>
 *                     <element name="ContractObject" maxOccurs="unbounded">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ManageObjectType">
 *                             <sequence>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                               <element name="BaseMService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
 *                               <element name="HouseService" maxOccurs="unbounded" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
 *                                       <sequence>
 *                                         <element name="BaseServiceCharter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
 *                                       </sequence>
 *                                     </extension>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="AddService" maxOccurs="unbounded" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
 *                                       <sequence>
 *                                         <element name="BaseServiceCharter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
 *                                       </sequence>
 *                                     </extension>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="IsManagedByContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             </sequence>
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                   </sequence>
 *                 </extension>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="EditCharter">
 *             <complexType>
 *               <complexContent>
 *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterType">
 *                   <sequence>
 *                     <element name="ContractObject" maxOccurs="unbounded" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                               <choice>
 *                                 <element name="Add">
 *                                   <complexType>
 *                                     <complexContent>
 *                                       <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ManageObjectType">
 *                                         <sequence>
 *                                           <element name="BaseMService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
 *                                           <element name="HouseService" maxOccurs="unbounded" minOccurs="0">
 *                                             <complexType>
 *                                               <complexContent>
 *                                                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
 *                                                   <sequence>
 *                                                     <element name="BaseServiceCharter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
 *                                                   </sequence>
 *                                                 </extension>
 *                                               </complexContent>
 *                                             </complexType>
 *                                           </element>
 *                                           <element name="AddService" maxOccurs="unbounded" minOccurs="0">
 *                                             <complexType>
 *                                               <complexContent>
 *                                                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
 *                                                   <sequence>
 *                                                     <element name="BaseServiceCharter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
 *                                                   </sequence>
 *                                                 </extension>
 *                                               </complexContent>
 *                                             </complexType>
 *                                           </element>
 *                                           <element name="IsManagedByContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                         </sequence>
 *                                       </extension>
 *                                     </complexContent>
 *                                   </complexType>
 *                                 </element>
 *                                 <element name="Edit">
 *                                   <complexType>
 *                                     <complexContent>
 *                                       <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ManageObjectType">
 *                                         <sequence>
 *                                           <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractObjectVersionGUID"/>
 *                                           <element name="BaseMService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType" minOccurs="0"/>
 *                                           <element name="HouseService" maxOccurs="unbounded" minOccurs="0">
 *                                             <complexType>
 *                                               <complexContent>
 *                                                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
 *                                                   <sequence>
 *                                                     <element name="BaseServiceCharter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
 *                                                   </sequence>
 *                                                 </extension>
 *                                               </complexContent>
 *                                             </complexType>
 *                                           </element>
 *                                           <element name="AddService" maxOccurs="unbounded" minOccurs="0">
 *                                             <complexType>
 *                                               <complexContent>
 *                                                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
 *                                                   <sequence>
 *                                                     <element name="BaseServiceCharter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
 *                                                   </sequence>
 *                                                 </extension>
 *                                               </complexContent>
 *                                             </complexType>
 *                                           </element>
 *                                           <element name="IsManagedByContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                         </sequence>
 *                                       </extension>
 *                                     </complexContent>
 *                                   </complexType>
 *                                 </element>
 *                                 <element name="Annulment">
 *                                   <complexType>
 *                                     <complexContent>
 *                                       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         <sequence>
 *                                           <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractObjectVersionGUID"/>
 *                                         </sequence>
 *                                       </restriction>
 *                                     </complexContent>
 *                                   </complexType>
 *                                 </element>
 *                               </choice>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterVersionGUID"/>
 *                   </sequence>
 *                 </extension>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="RollOverCharter">
 *             <complexType>
 *               <complexContent>
 *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RollOverType">
 *                   <sequence>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterVersionGUID"/>
 *                     <element name="RollToDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   </sequence>
 *                 </extension>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="TerminateCharter">
 *             <complexType>
 *               <complexContent>
 *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}TerminateType">
 *                   <sequence>
 *                     <element name="Reason">
 *                       <simpleType>
 *                         <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
 *                           <maxLength value="255"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterVersionGUID"/>
 *                   </sequence>
 *                 </extension>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="AnnulmentCharter">
 *             <complexType>
 *               <complexContent>
 *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}AnnulmentType">
 *                   <sequence>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterVersionGUID"/>
 *                   </sequence>
 *                 </extension>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="PlaceCharterPaymentsInfo">
 *             <complexType>
 *               <complexContent>
 *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterPaymentsInfoType">
 *                   <sequence>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterVersionGUID"/>
 *                   </sequence>
 *                 </extension>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="AnnulmentCharterPaymentsInfo">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterPaymentsInfoVersionGUID"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *         </choice>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.9.0.1""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transportGUID",
    "placingCharter",
    "editCharter",
    "rollOverCharter",
    "terminateCharter",
    "annulmentCharter",
    "placeCharterPaymentsInfo",
    "annulmentCharterPaymentsInfo"
})
@XmlRootElement(name = "importCharterRequest")
public class ImportCharterRequest
    extends BaseType
{

    /**
     * Транспортный идентификатор
     * 
     */
    @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String transportGUID;
    /**
     * Создание устава
     * 
     */
    @XmlElement(name = "PlacingCharter")
    protected ImportCharterRequest.PlacingCharter placingCharter;
    /**
     * Внесение изменений в версию устава
     * 
     */
    @XmlElement(name = "EditCharter")
    protected ImportCharterRequest.EditCharter editCharter;
    /**
     * Продление срока оказания услуг
     * 
     */
    @XmlElement(name = "RollOverCharter")
    protected ImportCharterRequest.RollOverCharter rollOverCharter;
    /**
     * Прекращение действия устава
     * 
     */
    @XmlElement(name = "TerminateCharter")
    protected ImportCharterRequest.TerminateCharter terminateCharter;
    /**
     * Аннулирование устава
     * 
     */
    @XmlElement(name = "AnnulmentCharter")
    protected ImportCharterRequest.AnnulmentCharter annulmentCharter;
    /**
     * Размещение сведений о размере платы
     * 
     */
    @XmlElement(name = "PlaceCharterPaymentsInfo")
    protected ImportCharterRequest.PlaceCharterPaymentsInfo placeCharterPaymentsInfo;
    /**
     * Аннулирование сведений о размере платы
     * 
     */
    @XmlElement(name = "AnnulmentCharterPaymentsInfo")
    protected ImportCharterRequest.AnnulmentCharterPaymentsInfo annulmentCharterPaymentsInfo;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

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
     * Создание устава
     * 
     * @return
     *     possible object is
     *     {@link ImportCharterRequest.PlacingCharter }
     *     
     */
    public ImportCharterRequest.PlacingCharter getPlacingCharter() {
        return placingCharter;
    }

    /**
     * Sets the value of the placingCharter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportCharterRequest.PlacingCharter }
     *     
     * @see #getPlacingCharter()
     */
    public void setPlacingCharter(ImportCharterRequest.PlacingCharter value) {
        this.placingCharter = value;
    }

    /**
     * Внесение изменений в версию устава
     * 
     * @return
     *     possible object is
     *     {@link ImportCharterRequest.EditCharter }
     *     
     */
    public ImportCharterRequest.EditCharter getEditCharter() {
        return editCharter;
    }

    /**
     * Sets the value of the editCharter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportCharterRequest.EditCharter }
     *     
     * @see #getEditCharter()
     */
    public void setEditCharter(ImportCharterRequest.EditCharter value) {
        this.editCharter = value;
    }

    /**
     * Продление срока оказания услуг
     * 
     * @return
     *     possible object is
     *     {@link ImportCharterRequest.RollOverCharter }
     *     
     */
    public ImportCharterRequest.RollOverCharter getRollOverCharter() {
        return rollOverCharter;
    }

    /**
     * Sets the value of the rollOverCharter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportCharterRequest.RollOverCharter }
     *     
     * @see #getRollOverCharter()
     */
    public void setRollOverCharter(ImportCharterRequest.RollOverCharter value) {
        this.rollOverCharter = value;
    }

    /**
     * Прекращение действия устава
     * 
     * @return
     *     possible object is
     *     {@link ImportCharterRequest.TerminateCharter }
     *     
     */
    public ImportCharterRequest.TerminateCharter getTerminateCharter() {
        return terminateCharter;
    }

    /**
     * Sets the value of the terminateCharter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportCharterRequest.TerminateCharter }
     *     
     * @see #getTerminateCharter()
     */
    public void setTerminateCharter(ImportCharterRequest.TerminateCharter value) {
        this.terminateCharter = value;
    }

    /**
     * Аннулирование устава
     * 
     * @return
     *     possible object is
     *     {@link ImportCharterRequest.AnnulmentCharter }
     *     
     */
    public ImportCharterRequest.AnnulmentCharter getAnnulmentCharter() {
        return annulmentCharter;
    }

    /**
     * Sets the value of the annulmentCharter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportCharterRequest.AnnulmentCharter }
     *     
     * @see #getAnnulmentCharter()
     */
    public void setAnnulmentCharter(ImportCharterRequest.AnnulmentCharter value) {
        this.annulmentCharter = value;
    }

    /**
     * Размещение сведений о размере платы
     * 
     * @return
     *     possible object is
     *     {@link ImportCharterRequest.PlaceCharterPaymentsInfo }
     *     
     */
    public ImportCharterRequest.PlaceCharterPaymentsInfo getPlaceCharterPaymentsInfo() {
        return placeCharterPaymentsInfo;
    }

    /**
     * Sets the value of the placeCharterPaymentsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportCharterRequest.PlaceCharterPaymentsInfo }
     *     
     * @see #getPlaceCharterPaymentsInfo()
     */
    public void setPlaceCharterPaymentsInfo(ImportCharterRequest.PlaceCharterPaymentsInfo value) {
        this.placeCharterPaymentsInfo = value;
    }

    /**
     * Аннулирование сведений о размере платы
     * 
     * @return
     *     possible object is
     *     {@link ImportCharterRequest.AnnulmentCharterPaymentsInfo }
     *     
     */
    public ImportCharterRequest.AnnulmentCharterPaymentsInfo getAnnulmentCharterPaymentsInfo() {
        return annulmentCharterPaymentsInfo;
    }

    /**
     * Sets the value of the annulmentCharterPaymentsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportCharterRequest.AnnulmentCharterPaymentsInfo }
     *     
     * @see #getAnnulmentCharterPaymentsInfo()
     */
    public void setAnnulmentCharterPaymentsInfo(ImportCharterRequest.AnnulmentCharterPaymentsInfo value) {
        this.annulmentCharterPaymentsInfo = value;
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
            return "11.9.0.1";
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


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}AnnulmentType">
     *       <sequence>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterVersionGUID"/>
     *       </sequence>
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "charterVersionGUID"
    })
    public static class AnnulmentCharter
        extends AnnulmentType
    {

        /**
         * Идентификатор версии устава в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "CharterVersionGUID", required = true)
        protected String charterVersionGUID;

        /**
         * Идентификатор версии устава в ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCharterVersionGUID() {
            return charterVersionGUID;
        }

        /**
         * Sets the value of the charterVersionGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getCharterVersionGUID()
         */
        public void setCharterVersionGUID(String value) {
            this.charterVersionGUID = value;
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
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterPaymentsInfoVersionGUID"/>
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
        "charterPaymentsInfoVersionGUID"
    })
    public static class AnnulmentCharterPaymentsInfo {

        /**
         * Идентификатор версии сведений о размере платы по уставу
         * 
         */
        @XmlElement(name = "CharterPaymentsInfoVersionGUID", required = true)
        protected String charterPaymentsInfoVersionGUID;

        /**
         * Идентификатор версии сведений о размере платы по уставу
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCharterPaymentsInfoVersionGUID() {
            return charterPaymentsInfoVersionGUID;
        }

        /**
         * Sets the value of the charterPaymentsInfoVersionGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getCharterPaymentsInfoVersionGUID()
         */
        public void setCharterPaymentsInfoVersionGUID(String value) {
            this.charterPaymentsInfoVersionGUID = value;
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterType">
     *       <sequence>
     *         <element name="ContractObject" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                   <choice>
     *                     <element name="Add">
     *                       <complexType>
     *                         <complexContent>
     *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ManageObjectType">
     *                             <sequence>
     *                               <element name="BaseMService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
     *                               <element name="HouseService" maxOccurs="unbounded" minOccurs="0">
     *                                 <complexType>
     *                                   <complexContent>
     *                                     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
     *                                       <sequence>
     *                                         <element name="BaseServiceCharter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
     *                                       </sequence>
     *                                     </extension>
     *                                   </complexContent>
     *                                 </complexType>
     *                               </element>
     *                               <element name="AddService" maxOccurs="unbounded" minOccurs="0">
     *                                 <complexType>
     *                                   <complexContent>
     *                                     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
     *                                       <sequence>
     *                                         <element name="BaseServiceCharter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
     *                                       </sequence>
     *                                     </extension>
     *                                   </complexContent>
     *                                 </complexType>
     *                               </element>
     *                               <element name="IsManagedByContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             </sequence>
     *                           </extension>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                     <element name="Edit">
     *                       <complexType>
     *                         <complexContent>
     *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ManageObjectType">
     *                             <sequence>
     *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractObjectVersionGUID"/>
     *                               <element name="BaseMService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType" minOccurs="0"/>
     *                               <element name="HouseService" maxOccurs="unbounded" minOccurs="0">
     *                                 <complexType>
     *                                   <complexContent>
     *                                     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
     *                                       <sequence>
     *                                         <element name="BaseServiceCharter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
     *                                       </sequence>
     *                                     </extension>
     *                                   </complexContent>
     *                                 </complexType>
     *                               </element>
     *                               <element name="AddService" maxOccurs="unbounded" minOccurs="0">
     *                                 <complexType>
     *                                   <complexContent>
     *                                     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
     *                                       <sequence>
     *                                         <element name="BaseServiceCharter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
     *                                       </sequence>
     *                                     </extension>
     *                                   </complexContent>
     *                                 </complexType>
     *                               </element>
     *                               <element name="IsManagedByContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             </sequence>
     *                           </extension>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                     <element name="Annulment">
     *                       <complexType>
     *                         <complexContent>
     *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             <sequence>
     *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractObjectVersionGUID"/>
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
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterVersionGUID"/>
     *       </sequence>
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "contractObject",
        "charterVersionGUID"
    })
    public static class EditCharter
        extends CharterType
    {

        /**
         * Объект управления.  Если устав является бессрочным элемент Дата окончания предоставления жилищных услуг необходимо заполнить значением "5000"
         * 
         */
        @XmlElement(name = "ContractObject")
        protected List<ImportCharterRequest.EditCharter.ContractObject> contractObject;
        /**
         * Идентификатор версии устава в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "CharterVersionGUID", required = true)
        protected String charterVersionGUID;

        /**
         * Объект управления.  Если устав является бессрочным элемент Дата окончания предоставления жилищных услуг необходимо заполнить значением "5000"
         * 
         * Gets the value of the contractObject property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contractObject property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getContractObject().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ImportCharterRequest.EditCharter.ContractObject }
         * </p>
         * 
         * 
         * @return
         *     The value of the contractObject property.
         */
        public List<ImportCharterRequest.EditCharter.ContractObject> getContractObject() {
            if (contractObject == null) {
                contractObject = new ArrayList<>();
            }
            return this.contractObject;
        }

        /**
         * Идентификатор версии устава в ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCharterVersionGUID() {
            return charterVersionGUID;
        }

        /**
         * Sets the value of the charterVersionGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getCharterVersionGUID()
         */
        public void setCharterVersionGUID(String value) {
            this.charterVersionGUID = value;
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
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
         *         <choice>
         *           <element name="Add">
         *             <complexType>
         *               <complexContent>
         *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ManageObjectType">
         *                   <sequence>
         *                     <element name="BaseMService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
         *                     <element name="HouseService" maxOccurs="unbounded" minOccurs="0">
         *                       <complexType>
         *                         <complexContent>
         *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
         *                             <sequence>
         *                               <element name="BaseServiceCharter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
         *                             </sequence>
         *                           </extension>
         *                         </complexContent>
         *                       </complexType>
         *                     </element>
         *                     <element name="AddService" maxOccurs="unbounded" minOccurs="0">
         *                       <complexType>
         *                         <complexContent>
         *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
         *                             <sequence>
         *                               <element name="BaseServiceCharter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
         *                             </sequence>
         *                           </extension>
         *                         </complexContent>
         *                       </complexType>
         *                     </element>
         *                     <element name="IsManagedByContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   </sequence>
         *                 </extension>
         *               </complexContent>
         *             </complexType>
         *           </element>
         *           <element name="Edit">
         *             <complexType>
         *               <complexContent>
         *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ManageObjectType">
         *                   <sequence>
         *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractObjectVersionGUID"/>
         *                     <element name="BaseMService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType" minOccurs="0"/>
         *                     <element name="HouseService" maxOccurs="unbounded" minOccurs="0">
         *                       <complexType>
         *                         <complexContent>
         *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
         *                             <sequence>
         *                               <element name="BaseServiceCharter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
         *                             </sequence>
         *                           </extension>
         *                         </complexContent>
         *                       </complexType>
         *                     </element>
         *                     <element name="AddService" maxOccurs="unbounded" minOccurs="0">
         *                       <complexType>
         *                         <complexContent>
         *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
         *                             <sequence>
         *                               <element name="BaseServiceCharter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
         *                             </sequence>
         *                           </extension>
         *                         </complexContent>
         *                       </complexType>
         *                     </element>
         *                     <element name="IsManagedByContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   </sequence>
         *                 </extension>
         *               </complexContent>
         *             </complexType>
         *           </element>
         *           <element name="Annulment">
         *             <complexType>
         *               <complexContent>
         *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   <sequence>
         *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractObjectVersionGUID"/>
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
            "add",
            "edit",
            "annulment"
        })
        public static class ContractObject {

            /**
             * Транспортный идентификатор
             * 
             */
            @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
            protected String transportGUID;
            /**
             * Добавление
             * 
             */
            @XmlElement(name = "Add")
            protected ImportCharterRequest.EditCharter.ContractObject.Add add;
            /**
             * Изменение
             * 
             */
            @XmlElement(name = "Edit")
            protected ImportCharterRequest.EditCharter.ContractObject.Edit edit;
            /**
             * Аннулирование
             * 
             */
            @XmlElement(name = "Annulment")
            protected ImportCharterRequest.EditCharter.ContractObject.Annulment annulment;

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
             * Добавление
             * 
             * @return
             *     possible object is
             *     {@link ImportCharterRequest.EditCharter.ContractObject.Add }
             *     
             */
            public ImportCharterRequest.EditCharter.ContractObject.Add getAdd() {
                return add;
            }

            /**
             * Sets the value of the add property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportCharterRequest.EditCharter.ContractObject.Add }
             *     
             * @see #getAdd()
             */
            public void setAdd(ImportCharterRequest.EditCharter.ContractObject.Add value) {
                this.add = value;
            }

            /**
             * Изменение
             * 
             * @return
             *     possible object is
             *     {@link ImportCharterRequest.EditCharter.ContractObject.Edit }
             *     
             */
            public ImportCharterRequest.EditCharter.ContractObject.Edit getEdit() {
                return edit;
            }

            /**
             * Sets the value of the edit property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportCharterRequest.EditCharter.ContractObject.Edit }
             *     
             * @see #getEdit()
             */
            public void setEdit(ImportCharterRequest.EditCharter.ContractObject.Edit value) {
                this.edit = value;
            }

            /**
             * Аннулирование
             * 
             * @return
             *     possible object is
             *     {@link ImportCharterRequest.EditCharter.ContractObject.Annulment }
             *     
             */
            public ImportCharterRequest.EditCharter.ContractObject.Annulment getAnnulment() {
                return annulment;
            }

            /**
             * Sets the value of the annulment property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportCharterRequest.EditCharter.ContractObject.Annulment }
             *     
             * @see #getAnnulment()
             */
            public void setAnnulment(ImportCharterRequest.EditCharter.ContractObject.Annulment value) {
                this.annulment = value;
            }


            /**
             * <p>Java class for anonymous complex type</p>.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ManageObjectType">
             *       <sequence>
             *         <element name="BaseMService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
             *         <element name="HouseService" maxOccurs="unbounded" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
             *                 <sequence>
             *                   <element name="BaseServiceCharter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
             *                 </sequence>
             *               </extension>
             *             </complexContent>
             *           </complexType>
             *         </element>
             *         <element name="AddService" maxOccurs="unbounded" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
             *                 <sequence>
             *                   <element name="BaseServiceCharter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
             *                 </sequence>
             *               </extension>
             *             </complexContent>
             *           </complexType>
             *         </element>
             *         <element name="IsManagedByContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *       </sequence>
             *     </extension>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "baseMService",
                "houseService",
                "addService",
                "isManagedByContract"
            })
            public static class Add
                extends ManageObjectType
            {

                /**
                 * Основание
                 * 
                 */
                @XmlElement(name = "BaseMService", required = true)
                protected BaseServiceCharterType baseMService;
                /**
                 * Виды КУ. Ссылка на НСИ "Вид коммунальной услуги" (реестровый номер 3)
                 * 
                 */
                @XmlElement(name = "HouseService")
                protected List<ImportCharterRequest.EditCharter.ContractObject.Add.HouseService> houseService;
                /**
                 * Дополнительные услуги. Ссылка на НСИ "Дополнительные услуги" (реестровый номер 1)
                 * 
                 */
                @XmlElement(name = "AddService")
                protected List<ImportCharterRequest.EditCharter.ContractObject.Add.AddService> addService;
                /**
                 * Управление многоквартирным домом осуществляется управляющей организацией по договору управления
                 * 
                 */
                @XmlElement(name = "IsManagedByContract")
                protected Boolean isManagedByContract;

                /**
                 * Основание
                 * 
                 * @return
                 *     possible object is
                 *     {@link BaseServiceCharterType }
                 *     
                 */
                public BaseServiceCharterType getBaseMService() {
                    return baseMService;
                }

                /**
                 * Sets the value of the baseMService property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BaseServiceCharterType }
                 *     
                 * @see #getBaseMService()
                 */
                public void setBaseMService(BaseServiceCharterType value) {
                    this.baseMService = value;
                }

                /**
                 * Виды КУ. Ссылка на НСИ "Вид коммунальной услуги" (реестровый номер 3)
                 * 
                 * Gets the value of the houseService property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the houseService property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getHouseService().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ImportCharterRequest.EditCharter.ContractObject.Add.HouseService }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the houseService property.
                 */
                public List<ImportCharterRequest.EditCharter.ContractObject.Add.HouseService> getHouseService() {
                    if (houseService == null) {
                        houseService = new ArrayList<>();
                    }
                    return this.houseService;
                }

                /**
                 * Дополнительные услуги. Ссылка на НСИ "Дополнительные услуги" (реестровый номер 1)
                 * 
                 * Gets the value of the addService property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the addService property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getAddService().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ImportCharterRequest.EditCharter.ContractObject.Add.AddService }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the addService property.
                 */
                public List<ImportCharterRequest.EditCharter.ContractObject.Add.AddService> getAddService() {
                    if (addService == null) {
                        addService = new ArrayList<>();
                    }
                    return this.addService;
                }

                /**
                 * Управление многоквартирным домом осуществляется управляющей организацией по договору управления
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isIsManagedByContract() {
                    return isManagedByContract;
                }

                /**
                 * Sets the value of the isManagedByContract property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 * @see #isIsManagedByContract()
                 */
                public void setIsManagedByContract(Boolean value) {
                    this.isManagedByContract = value;
                }


                /**
                 * <p>Java class for anonymous complex type</p>.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.</p>
                 * 
                 * <pre>{@code
                 * <complexType>
                 *   <complexContent>
                 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
                 *       <sequence>
                 *         <element name="BaseServiceCharter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
                 *       </sequence>
                 *     </extension>
                 *   </complexContent>
                 * </complexType>
                 * }</pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "baseServiceCharter"
                })
                public static class AddService
                    extends ContractServiceType
                {

                    /**
                     * Основание
                     * 
                     */
                    @XmlElement(name = "BaseServiceCharter", required = true)
                    protected BaseServiceCharterType baseServiceCharter;

                    /**
                     * Основание
                     * 
                     * @return
                     *     possible object is
                     *     {@link BaseServiceCharterType }
                     *     
                     */
                    public BaseServiceCharterType getBaseServiceCharter() {
                        return baseServiceCharter;
                    }

                    /**
                     * Sets the value of the baseServiceCharter property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BaseServiceCharterType }
                     *     
                     * @see #getBaseServiceCharter()
                     */
                    public void setBaseServiceCharter(BaseServiceCharterType value) {
                        this.baseServiceCharter = value;
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
                 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
                 *       <sequence>
                 *         <element name="BaseServiceCharter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
                 *       </sequence>
                 *     </extension>
                 *   </complexContent>
                 * </complexType>
                 * }</pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "baseServiceCharter"
                })
                public static class HouseService
                    extends ContractServiceType
                {

                    /**
                     * Основание
                     * 
                     */
                    @XmlElement(name = "BaseServiceCharter", required = true)
                    protected BaseServiceCharterType baseServiceCharter;

                    /**
                     * Основание
                     * 
                     * @return
                     *     possible object is
                     *     {@link BaseServiceCharterType }
                     *     
                     */
                    public BaseServiceCharterType getBaseServiceCharter() {
                        return baseServiceCharter;
                    }

                    /**
                     * Sets the value of the baseServiceCharter property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BaseServiceCharterType }
                     *     
                     * @see #getBaseServiceCharter()
                     */
                    public void setBaseServiceCharter(BaseServiceCharterType value) {
                        this.baseServiceCharter = value;
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
             *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractObjectVersionGUID"/>
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
                "contractObjectVersionGUID"
            })
            public static class Annulment {

                /**
                 * Идентификатор версии объекта управления  в ГИС ЖКХ
                 * 
                 */
                @XmlElement(name = "ContractObjectVersionGUID", required = true)
                protected String contractObjectVersionGUID;

                /**
                 * Идентификатор версии объекта управления  в ГИС ЖКХ
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getContractObjectVersionGUID() {
                    return contractObjectVersionGUID;
                }

                /**
                 * Sets the value of the contractObjectVersionGUID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getContractObjectVersionGUID()
                 */
                public void setContractObjectVersionGUID(String value) {
                    this.contractObjectVersionGUID = value;
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
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ManageObjectType">
             *       <sequence>
             *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractObjectVersionGUID"/>
             *         <element name="BaseMService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType" minOccurs="0"/>
             *         <element name="HouseService" maxOccurs="unbounded" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
             *                 <sequence>
             *                   <element name="BaseServiceCharter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
             *                 </sequence>
             *               </extension>
             *             </complexContent>
             *           </complexType>
             *         </element>
             *         <element name="AddService" maxOccurs="unbounded" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
             *                 <sequence>
             *                   <element name="BaseServiceCharter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
             *                 </sequence>
             *               </extension>
             *             </complexContent>
             *           </complexType>
             *         </element>
             *         <element name="IsManagedByContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *       </sequence>
             *     </extension>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "contractObjectVersionGUID",
                "baseMService",
                "houseService",
                "addService",
                "isManagedByContract"
            })
            public static class Edit
                extends ManageObjectType
            {

                /**
                 * Идентификатор версии объекта управления  в ГИС ЖКХ
                 * 
                 */
                @XmlElement(name = "ContractObjectVersionGUID", required = true)
                protected String contractObjectVersionGUID;
                /**
                 * Основание
                 * 
                 */
                @XmlElement(name = "BaseMService")
                protected BaseServiceCharterType baseMService;
                /**
                 * Виды КУ. Ссылка на НСИ "Вид коммунальной услуги" (реестровый номер 3)
                 * 
                 */
                @XmlElement(name = "HouseService")
                protected List<ImportCharterRequest.EditCharter.ContractObject.Edit.HouseService> houseService;
                /**
                 * Дополнительные услуги. Ссылка на НСИ "Дополнительные услуги" (реестровый номер 1)
                 * 
                 */
                @XmlElement(name = "AddService")
                protected List<ImportCharterRequest.EditCharter.ContractObject.Edit.AddService> addService;
                /**
                 * Управление многоквартирным домом осуществляется управляющей организацией по договору управления
                 * 
                 */
                @XmlElement(name = "IsManagedByContract")
                protected Boolean isManagedByContract;

                /**
                 * Идентификатор версии объекта управления  в ГИС ЖКХ
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getContractObjectVersionGUID() {
                    return contractObjectVersionGUID;
                }

                /**
                 * Sets the value of the contractObjectVersionGUID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getContractObjectVersionGUID()
                 */
                public void setContractObjectVersionGUID(String value) {
                    this.contractObjectVersionGUID = value;
                }

                /**
                 * Основание
                 * 
                 * @return
                 *     possible object is
                 *     {@link BaseServiceCharterType }
                 *     
                 */
                public BaseServiceCharterType getBaseMService() {
                    return baseMService;
                }

                /**
                 * Sets the value of the baseMService property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BaseServiceCharterType }
                 *     
                 * @see #getBaseMService()
                 */
                public void setBaseMService(BaseServiceCharterType value) {
                    this.baseMService = value;
                }

                /**
                 * Виды КУ. Ссылка на НСИ "Вид коммунальной услуги" (реестровый номер 3)
                 * 
                 * Gets the value of the houseService property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the houseService property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getHouseService().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ImportCharterRequest.EditCharter.ContractObject.Edit.HouseService }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the houseService property.
                 */
                public List<ImportCharterRequest.EditCharter.ContractObject.Edit.HouseService> getHouseService() {
                    if (houseService == null) {
                        houseService = new ArrayList<>();
                    }
                    return this.houseService;
                }

                /**
                 * Дополнительные услуги. Ссылка на НСИ "Дополнительные услуги" (реестровый номер 1)
                 * 
                 * Gets the value of the addService property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the addService property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getAddService().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ImportCharterRequest.EditCharter.ContractObject.Edit.AddService }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the addService property.
                 */
                public List<ImportCharterRequest.EditCharter.ContractObject.Edit.AddService> getAddService() {
                    if (addService == null) {
                        addService = new ArrayList<>();
                    }
                    return this.addService;
                }

                /**
                 * Управление многоквартирным домом осуществляется управляющей организацией по договору управления
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isIsManagedByContract() {
                    return isManagedByContract;
                }

                /**
                 * Sets the value of the isManagedByContract property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 * @see #isIsManagedByContract()
                 */
                public void setIsManagedByContract(Boolean value) {
                    this.isManagedByContract = value;
                }


                /**
                 * <p>Java class for anonymous complex type</p>.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.</p>
                 * 
                 * <pre>{@code
                 * <complexType>
                 *   <complexContent>
                 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
                 *       <sequence>
                 *         <element name="BaseServiceCharter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
                 *       </sequence>
                 *     </extension>
                 *   </complexContent>
                 * </complexType>
                 * }</pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "baseServiceCharter"
                })
                public static class AddService
                    extends ContractServiceType
                {

                    /**
                     * Основание
                     * 
                     */
                    @XmlElement(name = "BaseServiceCharter", required = true)
                    protected BaseServiceCharterType baseServiceCharter;

                    /**
                     * Основание
                     * 
                     * @return
                     *     possible object is
                     *     {@link BaseServiceCharterType }
                     *     
                     */
                    public BaseServiceCharterType getBaseServiceCharter() {
                        return baseServiceCharter;
                    }

                    /**
                     * Sets the value of the baseServiceCharter property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BaseServiceCharterType }
                     *     
                     * @see #getBaseServiceCharter()
                     */
                    public void setBaseServiceCharter(BaseServiceCharterType value) {
                        this.baseServiceCharter = value;
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
                 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
                 *       <sequence>
                 *         <element name="BaseServiceCharter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
                 *       </sequence>
                 *     </extension>
                 *   </complexContent>
                 * </complexType>
                 * }</pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "baseServiceCharter"
                })
                public static class HouseService
                    extends ContractServiceType
                {

                    /**
                     * Основание
                     * 
                     */
                    @XmlElement(name = "BaseServiceCharter", required = true)
                    protected BaseServiceCharterType baseServiceCharter;

                    /**
                     * Основание
                     * 
                     * @return
                     *     possible object is
                     *     {@link BaseServiceCharterType }
                     *     
                     */
                    public BaseServiceCharterType getBaseServiceCharter() {
                        return baseServiceCharter;
                    }

                    /**
                     * Sets the value of the baseServiceCharter property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BaseServiceCharterType }
                     *     
                     * @see #getBaseServiceCharter()
                     */
                    public void setBaseServiceCharter(BaseServiceCharterType value) {
                        this.baseServiceCharter = value;
                    }

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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterPaymentsInfoType">
     *       <sequence>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterVersionGUID"/>
     *       </sequence>
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "charterVersionGUID"
    })
    public static class PlaceCharterPaymentsInfo
        extends CharterPaymentsInfoType
    {

        /**
         * Идентификатор версии устава в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "CharterVersionGUID", required = true)
        protected String charterVersionGUID;

        /**
         * Идентификатор версии устава в ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCharterVersionGUID() {
            return charterVersionGUID;
        }

        /**
         * Sets the value of the charterVersionGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getCharterVersionGUID()
         */
        public void setCharterVersionGUID(String value) {
            this.charterVersionGUID = value;
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterType">
     *       <sequence>
     *         <element name="ContractObject" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ManageObjectType">
     *                 <sequence>
     *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                   <element name="BaseMService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
     *                   <element name="HouseService" maxOccurs="unbounded" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
     *                           <sequence>
     *                             <element name="BaseServiceCharter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
     *                           </sequence>
     *                         </extension>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="AddService" maxOccurs="unbounded" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
     *                           <sequence>
     *                             <element name="BaseServiceCharter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
     *                           </sequence>
     *                         </extension>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="IsManagedByContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                 </sequence>
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </sequence>
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "contractObject"
    })
    public static class PlacingCharter
        extends CharterType
    {

        /**
         * Объект управления.  Если устав является бессрочным элемент Дата окончания предоставления жилищных услуг необходимо заполнить значением "5000"
         * 
         */
        @XmlElement(name = "ContractObject", required = true)
        protected List<ImportCharterRequest.PlacingCharter.ContractObject> contractObject;

        /**
         * Объект управления.  Если устав является бессрочным элемент Дата окончания предоставления жилищных услуг необходимо заполнить значением "5000"
         * 
         * Gets the value of the contractObject property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contractObject property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getContractObject().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ImportCharterRequest.PlacingCharter.ContractObject }
         * </p>
         * 
         * 
         * @return
         *     The value of the contractObject property.
         */
        public List<ImportCharterRequest.PlacingCharter.ContractObject> getContractObject() {
            if (contractObject == null) {
                contractObject = new ArrayList<>();
            }
            return this.contractObject;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ManageObjectType">
         *       <sequence>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
         *         <element name="BaseMService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
         *         <element name="HouseService" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
         *                 <sequence>
         *                   <element name="BaseServiceCharter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
         *                 </sequence>
         *               </extension>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="AddService" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
         *                 <sequence>
         *                   <element name="BaseServiceCharter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
         *                 </sequence>
         *               </extension>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="IsManagedByContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *       </sequence>
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "transportGUID",
            "baseMService",
            "houseService",
            "addService",
            "isManagedByContract"
        })
        public static class ContractObject
            extends ManageObjectType
        {

            /**
             * Транспортный идентификатор
             * 
             */
            @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
            protected String transportGUID;
            /**
             * Основание
             * 
             */
            @XmlElement(name = "BaseMService", required = true)
            protected BaseServiceCharterType baseMService;
            /**
             * Виды КУ. Ссылка на НСИ "Вид коммунальной услуги" (реестровый номер 3)
             * 
             */
            @XmlElement(name = "HouseService")
            protected List<ImportCharterRequest.PlacingCharter.ContractObject.HouseService> houseService;
            /**
             * Дополнительные услуги. Ссылка на НСИ "Дополнительные услуги" (реестровый номер 1)
             * 
             */
            @XmlElement(name = "AddService")
            protected List<ImportCharterRequest.PlacingCharter.ContractObject.AddService> addService;
            /**
             * Управление многоквартирным домом осуществляется управляющей организацией по договору управления
             * 
             */
            @XmlElement(name = "IsManagedByContract")
            protected Boolean isManagedByContract;

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
             * Основание
             * 
             * @return
             *     possible object is
             *     {@link BaseServiceCharterType }
             *     
             */
            public BaseServiceCharterType getBaseMService() {
                return baseMService;
            }

            /**
             * Sets the value of the baseMService property.
             * 
             * @param value
             *     allowed object is
             *     {@link BaseServiceCharterType }
             *     
             * @see #getBaseMService()
             */
            public void setBaseMService(BaseServiceCharterType value) {
                this.baseMService = value;
            }

            /**
             * Виды КУ. Ссылка на НСИ "Вид коммунальной услуги" (реестровый номер 3)
             * 
             * Gets the value of the houseService property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the houseService property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getHouseService().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ImportCharterRequest.PlacingCharter.ContractObject.HouseService }
             * </p>
             * 
             * 
             * @return
             *     The value of the houseService property.
             */
            public List<ImportCharterRequest.PlacingCharter.ContractObject.HouseService> getHouseService() {
                if (houseService == null) {
                    houseService = new ArrayList<>();
                }
                return this.houseService;
            }

            /**
             * Дополнительные услуги. Ссылка на НСИ "Дополнительные услуги" (реестровый номер 1)
             * 
             * Gets the value of the addService property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the addService property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getAddService().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ImportCharterRequest.PlacingCharter.ContractObject.AddService }
             * </p>
             * 
             * 
             * @return
             *     The value of the addService property.
             */
            public List<ImportCharterRequest.PlacingCharter.ContractObject.AddService> getAddService() {
                if (addService == null) {
                    addService = new ArrayList<>();
                }
                return this.addService;
            }

            /**
             * Управление многоквартирным домом осуществляется управляющей организацией по договору управления
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsManagedByContract() {
                return isManagedByContract;
            }

            /**
             * Sets the value of the isManagedByContract property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isIsManagedByContract()
             */
            public void setIsManagedByContract(Boolean value) {
                this.isManagedByContract = value;
            }


            /**
             * <p>Java class for anonymous complex type</p>.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
             *       <sequence>
             *         <element name="BaseServiceCharter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
             *       </sequence>
             *     </extension>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "baseServiceCharter"
            })
            public static class AddService
                extends ContractServiceType
            {

                /**
                 * Основание
                 * 
                 */
                @XmlElement(name = "BaseServiceCharter", required = true)
                protected BaseServiceCharterType baseServiceCharter;

                /**
                 * Основание
                 * 
                 * @return
                 *     possible object is
                 *     {@link BaseServiceCharterType }
                 *     
                 */
                public BaseServiceCharterType getBaseServiceCharter() {
                    return baseServiceCharter;
                }

                /**
                 * Sets the value of the baseServiceCharter property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BaseServiceCharterType }
                 *     
                 * @see #getBaseServiceCharter()
                 */
                public void setBaseServiceCharter(BaseServiceCharterType value) {
                    this.baseServiceCharter = value;
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
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
             *       <sequence>
             *         <element name="BaseServiceCharter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceCharterType"/>
             *       </sequence>
             *     </extension>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "baseServiceCharter"
            })
            public static class HouseService
                extends ContractServiceType
            {

                /**
                 * Основание
                 * 
                 */
                @XmlElement(name = "BaseServiceCharter", required = true)
                protected BaseServiceCharterType baseServiceCharter;

                /**
                 * Основание
                 * 
                 * @return
                 *     possible object is
                 *     {@link BaseServiceCharterType }
                 *     
                 */
                public BaseServiceCharterType getBaseServiceCharter() {
                    return baseServiceCharter;
                }

                /**
                 * Sets the value of the baseServiceCharter property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BaseServiceCharterType }
                 *     
                 * @see #getBaseServiceCharter()
                 */
                public void setBaseServiceCharter(BaseServiceCharterType value) {
                    this.baseServiceCharter = value;
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RollOverType">
     *       <sequence>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterVersionGUID"/>
     *         <element name="RollToDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *       </sequence>
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "charterVersionGUID",
        "rollToDate"
    })
    public static class RollOverCharter
        extends RollOverType
    {

        /**
         * Идентификатор версии устава в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "CharterVersionGUID", required = true)
        protected String charterVersionGUID;
        /**
         * Пролонгировать до даты. Если не указано, то дата окончания управления домами устава и всех услуг увеличиваются на 1 год.
         * 
         */
        @XmlElement(name = "RollToDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar rollToDate;

        /**
         * Идентификатор версии устава в ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCharterVersionGUID() {
            return charterVersionGUID;
        }

        /**
         * Sets the value of the charterVersionGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getCharterVersionGUID()
         */
        public void setCharterVersionGUID(String value) {
            this.charterVersionGUID = value;
        }

        /**
         * Пролонгировать до даты. Если не указано, то дата окончания управления домами устава и всех услуг увеличиваются на 1 год.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRollToDate() {
            return rollToDate;
        }

        /**
         * Sets the value of the rollToDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getRollToDate()
         */
        public void setRollToDate(XMLGregorianCalendar value) {
            this.rollToDate = value;
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}TerminateType">
     *       <sequence>
     *         <element name="Reason">
     *           <simpleType>
     *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
     *               <maxLength value="255"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterVersionGUID"/>
     *       </sequence>
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "reason",
        "charterVersionGUID"
    })
    public static class TerminateCharter
        extends TerminateType
    {

        /**
         * Причина прекращения действия устава
         * 
         */
        @XmlElement(name = "Reason", required = true)
        protected String reason;
        /**
         * Идентификатор версии устава в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "CharterVersionGUID", required = true)
        protected String charterVersionGUID;

        /**
         * Причина прекращения действия устава
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReason() {
            return reason;
        }

        /**
         * Sets the value of the reason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getReason()
         */
        public void setReason(String value) {
            this.reason = value;
        }

        /**
         * Идентификатор версии устава в ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCharterVersionGUID() {
            return charterVersionGUID;
        }

        /**
         * Sets the value of the charterVersionGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getCharterVersionGUID()
         */
        public void setCharterVersionGUID(String value) {
            this.charterVersionGUID = value;
        }

    }

}
