/**
 * BuscarSuDisponibilidadDeHoraWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservices;

public class BuscarSuDisponibilidadDeHoraWSServiceLocator extends org.apache.axis.client.Service implements webservices.BuscarSuDisponibilidadDeHoraWSService {

    public BuscarSuDisponibilidadDeHoraWSServiceLocator() {
    }


    public BuscarSuDisponibilidadDeHoraWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BuscarSuDisponibilidadDeHoraWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BuscarSuDisponibilidadDeHoraWS
    private java.lang.String BuscarSuDisponibilidadDeHoraWS_address = "http://localhost:8080/ProveedorServicioHospital/services/BuscarSuDisponibilidadDeHoraWS";

    public java.lang.String getBuscarSuDisponibilidadDeHoraWSAddress() {
        return BuscarSuDisponibilidadDeHoraWS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BuscarSuDisponibilidadDeHoraWSWSDDServiceName = "BuscarSuDisponibilidadDeHoraWS";

    public java.lang.String getBuscarSuDisponibilidadDeHoraWSWSDDServiceName() {
        return BuscarSuDisponibilidadDeHoraWSWSDDServiceName;
    }

    public void setBuscarSuDisponibilidadDeHoraWSWSDDServiceName(java.lang.String name) {
        BuscarSuDisponibilidadDeHoraWSWSDDServiceName = name;
    }

    public webservices.BuscarSuDisponibilidadDeHoraWS getBuscarSuDisponibilidadDeHoraWS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BuscarSuDisponibilidadDeHoraWS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBuscarSuDisponibilidadDeHoraWS(endpoint);
    }

    public webservices.BuscarSuDisponibilidadDeHoraWS getBuscarSuDisponibilidadDeHoraWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            webservices.BuscarSuDisponibilidadDeHoraWSSoapBindingStub _stub = new webservices.BuscarSuDisponibilidadDeHoraWSSoapBindingStub(portAddress, this);
            _stub.setPortName(getBuscarSuDisponibilidadDeHoraWSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBuscarSuDisponibilidadDeHoraWSEndpointAddress(java.lang.String address) {
        BuscarSuDisponibilidadDeHoraWS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (webservices.BuscarSuDisponibilidadDeHoraWS.class.isAssignableFrom(serviceEndpointInterface)) {
                webservices.BuscarSuDisponibilidadDeHoraWSSoapBindingStub _stub = new webservices.BuscarSuDisponibilidadDeHoraWSSoapBindingStub(new java.net.URL(BuscarSuDisponibilidadDeHoraWS_address), this);
                _stub.setPortName(getBuscarSuDisponibilidadDeHoraWSWSDDServiceName());
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
        if ("BuscarSuDisponibilidadDeHoraWS".equals(inputPortName)) {
            return getBuscarSuDisponibilidadDeHoraWS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices", "BuscarSuDisponibilidadDeHoraWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices", "BuscarSuDisponibilidadDeHoraWS"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BuscarSuDisponibilidadDeHoraWS".equals(portName)) {
            setBuscarSuDisponibilidadDeHoraWSEndpointAddress(address);
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
