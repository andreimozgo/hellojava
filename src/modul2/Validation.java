package modul2;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

public class Validation{
	
	public static boolean validateXMLByXSD(File xml, File xsd) throws SAXException, IOException {
	    try {
	        SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI)
	        .newSchema(xsd)
	        .newValidator()
	        .validate(new StreamSource(xml));
	    } catch (Exception e) {
	        e.printStackTrace();
	        return false;
	    }
	    return true;
	}
	public static void main(String[] args) throws SAXException, IOException {
		File xml = new File("src/modul2/flowers.xml");
		File xsd = new File("src/modul2/flowers.xsd");
		
		if(validateXMLByXSD(xml, xsd)){
			System.out.println("The XML document is fully valid.");
		}
		else 
			System.out.println("The XML document is not valid.");
	}
}