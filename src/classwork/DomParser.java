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

class Point {
	String x;
	String y;
	String unit;
}

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

		NodeList nList = root.getChildNodes();
		Point point = new Point();
		for (int i = 0; i < nList.getLength(); i++) {
			if (nList.item(i) instanceof Element) {
				NodeList nList2 = nList.item(i).getChildNodes();
				NamedNodeMap attributes = nList.item(i).getAttributes();
				System.out.print("\n" + nList.item(i).getNodeName() + " "
						+ attributes.getNamedItem("m").getNodeValue() + ":");
				for (int j = 0; j < nList2.getLength(); j++) {
					if (nList2.item(j) instanceof Element) {
						switch (nList2.item(j).getNodeName()) {
						case "x":
							point.x = nList2.item(j).getTextContent();
							break;
						case "y":
							point.y = nList2.item(j).getTextContent();
							break;
						case "unit":
							point.unit = nList2.item(j).getTextContent();
						}
					}
				}
				System.out.print(point.x + point.unit + "," + point.y
						+ point.unit);
			}
		}
	}
}
