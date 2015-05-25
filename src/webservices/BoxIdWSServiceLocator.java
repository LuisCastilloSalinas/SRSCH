/**
 * BoxIdWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservices;

public class BoxIdWSServiceLocator extends org.apache.axis.client.Service implements webservices.BoxIdWSService {

    public BoxIdWSServiceLocator() {
    }


    public BoxIdWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BoxIdWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BoxIdWS
    private java.lang.String BoxIdWS_address = "http://localhost:8080/ProveedorServicioHospital/services/BoxIdWS";

    public java.lang.String getBoxIdWSAddress() {
        return BoxIdWS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BoxIdWSWSDDServiceName = "BoxIdWS";

    public java.lang.String getBoxIdWSWSDDServiceName() {
        return BoxIdWSWSDDServiceName;
    }

    public void setBoxIdWSWSDDServiceName(java.lang.String name) {
        BoxIdWSWSDDServiceName = name;
    }

    public webservices.BoxIdWS getBoxIdWS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BoxIdWS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBoxIdWS(endpoint);
    }

    public webservices.BoxIdWS getBoxIdWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            webservices.BoxIdWSSoapBindingStub _stub = new webservices.BoxIdWSSoapBindingStub(portAddress, this);
            _stub.setPortName(getBoxIdWSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBoxIdWSEndpointAddress(java.lang.String address) {
        BoxIdWS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (webservices.BoxIdWS.class.isAssignableFrom(serviceEndpointInterface)) {
                webservices.BoxIdWSSoapBindingStub _stub = new webservices.BoxIdWSSoapBindingStub(new java.net.URL(BoxIdWS_address), this);
                _stub.setPortName(getBoxIdWSWSDDServiceName());
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
        if ("BoxIdWS".equals(inputPortName)) {
            return getBoxIdWS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices", "BoxIdWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices", "BoxIdWS"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BoxIdWS".equals(portName)) {
            setBoxIdWSEndpointAddress(address);
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
