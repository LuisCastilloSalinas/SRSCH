package webservices;

public class BoxWSProxy implements webservices.BoxWS {
  private String _endpoint = null;
  private webservices.BoxWS boxWS = null;
  
  public BoxWSProxy() {
    _initBoxWSProxy();
  }
  
  public BoxWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initBoxWSProxy();
  }
  
  private void _initBoxWSProxy() {
    try {
      boxWS = (new webservices.BoxWSServiceLocator()).getBoxWS();
      if (boxWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)boxWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)boxWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (boxWS != null)
      ((javax.xml.rpc.Stub)boxWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webservices.BoxWS getBoxWS() {
    if (boxWS == null)
      _initBoxWSProxy();
    return boxWS;
  }
  
  public java.lang.String obtenerBoxMedicos() throws java.rmi.RemoteException{
    if (boxWS == null)
      _initBoxWSProxy();
    return boxWS.obtenerBoxMedicos();
  }
  
  
}