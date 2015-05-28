/**
 * ObtenerMedicosMasSolicitadosWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservices;

public class ObtenerMedicosMasSolicitadosWSServiceLocator extends org.apache.axis.client.Service implements webservices.ObtenerMedicosMasSolicitadosWSService {

    public ObtenerMedicosMasSolicitadosWSServiceLocator() {
    }


    public ObtenerMedicosMasSolicitadosWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ObtenerMedicosMasSolicitadosWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ObtenerMedicosMasSolicitadosWS
    private java.lang.String ObtenerMedicosMasSolicitadosWS_address = "http://localhost:8080/ProveedorServicioHospital/services/ObtenerMedicosMasSolicitadosWS";

    public java.lang.String getObtenerMedicosMasSolicitadosWSAddress() {
        return ObtenerMedicosMasSolicitadosWS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ObtenerMedicosMasSolicitadosWSWSDDServiceName = "ObtenerMedicosMasSolicitadosWS";

    public java.lang.String getObtenerMedicosMasSolicitadosWSWSDDServiceName() {
        return ObtenerMedicosMasSolicitadosWSWSDDServiceName;
    }

    public void setObtenerMedicosMasSolicitadosWSWSDDServiceName(java.lang.String name) {
        ObtenerMedicosMasSolicitadosWSWSDDServiceName = name;
    }

    public webservices.ObtenerMedicosMasSolicitadosWS getObtenerMedicosMasSolicitadosWS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ObtenerMedicosMasSolicitadosWS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getObtenerMedicosMasSolicitadosWS(endpoint);
    }

    public webservices.ObtenerMedicosMasSolicitadosWS getObtenerMedicosMasSolicitadosWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            webservices.ObtenerMedicosMasSolicitadosWSSoapBindingStub _stub = new webservices.ObtenerMedicosMasSolicitadosWSSoapBindingStub(portAddress, this);
            _stub.setPortName(getObtenerMedicosMasSolicitadosWSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setObtenerMedicosMasSolicitadosWSEndpointAddress(java.lang.String address) {
        ObtenerMedicosMasSolicitadosWS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (webservices.ObtenerMedicosMasSolicitadosWS.class.isAssignableFrom(serviceEndpointInterface)) {
                webservices.ObtenerMedicosMasSolicitadosWSSoapBindingStub _stub = new webservices.ObtenerMedicosMasSolicitadosWSSoapBindingStub(new java.net.URL(ObtenerMedicosMasSolicitadosWS_address), this);
                _stub.setPortName(getObtenerMedicosMasSolicitadosWSWSDDServiceName());
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
        if ("ObtenerMedicosMasSolicitadosWS".equals(inputPortName)) {
            return getObtenerMedicosMasSolicitadosWS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices", "ObtenerMedicosMasSolicitadosWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices", "ObtenerMedicosMasSolicitadosWS"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ObtenerMedicosMasSolicitadosWS".equals(portName)) {
            setObtenerMedicosMasSolicitadosWSEndpointAddress(address);
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
