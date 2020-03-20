package Lebedenko.Lesson6;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class Lesson6 {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException, TransformerException {
        ReadWithDOM readWithDOM = new ReadWithDOM ();
        readWithDOM.read ();

        ReadWithSAX readWithSAX = new ReadWithSAX ();
        readWithSAX.read ();
        System.out.println( XMLValidator.validateXml("D:\\Projects\\Java\\Lesson6\\Books.xsd", "D:\\Projects\\Java\\Lesson6\\Books.xml"));

    }
}
