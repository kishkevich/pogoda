package by.itacademy.pogoda;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

public class ParseXML {
    private List<Weather> weatherList = new ArrayList<>();

    public List<Weather> parseWeather(Document document) {
        NodeList nodeList = document.getElementsByTagName("element");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                createList(element, document);
            }
        }
        return weatherList;
    }

    public void createList(Element element, Document document) {
        this.weatherList.add((Weather.Builder.createBuilder()
                .setLocation(element.getElementsByTagName("location").item(0).getTextContent())
                .setDescription(element.getElementsByTagName("description").item(0).getTextContent()))
                .setTemp_max(element.getElementsByTagName("temp_max").item(0).getTextContent())
                .setTemp_min(element.getElementsByTagName("temp_min").item(0).getTextContent())
                .buildWeather());

    }
}
