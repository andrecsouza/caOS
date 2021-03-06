package org.cagrid.workflow.manager.instance.common;

import java.rmi.RemoteException;

/** 
 * This class is autogenerated, DO NOT EDIT.
 * 
 * This interface represents the API which is accessable on the grid service from the client. 
 * 
 * @created by Introduce Toolkit version 1.2
 * 
 */
public interface WorkflowManagerInstanceI {

  public org.oasis.wsrf.lifetime.DestroyResponse destroy(org.oasis.wsrf.lifetime.Destroy params) throws RemoteException ;

  public org.oasis.wsrf.lifetime.SetTerminationTimeResponse setTerminationTime(org.oasis.wsrf.lifetime.SetTerminationTime params) throws RemoteException ;

  public org.cagrid.workflow.helper.descriptor.TimestampedStatus getTimestampedStatus() throws RemoteException ;

  public void setParameter(org.cagrid.workflow.helper.descriptor.InputParameter inputParameter) throws RemoteException ;

  public java.lang.String[] getOutputValues() throws RemoteException ;

  public org.oasis.wsn.SubscribeResponse subscribe(org.oasis.wsn.Subscribe params) throws RemoteException ;

  public void start() throws RemoteException ;

  public java.lang.String getEPRString() throws RemoteException ;

  public org.cagrid.workflow.helper.descriptor.LocalWorkflowInstrumentationRecord getStagesInstrumentationRecords() throws RemoteException ;

}

