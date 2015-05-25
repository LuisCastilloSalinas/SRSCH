package webservices;

public class ObtenerPorcentajeOcupacionBoxWSProxy implements webservices.ObtenerPorcentajeOcupacionBoxWS {
  private String _endpoint = null;
  private webservices.ObtenerPorcentajeOcupacionBoxWS obtenerPorcentajeOcupacionBoxWS = null;
  
  public ObtenerPorcentajeOcupacionBoxWSProxy() {
    _initObtenerPorcentajeOcupacionBoxWSProxy();
  }
  
  public ObtenerPorcentajeOcupacionBoxWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initObtenerPorcentajeOcupacionBoxWSProxy();
  }
  
  private void _initObtenerPorcentajeOcupacionBoxWSProxy() {
    try {
      obtenerPorcentajeOcupacionBoxWS = (new webservices.ObtenerPorcentajeOcupacionBoxWSServiceLocator()).getObtenerPorcentajeOcupacionBoxWS();
      if (obtenerPorcentajeOcupacionBoxWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)obtenerPorcentajeOcupacionBoxWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)obtenerPorcentajeOcupacionBoxWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (obtenerPorcentajeOcupacionBoxWS != null)
      ((javax.xml.rpc.Stub)obtenerPorcentajeOcupacionBoxWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webservices.ObtenerPorcentajeOcupacionBoxWS getObtenerPorcentajeOcupacionBoxWS() {
    if (obtenerPorcentajeOcupacionBoxWS == null)
      _initObtenerPorcentajeOcupacionBoxWSProxy();
    return obtenerPorcentajeOcupacionBoxWS;
  }
  
  public int obtenerPorcentajeOcupacionBox(int idBox, java.util.Calendar fecha1, java.util.Calendar fecha2) throws java.rmi.RemoteException, webservices.PersistentException{
    if (obtenerPorcentajeOcupacionBoxWS == null)
      _initObtenerPorcentajeOcupacionBoxWSProxy();
    return obtenerPorcentajeOcupacionBoxWS.obtenerPorcentajeOcupacionBox(idBox, fecha1, fecha2);
  }
  
  
}