package task19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class StaxParser {
	public static void main(String args[]) {
		boolean isX = false;
		boolean isY = false;
		boolean isUnit = false;
		String pointX = new String();
		String pointY = new String();
		XMLInputFactory factory = XMLInputFactory.newFactory();
		int number = 0;

		try {
			XMLStreamReader reader = factory
					.createXMLStreamReader(new FileInputStream("src/1.xml"));
			while (reader.hasNext()) {
				int res = reader.next();
				if (res == XMLStreamConstants.START_ELEMENT) {
					if (reader.getLocalName().equals("pointList"))
						System.out.println(reader.getLocalName());
					else if (reader.getLocalName().equals("point"))
						System.out.print(reader.getLocalName() + " "
								+ ++number + ":");
					else if (reader.getLocalName().equals("x"))
						isX = true;
					else if (reader.getLocalName().equals("y"))
						isY = true;
					else if (reader.getLocalName().equals("unit"))
						isUnit = true;
				} else if (res == XMLStreamConstants.CHARACTERS) {
					if (isX) {
						pointX = reader.getText();
						isX = false;
					} else if (isY) {
						pointY = reader.getText();
						isY = false;
					} else if (isUnit) {
						System.out.println(pointX + reader.getText() + ","
								+ pointY + reader.getText());
						isUnit = false;
					}
				}
			}
		} catch (FileNotFoundException | XMLStreamException e) {
			e.printStackTrace();
		}
	}
}
