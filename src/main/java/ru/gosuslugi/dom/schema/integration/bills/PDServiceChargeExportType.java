
package ru.gosuslugi.dom.schema.integration.bills;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Потребление и начисление по услугам в ПД (экспорт)
 * 
 * <p>Java class for PDServiceChargeExportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PDServiceChargeExportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="HousingService">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ServicePDType">
 *                 <sequence minOccurs="0">
 *                   <element name="ServiceCharge" type="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceChargeType" minOccurs="0"/>
 *                   <element name="MunicipalResource" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="ServiceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                             <element name="Consumption" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="Volume">
 *                                         <complexType>
 *                                           <simpleContent>
 *                                             <extension base="<http://dom.gosuslugi.ru/schema/integration/bills/>ConsumptionVolumeType">
 *                                               <attribute name="type">
 *                                                 <simpleType>
 *                                                   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     <enumeration value="O"/>
 *                                                   </restriction>
 *                                                 </simpleType>
 *                                               </attribute>
 *                                               <attribute name="determiningMethod">
 *                                                 <simpleType>
 *                                                   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     <length value="1"/>
 *                                                     <enumeration value="N"/>
 *                                                     <enumeration value="M"/>
 *                                                     <enumeration value="O"/>
 *                                                   </restriction>
 *                                                 </simpleType>
 *                                               </attribute>
 *                                             </extension>
 *                                           </simpleContent>
 *                                         </complexType>
 *                                       </element>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="Rate" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   <fractionDigits value="6"/>
 *                                   <totalDigits value="14"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="AccountingPeriodTotal" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   <totalDigits value="18"/>
 *                                   <fractionDigits value="2"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="ServiceCharge" type="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceChargeType" minOccurs="0"/>
 *                             <element name="MunicipalServiceCommunalConsumptionPayable" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   <totalDigits value="18"/>
 *                                   <fractionDigits value="2"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="ServiceInformation" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="houseOverallNeedsNorm" type="{http://dom.gosuslugi.ru/schema/integration/bills/}VolumePDType" minOccurs="0"/>
 *                                       <element name="houseOverallNeedsCurrentValue" type="{http://dom.gosuslugi.ru/schema/integration/bills/}VolumePDType" minOccurs="0"/>
 *                                       <element name="houseTotalHouseOverallNeeds" type="{http://dom.gosuslugi.ru/schema/integration/bills/}VolumePDType" minOccurs="0"/>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="PaymentRecalculation" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="recalculationReason">
 *                                         <simpleType>
 *                                           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             <minLength value="1"/>
 *                                             <maxLength value="500"/>
 *                                           </restriction>
 *                                         </simpleType>
 *                                       </element>
 *                                       <element name="sum">
 *                                         <simpleType>
 *                                           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                             <fractionDigits value="2"/>
 *                                             <minInclusive value="-9999999999.99"/>
 *                                             <maxInclusive value="9999999999.99"/>
 *                                           </restriction>
 *                                         </simpleType>
 *                                       </element>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="AmountOfPaymentMunicipalServiceCommunalConsumption" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   <totalDigits value="13"/>
 *                                   <fractionDigits value="2"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="TotalPayable" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   <totalDigits value="18"/>
 *                                   <fractionDigits value="2"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="DebtPreviousPeriodsOrAdvanceBillingPeriod" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   <totalDigits value="13"/>
 *                                   <fractionDigits value="2"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="Penalties" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   <totalDigits value="13"/>
 *                                   <fractionDigits value="2"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="ServiceProviderPenalties" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   <totalDigits value="13"/>
 *                                   <fractionDigits value="2"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="StateFees" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   <totalDigits value="13"/>
 *                                   <fractionDigits value="2"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="CourtCosts" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   <totalDigits value="13"/>
 *                                   <fractionDigits value="2"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="TotalPayableOverall" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   <totalDigits value="13"/>
 *                                   <fractionDigits value="2"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                             <element name="GeneralMunicipalResource" type="{http://dom.gosuslugi.ru/schema/integration/bills/}GeneralMunicipalResourceExportType" maxOccurs="unbounded" minOccurs="0"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="PaymentRecalculation" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="recalculationReason">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   <minLength value="1"/>
 *                                   <maxLength value="500"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="sum">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   <fractionDigits value="2"/>
 *                                   <minInclusive value="-9999999999.99"/>
 *                                   <maxInclusive value="9999999999.99"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="AdditionalService">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ServicePDType">
 *                 <sequence>
 *                   <element name="ServiceCharge" type="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceChargeType" minOccurs="0"/>
 *                   <element name="Consumption" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="Volume" maxOccurs="2">
 *                               <complexType>
 *                                 <simpleContent>
 *                                   <extension base="<http://dom.gosuslugi.ru/schema/integration/bills/>ConsumptionVolumeType">
 *                                     <attribute name="type">
 *                                       <simpleType>
 *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           <enumeration value="I"/>
 *                                           <enumeration value="O"/>
 *                                         </restriction>
 *                                       </simpleType>
 *                                     </attribute>
 *                                   </extension>
 *                                 </simpleContent>
 *                               </complexType>
 *                             </element>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="PaymentRecalculation" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="recalculationReason">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   <minLength value="1"/>
 *                                   <maxLength value="500"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="sum">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   <fractionDigits value="2"/>
 *                                   <minInclusive value="-9999999999.99"/>
 *                                   <maxInclusive value="9999999999.99"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="MunicipalService">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ServicePDType">
 *                 <sequence>
 *                   <element name="ServiceCharge" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceChargeType">
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="PiecemealPayment" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="paymentPeriodPiecemealPaymentSum" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   <fractionDigits value="2"/>
 *                                   <totalDigits value="18"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="pastPaymentPeriodPiecemealPaymentSum" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   <fractionDigits value="2"/>
 *                                   <totalDigits value="18"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="piecemealPaymentPercentRub">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   <fractionDigits value="2"/>
 *                                   <totalDigits value="18"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="piecemealPaymentPercent">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   <minInclusive value="0"/>
 *                                   <fractionDigits value="2"/>
 *                                   <totalDigits value="5"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="piecemealPaymentSum">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   <fractionDigits value="2"/>
 *                                   <totalDigits value="18"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="PaymentRecalculation" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="recalculationReason">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   <minLength value="1"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="sum">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   <fractionDigits value="2"/>
 *                                   <minInclusive value="-9999999999.99"/>
 *                                   <maxInclusive value="9999999999.99"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceInformation" minOccurs="0"/>
 *                   <element name="Consumption" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="Volume" maxOccurs="2">
 *                               <complexType>
 *                                 <simpleContent>
 *                                   <extension base="<http://dom.gosuslugi.ru/schema/integration/bills/>ConsumptionVolumeType">
 *                                     <attribute name="type">
 *                                       <simpleType>
 *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           <enumeration value="I"/>
 *                                           <enumeration value="O"/>
 *                                         </restriction>
 *                                       </simpleType>
 *                                     </attribute>
 *                                     <attribute name="determiningMethod">
 *                                       <simpleType>
 *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           <length value="1"/>
 *                                           <enumeration value="N"/>
 *                                           <enumeration value="M"/>
 *                                           <enumeration value="O"/>
 *                                         </restriction>
 *                                       </simpleType>
 *                                     </attribute>
 *                                   </extension>
 *                                 </simpleContent>
 *                               </complexType>
 *                             </element>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="MultiplyingFactor" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="Ratio">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   <totalDigits value="5"/>
 *                                   <fractionDigits value="2"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="AmountOfExcessFees" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   <totalDigits value="18"/>
 *                                   <fractionDigits value="2"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="MunicipalServiceIndividualConsumptionPayable" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         <totalDigits value="18"/>
 *                         <fractionDigits value="2"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="MunicipalServiceCommunalConsumptionPayable" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         <totalDigits value="18"/>
 *                         <fractionDigits value="2"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="AmountOfPaymentMunicipalServiceIndividualConsumption" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         <totalDigits value="18"/>
 *                         <fractionDigits value="2"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="AmountOfPaymentMunicipalServiceCommunalConsumption" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         <totalDigits value="18"/>
 *                         <fractionDigits value="2"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="GroupMunicipalService">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="TypeMunicipalService" type="{http://dom.gosuslugi.ru/schema/integration/bills/}TypeMunicipalServiceExportType"/>
 *                   <element name="MunicipalService" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ServicePDType">
 *                           <sequence>
 *                             <element name="ServiceCharge" type="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceChargeImportType" minOccurs="0"/>
 *                             <element ref="{http://dom.gosuslugi.ru/schema/integration/bills/}PiecemealPayment" minOccurs="0"/>
 *                             <element name="PaymentRecalculation" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="recalculationReason">
 *                                         <simpleType>
 *                                           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             <minLength value="1"/>
 *                                             <maxLength value="500"/>
 *                                           </restriction>
 *                                         </simpleType>
 *                                       </element>
 *                                       <element name="sum">
 *                                         <simpleType>
 *                                           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                             <fractionDigits value="2"/>
 *                                             <minInclusive value="-9999999999.99"/>
 *                                             <maxInclusive value="9999999999.99"/>
 *                                           </restriction>
 *                                         </simpleType>
 *                                       </element>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element ref="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceInformation" minOccurs="0"/>
 *                             <element name="Consumption" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="Volume" maxOccurs="2">
 *                                         <complexType>
 *                                           <simpleContent>
 *                                             <extension base="<http://dom.gosuslugi.ru/schema/integration/bills/>ConsumptionVolumeType">
 *                                               <attribute name="type">
 *                                                 <simpleType>
 *                                                   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     <enumeration value="I"/>
 *                                                     <enumeration value="O"/>
 *                                                   </restriction>
 *                                                 </simpleType>
 *                                               </attribute>
 *                                               <attribute name="determiningMethod">
 *                                                 <simpleType>
 *                                                   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     <length value="1"/>
 *                                                     <enumeration value="N"/>
 *                                                     <enumeration value="M"/>
 *                                                     <enumeration value="O"/>
 *                                                   </restriction>
 *                                                 </simpleType>
 *                                               </attribute>
 *                                             </extension>
 *                                           </simpleContent>
 *                                         </complexType>
 *                                       </element>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="MultiplyingFactor" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="Ratio">
 *                                         <simpleType>
 *                                           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                             <totalDigits value="5"/>
 *                                             <fractionDigits value="2"/>
 *                                           </restriction>
 *                                         </simpleType>
 *                                       </element>
 *                                       <element name="AmountOfExcessFees" minOccurs="0">
 *                                         <simpleType>
 *                                           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                             <totalDigits value="13"/>
 *                                             <fractionDigits value="2"/>
 *                                           </restriction>
 *                                         </simpleType>
 *                                       </element>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="MunicipalServiceIndividualConsumptionPayable" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   <totalDigits value="13"/>
 *                                   <fractionDigits value="2"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="MunicipalServiceCommunalConsumptionPayable" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   <totalDigits value="13"/>
 *                                   <fractionDigits value="2"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="AmountOfPaymentMunicipalServiceIndividualConsumption" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   <totalDigits value="13"/>
 *                                   <fractionDigits value="2"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="AmountOfPaymentMunicipalServiceCommunalConsumption" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   <totalDigits value="13"/>
 *                                   <fractionDigits value="2"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                           </sequence>
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
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
@XmlType(name = "PDServiceChargeExportType", propOrder = {
    "housingService",
    "additionalService",
    "municipalService",
    "groupMunicipalService"
})
public class PDServiceChargeExportType {

    /**
     * Жилищная услуга
     * 
     */
    @XmlElement(name = "HousingService")
    protected PDServiceChargeExportType.HousingService housingService;
    /**
     * Вид дополнительной услуги
     * 
     */
    @XmlElement(name = "AdditionalService")
    protected PDServiceChargeExportType.AdditionalService additionalService;
    /**
     * Главная коммунальная услуга
     * 
     */
    @XmlElement(name = "MunicipalService")
    protected PDServiceChargeExportType.MunicipalService municipalService;
    /**
     * Блок главных коммунальных услуг, сгруппированных по виду коммунальной услуги.
     * Заполняется, если для расчета итоговой суммы начислений по коммунальной услуге используются двухкомпонентные тарифы или тарифы (цены), отличные от одноставочных тарифов (цен)
     * 
     */
    @XmlElement(name = "GroupMunicipalService")
    protected PDServiceChargeExportType.GroupMunicipalService groupMunicipalService;

    /**
     * Жилищная услуга
     * 
     * @return
     *     possible object is
     *     {@link PDServiceChargeExportType.HousingService }
     *     
     */
    public PDServiceChargeExportType.HousingService getHousingService() {
        return housingService;
    }

    /**
     * Sets the value of the housingService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDServiceChargeExportType.HousingService }
     *     
     * @see #getHousingService()
     */
    public void setHousingService(PDServiceChargeExportType.HousingService value) {
        this.housingService = value;
    }

