package org.cagrid.workflow.helper.client;

import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.NamespaceConstants;

import org.apache.axis.client.Stub;
import org.apache.axis.message.addressing.EndpointReferenceType;
import org.apache.axis.types.URI.MalformedURIException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.cagrid.workflow.helper.common.WorkflowHelperI;
import org.cagrid.workflow.helper.descriptor.InputParameter;
import org.cagrid.workflow.helper.descriptor.InputParameterDescriptor;
import org.cagrid.workflow.helper.descriptor.LocalWorkflowInstrumentationRecord;
import org.cagrid.workflow.helper.descriptor.OperationInputMessageDescriptor;
import org.cagrid.workflow.helper.descriptor.OperationOutputParameterTransportDescriptor;
import org.cagrid.workflow.helper.descriptor.OperationOutputTransportDescriptor;
import org.cagrid.workflow.helper.descriptor.TimestampedStatus;
import org.cagrid.workflow.helper.descriptor.WorkflowInvocationHelperDescriptor;
import org.cagrid.workflow.helper.instance.client.WorkflowInstanceHelperClient;
import org.cagrid.workflow.helper.invocation.client.WorkflowInvocationHelperClient;
import org.globus.gsi.GlobusCredential;

/**
 * This class is autogenerated, DO NOT EDIT GENERATED GRID SERVICE ACCESS METHODS.
 *
 * This client is generated automatically by Introduce to provide a clean unwrapped API to the
 * service.
 *
 * On construction the class instance will contact the remote service and retrieve it's security
 * metadata description which it will use to configure the Stub specifically for each method call.
 * 
 * @created by Introduce Toolkit version 1.2
 */
public class WorkflowHelperClient extends WorkflowHelperClientBase implements WorkflowHelperI {	

	private static Log logger = LogFactory.getLog(WorkflowHelperClient.class);
	private static String XSD_NAMESPACE = NamespaceConstants.NSURI_SCHEMA_XSD;
	private static String containerBaseURL = "http://localhost:8080";

	public WorkflowHelperClient(String url) throws MalformedURIException, RemoteException {
		this(url,null);	
	}

	public WorkflowHelperClient(String url, GlobusCredential proxy) throws MalformedURIException, RemoteException {
		super(url,proxy);
	}

	public WorkflowHelperClient(EndpointReferenceType epr) throws MalformedURIException, RemoteException {
		this(epr,null);
	}

	public WorkflowHelperClient(EndpointReferenceType epr, GlobusCredential proxy) throws MalformedURIException, RemoteException {
		super(epr,proxy);
	}

	public static void usage(){
		System.out.println(WorkflowHelperClient.class.getName() + " -url <service url>");
	}

