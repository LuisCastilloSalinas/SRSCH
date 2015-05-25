package webservices;

public class BoxIdWSProxy implements webservices.BoxIdWS {
  private String _endpoint = null;
  private webservices.BoxIdWS boxIdWS = null;
  
  public BoxIdWSProxy() {
    _initBoxIdWSProxy();
  }
  
  public BoxIdWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initBoxIdWSProxy();
  }
  
  private void _initBoxIdWSProxy() {
    try {
      boxIdWS = (new webservices.BoxIdWSServiceLocator()).getBoxIdWS();
      if (boxIdWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)boxIdWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)boxIdWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (boxIdWS != null)
      ((javax.xml.rpc.Stub)boxIdWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webservices.BoxIdWS getBoxIdWS() {
    if (boxIdWS == null)
      _initBoxIdWSProxy();
    return boxIdWS;
  }
  
  public java.lang.String obtenerNombreBoxPorId(int idBox) throws java.rmi.RemoteException{
    if (boxIdWS == null)
      _initBoxIdWSProxy();
    return boxIdWS.obtenerNombreBoxPorId(idBox);
  }
  
  
}