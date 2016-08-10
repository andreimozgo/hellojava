package classwork;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomParser {

	public static void main(String[] args) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		Document doc = null;
		try {
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		File f = new File("src/1.xml");
		try {
			doc = builder.parse(f);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Element root = doc.getDocumentElement();
		System.out.print(root.getTagName());
		
		NodeList nList = root..getChildNodes();
		//System.out.println(nList.getLength());
		int number=1;
		for (int i = 0; i < nList.getLength(); i++) {
			//System.out.println(nList.item(i).getNodeName());
			//System.out.println(nList.item(i).getNodeValue());
			
			if (nList.item(i) instanceof Element) {
				System.out.print("\n" + nList.item(i).getNodeName() + " " + number++ + ":");
				
				NodeList nList2 = nList.item(i).getChildNodes();
				//System.out.print(nList.item(i).getElementsByTagName("x");
				System.out.print(nList2.item(1).getTextContent() + nList2.item(5).getTextContent() +
						"," + nList2.item(3).getTextContent() + nList2.item(5).getTextContent());
			/*	for (int j = 0; j < nList2.getLength(); j++) {
					if (nList2.item(j). instanceof Element) {
						System.out.print(nList2.item(j).getTextContent());
					}*/
				//}
//				NamedNodeMap attributes = ((Element)nList.item(i)).getAttributes( );
//				for (int k = 0; k < attributes.getLength(); k++) {
//					System.out.print(attributes.item(k).getNodeName());
//					System.out.print(attributes.item(k).getNodeValue());
//				}
			}
		}
	}
}

