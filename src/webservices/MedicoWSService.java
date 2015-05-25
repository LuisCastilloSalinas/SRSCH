/**
 * MedicoWSService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservices;

public interface MedicoWSService extends javax.xml.rpc.Service {
    public java.lang.String getMedicoWSAddress();

    public webservices.MedicoWS getMedicoWS() throws javax.xml.rpc.ServiceException;

    public webservices.MedicoWS getMedicoWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
