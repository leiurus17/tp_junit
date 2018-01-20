package xmlunit;

import org.custommonkey.xmlunit.XMLTestCase;
import org.junit.Test;

public class MyXMLTestCase extends XMLTestCase {

	// This test method compare two pieces of the XML
	@Test
	public void testForXMLEquality() throws Exception {
		String myControlXML = "<msg><uuid>0x00435A8C</uuid></msg>";
		//String myTestXML = "<msg><uuid>0x00435A8C</uuid></msg>";
		String myTestXML = "<msg><localId>2376</localId></msg>";
		
		assertXMLEqual("Comparing test XML to control XML", myControlXML, myTestXML);
	}
}
