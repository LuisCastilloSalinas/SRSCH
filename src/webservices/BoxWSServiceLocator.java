/**
 * BoxWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservices;

public class BoxWSServiceLocator extends org.apache.axis.client.Service implements webservices.BoxWSService {

    public BoxWSServiceLocator() {
    }


    public BoxWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BoxWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BoxWS
    private java.lang.String BoxWS_address = "http://localhost:8080/ProveedorServicioHospital/services/BoxWS";

    public java.lang.String getBoxWSAddress() {
        return BoxWS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BoxWSWSDDServiceName = "BoxWS";

    public java.lang.String getBoxWSWSDDServiceName() {
        return BoxWSWSDDServiceName;
    }

    public void setBoxWSWSDDServiceName(java.lang.String name) {
        BoxWSWSDDServiceName = name;
    }

    public webservices.BoxWS getBoxWS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BoxWS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBoxWS(endpoint);
    }

    public webservices.BoxWS getBoxWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            webservices.BoxWSSoapBindingStub _stub = new webservices.BoxWSSoapBindingStub(portAddress, this);
            _stub.setPortName(getBoxWSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBoxWSEndpointAddress(java.lang.String address) {
        BoxWS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (webservices.BoxWS.class.isAssignableFrom(serviceEndpointInterface)) {
                webservices.BoxWSSoapBindingStub _stub = new webservices.BoxWSSoapBindingStub(new java.net.URL(BoxWS_address), this);
                _stub.setPortName(getBoxWSWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BoxWS".equals(inputPortName)) {
            return getBoxWS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices", "BoxWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices", "BoxWS"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BoxWS".equals(portName)) {
            setBoxWSEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
