package by.itacademy.pogoda;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ReadXML {
    private List<Weather> weatherList = new ArrayList<>();

    public List<Weather> read() throws IOException, ParserConfigurationException, SAXException {
        URL url = new URL("https://raw.githubusercontent.com/kishkevich/pogoda/master/pogoda-xml.xml");
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        InputStream inputStream = url.openStream();
        Document document = builder.parse(inputStream);
        weatherList.addAll(new ParseXML().parseWeather(document));
        inputStream.close();
        return weatherList;
    }
}
