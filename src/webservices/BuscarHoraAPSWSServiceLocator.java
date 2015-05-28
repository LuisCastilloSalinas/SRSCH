/**
 * BuscarHoraAPSWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservices;

public class BuscarHoraAPSWSServiceLocator extends org.apache.axis.client.Service implements webservices.BuscarHoraAPSWSService {

    public BuscarHoraAPSWSServiceLocator() {
    }


    public BuscarHoraAPSWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BuscarHoraAPSWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BuscarHoraAPSWS
    private java.lang.String BuscarHoraAPSWS_address = "http://localhost:8080/ProveedorServicioHospital/services/BuscarHoraAPSWS";

    public java.lang.String getBuscarHoraAPSWSAddress() {
        return BuscarHoraAPSWS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BuscarHoraAPSWSWSDDServiceName = "BuscarHoraAPSWS";

    public java.lang.String getBuscarHoraAPSWSWSDDServiceName() {
        return BuscarHoraAPSWSWSDDServiceName;
    }

    public void setBuscarHoraAPSWSWSDDServiceName(java.lang.String name) {
        BuscarHoraAPSWSWSDDServiceName = name;
    }

    public webservices.BuscarHoraAPSWS getBuscarHoraAPSWS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BuscarHoraAPSWS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBuscarHoraAPSWS(endpoint);
    }

    public webservices.BuscarHoraAPSWS getBuscarHoraAPSWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            webservices.BuscarHoraAPSWSSoapBindingStub _stub = new webservices.BuscarHoraAPSWSSoapBindingStub(portAddress, this);
            _stub.setPortName(getBuscarHoraAPSWSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBuscarHoraAPSWSEndpointAddress(java.lang.String address) {
        BuscarHoraAPSWS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (webservices.BuscarHoraAPSWS.class.isAssignableFrom(serviceEndpointInterface)) {
                webservices.BuscarHoraAPSWSSoapBindingStub _stub = new webservices.BuscarHoraAPSWSSoapBindingStub(new java.net.URL(BuscarHoraAPSWS_address), this);
                _stub.setPortName(getBuscarHoraAPSWSWSDDServiceName());
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
        if ("BuscarHoraAPSWS".equals(inputPortName)) {
            return getBuscarHoraAPSWS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices", "BuscarHoraAPSWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices", "BuscarHoraAPSWS"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BuscarHoraAPSWS".equals(portName)) {
            setBuscarHoraAPSWSEndpointAddress(address);
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
