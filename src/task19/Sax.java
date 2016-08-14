package task19;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class Sax extends DefaultHandler {
	int counter = 0;
	ArrayList<String> pointX = new ArrayList<>();
	ArrayList<String> pointY = new ArrayList<>();
	ArrayList<String> pointUnit = new ArrayList<>();
	boolean isX = false;
	boolean isY = false;
	boolean isUnit = false;

	@Override
	public void startDocument() {
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attrs) {
		if (localName.equals("pointList")) {
			System.out.println(localName);
		}
		if (localName.equals("point")) {
			counter++;
		}
		if (localName.equals("x")) {
			isX = true;
		}
		if (localName.equals("y")) {
			isY = true;
		}
		if (localName.equals("unit")) {
			isUnit = true;
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) {
		if (isX) {
			pointX.add(new String(ch, start, length));
			isX = false;
		}
		if (isY) {
			pointY.add(new String(ch, start, length));
			isY = false;
		}
		if (isUnit) {
			pointUnit.add(new String(ch, start, length));
			isUnit = false;
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) {
	}

	@Override
	public void endDocument() {
		for (int i = 0; i < counter; i++) {
			System.out.println("point " + (i + 1) + ": " + pointX.get(i)
					+ pointUnit.get(i) + ", " + pointY.get(i)
					+ pointUnit.get(i));
		}
	}
}