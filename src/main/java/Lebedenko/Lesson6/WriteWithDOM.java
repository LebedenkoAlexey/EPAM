package Lebedenko.Lesson6;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.SAAJResult;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class WriteWithDOM {
    public void write() throws ParserConfigurationException, TransformerException, FileNotFoundException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance ();
        DocumentBuilder builder =factory.newDocumentBuilder ();
        Document document =  builder.newDocument ();
        Element books = document.createElement ("Books");
        Element book = document.createElement ("Book");
        Element Page_coun = document.createElement ("Page_coun");
        Element Publisher = document.createElement ("Publisher");
        Element Author = document.createElement ("Author");
        Element firstName = document.createElement ("firstName");
        Element lastName = document.createElement ("lastName");
        Element secondName = document.createElement ("secondName");
        Text text_Page_coun = document.createTextNode ("100");
        Text text_Publisher = document.createTextNode ("BHV");
        Text text_firstName = document.createTextNode ("Петров");
        Text text_lastName = document.createTextNode ("Иван");
        Text text_secondName = document.createTextNode ("Сидорович");

        document.appendChild (books);
        books.appendChild (book);
        book.appendChild (Page_coun);
        Page_coun.appendChild ( text_Page_coun);
        book.appendChild (Publisher);
        Publisher.appendChild (text_Publisher);
        book.appendChild (Author);
        Author.appendChild (firstName);
        firstName.appendChild (text_firstName);
        Author.appendChild (lastName);
        lastName.appendChild (text_lastName);
        Author.appendChild (secondName);
        secondName.appendChild (text_secondName);
        book.setAttribute ("title","Супер книга");

        Transformer t = TransformerFactory.newInstance ().newTransformer ();
        t.setOutputProperty (OutputKeys.INDENT,"yes");
        t.transform (new DOMSource (document),new StreamResult (new FileOutputStream ("Books.xml")));
    }

}
