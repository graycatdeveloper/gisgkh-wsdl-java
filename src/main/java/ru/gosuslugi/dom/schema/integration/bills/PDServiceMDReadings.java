
package ru.gosuslugi.dom.schema.integration.bills;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о показаниях приборов учета
 * 
 * <p>Java class for PDServiceMDReadings complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PDServiceMDReadings">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MeteringDevice">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="100"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="MDPreviousPeriodReadings" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <pattern value="\d{1,15}(\.\d{1,5})?"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="MDUnit" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="20"/>
 *               <enumeration value="113"/>
 *               <enumeration value="116"/>
 *               <enumeration value="233"/>
 *               <enumeration value="245"/>
 *               <enumeration value="246"/>
 *               <enumeration value="271"/>
 *               <enumeration value="A005"/>
 *               <enumeration value="A056"/>
 *               <enumeration value="A058"/>
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
@XmlType(name = "PDServiceMDReadings", propOrder = {
    "meteringDevice",
    "mdPreviousPeriodReadings",
    "mdUnit"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.bills.PaymentDocumentType.IndividualMDReadings.class,
    ru.gosuslugi.dom.schema.integration.bills.PaymentDocumentExportType.IndividualMDReadings.class
})
public class PDServiceMDReadings {

    /**
     * Прибор учета.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 2 примерной формы ПД
     * 
     */
    @XmlElement(name = "MeteringDevice", required = true)
    protected String meteringDevice;
    /**
     * Показания прибора учета за предыдущий месяц, ед.
     * Должны быть указаны, если указана единица измерения показаний (tns:MDUnit).
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 2 примерной формы ПД
     * 
     */
    @XmlElement(name = "MDPreviousPeriodReadings")
    protected BigDecimal mdPreviousPeriodReadings;
    /**
     * Код единицы измерения из классификатора ОКЕИ.
     *  113 - м[3*]
     *  116 - дкл
     *  233 - Гкал
     *  245 - кВт.ч
     *  246 - МВт.ч|^ 10[3*] кВт.ч
     *  271 - Дж
     * A005 - м вод. ст
     * A056 - ГДж
     * A058 - МДж
     * Должен быть указан, если заполнены показания прибора учета за предыдущий месяц (tns:MDPreviousPeriodReadings).
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 2 примерной формы ПД
     * 
     */
    @XmlElement(name = "MDUnit")
    protected String mdUnit;

    /**
     * Прибор учета.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 2 примерной формы ПД
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeteringDevice() {
        return meteringDevice;
    }

    /**
     * Sets the value of the meteringDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMeteringDevice()
     */
    public void setMeteringDevice(String value) {
        this.meteringDevice = value;
    }

    /**
     * Показания прибора учета за предыдущий месяц, ед.
     * Должны быть указаны, если указана единица измерения показаний (tns:MDUnit).
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 2 примерной формы ПД
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDPreviousPeriodReadings() {
        return mdPreviousPeriodReadings;
    }

    /**
     * Sets the value of the mdPreviousPeriodReadings property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getMDPreviousPeriodReadings()
     */
    public void setMDPreviousPeriodReadings(BigDecimal value) {
        this.mdPreviousPeriodReadings = value;
    }

    /**
     * Код единицы измерения из классификатора ОКЕИ.
     *  113 - м[3*]
     *  116 - дкл
     *  233 - Гкал
     *  245 - кВт.ч
     *  246 - МВт.ч|^ 10[3*] кВт.ч
     *  271 - Дж
     * A005 - м вод. ст
     * A056 - ГДж
     * A058 - МДж
     * Должен быть указан, если заполнены показания прибора учета за предыдущий месяц (tns:MDPreviousPeriodReadings).
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 2 примерной формы ПД
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDUnit() {
        return mdUnit;
    }

    /**
     * Sets the value of the mdUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMDUnit()
     */
    public void setMDUnit(String value) {
        this.mdUnit = value;
    }

}
