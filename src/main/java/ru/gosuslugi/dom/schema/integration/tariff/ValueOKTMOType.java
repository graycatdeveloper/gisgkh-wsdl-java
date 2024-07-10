
package ru.gosuslugi.dom.schema.integration.tariff;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.OKTMORefType;


/**
 * Критерий дифференциации перечислимого типа (выбор из справочника ОКТМО)
 * 
 * <p>Java class for ValueOKTMOType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ValueOKTMOType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueOKTMOType")
public class ValueOKTMOType
    extends OKTMORefType
{


}
