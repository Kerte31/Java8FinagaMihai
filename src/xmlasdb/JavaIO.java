/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlasdb;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Mihai
 */
public class JavaIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            File inputFile = new File("C:\\Users\\Mihai\\Documents\\NetBeansProjects\\Java8FinagaMihai\\src\\xmlasdb\\users.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element : " + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("user");
            System.out.println("----------------------------");
            int length = nList.getLength();
            System.out.println("XML number of elements = " + length);
            for (int temp = 0; temp < length; temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element : " + nNode.getNodeName());
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("Username : "
                            + eElement.getElementsByTagName("username")
                                    .item(0)
                                    .getTextContent());
                    System.out.println("Password : "
                            + eElement
                                    .getElementsByTagName("password")
                                    .item(0)
                                    .getTextContent());
                    System.out.println("Role : "
                            + eElement
                                    .getElementsByTagName("role")
                                    .item(0)
                                    .getTextContent());
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException | DOMException e) {
        }
    }

}
