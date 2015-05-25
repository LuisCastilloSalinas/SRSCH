/**
 * EspecialidadWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservices;

public class EspecialidadWSServiceLocator extends org.apache.axis.client.Service implements webservices.EspecialidadWSService {

    public EspecialidadWSServiceLocator() {
    }


    public EspecialidadWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EspecialidadWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EspecialidadWS
    private java.lang.String EspecialidadWS_address = "http://localhost:8080/ProveedorServicioHospital/services/EspecialidadWS";

    public java.lang.String getEspecialidadWSAddress() {
        return EspecialidadWS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EspecialidadWSWSDDServiceName = "EspecialidadWS";

    public java.lang.String getEspecialidadWSWSDDServiceName() {
        return EspecialidadWSWSDDServiceName;
    }

    public void setEspecialidadWSWSDDServiceName(java.lang.String name) {
        EspecialidadWSWSDDServiceName = name;
    }

    public webservices.EspecialidadWS getEspecialidadWS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EspecialidadWS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEspecialidadWS(endpoint);
    }

    public webservices.EspecialidadWS getEspecialidadWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            webservices.EspecialidadWSSoapBindingStub _stub = new webservices.EspecialidadWSSoapBindingStub(portAddress, this);
            _stub.setPortName(getEspecialidadWSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEspecialidadWSEndpointAddress(java.lang.String address) {
        EspecialidadWS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (webservices.EspecialidadWS.class.isAssignableFrom(serviceEndpointInterface)) {
                webservices.EspecialidadWSSoapBindingStub _stub = new webservices.EspecialidadWSSoapBindingStub(new java.net.URL(EspecialidadWS_address), this);
                _stub.setPortName(getEspecialidadWSWSDDServiceName());
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
        if ("EspecialidadWS".equals(inputPortName)) {
            return getEspecialidadWS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices", "EspecialidadWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices", "EspecialidadWS"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EspecialidadWS".equals(portName)) {
            setEspecialidadWSEndpointAddress(address);
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
