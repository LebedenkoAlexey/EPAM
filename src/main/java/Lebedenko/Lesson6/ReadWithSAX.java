package Lebedenko.Lesson6;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import lombok.extern.slf4j.Slf4j;

import javax.lang.model.element.Element;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.io.File;
import java.util.Arrays;

@Slf4j
public class ReadWithSAX {
    void read() throws ParserConfigurationException, SAXException, IOException {
        DefaultHandler defaultHandler = new DefaultHandler (){
            @Override
            public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                String str="";
                String name = qName.trim ();

                System.out.println("");
                //log.info("\n");
                str+=name.trim ();
                if (!name.equals ("PLANT")&!name.equals ("CATALOG"))
                    str+="= ";
                log.info(str);
                System.out.print(str);
            }

            @Override
            public void characters(char[] ch, int start, int length) throws SAXException {
               String str="";
               for (int i=0; i<length;i++){
                       str += ch[start + i];
               }
               System.out.print (str.trim ());
                log.info(str.trim ());
            }
        };
//
        SAXParserFactory factory = SAXParserFactory.newInstance ();
        SAXParser parser = factory.newSAXParser ();
        parser.parse (new File ("D:\\Projects\\Java\\Lesson6\\src\\main\\java\\Lebedenko\\Lesson6\\plant_catalog.xml"),defaultHandler);

//
    }
}
