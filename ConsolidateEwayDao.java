package com.vgipl.GST.ewaybill.controller;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.vgipl.GST.login.CommonFactory.AllUtils;
import com.vgipl.GST.login.CommonFactory.DbProcess;
import com.vgipl.GST.login.CommonFactory.Result;
import com.vgipl.GST.masters.model.InvoiceEntryModel;

import oracle.sql.ARRAY;
import oracle.sql.ArrayDescriptor;

@Repository
public class ConsolidateEwayDao {
	@Autowired
	@Qualifier("dbProcessImpl")
	DbProcess dbProcess;
	
	@Value("${jdbc.username}")
	public String dbUserName;
	
	@Value("${jdbc.password}")
	public String dbPassword;
	
	@Value("${jdbc.jdbcUrl}")
	
	public String jdbcUrl;
	public String EWAYBILL_CONSOL_HEAD_DUMP(String euserId, String egstinId, int m_branch, int trno,
			int modeTrans, int fromState, String slocation, String vehicleNo, String fromdate,
			int vtype, String eipAddress,String emacAddress, String ehostname, String euserId2, String eworkingDate, String egstinId2,
			String egstinIdBW) {

			HashMap<String, Object>  inputParaList = new HashMap<>();
			inputParaList.put("P_TRNO",(trno));										//NUMBER, -
			inputParaList.put("P_CONSOL_EWAYBILL_NUMBER",null);                                     //NUMBER, -
			inputParaList.put("P_CONSOL_EWAYBILL_DATE",	AllUtils.getFormattedDateOracle(fromdate));                                       //DATE, ---
			inputParaList.put("P_ENTER_BY",Integer.parseInt(euserId));                              //NUMBER, -
			inputParaList.put("P_ENTER_DATE",AllUtils.getFormattedDateOracle(eworkingDate));        //DATE, ---
			inputParaList.put("P_EDIT_BY",0);                                                    //NUMBER, -
			inputParaList.put("P_EDIT_DATE",null);                                                  //DATE, ---
			inputParaList.put("P_IP_ADDRESS",eipAddress);                                           //VARCHAR2,
			inputParaList.put("P_MAC_ADDRESS",emacAddress );                                        //VARCHAR2,
			inputParaList.put("P_DELETE_FLAG",'N' );                                                //VARCHAR2,
			inputParaList.put("P_DELETE_BY_USER",null);                                             //NUMBER, -
			inputParaList.put("P_DELETE_DATE",null);                                                //DATE, ---
			inputParaList.put("P_GSTIN_ID",Integer.parseInt(egstinId ));                            //NUMBER, -
			inputParaList.put("P_GSTIN_USER_ID",Integer.parseInt(euserId));                         //NUMBER, -
			inputParaList.put("P_TRANSPORTER_NAME",null);                                           //VARCHAR2,
			inputParaList.put("P_TRANSPORTER_ID",null);                                             //VARCHAR2,
			inputParaList.put("P_APPROX_DISTANCE",null);                                            //NUMBER, -
			inputParaList.put("P_TRANSPORT_MODE_ID",(modeTrans));                  //NUMBER, -
			inputParaList.put("P_VEHICLE_TYPE_ID",(vtype));                         //NUMBER, -
			inputParaList.put("P_VEHICLE_NO",vehicleNo);                                            //VARCHAR2,
			inputParaList.put("P_TRANSPORTER_DOCNO",null);                                          //VARCHAR2,
			inputParaList.put("P_TRANSPORTER_DOCDT",null);                                          //DATE, ---
			inputParaList.put("P_EWAYBILL_RETURN_DESC",null);                                       //VARCHAR2,
			inputParaList.put("P_FROM_STATE_ID",(fromState));                       //NUMBER, -
			inputParaList.put("P_REASON_CODE",null);                                                //NUMBER, -
			inputParaList.put("P_REASON_DESC",null);                                                //VARCHAR2,
			inputParaList.put("P_STATUS",null);                                                     //VARCHAR2,
			inputParaList.put("P_FROM_PLACE",slocation);                                            //VARCHAR2,
			System.out.println("pr_ewaybill_consol_head_dump:"+inputParaList);
			HashMap<String, Object> map = dbProcess.executeProcedure( "pkg_ewaybill_process","pr_ewaybill_consol_head_dump", inputParaList);
			Set set = map.entrySet();
			String result = "";
			Iterator itr = set.iterator();
			while (itr.hasNext()) {
				Map.Entry mapEntry = (Map.Entry) itr.next();
				String key = (String) mapEntry.getKey();
				if (key.equalsIgnoreCase("result")) {
					result = mapEntry.getValue().toString();
					System.out.println("result " + result);
				}
			}
			return result;
	}

