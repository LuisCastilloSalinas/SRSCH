/**
 * PacientesWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservices;

public class PacientesWSServiceLocator extends org.apache.axis.client.Service implements webservices.PacientesWSService {

    public PacientesWSServiceLocator() {
    }


    public PacientesWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PacientesWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PacientesWS
    private java.lang.String PacientesWS_address = "http://localhost:8080/ProveedorServicioHospital/services/PacientesWS";

    public java.lang.String getPacientesWSAddress() {
        return PacientesWS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PacientesWSWSDDServiceName = "PacientesWS";

    public java.lang.String getPacientesWSWSDDServiceName() {
        return PacientesWSWSDDServiceName;
    }

    public void setPacientesWSWSDDServiceName(java.lang.String name) {
        PacientesWSWSDDServiceName = name;
    }

    public webservices.PacientesWS getPacientesWS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PacientesWS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPacientesWS(endpoint);
    }

    public webservices.PacientesWS getPacientesWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            webservices.PacientesWSSoapBindingStub _stub = new webservices.PacientesWSSoapBindingStub(portAddress, this);
            _stub.setPortName(getPacientesWSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPacientesWSEndpointAddress(java.lang.String address) {
        PacientesWS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (webservices.PacientesWS.class.isAssignableFrom(serviceEndpointInterface)) {
                webservices.PacientesWSSoapBindingStub _stub = new webservices.PacientesWSSoapBindingStub(new java.net.URL(PacientesWS_address), this);
                _stub.setPortName(getPacientesWSWSDDServiceName());
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
        if ("PacientesWS".equals(inputPortName)) {
            return getPacientesWS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices", "PacientesWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices", "PacientesWS"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PacientesWS".equals(portName)) {
            setPacientesWSEndpointAddress(address);
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
