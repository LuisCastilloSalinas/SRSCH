package webservices;

public class PacientesWSProxy implements webservices.PacientesWS {
  private String _endpoint = null;
  private webservices.PacientesWS pacientesWS = null;
  
  public PacientesWSProxy() {
    _initPacientesWSProxy();
  }
  
  public PacientesWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initPacientesWSProxy();
  }
  
  private void _initPacientesWSProxy() {
    try {
      pacientesWS = (new webservices.PacientesWSServiceLocator()).getPacientesWS();
      if (pacientesWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)pacientesWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)pacientesWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (pacientesWS != null)
      ((javax.xml.rpc.Stub)pacientesWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webservices.PacientesWS getPacientesWS() {
    if (pacientesWS == null)
      _initPacientesWSProxy();
    return pacientesWS;
  }
  
  public java.lang.String obtenerPacientes() throws java.rmi.RemoteException{
    if (pacientesWS == null)
      _initPacientesWSProxy();
    return pacientesWS.obtenerPacientes();
  }
  
  
}