	/*****************************************************************************************/
	public String EWAYBILL_CONSOL_LINE_DUMP(ArrayList<ConsolidatedModel> list, String userId, String gstinId, int m_branch,
		int trno, String[] arr_srNo, String[] arsrNo, String[] arEWBill, String[] arAmt, String[] arEWDate,
		String[] arGenBy, String[] arInvoNo, String[] ardate, String[] arsrc, String[] arvUntil) throws SQLException {
	
		ArrayDescriptor desNumber = null;
		ArrayDescriptor desVarchar = null;
		ArrayDescriptor desnVarchar = null;
		ArrayDescriptor desDate = null;
		Connection connect = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");    
			connect = DriverManager.getConnection(jdbcUrl,dbUserName,dbPassword);
	        desNumber = ArrayDescriptor.createDescriptor("TY_NUMBER", connect);
			desVarchar = ArrayDescriptor.createDescriptor("TY_VARCHAR2", connect);
			desnVarchar = ArrayDescriptor.createDescriptor("TY_NVARCHAR2", connect);
			desDate = ArrayDescriptor.createDescriptor("TY_DATE", connect);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	    Array oraArsrNo 	=new ARRAY(desNumber, connect, arsrNo);  	 
		Array oraArEWBill 	=new ARRAY(desNumber, connect, arEWBill);	 
		Array oraArAmt	 	=new ARRAY(desNumber, connect, arAmt );		 
		Array oraArEWDate 	=new ARRAY(desDate, connect, arEWDate); 	 
		Array oraArGenBy 	=new ARRAY(desVarchar, connect, arGenBy) ;	 
		Array oraArInvoNo 	=new ARRAY(desVarchar, connect, arInvoNo);       
		Array oraArdate	 	=new ARRAY(desDate, connect, ardate );		
		Array oraArsrc	 	=new ARRAY(desVarchar, connect, arsrc );	 
		Array oraArvUntil 	=new ARRAY(desDate, connect, arvUntil);  	 
				
		String result = "";
		HashMap<String ,Object> inputParaList = new HashMap<String ,Object>();
		inputParaList.put("P_LINE_NO"			,oraArsrNo);							//TY_NUMBER,
		inputParaList.put("P_TRNO"				,trno);									//NUMBER,
		inputParaList.put("P_GSTIN_USER_ID"		,userId);	                            //NUMBER,
		inputParaList.put("P_GSTIN_ID"			,gstinId);	                            //NUMBER,
		inputParaList.put("P_EWAYBILL_NUMBER"	,oraArEWBill);							//TY_NUMBER,
		inputParaList.put("P_EWAYBILL_DATE"		,oraArEWDate);							//TY_DATE,
		inputParaList.put("P_GENERATED_BY"		,oraArGenBy);							//TY_VARCHAR2,
		inputParaList.put("P_INVOICE_NUMBER"	,oraArInvoNo);							//TY_VARCHAR2,
		inputParaList.put("P_INVOICE_DATE"		,oraArdate);							//TY_DATE,
		inputParaList.put("P_INVOICE_AMOUNT"	,oraArAmt); 							//TY_NUMBER,
		inputParaList.put("P_SOURCE"			,oraArsrc); 							//TY_VARCHAR2,
		inputParaList.put("P_VALID_UNTIL"		,oraArvUntil);							//TY_DATE,	
		System.out.println("PR_EWAYBILL_CONSOL_LINE_DUMP:"+inputParaList);
		
		HashMap<String, Object> map = dbProcess.executeProcedure( "pkg_ewaybill_process","PR_EWAYBILL_CONSOL_LINE_DUMP", inputParaList);
		
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry mapEntry = (Map.Entry) itr.next();
			String key = (String) mapEntry.getKey();
			if (key.equalsIgnoreCase("result")) {
				result = mapEntry.getValue().toString();
				System.out.println("result " + result);
			}
		}
		return result;
	}
	
	/*****************************************************************************************/
	public String EWAYBILL_CONSOL_TRPT_DTL(String euserId, String egstinId, int m_branch, int trno,
	int modeTrans, int fromState, String slocation, String vehicleNo, String fromdate, int vtype,
	String eipAddress, String emacAddress, String ehostname, String euserId2, String eworkingDate,
	String egstinId2, String egstinIdBW) {
	HashMap<String, Object>  ParaList = new HashMap<>();
		ParaList.put("P_TRNO",trno);														//NUMBER",
		ParaList.put("P_GSTIN_ID",egstinId2);												//NUMBER",
		ParaList.put("P_EWAYBILL_RETURN_NUMBER",null);										//NUMBER",---VARCHAR2",
		ParaList.put("P_EWAYBILL_RETURN_DATE",AllUtils.getFormattedDateOracle(fromdate));	//DATE",
		ParaList.put("P_TRANSPORTER_NAME",null);											//VARCHAR2",
		ParaList.put("P_TRANSPORTER_ID",null);												//VARCHAR2",
		ParaList.put("P_APPROX_DISTANCE",null);												//NUMBER",
		ParaList.put("P_TRANSPORT_MODE_ID",modeTrans);										//NUMBER",
		ParaList.put("P_VEHICLE_TYPE_ID",vtype);											//NUMBER",
		ParaList.put("P_VEHICLE_NO",vehicleNo);												//VARCHAR2",
		ParaList.put("P_TRANSPORTER_DOCNO",null);											//VARCHAR2",
		ParaList.put("P_TRANSPORTER_DOCDT",null);											//DATE",
		ParaList.put("P_USER_ID",euserId);													//NUMBER",
		ParaList.put("P_EWAYBILL_RETURN_DESC",null);										//VARCHAR2",
		ParaList.put("P_IP_ADDRESS",eipAddress);											//VARCHAR2",
		ParaList.put("P_MAC_ADDRESS",emacAddress);											//VARCHAR2",
		ParaList.put("P_FROM_STATE_ID",fromState);											//NUMBER",
		ParaList.put("P_REASON_CODE",null);													//NUMBER",
		ParaList.put("P_REASON_DESC",null);													//VARCHAR2",
		ParaList.put("P_FROM_PLACE",slocation);												//VARCHAR2,

		System.out.println("PR_EWAYBILL_CONSOL_TRPT_DTL:"+ParaList);
		HashMap<String, Object> map = dbProcess.executeProcedure( "pkg_ewaybill_process","PR_EWAYBILL_CONSOL_TRPT_DTL", ParaList);
		Set set = map.entrySet();
		String result = "";
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry mapEntry = (Map.Entry) itr.next();
			String key = (String) mapEntry.getKey();
			if (key.equalsIgnoreCase("P_RESULT")) {
				result = mapEntry.getValue().toString();
				System.out.println("result " + result);
			}
		}
		return result;
	}