	public static void main(String [] args){
		System.out.println("Running the Grid Service Client");
		try{
			if(!(args.length < 2)){
				if(args[0].equals("-url")){
					WorkflowHelperClient client = new WorkflowHelperClient(args[1]);
					// place client calls here if you want to use this main as a
					// test....
					WorkflowHelperClient wf_helper = new WorkflowHelperClient(args[1]);

					// place client calls here if you want to use this main as a
					// test....

					org.cagrid.workflow.helper.descriptor.WorkflowInstanceHelperDescriptor workflowDescriptor5 = new org.cagrid.workflow.helper.descriptor.WorkflowInstanceHelperDescriptor();

					String containerBaseURL = "http://localhost:8080";

					runComplexArrayStreaming(null, wf_helper);

				}

				return;

			} else {
				usage();
				System.exit(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	public static void printDescriptor(org.cagrid.workflow.helper.descriptor.WorkflowInvocationHelperDescriptor workflowDescriptor){
		logger.debug("Printing Descriptor content");
		logger.debug("ID = "+workflowDescriptor.getWorkflowID());
		logger.debug("URL = "+workflowDescriptor.getServiceURL());
		if(workflowDescriptor.getOperationQName() != null){
			logger.debug( "OperationQname = "+ workflowDescriptor.getOperationQName().toString());
		}else{
			return;
		}
	}

	private static void runComplexArrayStreaming(EndpointReferenceType manager_epr, WorkflowHelperClient wf_helper)throws RemoteException {

		org.cagrid.workflow.helper.descriptor.WorkflowInstanceHelperDescriptor workflowDescriptor5 = new org.cagrid.workflow.helper.descriptor.WorkflowInstanceHelperDescriptor();
		String workflowID = "WorkFlow5";
		workflowDescriptor5.setWorkflowID(workflowID);
		workflowDescriptor5.setWorkflowManagerEPR(manager_epr);

		// Get helper client so we can create the invocation helpers
		WorkflowInstanceHelperClient wf_instance5 = null;
		try {
			wf_instance5 = wf_helper.createWorkflowInstanceHelper(workflowDescriptor5);
			//			this.subscribe(TimestampedStatus.getTypeDesc().getXmlType(), wf_instance5, workflowID);
			//			this.subscribe(LocalWorkflowInstrumentationRecord.getTypeDesc().getXmlType(), wf_instance5, workflowID);
		} catch (MalformedURIException e) {
			e.printStackTrace();
		}

		// BEGIN service 4				

		// Creating client of service 4
		org.cagrid.workflow.helper.descriptor.WorkflowInvocationHelperDescriptor operation4 = new org.cagrid.workflow.helper.descriptor.WorkflowInvocationHelperDescriptor();

		java.lang.String acess_url = containerBaseURL +"/wsrf/services/cagrid/Service4";
		operation4.setWorkflowID("GeorgeliusWorkFlow");
		operation4.setOperationQName(new QName("http://service4.introduce.cagrid.org/Service4", "PrintResultsRequest"));
		operation4.setOutputIsArray(false);
		operation4.setServiceURL(acess_url);
		WorkflowInvocationHelperClient serviceClient__4 = null;
		try {
			serviceClient__4 = wf_instance5.createWorkflowInvocationHelper(operation4);
		} catch (MalformedURIException e) {
			e.printStackTrace();
		}

		// Creating Descriptor of the InputMessage
		org.cagrid.workflow.helper.descriptor.OperationInputMessageDescriptor inputMessage4 = new OperationInputMessageDescriptor();
		InputParameterDescriptor[] inputParams4 = new InputParameterDescriptor[2];
		inputParams4[0] = new InputParameterDescriptor(new QName("result1"), new QName(XSD_NAMESPACE, "string"), false);
		inputParams4[1] = new InputParameterDescriptor(new QName("result2"), new QName(XSD_NAMESPACE, "string"), false);
		inputMessage4.setInputParam(inputParams4);
		serviceClient__4.configureInput(inputMessage4);
		// End InputMessage Descriptor

		// Setting output descriptor
		OperationOutputTransportDescriptor outputDescriptor4 = new OperationOutputTransportDescriptor();
		OperationOutputParameterTransportDescriptor outParameterDescriptor4 [] = new OperationOutputParameterTransportDescriptor[0];

		// takes the reference to no service
		outputDescriptor4.setParamDescriptor(outParameterDescriptor4);
		serviceClient__4.configureOutput(outputDescriptor4);
		serviceClient__4.start();

		// Setting second parameter
		serviceClient__4.setParameter(new InputParameter("complex type's streaming", 1));
		// END service 4

		// BEGIN CreateArrayService::getComplexArray				
		org.cagrid.workflow.helper.descriptor.WorkflowInvocationHelperDescriptor operation__ca = new org.cagrid.workflow.helper.descriptor.WorkflowInvocationHelperDescriptor();
		String access_url = containerBaseURL+"/wsrf/services/cagrid/CreateArrayService";
		operation__ca.setWorkflowID("GeorgeliusWorkFlow");
		operation__ca.setOperationQName(new QName("http://createarrayservice.introduce.cagrid.org/CreateArrayService", "GetComplexArrayRequest"));
		operation__ca.setServiceURL(access_url);
		operation__ca.setOutputType(new QName("http://systemtests.workflow.cagrid.org/SystemTests", "ComplexType"));
		operation__ca.setOutputIsArray(true);

		// create ReceiveArrayService				
		WorkflowInvocationHelperClient serviceClient__ca = null;
		try {
			serviceClient__ca = wf_instance5.createWorkflowInvocationHelper(operation__ca);
		} catch (MalformedURIException e) {
			e.printStackTrace();
		}

		// Creating Descriptor of the InputMessage
		org.cagrid.workflow.helper.descriptor.OperationInputMessageDescriptor inputMessage__ca = new OperationInputMessageDescriptor();
		InputParameterDescriptor[] inputParams__ca = new InputParameterDescriptor[0];
		inputMessage__ca.setInputParam(inputParams__ca);
		serviceClient__ca.configureInput(inputMessage__ca);
		// End InputMessage Descriptor

		// Creating the outputDescriptor of the only service that will receive the output (ReceiveArrayService)
		OperationOutputTransportDescriptor outputDescriptor__ca = new OperationOutputTransportDescriptor();
		OperationOutputParameterTransportDescriptor outParameterDescriptor__ca [] = new OperationOutputParameterTransportDescriptor[1];

		// First destination: ReceiveArrayService::ReceiveComplexArray
		outParameterDescriptor__ca[0] = new OperationOutputParameterTransportDescriptor();
		outParameterDescriptor__ca[0].setParamIndex(0);
		outParameterDescriptor__ca[0].setType(new QName(XSD_NAMESPACE ,"string"));
		outParameterDescriptor__ca[0].setExpectedTypeIsArray(false);
		outParameterDescriptor__ca[0].setQueryNamespaces(new QName[]{ new QName("http://createarrayservice.introduce.cagrid.org/CreateArrayService", "ns0"),
				new QName(XSD_NAMESPACE,"xsd"), new QName("http://systemtests.workflow.cagrid.org/SystemTests", "abc")});
		outParameterDescriptor__ca[0].setLocationQuery("/ns0:GetComplexArrayResponse/abc:ComplexType/abc:message");
		outParameterDescriptor__ca[0].setDestinationEPR(new EndpointReferenceType[]{serviceClient__4.getEndpointReference()});

		// takes the reference to ReceiveComplexArrayService
		outputDescriptor__ca.setParamDescriptor(outParameterDescriptor__ca);
		serviceClient__ca.configureOutput(outputDescriptor__ca);
		serviceClient__ca.start();

		// END CreateArrayService::getComplexArray 
	}

  public org.oasis.wsrf.properties.GetMultipleResourcePropertiesResponse getMultipleResourceProperties(org.oasis.wsrf.properties.GetMultipleResourceProperties_Element params) throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"getMultipleResourceProperties");
    return portType.getMultipleResourceProperties(params);
    }
  }

  public org.oasis.wsrf.properties.GetResourcePropertyResponse getResourceProperty(javax.xml.namespace.QName params) throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"getResourceProperty");
    return portType.getResourceProperty(params);
    }
  }

  public org.oasis.wsrf.properties.QueryResourcePropertiesResponse queryResourceProperties(org.oasis.wsrf.properties.QueryResourceProperties_Element params) throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"queryResourceProperties");
    return portType.queryResourceProperties(params);
    }
  }

  public org.cagrid.workflow.helper.instance.client.WorkflowInstanceHelperClient createWorkflowInstanceHelper(org.cagrid.workflow.helper.descriptor.WorkflowInstanceHelperDescriptor workflowInstanceHelperDescriptor) throws RemoteException, org.apache.axis.types.URI.MalformedURIException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"createWorkflowInstanceHelper");
    org.cagrid.workflow.helper.stubs.CreateWorkflowInstanceHelperRequest params = new org.cagrid.workflow.helper.stubs.CreateWorkflowInstanceHelperRequest();
    org.cagrid.workflow.helper.stubs.CreateWorkflowInstanceHelperRequestWorkflowInstanceHelperDescriptor workflowInstanceHelperDescriptorContainer = new org.cagrid.workflow.helper.stubs.CreateWorkflowInstanceHelperRequestWorkflowInstanceHelperDescriptor();
    workflowInstanceHelperDescriptorContainer.setWorkflowInstanceHelperDescriptor(workflowInstanceHelperDescriptor);
    params.setWorkflowInstanceHelperDescriptor(workflowInstanceHelperDescriptorContainer);
    org.cagrid.workflow.helper.stubs.CreateWorkflowInstanceHelperResponse boxedResult = portType.createWorkflowInstanceHelper(params);
    EndpointReferenceType ref = boxedResult.getWorkflowInstanceHelperReference().getEndpointReference();
    return new org.cagrid.workflow.helper.instance.client.WorkflowInstanceHelperClient(ref);
    }
  }

  public java.lang.String getIdentity() throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"getIdentity");
    org.cagrid.workflow.helper.stubs.GetIdentityRequest params = new org.cagrid.workflow.helper.stubs.GetIdentityRequest();
    org.cagrid.workflow.helper.stubs.GetIdentityResponse boxedResult = portType.getIdentity(params);
    return boxedResult.getResponse();
    }
  }

  public org.oasis.wsn.SubscribeResponse subscribe(org.oasis.wsn.Subscribe params) throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"subscribe");
    return portType.subscribe(params);
    }
  }

}
