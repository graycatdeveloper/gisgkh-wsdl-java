
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сводный статус объекта жилищного фонда в ГИС ЖКХ (для экспорта)
 * 
 * <p>Java class for OGFExportStatusType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OGFExportStatusType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}GKN_EGRP_KeyExportType">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OGFExportStatusType")
@XmlSeeAlso({
    HouseBasicExportType.class,
    BlockExportType.class,
    PremisesBasicExportType.class
})
public class OGFExportStatusType
    extends GKNEGRPKeyExportType
{


}
