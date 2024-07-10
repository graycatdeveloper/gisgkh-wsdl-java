
package ru.gosuslugi.dom.schema.integration.tariff;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiItemInfoType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Экспортируемые сведения о критерии дифференциации
 * 
 * <p>Java class for exportDifferentiationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportDifferentiationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DifferentiationCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         <element name="DifferentiationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="DifferentiationValueKind" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}DifferentiationValueKindType"/>
 *         <element name="UsedFor" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}TariffCaseType" maxOccurs="5"/>
 *         <element name="TariffKind" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="100" minOccurs="0"/>
 *         <element name="NsiItem" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}NsiItemInfoType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}ListGroup"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="IsPlural" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportDifferentiationType", propOrder = {
    "differentiationCode",
    "differentiationName",
    "differentiationValueKind",
    "usedFor",
    "tariffKind",
    "nsiItem",
    "isPlural"
})
public class ExportDifferentiationType {

    /**
     * Код критерия дифференциации.
     * 
     */
    @XmlElement(name = "DifferentiationCode", required = true)
    protected BigInteger differentiationCode;
    /**
     * Наименование критерия дифференциации.
     * 
     */
    @XmlElement(name = "DifferentiationName", required = true)
    protected String differentiationName;
    /**
     * Тип значения критерия дифференциации.
     * 
     */
    @XmlElement(name = "DifferentiationValueKind", required = true)
    @XmlSchemaType(name = "string")
    protected DifferentiationValueKindType differentiationValueKind;
    /**
     * Тип тарифа, для которого применяется критерий дифференциации (MunicipalResourceTariff - тариф на оплату коммунальных ресурсов, ResidentialPremisesMaintenance - размер платы за содержание жилого помещения, CapitalRepairTariff - минимальный размер взноса на капитальный ремонт, SocialNorm - социальная норма потребления электрической энергии, ResidentialPremisesUsage - размер платы за пользование жилым помещением.
     * 
     */
    @XmlElement(name = "UsedFor", required = true)
    @XmlSchemaType(name = "string")
    protected List<TariffCaseType> usedFor;
    /**
     * Сведения о виде тарифа из справочника НСИ 125 (Вид тарифа). Заполняется только для тарифов на коммунальные ресурсы. Содержит сведения о виде тарифа на коммунальные ресурсы, для которого может быть применен критерий дифференциации.
     * 
     */
    @XmlElement(name = "TariffKind")
    protected List<NsiRef> tariffKind;
    /**
     * Информация о справочнике для критерия перечислимого типа.
     * 
     */
    @XmlElement(name = "NsiItem")
    protected ExportDifferentiationType.NsiItem nsiItem;
    /**
     * true - справочником предусмотрено несколько значений; false - справочником предусмотрено одно значение (при формировании запросов на импорт сведений о тарифах, для критериев перечислимого типа предоставляется возможность указать несколько значений).
     * 
     */
    @XmlElement(name = "IsPlural")
    protected Boolean isPlural;

    /**
     * Код критерия дифференциации.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDifferentiationCode() {
        return differentiationCode;
    }

    /**
     * Sets the value of the differentiationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getDifferentiationCode()
     */
    public void setDifferentiationCode(BigInteger value) {
        this.differentiationCode = value;
    }

    /**
     * Наименование критерия дифференциации.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDifferentiationName() {
        return differentiationName;
    }

    /**
     * Sets the value of the differentiationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDifferentiationName()
     */
    public void setDifferentiationName(String value) {
        this.differentiationName = value;
    }

    /**
     * Тип значения критерия дифференциации.
     * 
     * @return
     *     possible object is
     *     {@link DifferentiationValueKindType }
     *     
     */
    public DifferentiationValueKindType getDifferentiationValueKind() {
        return differentiationValueKind;
    }

    /**
     * Sets the value of the differentiationValueKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link DifferentiationValueKindType }
     *     
     * @see #getDifferentiationValueKind()
     */
    public void setDifferentiationValueKind(DifferentiationValueKindType value) {
        this.differentiationValueKind = value;
    }

    /**
     * Тип тарифа, для которого применяется критерий дифференциации (MunicipalResourceTariff - тариф на оплату коммунальных ресурсов, ResidentialPremisesMaintenance - размер платы за содержание жилого помещения, CapitalRepairTariff - минимальный размер взноса на капитальный ремонт, SocialNorm - социальная норма потребления электрической энергии, ResidentialPremisesUsage - размер платы за пользование жилым помещением.
     * 
     * Gets the value of the usedFor property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usedFor property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUsedFor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffCaseType }
     * </p>
     * 
     * 
     * @return
     *     The value of the usedFor property.
     */
    public List<TariffCaseType> getUsedFor() {
        if (usedFor == null) {
            usedFor = new ArrayList<>();
        }
        return this.usedFor;
    }

    /**
     * Сведения о виде тарифа из справочника НСИ 125 (Вид тарифа). Заполняется только для тарифов на коммунальные ресурсы. Содержит сведения о виде тарифа на коммунальные ресурсы, для которого может быть применен критерий дифференциации.
     * 
     * Gets the value of the tariffKind property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tariffKind property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTariffKind().add(newItem);
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
     *     The value of the tariffKind property.
     */
    public List<NsiRef> getTariffKind() {
        if (tariffKind == null) {
            tariffKind = new ArrayList<>();
        }
        return this.tariffKind;
    }

    /**
     * Информация о справочнике для критерия перечислимого типа.
     * 
     * @return
     *     possible object is
     *     {@link ExportDifferentiationType.NsiItem }
     *     
     */
    public ExportDifferentiationType.NsiItem getNsiItem() {
        return nsiItem;
    }

    /**
     * Sets the value of the nsiItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDifferentiationType.NsiItem }
     *     
     * @see #getNsiItem()
     */
    public void setNsiItem(ExportDifferentiationType.NsiItem value) {
        this.nsiItem = value;
    }

    /**
     * true - справочником предусмотрено несколько значений; false - справочником предусмотрено одно значение (при формировании запросов на импорт сведений о тарифах, для критериев перечислимого типа предоставляется возможность указать несколько значений).
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPlural() {
        return isPlural;
    }

    /**
     * Sets the value of the isPlural property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsPlural()
     */
    public void setIsPlural(Boolean value) {
        this.isPlural = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}NsiItemInfoType">
     *       <sequence>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}ListGroup"/>
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
        "listGroup"
    })
    public static class NsiItem
        extends NsiItemInfoType
    {

        /**
         * Группа справочника:
         * NSI - (по умолчанию) общесистемный 
         * NSIRAO - ОЖФ
         * 
         */
        @XmlElement(name = "ListGroup", namespace = "http://dom.gosuslugi.ru/schema/integration/nsi-base/", required = true)
        protected String listGroup;

        /**
         * Группа справочника:
         * NSI - (по умолчанию) общесистемный 
         * NSIRAO - ОЖФ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getListGroup() {
            return listGroup;
        }

        /**
         * Sets the value of the listGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getListGroup()
         */
        public void setListGroup(String value) {
            this.listGroup = value;
        }

    }

}
