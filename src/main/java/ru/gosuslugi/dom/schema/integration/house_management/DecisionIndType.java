
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.individual_registry_base.FIOType;


/**
 * Физическое лицо для решений
 * 
 * <p>Java class for DecisionIndType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DecisionIndType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/individual-registry-base/}FIOType">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionIndType")
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.house_management.Owner.OwnerInd.class,
    ru.gosuslugi.dom.schema.integration.house_management.Representative.RepresentativeInd.class
})
public class DecisionIndType
    extends FIOType
{


}