/*****************************************************************************************/
	public Result EWAYBILL_CONSOL_PROCESS(String euserId, String egstinId, int trno, String opFlag) {
		HashMap<String, Object>  ParamList = new HashMap<>();
		ParamList.put("P_OPERATION"	,opFlag);   		// VARCHAR2,
        ParamList.put("P_USER_ID"	,euserId);  		// NUMBER,
        ParamList.put("P_GSTIN_ID"	,egstinId); 		// NUMBER,
        ParamList.put("P_TRNO"		,trno);
        System.out.println("PR_EWAYBILL_CONSOL_PROCESS:"+ParamList);
		HashMap<String, Object> map = dbProcess.executeProcedure( "pkg_ewaybill_process","PR_EWAYBILL_CONSOL_PROCESS", ParamList);
		System.out.println("Final SAve:"+map);
		Set set = map.entrySet();
		Result result = new Result();
		String resultStr = "";
		String dbResult = "";
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry mapEntry = (Map.Entry) itr.next();
			String key = (String) mapEntry.getKey();
			if (key.equalsIgnoreCase("result")) {
				resultStr = mapEntry.getValue().toString();
			}
		}
		if (resultStr.equals("Success")) {
			dbResult = "success";
			result.setStatus(dbResult);
			result.setMsg("Record Save Successfully.");
		} else {
			dbResult = "error";
			result.setStatus(dbResult);
			result.setMsg("Record Not Update.");
		}
		return result;
	}

}
