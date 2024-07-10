
package ru.gosuslugi.dom.schema.integration.tariff;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Критерии дифференциации тарифов
 * 
 * <p>Java class for DifferentiationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DifferentiationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DifferentiationCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         <choice>
 *           <sequence>
 *             <element name="Operator3">
 *               <simpleType>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                   <enumeration value="Range"/>
 *                   <enumeration value="ExcludingRange"/>
 *                 </restriction>
 *               </simpleType>
 *             </element>
 *             <element name="ValueEnumeration" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}ValueEnumerationType" maxOccurs="1000"/>
 *           </sequence>
 *           <choice>
 *             <sequence>
 *               <element name="Operator1">
 *                 <simpleType>
 *                   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                     <enumeration value="Equal"/>
 *                     <enumeration value="More"/>
 *                     <enumeration value="NotMore"/>
 *                     <enumeration value="Less"/>
 *                     <enumeration value="NotLess"/>
 *                   </restriction>
 *                 </simpleType>
 *               </element>
 *               <choice>
 *                 <element name="ValueDate" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}ValueDateType"/>
 *                 <element name="ValueYear" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}ValueYearType"/>
 *                 <element name="ValueInteger" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}ValueIntegerType"/>
 *                 <element name="ValueReal" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}ValueRealType"/>
 *               </choice>
 *             </sequence>
 *             <sequence>
 *               <element name="Operator2">
 *                 <simpleType>
 *                   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                     <enumeration value="Range"/>
 *                     <enumeration value="ExcludingRange"/>
 *                   </restriction>
 *                 </simpleType>
 *               </element>
 *               <choice>
 *                 <sequence>
 *                   <element name="ValueDate1" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}ValueDateType"/>
 *                   <element name="ValueDate2" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}ValueDateType"/>
 *                 </sequence>
 *                 <sequence>
 *                   <element name="ValueYear1" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}ValueYearType"/>
 *                   <element name="ValueYear2" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}ValueYearType"/>
 *                 </sequence>
 *                 <sequence>
 *                   <element name="ValueInteger1" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}ValueIntegerType"/>
 *                   <element name="ValueInteger2" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}ValueIntegerType"/>
 *                 </sequence>
 *                 <sequence>
 *                   <element name="ValueReal1" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}ValueRealType"/>
 *                   <element name="ValueReal2" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}ValueRealType"/>
 *                 </sequence>
 *               </choice>
 *             </sequence>
 *           </choice>
 *           <element name="ValueString" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}ValueStringType"/>
 *           <element name="ValueBoolean" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}ValueBooleanType"/>
 *           <element name="ValueMultiline" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}ValueMultilineType"/>
 *           <element name="ValueFIAS" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}ValueFIASType" maxOccurs="1000"/>
 *           <element name="ValueOKTMO" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}ValueOKTMOType" maxOccurs="1000"/>
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
@XmlType(name = "DifferentiationType", propOrder = {
    "differentiationCode",
    "operator3",
    "valueEnumeration",
    "operator1",
    "valueDate",
    "valueYear",
    "valueInteger",
    "valueReal",
    "operator2",
    "valueDate1",
    "valueDate2",
    "valueYear1",
    "valueYear2",
    "valueInteger1",
    "valueInteger2",
    "valueReal1",
    "valueReal2",
    "valueString",
    "valueBoolean",
    "valueMultiline",
    "valueFIAS",
    "valueOKTMO"
})
public class DifferentiationType {

