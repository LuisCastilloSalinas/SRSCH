/**
 * ObtenerPorcentajeOcupacionMedicoWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservices;

public class ObtenerPorcentajeOcupacionMedicoWSServiceLocator extends org.apache.axis.client.Service implements webservices.ObtenerPorcentajeOcupacionMedicoWSService {

    public ObtenerPorcentajeOcupacionMedicoWSServiceLocator() {
    }


    public ObtenerPorcentajeOcupacionMedicoWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ObtenerPorcentajeOcupacionMedicoWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ObtenerPorcentajeOcupacionMedicoWS
    private java.lang.String ObtenerPorcentajeOcupacionMedicoWS_address = "http://localhost:8080/ProveedorServicioHospital/services/ObtenerPorcentajeOcupacionMedicoWS";

    public java.lang.String getObtenerPorcentajeOcupacionMedicoWSAddress() {
        return ObtenerPorcentajeOcupacionMedicoWS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ObtenerPorcentajeOcupacionMedicoWSWSDDServiceName = "ObtenerPorcentajeOcupacionMedicoWS";

    public java.lang.String getObtenerPorcentajeOcupacionMedicoWSWSDDServiceName() {
        return ObtenerPorcentajeOcupacionMedicoWSWSDDServiceName;
    }

    public void setObtenerPorcentajeOcupacionMedicoWSWSDDServiceName(java.lang.String name) {
        ObtenerPorcentajeOcupacionMedicoWSWSDDServiceName = name;
    }

    public webservices.ObtenerPorcentajeOcupacionMedicoWS getObtenerPorcentajeOcupacionMedicoWS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ObtenerPorcentajeOcupacionMedicoWS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getObtenerPorcentajeOcupacionMedicoWS(endpoint);
    }

    public webservices.ObtenerPorcentajeOcupacionMedicoWS getObtenerPorcentajeOcupacionMedicoWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            webservices.ObtenerPorcentajeOcupacionMedicoWSSoapBindingStub _stub = new webservices.ObtenerPorcentajeOcupacionMedicoWSSoapBindingStub(portAddress, this);
            _stub.setPortName(getObtenerPorcentajeOcupacionMedicoWSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setObtenerPorcentajeOcupacionMedicoWSEndpointAddress(java.lang.String address) {
        ObtenerPorcentajeOcupacionMedicoWS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (webservices.ObtenerPorcentajeOcupacionMedicoWS.class.isAssignableFrom(serviceEndpointInterface)) {
                webservices.ObtenerPorcentajeOcupacionMedicoWSSoapBindingStub _stub = new webservices.ObtenerPorcentajeOcupacionMedicoWSSoapBindingStub(new java.net.URL(ObtenerPorcentajeOcupacionMedicoWS_address), this);
                _stub.setPortName(getObtenerPorcentajeOcupacionMedicoWSWSDDServiceName());
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
        if ("ObtenerPorcentajeOcupacionMedicoWS".equals(inputPortName)) {
            return getObtenerPorcentajeOcupacionMedicoWS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices", "ObtenerPorcentajeOcupacionMedicoWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices", "ObtenerPorcentajeOcupacionMedicoWS"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ObtenerPorcentajeOcupacionMedicoWS".equals(portName)) {
            setObtenerPorcentajeOcupacionMedicoWSEndpointAddress(address);
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
