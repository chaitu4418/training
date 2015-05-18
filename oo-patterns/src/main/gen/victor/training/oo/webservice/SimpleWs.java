
package victor.training.oo.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "simple-ws", targetNamespace = "http://training.ibm.com/simple-ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SimpleWs {


    /**
     * 
     * @param in
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://training.ibm.com/simple-ws/echo")
    @WebResult(name = "out", targetNamespace = "")
    @RequestWrapper(localName = "echo", targetNamespace = "http://training.ibm.com/simple-ws/", className = "victor.training.oo.webservice.Echo")
    @ResponseWrapper(localName = "echoResponse", targetNamespace = "http://training.ibm.com/simple-ws/", className = "victor.training.oo.webservice.EchoResponse")
    public String echo(
        @WebParam(name = "in", targetNamespace = "")
        String in);

}
