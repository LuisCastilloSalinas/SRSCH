package webservices;

public class ReservarHoraAPSWSProxy implements webservices.ReservarHoraAPSWS {
  private String _endpoint = null;
  private webservices.ReservarHoraAPSWS reservarHoraAPSWS = null;
  
  public ReservarHoraAPSWSProxy() {
    _initReservarHoraAPSWSProxy();
  }
  
  public ReservarHoraAPSWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initReservarHoraAPSWSProxy();
  }
  
  private void _initReservarHoraAPSWSProxy() {
    try {
      reservarHoraAPSWS = (new webservices.ReservarHoraAPSWSServiceLocator()).getReservarHoraAPSWS();
      if (reservarHoraAPSWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)reservarHoraAPSWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)reservarHoraAPSWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (reservarHoraAPSWS != null)
      ((javax.xml.rpc.Stub)reservarHoraAPSWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webservices.ReservarHoraAPSWS getReservarHoraAPSWS() {
    if (reservarHoraAPSWS == null)
      _initReservarHoraAPSWSProxy();
    return reservarHoraAPSWS;
  }
  
  public java.lang.String reservarHoraAPS(int idHoraMedicaAPS, int idPaciente) throws java.rmi.RemoteException{
    if (reservarHoraAPSWS == null)
      _initReservarHoraAPSWSProxy();
    return reservarHoraAPSWS.reservarHoraAPS(idHoraMedicaAPS, idPaciente);
  }
  
  
}