package Lebedenko.Lesson6;

import org.w3c.dom.*;
import org.xml.sax.SAXException;
import lombok.extern.slf4j.Slf4j;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.*;

@Slf4j
public class ReadWithDOM {

    void read() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance ();
        DocumentBuilder builder = factory.newDocumentBuilder ();
        Document document = builder.parse (new File ("D:\\Projects\\Java\\Lesson6\\src\\main\\java\\Lebedenko\\Lesson6\\plant_catalog.xml") );
        Element element = document.getDocumentElement ();
        printElement (element.getChildNodes ());
    }

    static void printElement(NodeList nodeList){
        for (int i=0; i<nodeList.getLength ();i++){
            if (nodeList.item (i) instanceof Element){
                String value="";
                if(!nodeList.item (i).getTextContent ().trim ().isEmpty () &&!((Text)nodeList.item (i).getFirstChild ()).getData ().trim ().isEmpty ()&&!((Text)nodeList.item (i).getFirstChild ()).getData ().trim ().equals (("\n"))){
                    Text text = (Text)nodeList.item (i).getFirstChild ();
                    value += "=" + text.getData ().trim ();
                }
                System.out.println (nodeList.item (i).getNodeName ()+value);
                log.info (nodeList.item (i).getNodeName ()+value);

                if (nodeList.item (i).hasChildNodes ()){
                    printElement(nodeList.item (i).getChildNodes ());
                }
            }
        }
    }
}


