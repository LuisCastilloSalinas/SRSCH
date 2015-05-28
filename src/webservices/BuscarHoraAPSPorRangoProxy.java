package webservices;

public class BuscarHoraAPSPorRangoProxy implements webservices.BuscarHoraAPSPorRango {
  private String _endpoint = null;
  private webservices.BuscarHoraAPSPorRango buscarHoraAPSPorRango = null;
  
  public BuscarHoraAPSPorRangoProxy() {
    _initBuscarHoraAPSPorRangoProxy();
  }
  
  public BuscarHoraAPSPorRangoProxy(String endpoint) {
    _endpoint = endpoint;
    _initBuscarHoraAPSPorRangoProxy();
  }
  
  private void _initBuscarHoraAPSPorRangoProxy() {
    try {
      buscarHoraAPSPorRango = (new webservices.BuscarHoraAPSPorRangoServiceLocator()).getBuscarHoraAPSPorRango();
      if (buscarHoraAPSPorRango != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)buscarHoraAPSPorRango)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)buscarHoraAPSPorRango)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (buscarHoraAPSPorRango != null)
      ((javax.xml.rpc.Stub)buscarHoraAPSPorRango)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webservices.BuscarHoraAPSPorRango getBuscarHoraAPSPorRango() {
    if (buscarHoraAPSPorRango == null)
      _initBuscarHoraAPSPorRangoProxy();
    return buscarHoraAPSPorRango;
  }
  
  public java.lang.String obtenerHoraAPSPorRango(java.util.Calendar fecha1, java.util.Calendar fecha2) throws java.rmi.RemoteException{
    if (buscarHoraAPSPorRango == null)
      _initBuscarHoraAPSPorRangoProxy();
    return buscarHoraAPSPorRango.obtenerHoraAPSPorRango(fecha1, fecha2);
  }
  
  
}