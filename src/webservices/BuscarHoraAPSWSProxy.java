package webservices;

public class BuscarHoraAPSWSProxy implements webservices.BuscarHoraAPSWS {
  private String _endpoint = null;
  private webservices.BuscarHoraAPSWS buscarHoraAPSWS = null;
  
  public BuscarHoraAPSWSProxy() {
    _initBuscarHoraAPSWSProxy();
  }
  
  public BuscarHoraAPSWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initBuscarHoraAPSWSProxy();
  }
  
  private void _initBuscarHoraAPSWSProxy() {
    try {
      buscarHoraAPSWS = (new webservices.BuscarHoraAPSWSServiceLocator()).getBuscarHoraAPSWS();
      if (buscarHoraAPSWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)buscarHoraAPSWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)buscarHoraAPSWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (buscarHoraAPSWS != null)
      ((javax.xml.rpc.Stub)buscarHoraAPSWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webservices.BuscarHoraAPSWS getBuscarHoraAPSWS() {
    if (buscarHoraAPSWS == null)
      _initBuscarHoraAPSWSProxy();
    return buscarHoraAPSWS;
  }
  
  public java.lang.String obtenerHoraAPS(int idMedico, java.util.Calendar fecha1, java.util.Calendar fecha2) throws java.rmi.RemoteException{
    if (buscarHoraAPSWS == null)
      _initBuscarHoraAPSWSProxy();
    return buscarHoraAPSWS.obtenerHoraAPS(idMedico, fecha1, fecha2);
  }
  
  
}