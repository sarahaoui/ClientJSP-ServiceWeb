package Service;

public class ConversionProxy implements Service.Conversion {
  private String _endpoint = null;
  private Service.Conversion conversion = null;
  
  public ConversionProxy() {
    _initConversionProxy();
  }
  
  public ConversionProxy(String endpoint) {
    _endpoint = endpoint;
    _initConversionProxy();
  }
  
  private void _initConversionProxy() {
    try {
      conversion = (new Service.ConversionWSLocator()).getConversionPort();
      if (conversion != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)conversion)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)conversion)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (conversion != null)
      ((javax.xml.rpc.Stub)conversion)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Service.Conversion getConversion() {
    if (conversion == null)
      _initConversionProxy();
    return conversion;
  }
  
  public double conversionDollarToDinar(double montant) throws java.rmi.RemoteException{
    if (conversion == null)
      _initConversionProxy();
    return conversion.conversionDollarToDinar(montant);
  }
  
  public double conversionEuroToDinar(double montant) throws java.rmi.RemoteException{
    if (conversion == null)
      _initConversionProxy();
    return conversion.conversionEuroToDinar(montant);
  }
  
  
}