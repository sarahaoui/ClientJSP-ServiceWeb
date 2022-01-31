/**
 * ConversionWSLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Service;

public class ConversionWSLocator extends org.apache.axis.client.Service implements Service.ConversionWS {

    public ConversionWSLocator() {
    }


    public ConversionWSLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ConversionWSLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ConversionPort
    private java.lang.String ConversionPort_address = "http://localhost:9494/";

    public java.lang.String getConversionPortAddress() {
        return ConversionPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ConversionPortWSDDServiceName = "ConversionPort";

    public java.lang.String getConversionPortWSDDServiceName() {
        return ConversionPortWSDDServiceName;
    }

    public void setConversionPortWSDDServiceName(java.lang.String name) {
        ConversionPortWSDDServiceName = name;
    }

    public Service.Conversion getConversionPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ConversionPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getConversionPort(endpoint);
    }

    public Service.Conversion getConversionPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            Service.ConversionPortBindingStub _stub = new Service.ConversionPortBindingStub(portAddress, this);
            _stub.setPortName(getConversionPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setConversionPortEndpointAddress(java.lang.String address) {
        ConversionPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (Service.Conversion.class.isAssignableFrom(serviceEndpointInterface)) {
                Service.ConversionPortBindingStub _stub = new Service.ConversionPortBindingStub(new java.net.URL(ConversionPort_address), this);
                _stub.setPortName(getConversionPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ConversionPort".equals(inputPortName)) {
            return getConversionPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Service/", "ConversionWS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Service/", "ConversionPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ConversionPort".equals(portName)) {
            setConversionPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