    /**
     * Вид дополнительной услуги
     * 
     * @return
     *     possible object is
     *     {@link PDServiceChargeExportType.AdditionalService }
     *     
     */
    public PDServiceChargeExportType.AdditionalService getAdditionalService() {
        return additionalService;
    }

    /**
     * Sets the value of the additionalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDServiceChargeExportType.AdditionalService }
     *     
     * @see #getAdditionalService()
     */
    public void setAdditionalService(PDServiceChargeExportType.AdditionalService value) {
        this.additionalService = value;
    }

    /**
     * Главная коммунальная услуга
     * 
     * @return
     *     possible object is
     *     {@link PDServiceChargeExportType.MunicipalService }
     *     
     */
    public PDServiceChargeExportType.MunicipalService getMunicipalService() {
        return municipalService;
    }

    /**
     * Sets the value of the municipalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDServiceChargeExportType.MunicipalService }
     *     
     * @see #getMunicipalService()
     */
    public void setMunicipalService(PDServiceChargeExportType.MunicipalService value) {
        this.municipalService = value;
    }

    /**
     * Блок главных коммунальных услуг, сгруппированных по виду коммунальной услуги.
     * Заполняется, если для расчета итоговой суммы начислений по коммунальной услуге используются двухкомпонентные тарифы или тарифы (цены), отличные от одноставочных тарифов (цен)
     * 
     * @return
     *     possible object is
     *     {@link PDServiceChargeExportType.GroupMunicipalService }
     *     
     */
    public PDServiceChargeExportType.GroupMunicipalService getGroupMunicipalService() {
        return groupMunicipalService;
    }