    /**
     * Код критерия дифференциации (см. метод exportTariffDifferentiation)
     * 
     */
    @XmlElement(name = "DifferentiationCode", required = true)
    protected BigInteger differentiationCode;
    /**
     * Range-диапазон значений, ExcludingRange-исключая диапазон значений
     * 
     */
    @XmlElement(name = "Operator3")
    protected String operator3;
    /**
     * Значение критерия дифференциации перечислимого типа
     * 
     */
    @XmlElement(name = "ValueEnumeration")
    protected List<ValueEnumerationType> valueEnumeration;
    /**
     * Equal-равно, More-больше, NotMore-не более, Less-меньше, NotLess-не меньше
     * 
     */
    @XmlElement(name = "Operator1")
    protected String operator1;
    /**
     * Значение критерия дифференциации типа даты
     * 
     */
    @XmlElement(name = "ValueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valueDate;
    /**
     * Значение критерия дифференциации типа год
     * 
     */
    @XmlElement(name = "ValueYear")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar valueYear;
    /**
     * Значение критерия дифференциации типа целое число
     * 
     */
    @XmlElement(name = "ValueInteger")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger valueInteger;
    /**
     * Значение критерия дифференциации типа вещественное число
     * 
     */
    @XmlElement(name = "ValueReal")
    protected BigDecimal valueReal;
    /**
     * Range-диапазон значений, ExcludingRange-исключая диапазон значений
     * 
     */
    @XmlElement(name = "Operator2")
    protected String operator2;
    /**
     * Значение критерия дифференциации типа даты C
     * 
     */
    @XmlElement(name = "ValueDate1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valueDate1;
    /**
     * Значение критерия дифференциации типа даты ПО
     * 
     */
    @XmlElement(name = "ValueDate2")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valueDate2;
    /**
     * Значение критерия дифференциации типа год C
     * 
     */
    @XmlElement(name = "ValueYear1")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar valueYear1;
    /**
     * Значение критерия дифференциации типа год ПО
     * 
     */
    @XmlElement(name = "ValueYear2")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar valueYear2;
    /**
     * Значение критерия дифференциации типа целое число С
     * 
     */
    @XmlElement(name = "ValueInteger1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger valueInteger1;
    /**
     * Значение критерия дифференциации типа целое число ПО
     * 
     */
    @XmlElement(name = "ValueInteger2")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger valueInteger2;
    /**
     * Значение критерия дифференциации типа вещественное число С
     * 
     */
    @XmlElement(name = "ValueReal1")
    protected BigDecimal valueReal1;
    /**
     * Значение критерия дифференциации типа вещественное число ПО
     * 
     */
    @XmlElement(name = "ValueReal2")
    protected BigDecimal valueReal2;
    /**
     * Значение критерия дифференциации строкового типа
     * 
     */
    @XmlElement(name = "ValueString")
    protected String valueString;
    /**
     * Значение критерия дифференциации логического типа
     * 
     */
    @XmlElement(name = "ValueBoolean")
    protected Boolean valueBoolean;
    /**
     * Значение критерия дифференциации многострочного типа
     * 
     */
    @XmlElement(name = "ValueMultiline")
    protected ValueMultilineType valueMultiline;
    /**
     * Значение критерия дифференциации перечислимого типа (выбор из справочника ФИАС)
     * 
     */
    @XmlElement(name = "ValueFIAS")
    protected List<String> valueFIAS;
    /**
     * Значение критерия дифференциации перечислимого типа (выбор из справочника ОКТМО)
     * 
     */
    @XmlElement(name = "ValueOKTMO")
    protected List<ValueOKTMOType> valueOKTMO;

    /**
     * Код критерия дифференциации (см. метод exportTariffDifferentiation)
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
     * Range-диапазон значений, ExcludingRange-исключая диапазон значений
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator3() {
        return operator3;
    }

    /**
     * Sets the value of the operator3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOperator3()
     */
    public void setOperator3(String value) {
        this.operator3 = value;
    }

    /**
     * Значение критерия дифференциации перечислимого типа
     * 
     * Gets the value of the valueEnumeration property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueEnumeration property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getValueEnumeration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueEnumerationType }
     * </p>
     * 
     * 
     * @return
     *     The value of the valueEnumeration property.
     */
    public List<ValueEnumerationType> getValueEnumeration() {
        if (valueEnumeration == null) {
            valueEnumeration = new ArrayList<>();
        }
        return this.valueEnumeration;
    }

    /**
     * Equal-равно, More-больше, NotMore-не более, Less-меньше, NotLess-не меньше
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator1() {
        return operator1;
    }

    /**
     * Sets the value of the operator1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOperator1()
     */
    public void setOperator1(String value) {
        this.operator1 = value;
    }

    /**
     * Значение критерия дифференциации типа даты
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValueDate() {
        return valueDate;
    }

    /**
     * Sets the value of the valueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getValueDate()
     */
    public void setValueDate(XMLGregorianCalendar value) {
        this.valueDate = value;
    }

    /**
     * Значение критерия дифференциации типа год
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValueYear() {
        return valueYear;
    }

    /**
     * Sets the value of the valueYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getValueYear()
     */
    public void setValueYear(XMLGregorianCalendar value) {
        this.valueYear = value;
    }

    /**
     * Значение критерия дифференциации типа целое число
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValueInteger() {
        return valueInteger;
    }

    /**
     * Sets the value of the valueInteger property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getValueInteger()
     */
    public void setValueInteger(BigInteger value) {
        this.valueInteger = value;
    }

    /**
     * Значение критерия дифференциации типа вещественное число
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValueReal() {
        return valueReal;
    }

    /**
     * Sets the value of the valueReal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getValueReal()
     */
    public void setValueReal(BigDecimal value) {
        this.valueReal = value;
    }

    /**
     * Range-диапазон значений, ExcludingRange-исключая диапазон значений
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator2() {
        return operator2;
    }

    /**
     * Sets the value of the operator2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOperator2()
     */
    public void setOperator2(String value) {
        this.operator2 = value;
    }

    /**
     * Значение критерия дифференциации типа даты C
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValueDate1() {
        return valueDate1;
    }

    /**
     * Sets the value of the valueDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getValueDate1()
     */
    public void setValueDate1(XMLGregorianCalendar value) {
        this.valueDate1 = value;
    }

    /**
     * Значение критерия дифференциации типа даты ПО
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValueDate2() {
        return valueDate2;
    }

    /**
     * Sets the value of the valueDate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getValueDate2()
     */
    public void setValueDate2(XMLGregorianCalendar value) {
        this.valueDate2 = value;
    }

    /**
     * Значение критерия дифференциации типа год C
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValueYear1() {
        return valueYear1;
    }

    /**
     * Sets the value of the valueYear1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getValueYear1()
     */
    public void setValueYear1(XMLGregorianCalendar value) {
        this.valueYear1 = value;
    }

    /**
     * Значение критерия дифференциации типа год ПО
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValueYear2() {
        return valueYear2;
    }

    /**
     * Sets the value of the valueYear2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getValueYear2()
     */
    public void setValueYear2(XMLGregorianCalendar value) {
        this.valueYear2 = value;
    }

    /**
     * Значение критерия дифференциации типа целое число С
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValueInteger1() {
        return valueInteger1;
    }

    /**
     * Sets the value of the valueInteger1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getValueInteger1()
     */
    public void setValueInteger1(BigInteger value) {
        this.valueInteger1 = value;
    }

    /**
     * Значение критерия дифференциации типа целое число ПО
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValueInteger2() {
        return valueInteger2;
    }

    /**
     * Sets the value of the valueInteger2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getValueInteger2()
     */
    public void setValueInteger2(BigInteger value) {
        this.valueInteger2 = value;
    }

    /**
     * Значение критерия дифференциации типа вещественное число С
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValueReal1() {
        return valueReal1;
    }

    /**
     * Sets the value of the valueReal1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getValueReal1()
     */
    public void setValueReal1(BigDecimal value) {
        this.valueReal1 = value;
    }

    /**
     * Значение критерия дифференциации типа вещественное число ПО
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValueReal2() {
        return valueReal2;
    }

    /**
     * Sets the value of the valueReal2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getValueReal2()
     */
    public void setValueReal2(BigDecimal value) {
        this.valueReal2 = value;
    }

    /**
     * Значение критерия дифференциации строкового типа
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueString() {
        return valueString;
    }

    /**
     * Sets the value of the valueString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getValueString()
     */
    public void setValueString(String value) {
        this.valueString = value;
    }

    /**
     * Значение критерия дифференциации логического типа
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValueBoolean() {
        return valueBoolean;
    }

    /**
     * Sets the value of the valueBoolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isValueBoolean()
     */
    public void setValueBoolean(Boolean value) {
        this.valueBoolean = value;
    }

    /**
     * Значение критерия дифференциации многострочного типа
     * 
     * @return
     *     possible object is
     *     {@link ValueMultilineType }
     *     
     */
    public ValueMultilineType getValueMultiline() {
        return valueMultiline;
    }

    /**
     * Sets the value of the valueMultiline property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueMultilineType }
     *     
     * @see #getValueMultiline()
     */
    public void setValueMultiline(ValueMultilineType value) {
        this.valueMultiline = value;
    }

    /**
     * Значение критерия дифференциации перечислимого типа (выбор из справочника ФИАС)
     * 
     * Gets the value of the valueFIAS property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueFIAS property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getValueFIAS().add(newItem);
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
     *     The value of the valueFIAS property.
     */
    public List<String> getValueFIAS() {
        if (valueFIAS == null) {
            valueFIAS = new ArrayList<>();
        }
        return this.valueFIAS;
    }

    /**
     * Значение критерия дифференциации перечислимого типа (выбор из справочника ОКТМО)
     * 
     * Gets the value of the valueOKTMO property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueOKTMO property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getValueOKTMO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueOKTMOType }
     * </p>
     * 
     * 
     * @return
     *     The value of the valueOKTMO property.
     */
    public List<ValueOKTMOType> getValueOKTMO() {
        if (valueOKTMO == null) {
            valueOKTMO = new ArrayList<>();
        }
        return this.valueOKTMO;
    }

}
