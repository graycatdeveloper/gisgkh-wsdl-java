
package ru.gosuslugi.dom.schema.integration.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Результат экспорта сведений о выполненных работах и услугах
 * 
 * <p>Java class for exportCompletedWorksResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportCompletedWorksResultType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/services/}CompletedWorksByPeriodExportType">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportCompletedWorksResultType")
public class ExportCompletedWorksResultType
    extends CompletedWorksByPeriodExportType
{


}
