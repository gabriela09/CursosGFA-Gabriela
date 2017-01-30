/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteestados;

import java.io.IOException;
import java.util.Iterator;
import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

/**
 *
 * @author ga.gutierrez
 */
public class ClienteEstados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        try {
            SOAPConnectionFactory factory = SOAPConnectionFactory.newInstance();
            SOAPConnection conexion = factory.createConnection();
            String urlConexion = "http://localhost:8100/04WebServiceBD/estado";
            SOAPMessage response = conexion.call(generarMensaje(), urlConexion);
            //generarMensaje();

            imprimirRespuesta(response);
            
            /// Invocar otro metodo 
            SOAPMessage response2 = conexion.call(generarTodo(), urlConexion);
            //generarMensaje();

            imprimirRespuestaEstados(response2);
            
            

        } catch (SOAPException e) {
            e.printStackTrace();
        }
    }

    public static SOAPMessage generarMensaje() throws SOAPException, IOException {
        MessageFactory factory = MessageFactory.newInstance();
        SOAPMessage mensaje = factory.createMessage();
        SOAPPart soapPart = mensaje.getSOAPPart();
        String servicioURI = "http://ws/";
        SOAPEnvelope envelope = soapPart.getEnvelope();

        envelope.addNamespaceDeclaration("ws", servicioURI);
        SOAPBody body = envelope.getBody();

        SOAPElement elemento = body.addChildElement("getCapital", "ws");
        SOAPElement elementoEstado = elemento.addChildElement("arg0");
        elementoEstado.addTextNode("Jalisco");

        mensaje.saveChanges();

        mensaje.writeTo(System.out);

        return mensaje;

    }

    public static SOAPMessage generarTodo() throws SOAPException, IOException {
        MessageFactory factory = MessageFactory.newInstance();
        SOAPMessage mensaje = factory.createMessage();
        SOAPPart soapPart = mensaje.getSOAPPart();
        String servicioURI = "http://ws/";
        SOAPEnvelope envelope = soapPart.getEnvelope();

        envelope.addNamespaceDeclaration("ws", servicioURI);
        SOAPBody body = envelope.getBody();

        SOAPElement elemento = body.addChildElement("obtieneEstados", "ws");

        mensaje.saveChanges();

        mensaje.writeTo(System.out);

        return mensaje;

    }

    public static void imprimirRespuestaEstados(SOAPMessage reponse) throws SOAPException {

        SOAPBody body = reponse.getSOAPBody();
        SOAPElement element = (SOAPBodyElement) body.getChildElements(new QName("http://ws/", "obtieneEstadosResponse")).next();
        Iterator<SOAPElement> iterator = element.getChildElements(new QName("estado"));

        iterator.forEachRemaining(estadoSOAP -> {
            System.out.println("-------------------------");
            Iterator<SOAPElement> iteratorInterno = estadoSOAP.getChildElements();
            iteratorInterno.forEachRemaining(estadoInterno -> {
                System.out.println(estadoInterno.getNodeName() + " : " + estadoInterno.getTextContent());
            });
            System.out.println("-------------------------");
        });

    }

    public static void imprimirRespuesta(SOAPMessage reponse) throws SOAPException {

        SOAPBody body = reponse.getSOAPBody();
        SOAPElement element = (SOAPBodyElement) body.getChildElements(new QName("http://ws/", "getCapitalResponse")).next();
        SOAPElement elementreturn = (SOAPBodyElement) element.getChildElements(new QName("return")).next();

        System.err.println(elementreturn.getTextContent());

    }

}
