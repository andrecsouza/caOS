package org.cagrid.workflow.helper.invocation.common;

import java.rmi.RemoteException;

/** 
 * This class is autogenerated, DO NOT EDIT.
 * 
 * This interface represents the API which is accessable on the grid service from the client. 
 * 
 * @created by Introduce Toolkit version 1.2
 * 
 */
public interface WorkflowInvocationHelperI {

  /**
   * Retrieve the qualified name for the operation enclosed by this resource
   *
   */
  public javax.xml.namespace.QName getOperationQName() throws RemoteException ;

  public org.oasis.wsrf.lifetime.DestroyResponse destroy(org.oasis.wsrf.lifetime.Destroy params) throws RemoteException ;

  public org.oasis.wsrf.lifetime.SetTerminationTimeResponse setTerminationTime(org.oasis.wsrf.lifetime.SetTerminationTime params) throws RemoteException ;

  public void configureInput(org.cagrid.workflow.helper.descriptor.OperationInputMessageDescriptor operationInputMessageDescriptor) throws RemoteException ;

  /**
   * ---
   *
   * @param operationOutputTransportDescriptor
   */
  public void configureOutput(org.cagrid.workflow.helper.descriptor.OperationOutputTransportDescriptor operationOutputTransportDescriptor) throws RemoteException ;

  public void setParameter(org.cagrid.workflow.helper.descriptor.InputParameter inputParameter) throws RemoteException ;

  public void setParameters(org.cagrid.workflow.helper.descriptor.InputParameter[] inputParameters) throws RemoteException ;

  public org.oasis.wsn.SubscribeResponse subscribe(org.oasis.wsn.Subscribe params) throws RemoteException ;

  public java.lang.String getEPRString() throws RemoteException ;

  public void start() throws RemoteException ;

  public void startStreaming() throws RemoteException ;

  public void endStreaming() throws RemoteException ;

}

