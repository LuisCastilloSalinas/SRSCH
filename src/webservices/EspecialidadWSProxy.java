package webservices;

public class EspecialidadWSProxy implements webservices.EspecialidadWS {
  private String _endpoint = null;
  private webservices.EspecialidadWS especialidadWS = null;
  
  public EspecialidadWSProxy() {
    _initEspecialidadWSProxy();
  }
  
  public EspecialidadWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initEspecialidadWSProxy();
  }
  
  private void _initEspecialidadWSProxy() {
    try {
      especialidadWS = (new webservices.EspecialidadWSServiceLocator()).getEspecialidadWS();
      if (especialidadWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)especialidadWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)especialidadWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (especialidadWS != null)
      ((javax.xml.rpc.Stub)especialidadWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webservices.EspecialidadWS getEspecialidadWS() {
    if (especialidadWS == null)
      _initEspecialidadWSProxy();
    return especialidadWS;
  }
  
  public java.lang.String obtenerEspecialidad() throws java.rmi.RemoteException{
    if (especialidadWS == null)
      _initEspecialidadWSProxy();
    return especialidadWS.obtenerEspecialidad();
  }
  
  
}