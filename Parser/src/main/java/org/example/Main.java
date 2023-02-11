package org.example;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            //Build Document
            final String inputFileName = "C:\\Users\\User467\\Desktop\\InputXML.xml";
            Document document = builder.parse(new File(inputFileName));

            //Normalize the XML Structure; It's just too important !!
            document.getDocumentElement().normalize();
            //Here comes the root node
            Element root = document.getDocumentElement();
            System.out.println(root.getNodeName());

            //Get all employees
            NodeList nList = document.getElementsByTagName("employee");
            System.out.println("============================");

            visitChildNodes(nList);
        } catch (ParserConfigurationException ex) {
            System.out.println(ex.toString());
        } catch (SAXException ex) {
            System.out.println(ex.toString());
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } finally {
            System.out.println("============================");
            System.out.println("Program completed!");
        }
    }

    private static List<Employee> parseEmployeesXML() throws ParserConfigurationException, SAXException, IOException {
        //Initialize a list of employees
        List<Employee> employees = new ArrayList<Employee>();
        Employee employee = null;

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        final String inputFileName = "C:\\Users\\HP\\Downloads\\reader-development\\TestValueType\\target\\classes\\InputXML.xml";
        Document document = builder.parse(new File(inputFileName));
        document.getDocumentElement().normalize();
        NodeList nList = document.getElementsByTagName("employee");
        for (int i = 0; i < nList.getLength(); i++) {
            Node node = nList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) node;

                //Create new Employee Object
                employee = new Employee();
                employee.id = (Integer.parseInt(eElement.getAttribute("id")));
                employee.firstName = (eElement.getElementsByTagName("firstName").item(0).getTextContent());
                employee.lastName = (eElement.getElementsByTagName("lastName").item(0).getTextContent());
                employee.location = (eElement.getElementsByTagName("location").item(0).getTextContent());

                //Add Employee to list
                employees.add(employee);
            }
        }
        return employees;
    }

    //This function is called recursively
    private static void visitChildNodes(NodeList nList) {
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node node = nList.item(temp);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                System.out.println("Node Name = " + node.getNodeName() + "; Value = " + node.getTextContent());
                //Check all attributes
                if (node.hasAttributes()) {
                    // get attributes names and values
                    NamedNodeMap nodeMap = node.getAttributes();
                    for (int i = 0; i < nodeMap.getLength(); i++) {
                        Node tempNode = nodeMap.item(i);
                        System.out.println("Attr name : " + tempNode.getNodeName() + "; Value = " + tempNode.getNodeValue());
                    }
                    if (node.hasChildNodes()) {
                        //We got more childs; Let's visit them as well
                        visitChildNodes(node.getChildNodes());
                    }
                }
            }
        }
    }
}