    /**
     * Sets the value of the groupMunicipalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDServiceChargeExportType.GroupMunicipalService }
     *     
     * @see #getGroupMunicipalService()
     */
    public void setGroupMunicipalService(PDServiceChargeExportType.GroupMunicipalService value) {
        this.groupMunicipalService = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ServicePDType">
     *       <sequence>
     *         <element name="ServiceCharge" type="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceChargeType" minOccurs="0"/>
     *         <element name="Consumption" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="Volume" maxOccurs="2">
     *                     <complexType>
     *                       <simpleContent>
     *                         <extension base="<http://dom.gosuslugi.ru/schema/integration/bills/>ConsumptionVolumeType">
     *                           <attribute name="type">
     *                             <simpleType>
     *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 <enumeration value="I"/>
     *                                 <enumeration value="O"/>
     *                               </restriction>
     *                             </simpleType>
     *                           </attribute>
     *                         </extension>
     *                       </simpleContent>
     *                     </complexType>
     *                   </element>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="PaymentRecalculation" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="recalculationReason">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         <minLength value="1"/>
     *                         <maxLength value="500"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="sum">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         <fractionDigits value="2"/>
     *                         <minInclusive value="-9999999999.99"/>
     *                         <maxInclusive value="9999999999.99"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                 </sequence>
     *               </restriction>
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
        "serviceCharge",
        "consumption",
        "paymentRecalculation"
    })
    public static class AdditionalService
        extends ServicePDType
    {

        /**
         * Перерасчеты, льготы, субсидии
         * 
         */
        @XmlElement(name = "ServiceCharge")
        protected ServiceChargeType serviceCharge;
        /**
         * Объем коммунальных услуг / Объем коммунальных ресурсов, потребленных при использовании и содержании общего имущества в многоквартирном доме, или коммунальных услуг на общедомовые нужды.
         * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
         * 
         */
        @XmlElement(name = "Consumption")
        protected PDServiceChargeExportType.AdditionalService.Consumption consumption;
        /**
         * Сведения о перерасчетах (доначислении +, уменьшении -).
         * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 6 примерной формы ПД
         * 
         */
        @XmlElement(name = "PaymentRecalculation")
        protected PDServiceChargeExportType.AdditionalService.PaymentRecalculation paymentRecalculation;

        /**
         * Перерасчеты, льготы, субсидии
         * 
         * @return
         *     possible object is
         *     {@link ServiceChargeType }
         *     
         */
        public ServiceChargeType getServiceCharge() {
            return serviceCharge;
        }

        /**
         * Sets the value of the serviceCharge property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceChargeType }
         *     
         * @see #getServiceCharge()
         */
        public void setServiceCharge(ServiceChargeType value) {
            this.serviceCharge = value;
        }

        /**
         * Объем коммунальных услуг / Объем коммунальных ресурсов, потребленных при использовании и содержании общего имущества в многоквартирном доме, или коммунальных услуг на общедомовые нужды.
         * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
         * 
         * @return
         *     possible object is
         *     {@link PDServiceChargeExportType.AdditionalService.Consumption }
         *     
         */
        public PDServiceChargeExportType.AdditionalService.Consumption getConsumption() {
            return consumption;
        }

        /**
         * Sets the value of the consumption property.
         * 
         * @param value
         *     allowed object is
         *     {@link PDServiceChargeExportType.AdditionalService.Consumption }
         *     
         * @see #getConsumption()
         */
        public void setConsumption(PDServiceChargeExportType.AdditionalService.Consumption value) {
            this.consumption = value;
        }

        /**
         * Сведения о перерасчетах (доначислении +, уменьшении -).
         * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 6 примерной формы ПД
         * 
         * @return
         *     possible object is
         *     {@link PDServiceChargeExportType.AdditionalService.PaymentRecalculation }
         *     
         */
        public PDServiceChargeExportType.AdditionalService.PaymentRecalculation getPaymentRecalculation() {
            return paymentRecalculation;
        }

        /**
         * Sets the value of the paymentRecalculation property.
         * 
         * @param value
         *     allowed object is
         *     {@link PDServiceChargeExportType.AdditionalService.PaymentRecalculation }
         *     
         * @see #getPaymentRecalculation()
         */
        public void setPaymentRecalculation(PDServiceChargeExportType.AdditionalService.PaymentRecalculation value) {
            this.paymentRecalculation = value;
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
         *         <element name="Volume" maxOccurs="2">
         *           <complexType>
         *             <simpleContent>
         *               <extension base="<http://dom.gosuslugi.ru/schema/integration/bills/>ConsumptionVolumeType">
         *                 <attribute name="type">
         *                   <simpleType>
         *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       <enumeration value="I"/>
         *                       <enumeration value="O"/>
         *                     </restriction>
         *                   </simpleType>
         *                 </attribute>
         *               </extension>
         *             </simpleContent>
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
            "volume"
        })
        public static class Consumption {

            /**
             * Объем
             * 
             */
            @XmlElement(name = "Volume", required = true)
            protected List<PDServiceChargeExportType.AdditionalService.Consumption.Volume> volume;

            /**
             * Объем
             * 
             * Gets the value of the volume property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the volume property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getVolume().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PDServiceChargeExportType.AdditionalService.Consumption.Volume }
             * </p>
             * 
             * 
             * @return
             *     The value of the volume property.
             */
            public List<PDServiceChargeExportType.AdditionalService.Consumption.Volume> getVolume() {
                if (volume == null) {
                    volume = new ArrayList<>();
                }
                return this.volume;
            }


            /**
             * <p>Java class for anonymous complex type</p>.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <simpleContent>
             *     <extension base="<http://dom.gosuslugi.ru/schema/integration/bills/>ConsumptionVolumeType">
             *       <attribute name="type">
             *         <simpleType>
             *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             <enumeration value="I"/>
             *             <enumeration value="O"/>
             *           </restriction>
             *         </simpleType>
             *       </attribute>
             *     </extension>
             *   </simpleContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Volume {

                /**
                 * Тип объема потребления КУ
                 * 
                 */
                @XmlValue
                protected BigDecimal value;
                /**
                 * Тип:
                 * (I)ndividualConsumption - объем коммунальных услуг
                 * house(O)verallNeeds - объем коммунальных ресурсов, потребленных при использовании и содержании общего имущества в многоквартирном доме, или коммунальных услуг на общедомовые нужды
                 * 
                 */
                @XmlAttribute(name = "type")
                protected String type;

                /**
                 * Тип объема потребления КУ
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 * @see #getValue()
                 */
                public void setValue(BigDecimal value) {
                    this.value = value;
                }

                /**
                 * Тип:
                 * (I)ndividualConsumption - объем коммунальных услуг
                 * house(O)verallNeeds - объем коммунальных ресурсов, потребленных при использовании и содержании общего имущества в многоквартирном доме, или коммунальных услуг на общедомовые нужды
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
         *         <element name="recalculationReason">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <minLength value="1"/>
         *               <maxLength value="500"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="sum">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               <fractionDigits value="2"/>
         *               <minInclusive value="-9999999999.99"/>
         *               <maxInclusive value="9999999999.99"/>
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
            "recalculationReason",
            "sum"
        })
        public static class PaymentRecalculation {

            /**
             * Основания перерасчётов
             * 
             */
            @XmlElement(required = true)
            protected String recalculationReason;
            /**
             * Сумма
             * 
             */
            @XmlElement(required = true)
            protected BigDecimal sum;

            /**
             * Основания перерасчётов
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRecalculationReason() {
                return recalculationReason;
            }

            /**
             * Sets the value of the recalculationReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getRecalculationReason()
             */
            public void setRecalculationReason(String value) {
                this.recalculationReason = value;
            }

            /**
             * Сумма
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSum() {
                return sum;
            }

            /**
             * Sets the value of the sum property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getSum()
             */
            public void setSum(BigDecimal value) {
                this.sum = value;
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
     *         <element name="TypeMunicipalService" type="{http://dom.gosuslugi.ru/schema/integration/bills/}TypeMunicipalServiceExportType"/>
     *         <element name="MunicipalService" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ServicePDType">
     *                 <sequence>
     *                   <element name="ServiceCharge" type="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceChargeImportType" minOccurs="0"/>
     *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/bills/}PiecemealPayment" minOccurs="0"/>
     *                   <element name="PaymentRecalculation" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="recalculationReason">
     *                               <simpleType>
     *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   <minLength value="1"/>
     *                                   <maxLength value="500"/>
     *                                 </restriction>
     *                               </simpleType>
     *                             </element>
     *                             <element name="sum">
     *                               <simpleType>
     *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                   <fractionDigits value="2"/>
     *                                   <minInclusive value="-9999999999.99"/>
     *                                   <maxInclusive value="9999999999.99"/>
     *                                 </restriction>
     *                               </simpleType>
     *                             </element>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceInformation" minOccurs="0"/>
     *                   <element name="Consumption" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="Volume" maxOccurs="2">
     *                               <complexType>
     *                                 <simpleContent>
     *                                   <extension base="<http://dom.gosuslugi.ru/schema/integration/bills/>ConsumptionVolumeType">
     *                                     <attribute name="type">
     *                                       <simpleType>
     *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           <enumeration value="I"/>
     *                                           <enumeration value="O"/>
     *                                         </restriction>
     *                                       </simpleType>
     *                                     </attribute>
     *                                     <attribute name="determiningMethod">
     *                                       <simpleType>
     *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           <length value="1"/>
     *                                           <enumeration value="N"/>
     *                                           <enumeration value="M"/>
     *                                           <enumeration value="O"/>
     *                                         </restriction>
     *                                       </simpleType>
     *                                     </attribute>
     *                                   </extension>
     *                                 </simpleContent>
     *                               </complexType>
     *                             </element>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="MultiplyingFactor" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="Ratio">
     *                               <simpleType>
     *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                   <totalDigits value="5"/>
     *                                   <fractionDigits value="2"/>
     *                                 </restriction>
     *                               </simpleType>
     *                             </element>
     *                             <element name="AmountOfExcessFees" minOccurs="0">
     *                               <simpleType>
     *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                   <totalDigits value="13"/>
     *                                   <fractionDigits value="2"/>
     *                                 </restriction>
     *                               </simpleType>
     *                             </element>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="MunicipalServiceIndividualConsumptionPayable" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         <totalDigits value="13"/>
     *                         <fractionDigits value="2"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="MunicipalServiceCommunalConsumptionPayable" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         <totalDigits value="13"/>
     *                         <fractionDigits value="2"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="AmountOfPaymentMunicipalServiceIndividualConsumption" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         <totalDigits value="13"/>
     *                         <fractionDigits value="2"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="AmountOfPaymentMunicipalServiceCommunalConsumption" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         <totalDigits value="13"/>
     *                         <fractionDigits value="2"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                 </sequence>
     *               </extension>
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
        "typeMunicipalService",
        "municipalService"
    })
    public static class GroupMunicipalService {

        /**
         * Вид коммунальной услуги
         * 
         */
        @XmlElement(name = "TypeMunicipalService", required = true)
        protected TypeMunicipalServiceExportType typeMunicipalService;
        /**
         * Главная коммунальная услуга с объемом потребления
         * 
         */
        @XmlElement(name = "MunicipalService")
        protected List<PDServiceChargeExportType.GroupMunicipalService.MunicipalService> municipalService;

        /**
         * Вид коммунальной услуги
         * 
         * @return
         *     possible object is
         *     {@link TypeMunicipalServiceExportType }
         *     
         */
        public TypeMunicipalServiceExportType getTypeMunicipalService() {
            return typeMunicipalService;
        }

        /**
         * Sets the value of the typeMunicipalService property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeMunicipalServiceExportType }
         *     
         * @see #getTypeMunicipalService()
         */
        public void setTypeMunicipalService(TypeMunicipalServiceExportType value) {
            this.typeMunicipalService = value;
        }

        /**
         * Главная коммунальная услуга с объемом потребления
         * 
         * Gets the value of the municipalService property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the municipalService property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getMunicipalService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PDServiceChargeExportType.GroupMunicipalService.MunicipalService }
         * </p>
         * 
         * 
         * @return
         *     The value of the municipalService property.
         */
        public List<PDServiceChargeExportType.GroupMunicipalService.MunicipalService> getMunicipalService() {
            if (municipalService == null) {
                municipalService = new ArrayList<>();
            }
            return this.municipalService;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ServicePDType">
         *       <sequence>
         *         <element name="ServiceCharge" type="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceChargeImportType" minOccurs="0"/>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/bills/}PiecemealPayment" minOccurs="0"/>
         *         <element name="PaymentRecalculation" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="recalculationReason">
         *                     <simpleType>
         *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         <minLength value="1"/>
         *                         <maxLength value="500"/>
         *                       </restriction>
         *                     </simpleType>
         *                   </element>
         *                   <element name="sum">
         *                     <simpleType>
         *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                         <fractionDigits value="2"/>
         *                         <minInclusive value="-9999999999.99"/>
         *                         <maxInclusive value="9999999999.99"/>
         *                       </restriction>
         *                     </simpleType>
         *                   </element>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceInformation" minOccurs="0"/>
         *         <element name="Consumption" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="Volume" maxOccurs="2">
         *                     <complexType>
         *                       <simpleContent>
         *                         <extension base="<http://dom.gosuslugi.ru/schema/integration/bills/>ConsumptionVolumeType">
         *                           <attribute name="type">
         *                             <simpleType>
         *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 <enumeration value="I"/>
         *                                 <enumeration value="O"/>
         *                               </restriction>
         *                             </simpleType>
         *                           </attribute>
         *                           <attribute name="determiningMethod">
         *                             <simpleType>
         *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 <length value="1"/>
         *                                 <enumeration value="N"/>
         *                                 <enumeration value="M"/>
         *                                 <enumeration value="O"/>
         *                               </restriction>
         *                             </simpleType>
         *                           </attribute>
         *                         </extension>
         *                       </simpleContent>
         *                     </complexType>
         *                   </element>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="MultiplyingFactor" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="Ratio">
         *                     <simpleType>
         *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                         <totalDigits value="5"/>
         *                         <fractionDigits value="2"/>
         *                       </restriction>
         *                     </simpleType>
         *                   </element>
         *                   <element name="AmountOfExcessFees" minOccurs="0">
         *                     <simpleType>
         *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                         <totalDigits value="13"/>
         *                         <fractionDigits value="2"/>
         *                       </restriction>
         *                     </simpleType>
         *                   </element>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="MunicipalServiceIndividualConsumptionPayable" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               <totalDigits value="13"/>
         *               <fractionDigits value="2"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="MunicipalServiceCommunalConsumptionPayable" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               <totalDigits value="13"/>
         *               <fractionDigits value="2"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="AmountOfPaymentMunicipalServiceIndividualConsumption" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               <totalDigits value="13"/>
         *               <fractionDigits value="2"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="AmountOfPaymentMunicipalServiceCommunalConsumption" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               <totalDigits value="13"/>
         *               <fractionDigits value="2"/>
         *             </restriction>
         *           </simpleType>
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
            "serviceCharge",
            "piecemealPayment",
            "paymentRecalculation",
            "serviceInformation",
            "consumption",
            "multiplyingFactor",
            "municipalServiceIndividualConsumptionPayable",
            "municipalServiceCommunalConsumptionPayable",
            "amountOfPaymentMunicipalServiceIndividualConsumption",
            "amountOfPaymentMunicipalServiceCommunalConsumption"
        })
        public static class MunicipalService
            extends ServicePDType
        {

            /**
             * Перерасчеты, льготы, субсидии
             * 
             */
            @XmlElement(name = "ServiceCharge")
            protected ServiceChargeImportType serviceCharge;
            /**
             * Расчет суммы к оплате с учетом рассрочки платежа.
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 5 примерной формы ПД
             * 
             */
            @XmlElement(name = "PiecemealPayment")
            protected ru.gosuslugi.dom.schema.integration.bills.PiecemealPayment piecemealPayment;
            /**
             * Сведения о перерасчетах (доначислении +, уменьшении -).
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 6 примерной формы ПД
             * 
             */
            @XmlElement(name = "PaymentRecalculation")
            protected PDServiceChargeExportType.GroupMunicipalService.MunicipalService.PaymentRecalculation paymentRecalculation;
            /**
             * Справочная информация.
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 4 примерной формы ПД
             * 
             */
            @XmlElement(name = "ServiceInformation")
            protected ru.gosuslugi.dom.schema.integration.bills.ServiceInformation serviceInformation;
            /**
             * Объем коммунальных услуг / Объем коммунальных ресурсов, потребленных при использовании и содержании общего имущества в многоквартирном доме, или коммунальных услуг на общедомовые нужды.
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
             * 
             */
            @XmlElement(name = "Consumption")
            protected PDServiceChargeExportType.GroupMunicipalService.MunicipalService.Consumption consumption;
            /**
             * Повышающий коэффициент.
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
             * 
             */
            @XmlElement(name = "MultiplyingFactor")
            protected PDServiceChargeExportType.GroupMunicipalService.MunicipalService.MultiplyingFactor multiplyingFactor;
            /**
             * К оплате за индивидуальное потребление коммунальной услуги, руб.
             * Ссылка на пост. 924 – Приложение 2, п. 23
             * 
             */
            @XmlElement(name = "MunicipalServiceIndividualConsumptionPayable")
            protected BigDecimal municipalServiceIndividualConsumptionPayable;
            /**
             * К оплате за общедомовое потребление коммунальной услуги, руб.
             * Ссылка на пост. 924 – Приложение 2, п. 23
             * 
             */
            @XmlElement(name = "MunicipalServiceCommunalConsumptionPayable")
            protected BigDecimal municipalServiceCommunalConsumptionPayable;
            /**
             * Размер платы за коммунальные услуги, индивидуальное потребление.
             * Ссылка на пост. 924 – Приложение 2, п. 18
             * 
             */
            @XmlElement(name = "AmountOfPaymentMunicipalServiceIndividualConsumption")
            protected BigDecimal amountOfPaymentMunicipalServiceIndividualConsumption;
            /**
             * Размер платы за коммунальные услуги, общедомовые нужды.
             * Ссылка на пост. 924 – Приложение 2, п. 18
             * 
             */
            @XmlElement(name = "AmountOfPaymentMunicipalServiceCommunalConsumption")
            protected BigDecimal amountOfPaymentMunicipalServiceCommunalConsumption;

            /**
             * Перерасчеты, льготы, субсидии
             * 
             * @return
             *     possible object is
             *     {@link ServiceChargeImportType }
             *     
             */
            public ServiceChargeImportType getServiceCharge() {
                return serviceCharge;
            }

            /**
             * Sets the value of the serviceCharge property.
             * 
             * @param value
             *     allowed object is
             *     {@link ServiceChargeImportType }
             *     
             * @see #getServiceCharge()
             */
            public void setServiceCharge(ServiceChargeImportType value) {
                this.serviceCharge = value;
            }

            /**
             * Расчет суммы к оплате с учетом рассрочки платежа.
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 5 примерной формы ПД
             * 
             * @return
             *     possible object is
             *     {@link ru.gosuslugi.dom.schema.integration.bills.PiecemealPayment }
             *     
             */
            public ru.gosuslugi.dom.schema.integration.bills.PiecemealPayment getPiecemealPayment() {
                return piecemealPayment;
            }

            /**
             * Sets the value of the piecemealPayment property.
             * 
             * @param value
             *     allowed object is
             *     {@link ru.gosuslugi.dom.schema.integration.bills.PiecemealPayment }
             *     
             * @see #getPiecemealPayment()
             */
            public void setPiecemealPayment(ru.gosuslugi.dom.schema.integration.bills.PiecemealPayment value) {
                this.piecemealPayment = value;
            }

            /**
             * Сведения о перерасчетах (доначислении +, уменьшении -).
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 6 примерной формы ПД
             * 
             * @return
             *     possible object is
             *     {@link PDServiceChargeExportType.GroupMunicipalService.MunicipalService.PaymentRecalculation }
             *     
             */
            public PDServiceChargeExportType.GroupMunicipalService.MunicipalService.PaymentRecalculation getPaymentRecalculation() {
                return paymentRecalculation;
            }

            /**
             * Sets the value of the paymentRecalculation property.
             * 
             * @param value
             *     allowed object is
             *     {@link PDServiceChargeExportType.GroupMunicipalService.MunicipalService.PaymentRecalculation }
             *     
             * @see #getPaymentRecalculation()
             */
            public void setPaymentRecalculation(PDServiceChargeExportType.GroupMunicipalService.MunicipalService.PaymentRecalculation value) {
                this.paymentRecalculation = value;
            }

            /**
             * Справочная информация.
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 4 примерной формы ПД
             * 
             * @return
             *     possible object is
             *     {@link ru.gosuslugi.dom.schema.integration.bills.ServiceInformation }
             *     
             */
            public ru.gosuslugi.dom.schema.integration.bills.ServiceInformation getServiceInformation() {
                return serviceInformation;
            }

            /**
             * Sets the value of the serviceInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link ru.gosuslugi.dom.schema.integration.bills.ServiceInformation }
             *     
             * @see #getServiceInformation()
             */
            public void setServiceInformation(ru.gosuslugi.dom.schema.integration.bills.ServiceInformation value) {
                this.serviceInformation = value;
            }

            /**
             * Объем коммунальных услуг / Объем коммунальных ресурсов, потребленных при использовании и содержании общего имущества в многоквартирном доме, или коммунальных услуг на общедомовые нужды.
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
             * 
             * @return
             *     possible object is
             *     {@link PDServiceChargeExportType.GroupMunicipalService.MunicipalService.Consumption }
             *     
             */
            public PDServiceChargeExportType.GroupMunicipalService.MunicipalService.Consumption getConsumption() {
                return consumption;
            }

            /**
             * Sets the value of the consumption property.
             * 
             * @param value
             *     allowed object is
             *     {@link PDServiceChargeExportType.GroupMunicipalService.MunicipalService.Consumption }
             *     
             * @see #getConsumption()
             */
            public void setConsumption(PDServiceChargeExportType.GroupMunicipalService.MunicipalService.Consumption value) {
                this.consumption = value;
            }

            /**
             * Повышающий коэффициент.
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
             * 
             * @return
             *     possible object is
             *     {@link PDServiceChargeExportType.GroupMunicipalService.MunicipalService.MultiplyingFactor }
             *     
             */
            public PDServiceChargeExportType.GroupMunicipalService.MunicipalService.MultiplyingFactor getMultiplyingFactor() {
                return multiplyingFactor;
            }

            /**
             * Sets the value of the multiplyingFactor property.
             * 
             * @param value
             *     allowed object is
             *     {@link PDServiceChargeExportType.GroupMunicipalService.MunicipalService.MultiplyingFactor }
             *     
             * @see #getMultiplyingFactor()
             */
            public void setMultiplyingFactor(PDServiceChargeExportType.GroupMunicipalService.MunicipalService.MultiplyingFactor value) {
                this.multiplyingFactor = value;
            }

            /**
             * К оплате за индивидуальное потребление коммунальной услуги, руб.
             * Ссылка на пост. 924 – Приложение 2, п. 23
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMunicipalServiceIndividualConsumptionPayable() {
                return municipalServiceIndividualConsumptionPayable;
            }

            /**
             * Sets the value of the municipalServiceIndividualConsumptionPayable property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getMunicipalServiceIndividualConsumptionPayable()
             */
            public void setMunicipalServiceIndividualConsumptionPayable(BigDecimal value) {
                this.municipalServiceIndividualConsumptionPayable = value;
            }

            /**
             * К оплате за общедомовое потребление коммунальной услуги, руб.
             * Ссылка на пост. 924 – Приложение 2, п. 23
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMunicipalServiceCommunalConsumptionPayable() {
                return municipalServiceCommunalConsumptionPayable;
            }

            /**
             * Sets the value of the municipalServiceCommunalConsumptionPayable property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getMunicipalServiceCommunalConsumptionPayable()
             */
            public void setMunicipalServiceCommunalConsumptionPayable(BigDecimal value) {
                this.municipalServiceCommunalConsumptionPayable = value;
            }

            /**
             * Размер платы за коммунальные услуги, индивидуальное потребление.
             * Ссылка на пост. 924 – Приложение 2, п. 18
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAmountOfPaymentMunicipalServiceIndividualConsumption() {
                return amountOfPaymentMunicipalServiceIndividualConsumption;
            }

            /**
             * Sets the value of the amountOfPaymentMunicipalServiceIndividualConsumption property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getAmountOfPaymentMunicipalServiceIndividualConsumption()
             */
            public void setAmountOfPaymentMunicipalServiceIndividualConsumption(BigDecimal value) {
                this.amountOfPaymentMunicipalServiceIndividualConsumption = value;
            }

            /**
             * Размер платы за коммунальные услуги, общедомовые нужды.
             * Ссылка на пост. 924 – Приложение 2, п. 18
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAmountOfPaymentMunicipalServiceCommunalConsumption() {
                return amountOfPaymentMunicipalServiceCommunalConsumption;
            }

            /**
             * Sets the value of the amountOfPaymentMunicipalServiceCommunalConsumption property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getAmountOfPaymentMunicipalServiceCommunalConsumption()
             */
            public void setAmountOfPaymentMunicipalServiceCommunalConsumption(BigDecimal value) {
                this.amountOfPaymentMunicipalServiceCommunalConsumption = value;
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
             *         <element name="Volume" maxOccurs="2">
             *           <complexType>
             *             <simpleContent>
             *               <extension base="<http://dom.gosuslugi.ru/schema/integration/bills/>ConsumptionVolumeType">
             *                 <attribute name="type">
             *                   <simpleType>
             *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       <enumeration value="I"/>
             *                       <enumeration value="O"/>
             *                     </restriction>
             *                   </simpleType>
             *                 </attribute>
             *                 <attribute name="determiningMethod">
             *                   <simpleType>
             *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       <length value="1"/>
             *                       <enumeration value="N"/>
             *                       <enumeration value="M"/>
             *                       <enumeration value="O"/>
             *                     </restriction>
             *                   </simpleType>
             *                 </attribute>
             *               </extension>
             *             </simpleContent>
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
                "volume"
            })
            public static class Consumption {

                /**
                 * Объем
                 * 
                 */
                @XmlElement(name = "Volume", required = true)
                protected List<PDServiceChargeExportType.GroupMunicipalService.MunicipalService.Consumption.Volume> volume;

                /**
                 * Объем
                 * 
                 * Gets the value of the volume property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the volume property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getVolume().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PDServiceChargeExportType.GroupMunicipalService.MunicipalService.Consumption.Volume }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the volume property.
                 */
                public List<PDServiceChargeExportType.GroupMunicipalService.MunicipalService.Consumption.Volume> getVolume() {
                    if (volume == null) {
                        volume = new ArrayList<>();
                    }
                    return this.volume;
                }


                /**
                 * <p>Java class for anonymous complex type</p>.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.</p>
                 * 
                 * <pre>{@code
                 * <complexType>
                 *   <simpleContent>
                 *     <extension base="<http://dom.gosuslugi.ru/schema/integration/bills/>ConsumptionVolumeType">
                 *       <attribute name="type">
                 *         <simpleType>
                 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             <enumeration value="I"/>
                 *             <enumeration value="O"/>
                 *           </restriction>
                 *         </simpleType>
                 *       </attribute>
                 *       <attribute name="determiningMethod">
                 *         <simpleType>
                 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             <length value="1"/>
                 *             <enumeration value="N"/>
                 *             <enumeration value="M"/>
                 *             <enumeration value="O"/>
                 *           </restriction>
                 *         </simpleType>
                 *       </attribute>
                 *     </extension>
                 *   </simpleContent>
                 * </complexType>
                 * }</pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class Volume {

                    /**
                     * Тип объема потребления КУ
                     * 
                     */
                    @XmlValue
                    protected BigDecimal value;
                    /**
                     * Тип:
                     * (I)ndividualConsumption - объем коммунальных услуг
                     * house(O)verallNeeds - объем коммунальных ресурсов, потребленных при использовании и содержании общего имущества в многоквартирном доме, или коммунальных услуг на общедомовые нужды
                     * 
                     */
                    @XmlAttribute(name = "type")
                    protected String type;
                    /**
                     * Способ определения объемов КУ:
                     * (N)orm - Норматив
                     * (M)etering device - Прибор учета
                     * (O)ther - Иное
                     * 
                     */
                    @XmlAttribute(name = "determiningMethod")
                    protected String determiningMethod;

                    /**
                     * Тип объема потребления КУ
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     * @see #getValue()
                     */
                    public void setValue(BigDecimal value) {
                        this.value = value;
                    }

                    /**
                     * Тип:
                     * (I)ndividualConsumption - объем коммунальных услуг
                     * house(O)verallNeeds - объем коммунальных ресурсов, потребленных при использовании и содержании общего имущества в многоквартирном доме, или коммунальных услуг на общедомовые нужды
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

                    /**
                     * Способ определения объемов КУ:
                     * (N)orm - Норматив
                     * (M)etering device - Прибор учета
                     * (O)ther - Иное
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDeterminingMethod() {
                        return determiningMethod;
                    }

                    /**
                     * Sets the value of the determiningMethod property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     * @see #getDeterminingMethod()
                     */
                    public void setDeterminingMethod(String value) {
                        this.determiningMethod = value;
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
             *         <element name="Ratio">
             *           <simpleType>
             *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *               <totalDigits value="5"/>
             *               <fractionDigits value="2"/>
             *             </restriction>
             *           </simpleType>
             *         </element>
             *         <element name="AmountOfExcessFees" minOccurs="0">
             *           <simpleType>
             *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *               <totalDigits value="13"/>
             *               <fractionDigits value="2"/>
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
                "ratio",
                "amountOfExcessFees"
            })
            public static class MultiplyingFactor {

                /**
                 * Размер повышающего коэффициента
                 * 
                 */
                @XmlElement(name = "Ratio", required = true)
                protected BigDecimal ratio;
                /**
                 * Размер превышения платы, рассчитанной с применением повышающего коэффициента над размером платы, рассчитанной без учета повышающего коэффициента, руб.
                 * 
                 */
                @XmlElement(name = "AmountOfExcessFees")
                protected BigDecimal amountOfExcessFees;

                /**
                 * Размер повышающего коэффициента
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getRatio() {
                    return ratio;
                }

                /**
                 * Sets the value of the ratio property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 * @see #getRatio()
                 */
                public void setRatio(BigDecimal value) {
                    this.ratio = value;
                }

                /**
                 * Размер превышения платы, рассчитанной с применением повышающего коэффициента над размером платы, рассчитанной без учета повышающего коэффициента, руб.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getAmountOfExcessFees() {
                    return amountOfExcessFees;
                }

                /**
                 * Sets the value of the amountOfExcessFees property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 * @see #getAmountOfExcessFees()
                 */
                public void setAmountOfExcessFees(BigDecimal value) {
                    this.amountOfExcessFees = value;
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
             *         <element name="recalculationReason">
             *           <simpleType>
             *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               <minLength value="1"/>
             *               <maxLength value="500"/>
             *             </restriction>
             *           </simpleType>
             *         </element>
             *         <element name="sum">
             *           <simpleType>
             *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *               <fractionDigits value="2"/>
             *               <minInclusive value="-9999999999.99"/>
             *               <maxInclusive value="9999999999.99"/>
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
                "recalculationReason",
                "sum"
            })
            public static class PaymentRecalculation {

                /**
                 * Основания перерасчётов
                 * 
                 */
                @XmlElement(required = true)
                protected String recalculationReason;
                /**
                 * Сумма
                 * 
                 */
                @XmlElement(required = true)
                protected BigDecimal sum;

                /**
                 * Основания перерасчётов
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRecalculationReason() {
                    return recalculationReason;
                }

                /**
                 * Sets the value of the recalculationReason property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getRecalculationReason()
                 */
                public void setRecalculationReason(String value) {
                    this.recalculationReason = value;
                }

                /**
                 * Сумма
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getSum() {
                    return sum;
                }

                /**
                 * Sets the value of the sum property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 * @see #getSum()
                 */
                public void setSum(BigDecimal value) {
                    this.sum = value;
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ServicePDType">
     *       <sequence minOccurs="0">
     *         <element name="ServiceCharge" type="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceChargeType" minOccurs="0"/>
     *         <element name="MunicipalResource" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="ServiceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *                   <element name="Consumption" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="Volume">
     *                               <complexType>
     *                                 <simpleContent>
     *                                   <extension base="<http://dom.gosuslugi.ru/schema/integration/bills/>ConsumptionVolumeType">
     *                                     <attribute name="type">
     *                                       <simpleType>
     *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           <enumeration value="O"/>
     *                                         </restriction>
     *                                       </simpleType>
     *                                     </attribute>
     *                                     <attribute name="determiningMethod">
     *                                       <simpleType>
     *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           <length value="1"/>
     *                                           <enumeration value="N"/>
     *                                           <enumeration value="M"/>
     *                                           <enumeration value="O"/>
     *                                         </restriction>
     *                                       </simpleType>
     *                                     </attribute>
     *                                   </extension>
     *                                 </simpleContent>
     *                               </complexType>
     *                             </element>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="Rate" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         <fractionDigits value="6"/>
     *                         <totalDigits value="14"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="AccountingPeriodTotal" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         <totalDigits value="18"/>
     *                         <fractionDigits value="2"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="ServiceCharge" type="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceChargeType" minOccurs="0"/>
     *                   <element name="MunicipalServiceCommunalConsumptionPayable" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         <totalDigits value="18"/>
     *                         <fractionDigits value="2"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="ServiceInformation" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="houseOverallNeedsNorm" type="{http://dom.gosuslugi.ru/schema/integration/bills/}VolumePDType" minOccurs="0"/>
     *                             <element name="houseOverallNeedsCurrentValue" type="{http://dom.gosuslugi.ru/schema/integration/bills/}VolumePDType" minOccurs="0"/>
     *                             <element name="houseTotalHouseOverallNeeds" type="{http://dom.gosuslugi.ru/schema/integration/bills/}VolumePDType" minOccurs="0"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="PaymentRecalculation" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="recalculationReason">
     *                               <simpleType>
     *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   <minLength value="1"/>
     *                                   <maxLength value="500"/>
     *                                 </restriction>
     *                               </simpleType>
     *                             </element>
     *                             <element name="sum">
     *                               <simpleType>
     *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                   <fractionDigits value="2"/>
     *                                   <minInclusive value="-9999999999.99"/>
     *                                   <maxInclusive value="9999999999.99"/>
     *                                 </restriction>
     *                               </simpleType>
     *                             </element>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="AmountOfPaymentMunicipalServiceCommunalConsumption" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         <totalDigits value="13"/>
     *                         <fractionDigits value="2"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="TotalPayable" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         <totalDigits value="18"/>
     *                         <fractionDigits value="2"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="DebtPreviousPeriodsOrAdvanceBillingPeriod" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         <totalDigits value="13"/>
     *                         <fractionDigits value="2"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="Penalties" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         <totalDigits value="13"/>
     *                         <fractionDigits value="2"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="ServiceProviderPenalties" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         <totalDigits value="13"/>
     *                         <fractionDigits value="2"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="StateFees" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         <totalDigits value="13"/>
     *                         <fractionDigits value="2"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="CourtCosts" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         <totalDigits value="13"/>
     *                         <fractionDigits value="2"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="TotalPayableOverall" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         <totalDigits value="13"/>
     *                         <fractionDigits value="2"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *                   <element name="GeneralMunicipalResource" type="{http://dom.gosuslugi.ru/schema/integration/bills/}GeneralMunicipalResourceExportType" maxOccurs="unbounded" minOccurs="0"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="PaymentRecalculation" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="recalculationReason">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         <minLength value="1"/>
     *                         <maxLength value="500"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="sum">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         <fractionDigits value="2"/>
     *                         <minInclusive value="-9999999999.99"/>
     *                         <maxInclusive value="9999999999.99"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                 </sequence>
     *               </restriction>
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
        "serviceCharge",
        "municipalResource",
        "paymentRecalculation"
    })
    public static class HousingService
        extends ServicePDType
    {

        /**
         * Перерасчеты, льготы, субсидии
         * 
         */
        @XmlElement(name = "ServiceCharge")
        protected ServiceChargeType serviceCharge;
        /**
         * Виды коммунальных ресурсов, потребляемых при использовании и содержании общего имущества в многоквартирном доме.
         * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД.
         * 
         */
        @XmlElement(name = "MunicipalResource")
        protected List<PDServiceChargeExportType.HousingService.MunicipalResource> municipalResource;
        /**
         * Сведения о перерасчетах (доначислении +, уменьшении -).
         * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 6 примерной формы ПД
         * 
         */
        @XmlElement(name = "PaymentRecalculation")
        protected PDServiceChargeExportType.HousingService.PaymentRecalculation paymentRecalculation;

        /**
         * Перерасчеты, льготы, субсидии
         * 
         * @return
         *     possible object is
         *     {@link ServiceChargeType }
         *     
         */
        public ServiceChargeType getServiceCharge() {
            return serviceCharge;
        }

        /**
         * Sets the value of the serviceCharge property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceChargeType }
         *     
         * @see #getServiceCharge()
         */
        public void setServiceCharge(ServiceChargeType value) {
            this.serviceCharge = value;
        }

        /**
         * Виды коммунальных ресурсов, потребляемых при использовании и содержании общего имущества в многоквартирном доме.
         * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД.
         * 
         * Gets the value of the municipalResource property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the municipalResource property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getMunicipalResource().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PDServiceChargeExportType.HousingService.MunicipalResource }
         * </p>
         * 
         * 
         * @return
         *     The value of the municipalResource property.
         */
        public List<PDServiceChargeExportType.HousingService.MunicipalResource> getMunicipalResource() {
            if (municipalResource == null) {
                municipalResource = new ArrayList<>();
            }
            return this.municipalResource;
        }

        /**
         * Сведения о перерасчетах (доначислении +, уменьшении -).
         * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 6 примерной формы ПД
         * 
         * @return
         *     possible object is
         *     {@link PDServiceChargeExportType.HousingService.PaymentRecalculation }
         *     
         */
        public PDServiceChargeExportType.HousingService.PaymentRecalculation getPaymentRecalculation() {
            return paymentRecalculation;
        }

        /**
         * Sets the value of the paymentRecalculation property.
         * 
         * @param value
         *     allowed object is
         *     {@link PDServiceChargeExportType.HousingService.PaymentRecalculation }
         *     
         * @see #getPaymentRecalculation()
         */
        public void setPaymentRecalculation(PDServiceChargeExportType.HousingService.PaymentRecalculation value) {
            this.paymentRecalculation = value;
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
         *         <element name="ServiceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
         *         <element name="Consumption" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="Volume">
         *                     <complexType>
         *                       <simpleContent>
         *                         <extension base="<http://dom.gosuslugi.ru/schema/integration/bills/>ConsumptionVolumeType">
         *                           <attribute name="type">
         *                             <simpleType>
         *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 <enumeration value="O"/>
         *                               </restriction>
         *                             </simpleType>
         *                           </attribute>
         *                           <attribute name="determiningMethod">
         *                             <simpleType>
         *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 <length value="1"/>
         *                                 <enumeration value="N"/>
         *                                 <enumeration value="M"/>
         *                                 <enumeration value="O"/>
         *                               </restriction>
         *                             </simpleType>
         *                           </attribute>
         *                         </extension>
         *                       </simpleContent>
         *                     </complexType>
         *                   </element>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="Rate" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               <fractionDigits value="6"/>
         *               <totalDigits value="14"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="AccountingPeriodTotal" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               <totalDigits value="18"/>
         *               <fractionDigits value="2"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="ServiceCharge" type="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceChargeType" minOccurs="0"/>
         *         <element name="MunicipalServiceCommunalConsumptionPayable" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               <totalDigits value="18"/>
         *               <fractionDigits value="2"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="ServiceInformation" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="houseOverallNeedsNorm" type="{http://dom.gosuslugi.ru/schema/integration/bills/}VolumePDType" minOccurs="0"/>
         *                   <element name="houseOverallNeedsCurrentValue" type="{http://dom.gosuslugi.ru/schema/integration/bills/}VolumePDType" minOccurs="0"/>
         *                   <element name="houseTotalHouseOverallNeeds" type="{http://dom.gosuslugi.ru/schema/integration/bills/}VolumePDType" minOccurs="0"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="PaymentRecalculation" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="recalculationReason">
         *                     <simpleType>
         *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         <minLength value="1"/>
         *                         <maxLength value="500"/>
         *                       </restriction>
         *                     </simpleType>
         *                   </element>
         *                   <element name="sum">
         *                     <simpleType>
         *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                         <fractionDigits value="2"/>
         *                         <minInclusive value="-9999999999.99"/>
         *                         <maxInclusive value="9999999999.99"/>
         *                       </restriction>
         *                     </simpleType>
         *                   </element>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="AmountOfPaymentMunicipalServiceCommunalConsumption" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               <totalDigits value="13"/>
         *               <fractionDigits value="2"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="TotalPayable" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               <totalDigits value="18"/>
         *               <fractionDigits value="2"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="DebtPreviousPeriodsOrAdvanceBillingPeriod" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               <totalDigits value="13"/>
         *               <fractionDigits value="2"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="Penalties" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               <totalDigits value="13"/>
         *               <fractionDigits value="2"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="ServiceProviderPenalties" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               <totalDigits value="13"/>
         *               <fractionDigits value="2"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="StateFees" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               <totalDigits value="13"/>
         *               <fractionDigits value="2"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="CourtCosts" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               <totalDigits value="13"/>
         *               <fractionDigits value="2"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="TotalPayableOverall" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               <totalDigits value="13"/>
         *               <fractionDigits value="2"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
         *         <element name="GeneralMunicipalResource" type="{http://dom.gosuslugi.ru/schema/integration/bills/}GeneralMunicipalResourceExportType" maxOccurs="unbounded" minOccurs="0"/>
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
            "serviceType",
            "consumption",
            "rate",
            "accountingPeriodTotal",
            "serviceCharge",
            "municipalServiceCommunalConsumptionPayable",
            "serviceInformation",
            "paymentRecalculation",
            "amountOfPaymentMunicipalServiceCommunalConsumption",
            "totalPayable",
            "debtPreviousPeriodsOrAdvanceBillingPeriod",
            "penalties",
            "serviceProviderPenalties",
            "stateFees",
            "courtCosts",
            "totalPayableOverall",
            "orgPPAGUID",
            "generalMunicipalResource"
        })
        public static class MunicipalResource {

            /**
             * Код коммунального ресурса при содержании общего имущества. НСИ 2 "Вид коммунального ресурса"
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
             * 
             */
            @XmlElement(name = "ServiceType", required = true)
            protected NsiRef serviceType;
            /**
             * Объем коммунальных услуг / Объем коммунальных ресурсов, потребленных при использовании и содержании общего имущества в многоквартирном доме, или коммунальных услуг на общедомовые нужды.
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
             * 
             */
            @XmlElement(name = "Consumption")
            protected PDServiceChargeExportType.HousingService.MunicipalResource.Consumption consumption;
            /**
             * Тариф / Размер платы на кв.м, руб. / Размер взноса на кв.м, руб.
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
             * 
             */
            @XmlElement(name = "Rate")
            protected BigDecimal rate;
            /**
             * Начислено за расчетный период, руб.
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
             * 
             */
            @XmlElement(name = "AccountingPeriodTotal")
            protected BigDecimal accountingPeriodTotal;
            /**
             * Перерасчеты, льготы, субсидии
             * 
             */
            @XmlElement(name = "ServiceCharge")
            protected ServiceChargeType serviceCharge;
            /**
             * К оплате за коммунальный ресурс потребления при содержании общего имущества, руб. 
             * Ссылка на пост. 924 – Приложение 2, п. 19
             * 
             */
            @XmlElement(name = "MunicipalServiceCommunalConsumptionPayable")
            protected BigDecimal municipalServiceCommunalConsumptionPayable;
            /**
             * Справочная информация.
             * Справочная информация.
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 4 примерной формы ПД
             * 
             */
            @XmlElement(name = "ServiceInformation")
            protected PDServiceChargeExportType.HousingService.MunicipalResource.ServiceInformation serviceInformation;
            /**
             * Сведения о перерасчетах (доначислении +, уменьшении -).
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 6 примерной формы ПД
             * 
             */
            @XmlElement(name = "PaymentRecalculation")
            protected PDServiceChargeExportType.HousingService.MunicipalResource.PaymentRecalculation paymentRecalculation;
            /**
             * Размер платы за коммунальные услуги, общедомовые нужды.
             * Ссылка на пост. 924 – Приложение 2, п. 18
             * 
             */
            @XmlElement(name = "AmountOfPaymentMunicipalServiceCommunalConsumption")
            protected BigDecimal amountOfPaymentMunicipalServiceCommunalConsumption;
            /**
             * К оплате за расчетный период, руб.
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
             * 
             */
            @XmlElement(name = "TotalPayable")
            protected BigDecimal totalPayable;
            /**
             * Задолженность за предыдущие периоды / Аванс на начало расчетного периода (учтены платежи, поступившие включительно до числа расчетного периода, указанного в tns:PaymentDocument/tns:PaymentsTaken).
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
             * 
             */
            @XmlElement(name = "DebtPreviousPeriodsOrAdvanceBillingPeriod")
            protected BigDecimal debtPreviousPeriodsOrAdvanceBillingPeriod;
            /**
             * Неустойка (штраф, пеня).
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
             * 
             */
            @XmlElement(name = "Penalties")
            protected BigDecimal penalties;
            /**
             * Штраф исполнителя работ (услуг).
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
             * 
             */
            @XmlElement(name = "ServiceProviderPenalties")
            protected BigDecimal serviceProviderPenalties;
            /**
             * Государственные пошлины.
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
             * 
             */
            @XmlElement(name = "StateFees")
            protected BigDecimal stateFees;
            /**
             * Судебные издержки.
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
             * 
             */
            @XmlElement(name = "CourtCosts")
            protected BigDecimal courtCosts;
            /**
             * ИТОГО К ОПЛАТЕ (с учетом задолженности/аванса, неустоек и судебных расходов).
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
             * 
             */
            @XmlElement(name = "TotalPayableOverall")
            protected BigDecimal totalPayableOverall;
            /**
             * Поставщик услуги. Идентификатор зарегистрированной организации. Обязателен, если тип ЛС "ЛС РЦ" (isRCAccount), запрещен для заполнения для остальных типов лицевых счетов
             * 
             */
            protected String orgPPAGUID;
            /**
             * Главные коммунальные ресурсы потребляемые при использовании и содержании общего имущества в многоквартирном доме. 
             * Группируются по виду коммунального ресурса.
             * Заполняются, если для расчета итоговой суммы начислений по виду коммунального ресурса используются двухкомпонентные тарифы или тарифы (цены), отличные от одноставочных тарифов (цен)
             * 
             */
            @XmlElement(name = "GeneralMunicipalResource")
            protected List<GeneralMunicipalResourceExportType> generalMunicipalResource;

            /**
             * Код коммунального ресурса при содержании общего имущества. НСИ 2 "Вид коммунального ресурса"
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
             * 
             * @return
             *     possible object is
             *     {@link NsiRef }
             *     
             */
            public NsiRef getServiceType() {
                return serviceType;
            }

            /**
             * Sets the value of the serviceType property.
             * 
             * @param value
             *     allowed object is
             *     {@link NsiRef }
             *     
             * @see #getServiceType()
             */
            public void setServiceType(NsiRef value) {
                this.serviceType = value;
            }

            /**
             * Объем коммунальных услуг / Объем коммунальных ресурсов, потребленных при использовании и содержании общего имущества в многоквартирном доме, или коммунальных услуг на общедомовые нужды.
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
             * 
             * @return
             *     possible object is
             *     {@link PDServiceChargeExportType.HousingService.MunicipalResource.Consumption }
             *     
             */
            public PDServiceChargeExportType.HousingService.MunicipalResource.Consumption getConsumption() {
                return consumption;
            }

            /**
             * Sets the value of the consumption property.
             * 
             * @param value
             *     allowed object is
             *     {@link PDServiceChargeExportType.HousingService.MunicipalResource.Consumption }
             *     
             * @see #getConsumption()
             */
            public void setConsumption(PDServiceChargeExportType.HousingService.MunicipalResource.Consumption value) {
                this.consumption = value;
            }

            /**
             * Тариф / Размер платы на кв.м, руб. / Размер взноса на кв.м, руб.
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getRate() {
                return rate;
            }

            /**
             * Sets the value of the rate property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getRate()
             */
            public void setRate(BigDecimal value) {
                this.rate = value;
            }

            /**
             * Начислено за расчетный период, руб.
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAccountingPeriodTotal() {
                return accountingPeriodTotal;
            }

            /**
             * Sets the value of the accountingPeriodTotal property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getAccountingPeriodTotal()
             */
            public void setAccountingPeriodTotal(BigDecimal value) {
                this.accountingPeriodTotal = value;
            }

            /**
             * Перерасчеты, льготы, субсидии
             * 
             * @return
             *     possible object is
             *     {@link ServiceChargeType }
             *     
             */
            public ServiceChargeType getServiceCharge() {
                return serviceCharge;
            }

            /**
             * Sets the value of the serviceCharge property.
             * 
             * @param value
             *     allowed object is
             *     {@link ServiceChargeType }
             *     
             * @see #getServiceCharge()
             */
            public void setServiceCharge(ServiceChargeType value) {
                this.serviceCharge = value;
            }

            /**
             * К оплате за коммунальный ресурс потребления при содержании общего имущества, руб. 
             * Ссылка на пост. 924 – Приложение 2, п. 19
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMunicipalServiceCommunalConsumptionPayable() {
                return municipalServiceCommunalConsumptionPayable;
            }

            /**
             * Sets the value of the municipalServiceCommunalConsumptionPayable property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getMunicipalServiceCommunalConsumptionPayable()
             */
            public void setMunicipalServiceCommunalConsumptionPayable(BigDecimal value) {
                this.municipalServiceCommunalConsumptionPayable = value;
            }

            /**
             * Справочная информация.
             * Справочная информация.
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 4 примерной формы ПД
             * 
             * @return
             *     possible object is
             *     {@link PDServiceChargeExportType.HousingService.MunicipalResource.ServiceInformation }
             *     
             */
            public PDServiceChargeExportType.HousingService.MunicipalResource.ServiceInformation getServiceInformation() {
                return serviceInformation;
            }

            /**
             * Sets the value of the serviceInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link PDServiceChargeExportType.HousingService.MunicipalResource.ServiceInformation }
             *     
             * @see #getServiceInformation()
             */
            public void setServiceInformation(PDServiceChargeExportType.HousingService.MunicipalResource.ServiceInformation value) {
                this.serviceInformation = value;
            }

            /**
             * Сведения о перерасчетах (доначислении +, уменьшении -).
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 6 примерной формы ПД
             * 
             * @return
             *     possible object is
             *     {@link PDServiceChargeExportType.HousingService.MunicipalResource.PaymentRecalculation }
             *     
             */
            public PDServiceChargeExportType.HousingService.MunicipalResource.PaymentRecalculation getPaymentRecalculation() {
                return paymentRecalculation;
            }

            /**
             * Sets the value of the paymentRecalculation property.
             * 
             * @param value
             *     allowed object is
             *     {@link PDServiceChargeExportType.HousingService.MunicipalResource.PaymentRecalculation }
             *     
             * @see #getPaymentRecalculation()
             */
            public void setPaymentRecalculation(PDServiceChargeExportType.HousingService.MunicipalResource.PaymentRecalculation value) {
                this.paymentRecalculation = value;
            }

            /**
             * Размер платы за коммунальные услуги, общедомовые нужды.
             * Ссылка на пост. 924 – Приложение 2, п. 18
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAmountOfPaymentMunicipalServiceCommunalConsumption() {
                return amountOfPaymentMunicipalServiceCommunalConsumption;
            }

            /**
             * Sets the value of the amountOfPaymentMunicipalServiceCommunalConsumption property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getAmountOfPaymentMunicipalServiceCommunalConsumption()
             */
            public void setAmountOfPaymentMunicipalServiceCommunalConsumption(BigDecimal value) {
                this.amountOfPaymentMunicipalServiceCommunalConsumption = value;
            }

            /**
             * К оплате за расчетный период, руб.
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalPayable() {
                return totalPayable;
            }

            /**
             * Sets the value of the totalPayable property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getTotalPayable()
             */
            public void setTotalPayable(BigDecimal value) {
                this.totalPayable = value;
            }

            /**
             * Задолженность за предыдущие периоды / Аванс на начало расчетного периода (учтены платежи, поступившие включительно до числа расчетного периода, указанного в tns:PaymentDocument/tns:PaymentsTaken).
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDebtPreviousPeriodsOrAdvanceBillingPeriod() {
                return debtPreviousPeriodsOrAdvanceBillingPeriod;
            }

            /**
             * Sets the value of the debtPreviousPeriodsOrAdvanceBillingPeriod property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getDebtPreviousPeriodsOrAdvanceBillingPeriod()
             */
            public void setDebtPreviousPeriodsOrAdvanceBillingPeriod(BigDecimal value) {
                this.debtPreviousPeriodsOrAdvanceBillingPeriod = value;
            }

            /**
             * Неустойка (штраф, пеня).
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPenalties() {
                return penalties;
            }

            /**
             * Sets the value of the penalties property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getPenalties()
             */
            public void setPenalties(BigDecimal value) {
                this.penalties = value;
            }

            /**
             * Штраф исполнителя работ (услуг).
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getServiceProviderPenalties() {
                return serviceProviderPenalties;
            }

            /**
             * Sets the value of the serviceProviderPenalties property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getServiceProviderPenalties()
             */
            public void setServiceProviderPenalties(BigDecimal value) {
                this.serviceProviderPenalties = value;
            }

            /**
             * Государственные пошлины.
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getStateFees() {
                return stateFees;
            }

            /**
             * Sets the value of the stateFees property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getStateFees()
             */
            public void setStateFees(BigDecimal value) {
                this.stateFees = value;
            }

            /**
             * Судебные издержки.
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCourtCosts() {
                return courtCosts;
            }

            /**
             * Sets the value of the courtCosts property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getCourtCosts()
             */
            public void setCourtCosts(BigDecimal value) {
                this.courtCosts = value;
            }

            /**
             * ИТОГО К ОПЛАТЕ (с учетом задолженности/аванса, неустоек и судебных расходов).
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalPayableOverall() {
                return totalPayableOverall;
            }

            /**
             * Sets the value of the totalPayableOverall property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getTotalPayableOverall()
             */
            public void setTotalPayableOverall(BigDecimal value) {
                this.totalPayableOverall = value;
            }

            /**
             * Поставщик услуги. Идентификатор зарегистрированной организации. Обязателен, если тип ЛС "ЛС РЦ" (isRCAccount), запрещен для заполнения для остальных типов лицевых счетов
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrgPPAGUID() {
                return orgPPAGUID;
            }

            /**
             * Sets the value of the orgPPAGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getOrgPPAGUID()
             */
            public void setOrgPPAGUID(String value) {
                this.orgPPAGUID = value;
            }

            /**
             * Главные коммунальные ресурсы потребляемые при использовании и содержании общего имущества в многоквартирном доме. 
             * Группируются по виду коммунального ресурса.
             * Заполняются, если для расчета итоговой суммы начислений по виду коммунального ресурса используются двухкомпонентные тарифы или тарифы (цены), отличные от одноставочных тарифов (цен)
             * 
             * Gets the value of the generalMunicipalResource property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the generalMunicipalResource property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getGeneralMunicipalResource().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GeneralMunicipalResourceExportType }
             * </p>
             * 
             * 
             * @return
             *     The value of the generalMunicipalResource property.
             */
            public List<GeneralMunicipalResourceExportType> getGeneralMunicipalResource() {
                if (generalMunicipalResource == null) {
                    generalMunicipalResource = new ArrayList<>();
                }
                return this.generalMunicipalResource;
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
             *         <element name="Volume">
             *           <complexType>
             *             <simpleContent>
             *               <extension base="<http://dom.gosuslugi.ru/schema/integration/bills/>ConsumptionVolumeType">
             *                 <attribute name="type">
             *                   <simpleType>
             *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       <enumeration value="O"/>
             *                     </restriction>
             *                   </simpleType>
             *                 </attribute>
             *                 <attribute name="determiningMethod">
             *                   <simpleType>
             *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       <length value="1"/>
             *                       <enumeration value="N"/>
             *                       <enumeration value="M"/>
             *                       <enumeration value="O"/>
             *                     </restriction>
             *                   </simpleType>
             *                 </attribute>
             *               </extension>
             *             </simpleContent>
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
                "volume"
            })
            public static class Consumption {

                /**
                 * Объем
                 * 
                 */
                @XmlElement(name = "Volume", required = true)
                protected PDServiceChargeExportType.HousingService.MunicipalResource.Consumption.Volume volume;

                /**
                 * Объем
                 * 
                 * @return
                 *     possible object is
                 *     {@link PDServiceChargeExportType.HousingService.MunicipalResource.Consumption.Volume }
                 *     
                 */
                public PDServiceChargeExportType.HousingService.MunicipalResource.Consumption.Volume getVolume() {
                    return volume;
                }

                /**
                 * Sets the value of the volume property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PDServiceChargeExportType.HousingService.MunicipalResource.Consumption.Volume }
                 *     
                 * @see #getVolume()
                 */
                public void setVolume(PDServiceChargeExportType.HousingService.MunicipalResource.Consumption.Volume value) {
                    this.volume = value;
                }


                /**
                 * <p>Java class for anonymous complex type</p>.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.</p>
                 * 
                 * <pre>{@code
                 * <complexType>
                 *   <simpleContent>
                 *     <extension base="<http://dom.gosuslugi.ru/schema/integration/bills/>ConsumptionVolumeType">
                 *       <attribute name="type">
                 *         <simpleType>
                 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             <enumeration value="O"/>
                 *           </restriction>
                 *         </simpleType>
                 *       </attribute>
                 *       <attribute name="determiningMethod">
                 *         <simpleType>
                 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             <length value="1"/>
                 *             <enumeration value="N"/>
                 *             <enumeration value="M"/>
                 *             <enumeration value="O"/>
                 *           </restriction>
                 *         </simpleType>
                 *       </attribute>
                 *     </extension>
                 *   </simpleContent>
                 * </complexType>
                 * }</pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class Volume {

                    /**
                     * Тип объема потребления КУ
                     * 
                     */
                    @XmlValue
                    protected BigDecimal value;
                    /**
                     * Тип:
                     * house(O)verallNeeds - объем коммунальных ресурсов, потребленных при использовании и содержании общего имущества в многоквартирном доме, или коммунальных услуг на общедомовые нужды
                     * 
                     */
                    @XmlAttribute(name = "type")
                    protected String type;
                    /**
                     * Способ определения объемов КУ:
                     * (N)orm - Норматив
                     * (M)etering device - Прибор учета
                     * (O)ther - Иное
                     * 
                     */
                    @XmlAttribute(name = "determiningMethod")
                    protected String determiningMethod;

                    /**
                     * Тип объема потребления КУ
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     * @see #getValue()
                     */
                    public void setValue(BigDecimal value) {
                        this.value = value;
                    }

                    /**
                     * Тип:
                     * house(O)verallNeeds - объем коммунальных ресурсов, потребленных при использовании и содержании общего имущества в многоквартирном доме, или коммунальных услуг на общедомовые нужды
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

                    /**
                     * Способ определения объемов КУ:
                     * (N)orm - Норматив
                     * (M)etering device - Прибор учета
                     * (O)ther - Иное
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDeterminingMethod() {
                        return determiningMethod;
                    }

                    /**
                     * Sets the value of the determiningMethod property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     * @see #getDeterminingMethod()
                     */
                    public void setDeterminingMethod(String value) {
                        this.determiningMethod = value;
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
             *         <element name="recalculationReason">
             *           <simpleType>
             *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               <minLength value="1"/>
             *               <maxLength value="500"/>
             *             </restriction>
             *           </simpleType>
             *         </element>
             *         <element name="sum">
             *           <simpleType>
             *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *               <fractionDigits value="2"/>
             *               <minInclusive value="-9999999999.99"/>
             *               <maxInclusive value="9999999999.99"/>
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
                "recalculationReason",
                "sum"
            })
            public static class PaymentRecalculation {

                /**
                 * Основания перерасчётов
                 * 
                 */
                @XmlElement(required = true)
                protected String recalculationReason;
                /**
                 * Сумма
                 * 
                 */
                @XmlElement(required = true)
                protected BigDecimal sum;

                /**
                 * Основания перерасчётов
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRecalculationReason() {
                    return recalculationReason;
                }

                /**
                 * Sets the value of the recalculationReason property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getRecalculationReason()
                 */
                public void setRecalculationReason(String value) {
                    this.recalculationReason = value;
                }

                /**
                 * Сумма
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getSum() {
                    return sum;
                }

                /**
                 * Sets the value of the sum property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 * @see #getSum()
                 */
                public void setSum(BigDecimal value) {
                    this.sum = value;
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
             *         <element name="houseOverallNeedsNorm" type="{http://dom.gosuslugi.ru/schema/integration/bills/}VolumePDType" minOccurs="0"/>
             *         <element name="houseOverallNeedsCurrentValue" type="{http://dom.gosuslugi.ru/schema/integration/bills/}VolumePDType" minOccurs="0"/>
             *         <element name="houseTotalHouseOverallNeeds" type="{http://dom.gosuslugi.ru/schema/integration/bills/}VolumePDType" minOccurs="0"/>
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
                "houseOverallNeedsNorm",
                "houseOverallNeedsCurrentValue",
                "houseTotalHouseOverallNeeds"
            })
            public static class ServiceInformation {

                /**
                 * Норматив потребления коммунальных ресурсов в целях использования и содержания общего имущества в многоквартирном доме
                 * 
                 */
                protected BigDecimal houseOverallNeedsNorm;
                /**
                 * Текущие показания приборов учёта
                 * коммунальных ресурсов - коллективных (общедомовых)
                 * 
                 */
                protected BigDecimal houseOverallNeedsCurrentValue;
                /**
                 * Суммарный объём коммунальных ресурсов в многоквартирном доме - в целях содержания общего имущества в многоквартирном доме
                 * 
                 */
                protected BigDecimal houseTotalHouseOverallNeeds;

                /**
                 * Норматив потребления коммунальных ресурсов в целях использования и содержания общего имущества в многоквартирном доме
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getHouseOverallNeedsNorm() {
                    return houseOverallNeedsNorm;
                }

                /**
                 * Sets the value of the houseOverallNeedsNorm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 * @see #getHouseOverallNeedsNorm()
                 */
                public void setHouseOverallNeedsNorm(BigDecimal value) {
                    this.houseOverallNeedsNorm = value;
                }

                /**
                 * Текущие показания приборов учёта
                 * коммунальных ресурсов - коллективных (общедомовых)
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getHouseOverallNeedsCurrentValue() {
                    return houseOverallNeedsCurrentValue;
                }

                /**
                 * Sets the value of the houseOverallNeedsCurrentValue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 * @see #getHouseOverallNeedsCurrentValue()
                 */
                public void setHouseOverallNeedsCurrentValue(BigDecimal value) {
                    this.houseOverallNeedsCurrentValue = value;
                }

                /**
                 * Суммарный объём коммунальных ресурсов в многоквартирном доме - в целях содержания общего имущества в многоквартирном доме
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getHouseTotalHouseOverallNeeds() {
                    return houseTotalHouseOverallNeeds;
                }

                /**
                 * Sets the value of the houseTotalHouseOverallNeeds property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 * @see #getHouseTotalHouseOverallNeeds()
                 */
                public void setHouseTotalHouseOverallNeeds(BigDecimal value) {
                    this.houseTotalHouseOverallNeeds = value;
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
         *         <element name="recalculationReason">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <minLength value="1"/>
         *               <maxLength value="500"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="sum">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               <fractionDigits value="2"/>
         *               <minInclusive value="-9999999999.99"/>
         *               <maxInclusive value="9999999999.99"/>
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
            "recalculationReason",
            "sum"
        })
        public static class PaymentRecalculation {

            /**
             * Основания перерасчётов
             * 
             */
            @XmlElement(required = true)
            protected String recalculationReason;
            /**
             * Сумма
             * 
             */
            @XmlElement(required = true)
            protected BigDecimal sum;

            /**
             * Основания перерасчётов
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRecalculationReason() {
                return recalculationReason;
            }

            /**
             * Sets the value of the recalculationReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getRecalculationReason()
             */
            public void setRecalculationReason(String value) {
                this.recalculationReason = value;
            }

            /**
             * Сумма
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSum() {
                return sum;
            }

            /**
             * Sets the value of the sum property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getSum()
             */
            public void setSum(BigDecimal value) {
                this.sum = value;
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ServicePDType">
     *       <sequence>
     *         <element name="ServiceCharge" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceChargeType">
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="PiecemealPayment" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="paymentPeriodPiecemealPaymentSum" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         <fractionDigits value="2"/>
     *                         <totalDigits value="18"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="pastPaymentPeriodPiecemealPaymentSum" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         <fractionDigits value="2"/>
     *                         <totalDigits value="18"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="piecemealPaymentPercentRub">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         <fractionDigits value="2"/>
     *                         <totalDigits value="18"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="piecemealPaymentPercent">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         <minInclusive value="0"/>
     *                         <fractionDigits value="2"/>
     *                         <totalDigits value="5"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="piecemealPaymentSum">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         <fractionDigits value="2"/>
     *                         <totalDigits value="18"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="PaymentRecalculation" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="recalculationReason">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         <minLength value="1"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="sum">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         <fractionDigits value="2"/>
     *                         <minInclusive value="-9999999999.99"/>
     *                         <maxInclusive value="9999999999.99"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceInformation" minOccurs="0"/>
     *         <element name="Consumption" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="Volume" maxOccurs="2">
     *                     <complexType>
     *                       <simpleContent>
     *                         <extension base="<http://dom.gosuslugi.ru/schema/integration/bills/>ConsumptionVolumeType">
     *                           <attribute name="type">
     *                             <simpleType>
     *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 <enumeration value="I"/>
     *                                 <enumeration value="O"/>
     *                               </restriction>
     *                             </simpleType>
     *                           </attribute>
     *                           <attribute name="determiningMethod">
     *                             <simpleType>
     *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 <length value="1"/>
     *                                 <enumeration value="N"/>
     *                                 <enumeration value="M"/>
     *                                 <enumeration value="O"/>
     *                               </restriction>
     *                             </simpleType>
     *                           </attribute>
     *                         </extension>
     *                       </simpleContent>
     *                     </complexType>
     *                   </element>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="MultiplyingFactor" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="Ratio">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         <totalDigits value="5"/>
     *                         <fractionDigits value="2"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="AmountOfExcessFees" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         <totalDigits value="18"/>
     *                         <fractionDigits value="2"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="MunicipalServiceIndividualConsumptionPayable" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               <totalDigits value="18"/>
     *               <fractionDigits value="2"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="MunicipalServiceCommunalConsumptionPayable" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               <totalDigits value="18"/>
     *               <fractionDigits value="2"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="AmountOfPaymentMunicipalServiceIndividualConsumption" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               <totalDigits value="18"/>
     *               <fractionDigits value="2"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="AmountOfPaymentMunicipalServiceCommunalConsumption" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               <totalDigits value="18"/>
     *               <fractionDigits value="2"/>
     *             </restriction>
     *           </simpleType>
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
        "serviceCharge",
        "piecemealPayment",
        "paymentRecalculation",
        "serviceInformation",
        "consumption",
        "multiplyingFactor",
        "municipalServiceIndividualConsumptionPayable",
        "municipalServiceCommunalConsumptionPayable",
        "amountOfPaymentMunicipalServiceIndividualConsumption",
        "amountOfPaymentMunicipalServiceCommunalConsumption"
    })
    public static class MunicipalService
        extends ServicePDType
    {

        /**
         * Перерасчеты, льготы, субсидии
         * 
         */
        @XmlElement(name = "ServiceCharge")
        protected PDServiceChargeExportType.MunicipalService.ServiceCharge serviceCharge;
        /**
         * Расчет суммы к оплате с учетом рассрочки платежа.
         * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 5 примерной формы ПД
         * 
         */
        @XmlElement(name = "PiecemealPayment")
        protected PDServiceChargeExportType.MunicipalService.PiecemealPayment piecemealPayment;
        /**
         * Сведения о перерасчетах (доначислении +, уменьшении -).
         * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 6 примерной формы ПД
         * 
         */
        @XmlElement(name = "PaymentRecalculation")
        protected PDServiceChargeExportType.MunicipalService.PaymentRecalculation paymentRecalculation;
        /**
         * Справочная информация.
         * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 4 примерной формы ПД
         * 
         */
        @XmlElement(name = "ServiceInformation")
        protected ru.gosuslugi.dom.schema.integration.bills.ServiceInformation serviceInformation;
        /**
         * Объем коммунальных услуг / Объем коммунальных ресурсов, потребленных при использовании и содержании общего имущества в многоквартирном доме, или коммунальных услуг на общедомовые нужды.
         * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
         * 
         */
        @XmlElement(name = "Consumption")
        protected PDServiceChargeExportType.MunicipalService.Consumption consumption;
        /**
         * Повышающий коэффициент.
         * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
         * 
         */
        @XmlElement(name = "MultiplyingFactor")
        protected PDServiceChargeExportType.MunicipalService.MultiplyingFactor multiplyingFactor;
        /**
         * К оплате за индивидуальное потребление коммунальной услуги, руб.
         * Ссылка на пост. 924 – Приложение 2, п. 23
         * 
         */
        @XmlElement(name = "MunicipalServiceIndividualConsumptionPayable")
        protected BigDecimal municipalServiceIndividualConsumptionPayable;
        /**
         * К оплате за общедомовое потребление коммунальной услуги, руб.
         * Ссылка на пост. 924 – Приложение 2, п. 23
         * 
         */
        @XmlElement(name = "MunicipalServiceCommunalConsumptionPayable")
        protected BigDecimal municipalServiceCommunalConsumptionPayable;
        /**
         * Размер платы за коммунальные услуги, индивидуальное потребление.
         * Ссылка на пост. 924 – Приложение 2, п. 18
         * 
         */
        @XmlElement(name = "AmountOfPaymentMunicipalServiceIndividualConsumption")
        protected BigDecimal amountOfPaymentMunicipalServiceIndividualConsumption;
        /**
         * Размер платы за коммунальные услуги, общедомовые нужды.
         * Ссылка на пост. 924 – Приложение 2, п. 18
         * 
         */
        @XmlElement(name = "AmountOfPaymentMunicipalServiceCommunalConsumption")
        protected BigDecimal amountOfPaymentMunicipalServiceCommunalConsumption;

        /**
         * Перерасчеты, льготы, субсидии
         * 
         * @return
         *     possible object is
         *     {@link PDServiceChargeExportType.MunicipalService.ServiceCharge }
         *     
         */
        public PDServiceChargeExportType.MunicipalService.ServiceCharge getServiceCharge() {
            return serviceCharge;
        }

        /**
         * Sets the value of the serviceCharge property.
         * 
         * @param value
         *     allowed object is
         *     {@link PDServiceChargeExportType.MunicipalService.ServiceCharge }
         *     
         * @see #getServiceCharge()
         */
        public void setServiceCharge(PDServiceChargeExportType.MunicipalService.ServiceCharge value) {
            this.serviceCharge = value;
        }

        /**
         * Расчет суммы к оплате с учетом рассрочки платежа.
         * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 5 примерной формы ПД
         * 
         * @return
         *     possible object is
         *     {@link PDServiceChargeExportType.MunicipalService.PiecemealPayment }
         *     
         */
        public PDServiceChargeExportType.MunicipalService.PiecemealPayment getPiecemealPayment() {
            return piecemealPayment;
        }

        /**
         * Sets the value of the piecemealPayment property.
         * 
         * @param value
         *     allowed object is
         *     {@link PDServiceChargeExportType.MunicipalService.PiecemealPayment }
         *     
         * @see #getPiecemealPayment()
         */
        public void setPiecemealPayment(PDServiceChargeExportType.MunicipalService.PiecemealPayment value) {
            this.piecemealPayment = value;
        }

        /**
         * Сведения о перерасчетах (доначислении +, уменьшении -).
         * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 6 примерной формы ПД
         * 
         * @return
         *     possible object is
         *     {@link PDServiceChargeExportType.MunicipalService.PaymentRecalculation }
         *     
         */
        public PDServiceChargeExportType.MunicipalService.PaymentRecalculation getPaymentRecalculation() {
            return paymentRecalculation;
        }

        /**
         * Sets the value of the paymentRecalculation property.
         * 
         * @param value
         *     allowed object is
         *     {@link PDServiceChargeExportType.MunicipalService.PaymentRecalculation }
         *     
         * @see #getPaymentRecalculation()
         */
        public void setPaymentRecalculation(PDServiceChargeExportType.MunicipalService.PaymentRecalculation value) {
            this.paymentRecalculation = value;
        }

        /**
         * Справочная информация.
         * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 4 примерной формы ПД
         * 
         * @return
         *     possible object is
         *     {@link ru.gosuslugi.dom.schema.integration.bills.ServiceInformation }
         *     
         */
        public ru.gosuslugi.dom.schema.integration.bills.ServiceInformation getServiceInformation() {
            return serviceInformation;
        }

        /**
         * Sets the value of the serviceInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ru.gosuslugi.dom.schema.integration.bills.ServiceInformation }
         *     
         * @see #getServiceInformation()
         */
        public void setServiceInformation(ru.gosuslugi.dom.schema.integration.bills.ServiceInformation value) {
            this.serviceInformation = value;
        }

        /**
         * Объем коммунальных услуг / Объем коммунальных ресурсов, потребленных при использовании и содержании общего имущества в многоквартирном доме, или коммунальных услуг на общедомовые нужды.
         * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
         * 
         * @return
         *     possible object is
         *     {@link PDServiceChargeExportType.MunicipalService.Consumption }
         *     
         */
        public PDServiceChargeExportType.MunicipalService.Consumption getConsumption() {
            return consumption;
        }

        /**
         * Sets the value of the consumption property.
         * 
         * @param value
         *     allowed object is
         *     {@link PDServiceChargeExportType.MunicipalService.Consumption }
         *     
         * @see #getConsumption()
         */
        public void setConsumption(PDServiceChargeExportType.MunicipalService.Consumption value) {
            this.consumption = value;
        }

        /**
         * Повышающий коэффициент.
         * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
         * 
         * @return
         *     possible object is
         *     {@link PDServiceChargeExportType.MunicipalService.MultiplyingFactor }
         *     
         */
        public PDServiceChargeExportType.MunicipalService.MultiplyingFactor getMultiplyingFactor() {
            return multiplyingFactor;
        }

        /**
         * Sets the value of the multiplyingFactor property.
         * 
         * @param value
         *     allowed object is
         *     {@link PDServiceChargeExportType.MunicipalService.MultiplyingFactor }
         *     
         * @see #getMultiplyingFactor()
         */
        public void setMultiplyingFactor(PDServiceChargeExportType.MunicipalService.MultiplyingFactor value) {
            this.multiplyingFactor = value;
        }

        /**
         * К оплате за индивидуальное потребление коммунальной услуги, руб.
         * Ссылка на пост. 924 – Приложение 2, п. 23
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMunicipalServiceIndividualConsumptionPayable() {
            return municipalServiceIndividualConsumptionPayable;
        }

        /**
         * Sets the value of the municipalServiceIndividualConsumptionPayable property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getMunicipalServiceIndividualConsumptionPayable()
         */
        public void setMunicipalServiceIndividualConsumptionPayable(BigDecimal value) {
            this.municipalServiceIndividualConsumptionPayable = value;
        }

        /**
         * К оплате за общедомовое потребление коммунальной услуги, руб.
         * Ссылка на пост. 924 – Приложение 2, п. 23
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMunicipalServiceCommunalConsumptionPayable() {
            return municipalServiceCommunalConsumptionPayable;
        }

        /**
         * Sets the value of the municipalServiceCommunalConsumptionPayable property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getMunicipalServiceCommunalConsumptionPayable()
         */
        public void setMunicipalServiceCommunalConsumptionPayable(BigDecimal value) {
            this.municipalServiceCommunalConsumptionPayable = value;
        }

        /**
         * Размер платы за коммунальные услуги, индивидуальное потребление.
         * Ссылка на пост. 924 – Приложение 2, п. 18
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmountOfPaymentMunicipalServiceIndividualConsumption() {
            return amountOfPaymentMunicipalServiceIndividualConsumption;
        }

        /**
         * Sets the value of the amountOfPaymentMunicipalServiceIndividualConsumption property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getAmountOfPaymentMunicipalServiceIndividualConsumption()
         */
        public void setAmountOfPaymentMunicipalServiceIndividualConsumption(BigDecimal value) {
            this.amountOfPaymentMunicipalServiceIndividualConsumption = value;
        }

        /**
         * Размер платы за коммунальные услуги, общедомовые нужды.
         * Ссылка на пост. 924 – Приложение 2, п. 18
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmountOfPaymentMunicipalServiceCommunalConsumption() {
            return amountOfPaymentMunicipalServiceCommunalConsumption;
        }

        /**
         * Sets the value of the amountOfPaymentMunicipalServiceCommunalConsumption property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getAmountOfPaymentMunicipalServiceCommunalConsumption()
         */
        public void setAmountOfPaymentMunicipalServiceCommunalConsumption(BigDecimal value) {
            this.amountOfPaymentMunicipalServiceCommunalConsumption = value;
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
         *         <element name="Volume" maxOccurs="2">
         *           <complexType>
         *             <simpleContent>
         *               <extension base="<http://dom.gosuslugi.ru/schema/integration/bills/>ConsumptionVolumeType">
         *                 <attribute name="type">
         *                   <simpleType>
         *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       <enumeration value="I"/>
         *                       <enumeration value="O"/>
         *                     </restriction>
         *                   </simpleType>
         *                 </attribute>
         *                 <attribute name="determiningMethod">
         *                   <simpleType>
         *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       <length value="1"/>
         *                       <enumeration value="N"/>
         *                       <enumeration value="M"/>
         *                       <enumeration value="O"/>
         *                     </restriction>
         *                   </simpleType>
         *                 </attribute>
         *               </extension>
         *             </simpleContent>
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
            "volume"
        })
        public static class Consumption {

            /**
             * Объем
             * 
             */
            @XmlElement(name = "Volume", required = true)
            protected List<PDServiceChargeExportType.MunicipalService.Consumption.Volume> volume;

            /**
             * Объем
             * 
             * Gets the value of the volume property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the volume property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getVolume().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PDServiceChargeExportType.MunicipalService.Consumption.Volume }
             * </p>
             * 
             * 
             * @return
             *     The value of the volume property.
             */
            public List<PDServiceChargeExportType.MunicipalService.Consumption.Volume> getVolume() {
                if (volume == null) {
                    volume = new ArrayList<>();
                }
                return this.volume;
            }


            /**
             * <p>Java class for anonymous complex type</p>.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <simpleContent>
             *     <extension base="<http://dom.gosuslugi.ru/schema/integration/bills/>ConsumptionVolumeType">
             *       <attribute name="type">
             *         <simpleType>
             *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             <enumeration value="I"/>
             *             <enumeration value="O"/>
             *           </restriction>
             *         </simpleType>
             *       </attribute>
             *       <attribute name="determiningMethod">
             *         <simpleType>
             *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             <length value="1"/>
             *             <enumeration value="N"/>
             *             <enumeration value="M"/>
             *             <enumeration value="O"/>
             *           </restriction>
             *         </simpleType>
             *       </attribute>
             *     </extension>
             *   </simpleContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Volume {

                /**
                 * Тип объема потребления КУ
                 * 
                 */
                @XmlValue
                protected BigDecimal value;
                /**
                 * Тип:
                 * (I)ndividualConsumption - объем коммунальных услуг
                 * house(O)verallNeeds - объем коммунальных ресурсов, потребленных при использовании и содержании общего имущества в многоквартирном доме, или коммунальных услуг на общедомовые нужды
                 * 
                 */
                @XmlAttribute(name = "type")
                protected String type;
                /**
                 * Способ определения объемов КУ:
                 * (N)orm - Норматив
                 * (M)etering device - Прибор учета
                 * (O)ther - Иное
                 * 
                 */
                @XmlAttribute(name = "determiningMethod")
                protected String determiningMethod;

                /**
                 * Тип объема потребления КУ
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 * @see #getValue()
                 */
                public void setValue(BigDecimal value) {
                    this.value = value;
                }

                /**
                 * Тип:
                 * (I)ndividualConsumption - объем коммунальных услуг
                 * house(O)verallNeeds - объем коммунальных ресурсов, потребленных при использовании и содержании общего имущества в многоквартирном доме, или коммунальных услуг на общедомовые нужды
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

                /**
                 * Способ определения объемов КУ:
                 * (N)orm - Норматив
                 * (M)etering device - Прибор учета
                 * (O)ther - Иное
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDeterminingMethod() {
                    return determiningMethod;
                }

                /**
                 * Sets the value of the determiningMethod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getDeterminingMethod()
                 */
                public void setDeterminingMethod(String value) {
                    this.determiningMethod = value;
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
         *         <element name="Ratio">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               <totalDigits value="5"/>
         *               <fractionDigits value="2"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="AmountOfExcessFees" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               <totalDigits value="18"/>
         *               <fractionDigits value="2"/>
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
            "ratio",
            "amountOfExcessFees"
        })
        public static class MultiplyingFactor {

            /**
             * Размер повышающего коэффициента
             * 
             */
            @XmlElement(name = "Ratio", required = true)
            protected BigDecimal ratio;
            /**
             * Размер превышения платы, рассчитанной с применением повышающего коэффициента над размером платы, рассчитанной без учета повышающего коэффициента, руб.
             * 
             */
            @XmlElement(name = "AmountOfExcessFees")
            protected BigDecimal amountOfExcessFees;

            /**
             * Размер повышающего коэффициента
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getRatio() {
                return ratio;
            }

            /**
             * Sets the value of the ratio property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getRatio()
             */
            public void setRatio(BigDecimal value) {
                this.ratio = value;
            }

            /**
             * Размер превышения платы, рассчитанной с применением повышающего коэффициента над размером платы, рассчитанной без учета повышающего коэффициента, руб.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAmountOfExcessFees() {
                return amountOfExcessFees;
            }

            /**
             * Sets the value of the amountOfExcessFees property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getAmountOfExcessFees()
             */
            public void setAmountOfExcessFees(BigDecimal value) {
                this.amountOfExcessFees = value;
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
         *         <element name="recalculationReason">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <minLength value="1"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="sum">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               <fractionDigits value="2"/>
         *               <minInclusive value="-9999999999.99"/>
         *               <maxInclusive value="9999999999.99"/>
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
            "recalculationReason",
            "sum"
        })
        public static class PaymentRecalculation {

            /**
             * Основания перерасчётов
             * 
             */
            @XmlElement(required = true)
            protected String recalculationReason;
            /**
             * Сумма
             * 
             */
            @XmlElement(required = true)
            protected BigDecimal sum;

            /**
             * Основания перерасчётов
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRecalculationReason() {
                return recalculationReason;
            }

            /**
             * Sets the value of the recalculationReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getRecalculationReason()
             */
            public void setRecalculationReason(String value) {
                this.recalculationReason = value;
            }

            /**
             * Сумма
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSum() {
                return sum;
            }

            /**
             * Sets the value of the sum property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getSum()
             */
            public void setSum(BigDecimal value) {
                this.sum = value;
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
         *         <element name="paymentPeriodPiecemealPaymentSum" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               <fractionDigits value="2"/>
         *               <totalDigits value="18"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="pastPaymentPeriodPiecemealPaymentSum" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               <fractionDigits value="2"/>
         *               <totalDigits value="18"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="piecemealPaymentPercentRub">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               <fractionDigits value="2"/>
         *               <totalDigits value="18"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="piecemealPaymentPercent">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               <minInclusive value="0"/>
         *               <fractionDigits value="2"/>
         *               <totalDigits value="5"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="piecemealPaymentSum">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               <fractionDigits value="2"/>
         *               <totalDigits value="18"/>
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
            "paymentPeriodPiecemealPaymentSum",
            "pastPaymentPeriodPiecemealPaymentSum",
            "piecemealPaymentPercentRub",
            "piecemealPaymentPercent",
            "piecemealPaymentSum"
        })
        public static class PiecemealPayment {

            /**
             * Сумма платы с учётом рассрочки платежа - от платы за расчётный период, руб.
             * 
             */
            protected BigDecimal paymentPeriodPiecemealPaymentSum;
            /**
             * Сумма платы с учётом рассрочки платежа - от платы за предыдущие расчётные периоды
             * 
             */
            protected BigDecimal pastPaymentPeriodPiecemealPaymentSum;
            /**
             * Плата за рассрочку, руб.
             * 
             */
            @XmlElement(required = true)
            protected BigDecimal piecemealPaymentPercentRub;
            /**
             * Плата за рассрочку, %
             * 
             */
            @XmlElement(required = true)
            protected BigDecimal piecemealPaymentPercent;
            /**
             * Сумма к оплате с учётом рассрочки платежа и процентов за рассрочку, руб.
             * 
             */
            @XmlElement(required = true)
            protected BigDecimal piecemealPaymentSum;

            /**
             * Сумма платы с учётом рассрочки платежа - от платы за расчётный период, руб.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPaymentPeriodPiecemealPaymentSum() {
                return paymentPeriodPiecemealPaymentSum;
            }

            /**
             * Sets the value of the paymentPeriodPiecemealPaymentSum property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getPaymentPeriodPiecemealPaymentSum()
             */
            public void setPaymentPeriodPiecemealPaymentSum(BigDecimal value) {
                this.paymentPeriodPiecemealPaymentSum = value;
            }

            /**
             * Сумма платы с учётом рассрочки платежа - от платы за предыдущие расчётные периоды
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPastPaymentPeriodPiecemealPaymentSum() {
                return pastPaymentPeriodPiecemealPaymentSum;
            }

            /**
             * Sets the value of the pastPaymentPeriodPiecemealPaymentSum property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getPastPaymentPeriodPiecemealPaymentSum()
             */
            public void setPastPaymentPeriodPiecemealPaymentSum(BigDecimal value) {
                this.pastPaymentPeriodPiecemealPaymentSum = value;
            }

            /**
             * Плата за рассрочку, руб.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPiecemealPaymentPercentRub() {
                return piecemealPaymentPercentRub;
            }

            /**
             * Sets the value of the piecemealPaymentPercentRub property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getPiecemealPaymentPercentRub()
             */
            public void setPiecemealPaymentPercentRub(BigDecimal value) {
                this.piecemealPaymentPercentRub = value;
            }

            /**
             * Плата за рассрочку, %
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPiecemealPaymentPercent() {
                return piecemealPaymentPercent;
            }

            /**
             * Sets the value of the piecemealPaymentPercent property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getPiecemealPaymentPercent()
             */
            public void setPiecemealPaymentPercent(BigDecimal value) {
                this.piecemealPaymentPercent = value;
            }

            /**
             * Сумма к оплате с учётом рассрочки платежа и процентов за рассрочку, руб.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPiecemealPaymentSum() {
                return piecemealPaymentSum;
            }

            /**
             * Sets the value of the piecemealPaymentSum property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getPiecemealPaymentSum()
             */
            public void setPiecemealPaymentSum(BigDecimal value) {
                this.piecemealPaymentSum = value;
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceChargeType">
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ServiceCharge
            extends ServiceChargeType
        {


        }

    }

}
