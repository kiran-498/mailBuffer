package com.hcl.email.repositry;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;
import com.hcl.email.entity.BufferEmailIdRequest;
import com.hcl.email.entity.EmailIdRequest;


@Repository
public class BufferEmailIdRequestRepositryImpl implements BufferEmailIdRequestRepositry {
	
	@Autowired
	private DataSource dataSource;

	@Override
	public BufferEmailIdRequest getMailDataById(Long id) {
		List<BufferEmailIdRequest> list = new ArrayList<BufferEmailIdRequest>();
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("get_mail_data_by_id");
		SqlParameterSource in = new MapSqlParameterSource().addValue("BufferRequestId", id);
		Map<String, Object> out = jdbcCall.execute(in);
		BufferEmailIdRequest result = new BufferEmailIdRequest();
	
		ArrayList arrayList  = (ArrayList)out.get("#result-set-1");
		Map resultMap = (Map) arrayList.get(0);
		System.out.println("EmpName: " + resultMap.get("EmpName"));
		result.setBufferRequestId(Long.valueOf((Integer)resultMap.get("BufferRequestId")));
		result.setEmpName((String)resultMap.get("EmpName"));
		result.setBand((String)resultMap.get("Band"));
		
		result.setDesignation((String)resultMap.get("Designation"));
		result.setEmpNo((Integer)resultMap.get("EmpNo"));
		result.sethCLEmailId((String)resultMap.get("HCLEmailId"));
		result.setEmpType((String)resultMap.get("EmpType"));
		result.setCiscoEmailId((String)resultMap.get("CiscoEmailId"));
		result.setPlannedBillableProject((String)resultMap.get("PlannedBillableProject"));
		result.setWorkLocation((String)resultMap.get("WorkLocation"));
		result.setDuration((String)resultMap.get("Duration"));
		result.setExpectedBillingDate((String)resultMap.get("ExpectedBillingDate"));
		result.setJustification((String)resultMap.get("Justification"));
		result.setCreatedDate((Date)resultMap.get("CreatedDate"));
		result.setCreatedBy((String)resultMap.get("CreatedBy"));
		
		
		return result;
	}

	private void listOfData(List<BufferEmailIdRequest> list, Map<String, Object> out) {
		for(Entry<String, Object> row:out.entrySet()){
			list.addAll((Collection<? extends BufferEmailIdRequest>) row.getValue());
			}
	}
	private void listOfDataEmailIdRequest(List<EmailIdRequest> list, Map<String, Object> out) {
		for(Entry<String, Object> row:out.entrySet()){
			list.addAll((Collection<? extends EmailIdRequest>) row.getValue());
			}
	}

	@Override
	public String save(BufferEmailIdRequest bufferEmailIdRequest) {

		Map map = new HashMap<>();
		//map.put("BufferRequestId", bufferEmailIdRequest.getBufferRequestId());
		//map.put("EmpName", bufferEmailIdRequest.getEmpName());
		map.put("EmpNo", bufferEmailIdRequest.getEmpNo());
		map.put("EmpType", bufferEmailIdRequest.getEmpType());
		map.put("PlannedBillableProject", bufferEmailIdRequest.getPlannedBillableProject());
		map.put("WorkLocation", bufferEmailIdRequest.getWorkLocation());
		map.put("CiscoEmailId", bufferEmailIdRequest.getCiscoEmailId());
		map.put("CiscoMailId", bufferEmailIdRequest.getCiscoMailId());
		map.put("ExpectedBillingDate", bufferEmailIdRequest.getExpectedBillingDate());
		map.put("Duration", bufferEmailIdRequest.getDuration());		
		map.put("Justification", bufferEmailIdRequest.getJustification());		
		map.put("CreatedBy", bufferEmailIdRequest.getCreatedBy());
		
		//map.put("Band", bufferEmailIdRequest.getBand());
		//map.put("Designation", bufferEmailIdRequest.getDesignation());		
		//map.put("HCLEmailId", bufferEmailIdRequest.gethCLEmailId());
		//map.put("CreatedDate", bufferEmailIdRequest.getCreatedDate());
		
		
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("Usp_buffer_Email_Request");
		SqlParameterSource in = new MapSqlParameterSource().addValues(map);
		Map<String, Object> out = jdbcCall.execute(in);
		
		return "Success";
	}

	@Override
	public List<BufferEmailIdRequest> getEmailData() {
		List<BufferEmailIdRequest> list = new ArrayList<BufferEmailIdRequest>();
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("usp_Get_bufferEmailIdRequest");
		Map<String, Object> out = jdbcCall.execute();
		this.listOfData(list, out);
		return list;
	}
	
	@Override
	public List<BufferEmailIdRequest> getEmployee() {
		List<BufferEmailIdRequest> list = new ArrayList<BufferEmailIdRequest>();
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("USP_GetEmployee");
		Map<String, Object> out = jdbcCall.execute();
		this.listOfData(list, out);
		return list;
	}
	
	@Override
	public List<BufferEmailIdRequest> getEmailIdRequestForUpdate() {
		List<BufferEmailIdRequest> list = new ArrayList<BufferEmailIdRequest>();
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("usp_Get_EmailIdRequest_ForUpdate");
		Map<String, Object> out = jdbcCall.execute();
		this.listOfData(list, out);
		return list;
	}
	@Override
	public List<BufferEmailIdRequest> GetEmailIdRequestStatus() {
		List<BufferEmailIdRequest> list = new ArrayList<BufferEmailIdRequest>();
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("usp_GetEmailIdRequestStatus");
		Map<String, Object> out = jdbcCall.execute();
		this.listOfData(list, out);
		return list;
	}
	
	
	public String insertEmailIdRequest(EmailIdRequest emailIdRequest) {

		Map map = new HashMap<>();		
		map.put("employeeNo", emailIdRequest.getEmployeeNo());
		map.put("role", emailIdRequest.getRole());
		map.put("requirementType", emailIdRequest.getRequirementType());
		map.put("projectName", emailIdRequest.getProjectName());
		map.put("projectId", emailIdRequest.getProjectId());
		map.put("location", emailIdRequest.getLocation());
		map.put("mailExist", emailIdRequest.getMailExist());
		map.put("ciscoMailId", emailIdRequest.getCiscoMailId());			
		map.put("justification", emailIdRequest.getJustification());		
		map.put("createdBy", emailIdRequest.getCreatedBy());
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("Usp_Insert_EmailId_Request");
		SqlParameterSource in = new MapSqlParameterSource().addValues(map);
		try {
		Map<String, Object> out = jdbcCall.execute(in);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		return "Success";
	}

	@Override
	public List<EmailIdRequest> getEmailIdRequest() {
		List<EmailIdRequest> list = new ArrayList<EmailIdRequest>();
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("usp_Get_EmailIdRequest");
		Map<String, Object> out = jdbcCall.execute();
		this.listOfDataEmailIdRequest(list, out);
		return list;
	}
	
}
