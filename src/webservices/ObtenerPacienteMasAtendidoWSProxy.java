package webservices;

public class ObtenerPacienteMasAtendidoWSProxy implements webservices.ObtenerPacienteMasAtendidoWS {
  private String _endpoint = null;
  private webservices.ObtenerPacienteMasAtendidoWS obtenerPacienteMasAtendidoWS = null;
  
  public ObtenerPacienteMasAtendidoWSProxy() {
    _initObtenerPacienteMasAtendidoWSProxy();
  }
  
  public ObtenerPacienteMasAtendidoWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initObtenerPacienteMasAtendidoWSProxy();
  }
  
  private void _initObtenerPacienteMasAtendidoWSProxy() {
    try {
      obtenerPacienteMasAtendidoWS = (new webservices.ObtenerPacienteMasAtendidoWSServiceLocator()).getObtenerPacienteMasAtendidoWS();
      if (obtenerPacienteMasAtendidoWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)obtenerPacienteMasAtendidoWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)obtenerPacienteMasAtendidoWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (obtenerPacienteMasAtendidoWS != null)
      ((javax.xml.rpc.Stub)obtenerPacienteMasAtendidoWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webservices.ObtenerPacienteMasAtendidoWS getObtenerPacienteMasAtendidoWS() {
    if (obtenerPacienteMasAtendidoWS == null)
      _initObtenerPacienteMasAtendidoWSProxy();
    return obtenerPacienteMasAtendidoWS;
  }
  
  public java.lang.String pacienteMasAtendido(java.util.Calendar fecha1, java.util.Calendar fecha2) throws java.rmi.RemoteException{
    if (obtenerPacienteMasAtendidoWS == null)
      _initObtenerPacienteMasAtendidoWSProxy();
    return obtenerPacienteMasAtendidoWS.pacienteMasAtendido(fecha1, fecha2);
  }
  
  
}