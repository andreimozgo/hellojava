package task19;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class Sax extends DefaultHandler {

	@Override
	public void startDocument() {
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attrs) {
		System.out.print(localName);
	}

	@Override
	public void characters(char[] ch, int start, int length) {
		System.out.print(" " + new String(ch, start, length) + " ");
	}

	@Override
	public void endElement(String uri, String localName, String qName) {
	}

	@Override
	public void endDocument() {
	}
}