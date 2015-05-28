package webservices;

public class BuscarSuDisponibilidadDeHoraWSProxy implements webservices.BuscarSuDisponibilidadDeHoraWS {
  private String _endpoint = null;
  private webservices.BuscarSuDisponibilidadDeHoraWS buscarSuDisponibilidadDeHoraWS = null;
  
  public BuscarSuDisponibilidadDeHoraWSProxy() {
    _initBuscarSuDisponibilidadDeHoraWSProxy();
  }
  
  public BuscarSuDisponibilidadDeHoraWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initBuscarSuDisponibilidadDeHoraWSProxy();
  }
  
  private void _initBuscarSuDisponibilidadDeHoraWSProxy() {
    try {
      buscarSuDisponibilidadDeHoraWS = (new webservices.BuscarSuDisponibilidadDeHoraWSServiceLocator()).getBuscarSuDisponibilidadDeHoraWS();
      if (buscarSuDisponibilidadDeHoraWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)buscarSuDisponibilidadDeHoraWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)buscarSuDisponibilidadDeHoraWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (buscarSuDisponibilidadDeHoraWS != null)
      ((javax.xml.rpc.Stub)buscarSuDisponibilidadDeHoraWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webservices.BuscarSuDisponibilidadDeHoraWS getBuscarSuDisponibilidadDeHoraWS() {
    if (buscarSuDisponibilidadDeHoraWS == null)
      _initBuscarSuDisponibilidadDeHoraWSProxy();
    return buscarSuDisponibilidadDeHoraWS;
  }
  
  public java.lang.String getDisponibilidadDeHora(int idMedico, java.util.Calendar fecha1, java.util.Calendar fecha2) throws java.rmi.RemoteException{
    if (buscarSuDisponibilidadDeHoraWS == null)
      _initBuscarSuDisponibilidadDeHoraWSProxy();
    return buscarSuDisponibilidadDeHoraWS.getDisponibilidadDeHora(idMedico, fecha1, fecha2);
  }
  
  
}