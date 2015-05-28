package webservices;

public class BuscarHoraAPSPorMedicoProxy implements webservices.BuscarHoraAPSPorMedico {
  private String _endpoint = null;
  private webservices.BuscarHoraAPSPorMedico buscarHoraAPSPorMedico = null;
  
  public BuscarHoraAPSPorMedicoProxy() {
    _initBuscarHoraAPSPorMedicoProxy();
  }
  
  public BuscarHoraAPSPorMedicoProxy(String endpoint) {
    _endpoint = endpoint;
    _initBuscarHoraAPSPorMedicoProxy();
  }
  
  private void _initBuscarHoraAPSPorMedicoProxy() {
    try {
      buscarHoraAPSPorMedico = (new webservices.BuscarHoraAPSPorMedicoServiceLocator()).getBuscarHoraAPSPorMedico();
      if (buscarHoraAPSPorMedico != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)buscarHoraAPSPorMedico)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)buscarHoraAPSPorMedico)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (buscarHoraAPSPorMedico != null)
      ((javax.xml.rpc.Stub)buscarHoraAPSPorMedico)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webservices.BuscarHoraAPSPorMedico getBuscarHoraAPSPorMedico() {
    if (buscarHoraAPSPorMedico == null)
      _initBuscarHoraAPSPorMedicoProxy();
    return buscarHoraAPSPorMedico;
  }
  
  public java.lang.String obtenerHorasAPSPorMedico(int idMedico) throws java.rmi.RemoteException{
    if (buscarHoraAPSPorMedico == null)
      _initBuscarHoraAPSPorMedicoProxy();
    return buscarHoraAPSPorMedico.obtenerHorasAPSPorMedico(idMedico);
  }
  
  
}