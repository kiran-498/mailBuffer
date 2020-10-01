package com.hcl.email.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.hcl.email.entity.BufferEmailIdRequest;
import com.hcl.email.entity.EmailIdRequest;
import com.hcl.email.service.BufferEmailIdRequestService;

@RestController
public class BufferEmailIdRequestController {
	@Autowired
	private DataSource dataSource;
	@Autowired
	private BufferEmailIdRequestService bufferEmailIdRequestService;

	@GetMapping("/getDataById")
	public BufferEmailIdRequest getMailDataById(@RequestParam("id") Long id) {
		
		return bufferEmailIdRequestService.getMailDataById(id);
	}
	
	@GetMapping("/getEmailData")
	public List<BufferEmailIdRequest> getEmailData() {
		
		return bufferEmailIdRequestService.getEmailData();
	}
	
	@PostMapping("/save")
	public String save(@RequestBody BufferEmailIdRequest bufferEmailIdRequest) {
		
		return bufferEmailIdRequestService.save(bufferEmailIdRequest);
		
	}
	@PostMapping("/bufferApprove")
	public  String bufferApprove(@RequestBody  List<BufferEmailIdRequest> bufferEmailIdRequest) {
		//System.out.println(bufferEmailIdRequest);
		
		 bufferEmailIdRequestService.bufferApprove( bufferEmailIdRequest);
		 
		 return  "";
		
	}
	@PostMapping("/bufferReject")
	public  String bufferReject(@RequestBody  List<BufferEmailIdRequest> bufferEmailIdRequest) {
		//System.out.println(bufferEmailIdRequest);		
		 bufferEmailIdRequestService.bufferReject( bufferEmailIdRequest);		 
		 return  "";
		
	}
	@GetMapping("/getEmployee")
	public List<BufferEmailIdRequest> getEmployee() {
		
		return bufferEmailIdRequestService.getEmployee();
	}
	@GetMapping("/getEmailIdRequestForUpdate")
	public List<BufferEmailIdRequest> getEmailIdRequestForUpdate() {
		
		return bufferEmailIdRequestService.getEmailIdRequestForUpdate();
	}
	@GetMapping("/GetEmailIdRequestStatus")
	public List<BufferEmailIdRequest> GetEmailIdRequestStatus() {
		
		return bufferEmailIdRequestService.GetEmailIdRequestStatus();
	}
	@PostMapping("/updateRequest")
	public  String updateRequest(@RequestBody  List<BufferEmailIdRequest> bufferEmailIdRequest) {
		//System.out.println(bufferEmailIdRequest);
		
		 bufferEmailIdRequestService.updateRequest( bufferEmailIdRequest);
		 
		 return  "";
		
	}
	
	@PostMapping("/insertEmailIdRequest")
	public String insertEmailIdRequest(@RequestBody EmailIdRequest emailIdRequest) {
		
		return bufferEmailIdRequestService.insertEmailIdRequest(emailIdRequest);
		
	}
	
	@GetMapping("/getEmailIdRequest")
	public List<EmailIdRequest> getEmailIdRequest() {
		
		return bufferEmailIdRequestService.getEmailIdRequest();
	}
	
	@PostMapping("/editEmailIdRequest")
	public  String editEmailIdRequest(@RequestBody  EmailIdRequest emailIdRequest) {		
		 Map parameters = new HashMap();
			Map out=new HashMap();;
		 parameters.put("requestId",emailIdRequest.getRequestId());
			parameters.put("projectName",emailIdRequest.getProjectName());
			parameters.put("location", emailIdRequest.getLocation());
			parameters.put("ciscoMailId", emailIdRequest.getCiscoMailId());
			parameters.put("justification", emailIdRequest.getJustification());
			parameters.put("updatedBy", emailIdRequest.getUpdatedBy());
			SqlParameterSource in = new MapSqlParameterSource().addValues(parameters);
			SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("usp_editEmailIdRequest");
			out = jdbcCall.execute(parameters);	
		 return  "";
		
	}
	@PostMapping("/deleteEmailIdRequest")
	public  String deleteEmailIdRequest(@RequestBody  EmailIdRequest emailIdRequest) {
		 Map parameters = new HashMap();
			Map out=new HashMap();;
		 parameters.put("requestId",emailIdRequest.getRequestId());
			SqlParameterSource in = new MapSqlParameterSource().addValues(parameters);
			SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("usp_deleteEmailIdRequest");
			out = jdbcCall.execute(parameters);	
		 
		 return  "";
		
	}
}
