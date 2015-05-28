package webservices;

public class ObtenerMedicosMasSolicitadosWSProxy implements webservices.ObtenerMedicosMasSolicitadosWS {
  private String _endpoint = null;
  private webservices.ObtenerMedicosMasSolicitadosWS obtenerMedicosMasSolicitadosWS = null;
  
  public ObtenerMedicosMasSolicitadosWSProxy() {
    _initObtenerMedicosMasSolicitadosWSProxy();
  }
  
  public ObtenerMedicosMasSolicitadosWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initObtenerMedicosMasSolicitadosWSProxy();
  }
  
  private void _initObtenerMedicosMasSolicitadosWSProxy() {
    try {
      obtenerMedicosMasSolicitadosWS = (new webservices.ObtenerMedicosMasSolicitadosWSServiceLocator()).getObtenerMedicosMasSolicitadosWS();
      if (obtenerMedicosMasSolicitadosWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)obtenerMedicosMasSolicitadosWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)obtenerMedicosMasSolicitadosWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (obtenerMedicosMasSolicitadosWS != null)
      ((javax.xml.rpc.Stub)obtenerMedicosMasSolicitadosWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webservices.ObtenerMedicosMasSolicitadosWS getObtenerMedicosMasSolicitadosWS() {
    if (obtenerMedicosMasSolicitadosWS == null)
      _initObtenerMedicosMasSolicitadosWSProxy();
    return obtenerMedicosMasSolicitadosWS;
  }
  
  public java.lang.String obtenerMedicoMasSolicitado(java.util.Calendar fecha1, java.util.Calendar fecha2) throws java.rmi.RemoteException{
    if (obtenerMedicosMasSolicitadosWS == null)
      _initObtenerMedicosMasSolicitadosWSProxy();
    return obtenerMedicosMasSolicitadosWS.obtenerMedicoMasSolicitado(fecha1, fecha2);
  }
  
  
}