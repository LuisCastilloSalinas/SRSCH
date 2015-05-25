package webservices;

public class ObtenerPorcentajeOcupacionMedicoWSProxy implements webservices.ObtenerPorcentajeOcupacionMedicoWS {
  private String _endpoint = null;
  private webservices.ObtenerPorcentajeOcupacionMedicoWS obtenerPorcentajeOcupacionMedicoWS = null;
  
  public ObtenerPorcentajeOcupacionMedicoWSProxy() {
    _initObtenerPorcentajeOcupacionMedicoWSProxy();
  }
  
  public ObtenerPorcentajeOcupacionMedicoWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initObtenerPorcentajeOcupacionMedicoWSProxy();
  }
  
  private void _initObtenerPorcentajeOcupacionMedicoWSProxy() {
    try {
      obtenerPorcentajeOcupacionMedicoWS = (new webservices.ObtenerPorcentajeOcupacionMedicoWSServiceLocator()).getObtenerPorcentajeOcupacionMedicoWS();
      if (obtenerPorcentajeOcupacionMedicoWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)obtenerPorcentajeOcupacionMedicoWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)obtenerPorcentajeOcupacionMedicoWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (obtenerPorcentajeOcupacionMedicoWS != null)
      ((javax.xml.rpc.Stub)obtenerPorcentajeOcupacionMedicoWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webservices.ObtenerPorcentajeOcupacionMedicoWS getObtenerPorcentajeOcupacionMedicoWS() {
    if (obtenerPorcentajeOcupacionMedicoWS == null)
      _initObtenerPorcentajeOcupacionMedicoWSProxy();
    return obtenerPorcentajeOcupacionMedicoWS;
  }
  
  public int obtenerPorcentajeOcupacionMedico(int idMedico, java.util.Calendar fecha1, java.util.Calendar fecha2) throws java.rmi.RemoteException{
    if (obtenerPorcentajeOcupacionMedicoWS == null)
      _initObtenerPorcentajeOcupacionMedicoWSProxy();
    return obtenerPorcentajeOcupacionMedicoWS.obtenerPorcentajeOcupacionMedico(idMedico, fecha1, fecha2);
  }
  
  
}