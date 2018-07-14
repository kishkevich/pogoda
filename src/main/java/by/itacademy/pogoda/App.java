package by.itacademy.pogoda;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ParserConfigurationException, SAXException, IOException {

ReadXML readXML=new ReadXML();
readXML.read();
    }
}
