package org.example

import java.io.File
import com.sun.tools.ws.WsImport.doMain as convert

private val wsdlDir = File("wsdl_xsd_14.4.0.1")
private val targetDir = File("src/main/java")

fun main() {
    System.setProperty("jdk.xml.maxOccurLimit", "100000")

    targetDir.mkdirs()

    wsdlDir.listFiles()?.forEach { dir ->
        dir.listFiles()?.firstOrNull { it.extension == "wsdl" }?.let { wsdl ->
            val args = arrayOf(
                "-s", targetDir.absolutePath,
                "-keep",
                "-Xnocompile",
                "-extension",
                "-encoding", "UTF-8",
                "-wsdllocation", "http://localhost/",
                "${dir.absolutePath}/${wsdl.name}"
            )
            convert(args)
        }
    }

    //val port = ru.gosuslugi.dom.schema.integration.house_management_service_async.HouseManagementServiceAsync().houseManagementPortAsync

}