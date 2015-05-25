/**
 * ObtenerPorcentajeOcupacionBoxWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservices;

public class ObtenerPorcentajeOcupacionBoxWSServiceLocator extends org.apache.axis.client.Service implements webservices.ObtenerPorcentajeOcupacionBoxWSService {

    public ObtenerPorcentajeOcupacionBoxWSServiceLocator() {
    }


    public ObtenerPorcentajeOcupacionBoxWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ObtenerPorcentajeOcupacionBoxWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ObtenerPorcentajeOcupacionBoxWS
    private java.lang.String ObtenerPorcentajeOcupacionBoxWS_address = "http://localhost:8080/ProveedorServicioHospital/services/ObtenerPorcentajeOcupacionBoxWS";

    public java.lang.String getObtenerPorcentajeOcupacionBoxWSAddress() {
        return ObtenerPorcentajeOcupacionBoxWS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ObtenerPorcentajeOcupacionBoxWSWSDDServiceName = "ObtenerPorcentajeOcupacionBoxWS";

    public java.lang.String getObtenerPorcentajeOcupacionBoxWSWSDDServiceName() {
        return ObtenerPorcentajeOcupacionBoxWSWSDDServiceName;
    }

    public void setObtenerPorcentajeOcupacionBoxWSWSDDServiceName(java.lang.String name) {
        ObtenerPorcentajeOcupacionBoxWSWSDDServiceName = name;
    }

    public webservices.ObtenerPorcentajeOcupacionBoxWS getObtenerPorcentajeOcupacionBoxWS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ObtenerPorcentajeOcupacionBoxWS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getObtenerPorcentajeOcupacionBoxWS(endpoint);
    }

    public webservices.ObtenerPorcentajeOcupacionBoxWS getObtenerPorcentajeOcupacionBoxWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            webservices.ObtenerPorcentajeOcupacionBoxWSSoapBindingStub _stub = new webservices.ObtenerPorcentajeOcupacionBoxWSSoapBindingStub(portAddress, this);
            _stub.setPortName(getObtenerPorcentajeOcupacionBoxWSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setObtenerPorcentajeOcupacionBoxWSEndpointAddress(java.lang.String address) {
        ObtenerPorcentajeOcupacionBoxWS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (webservices.ObtenerPorcentajeOcupacionBoxWS.class.isAssignableFrom(serviceEndpointInterface)) {
                webservices.ObtenerPorcentajeOcupacionBoxWSSoapBindingStub _stub = new webservices.ObtenerPorcentajeOcupacionBoxWSSoapBindingStub(new java.net.URL(ObtenerPorcentajeOcupacionBoxWS_address), this);
                _stub.setPortName(getObtenerPorcentajeOcupacionBoxWSWSDDServiceName());
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
        if ("ObtenerPorcentajeOcupacionBoxWS".equals(inputPortName)) {
            return getObtenerPorcentajeOcupacionBoxWS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices", "ObtenerPorcentajeOcupacionBoxWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices", "ObtenerPorcentajeOcupacionBoxWS"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ObtenerPorcentajeOcupacionBoxWS".equals(portName)) {
            setObtenerPorcentajeOcupacionBoxWSEndpointAddress(address);
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
