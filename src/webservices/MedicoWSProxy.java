package webservices;

public class MedicoWSProxy implements webservices.MedicoWS {
  private String _endpoint = null;
  private webservices.MedicoWS medicoWS = null;
  
  public MedicoWSProxy() {
    _initMedicoWSProxy();
  }
  
  public MedicoWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initMedicoWSProxy();
  }
  
  private void _initMedicoWSProxy() {
    try {
      medicoWS = (new webservices.MedicoWSServiceLocator()).getMedicoWS();
      if (medicoWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)medicoWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)medicoWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (medicoWS != null)
      ((javax.xml.rpc.Stub)medicoWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webservices.MedicoWS getMedicoWS() {
    if (medicoWS == null)
      _initMedicoWSProxy();
    return medicoWS;
  }
  
  public java.lang.String obtenerMedicos() throws java.rmi.RemoteException{
    if (medicoWS == null)
      _initMedicoWSProxy();
    return medicoWS.obtenerMedicos();
  }
  
  
}