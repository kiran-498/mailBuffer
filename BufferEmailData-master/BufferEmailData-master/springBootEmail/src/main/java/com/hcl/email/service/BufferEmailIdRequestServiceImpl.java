package com.hcl.email.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;


import com.hcl.email.entity.BufferEmailIdRequest;
import com.hcl.email.entity.EmailIdRequest;
import com.hcl.email.repositry.BufferEmailIdRequestRepositry;

@Service
public class BufferEmailIdRequestServiceImpl implements BufferEmailIdRequestService {
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private BufferEmailIdRequestRepositry bufferEmailIdRequestRepositry;

	@Override
	public BufferEmailIdRequest getMailDataById(Long id) {
		
		BufferEmailIdRequest result = bufferEmailIdRequestRepositry.getMailDataById(id);
		return result;
	}

	@Override
	public String save(BufferEmailIdRequest bufferEmailIdRequest) {
		// TODO Auto-generated method stub
		return bufferEmailIdRequestRepositry.save(bufferEmailIdRequest);
	}

	@Override
	public List<BufferEmailIdRequest> getEmailData() {
		List<BufferEmailIdRequest> result =  bufferEmailIdRequestRepositry.getEmailData();
		return result;
	}

	@Override
	public void bufferApprove(List<BufferEmailIdRequest> bufferEmailIdRequest) {
		Map parameters = new HashMap();
		Map out=new HashMap();;
		for(BufferEmailIdRequest single : bufferEmailIdRequest) {
			parameters.put("BufferRequestId",single.getBufferRequestId());
			parameters.put("StatusId", 2);
			parameters.put("ManagerComments", single.getManagerComments());
			parameters.put("UpdatedBy", single.getUpdatedBy());
			SqlParameterSource in = new MapSqlParameterSource().addValues(parameters);
			SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("usp_updateBufferRequestStatus");
			//SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcIntranet).withProcedureName("usp_UpdateAnnouncementStatus");
			out = jdbcCall.execute(parameters);		
			//System.out.println("id: "+single.getBufferRequestId());;
			
		}
		
	}
	@Override
	public void bufferReject(List<BufferEmailIdRequest> bufferEmailIdRequest) {
		Map parameters = new HashMap();
		Map out=new HashMap();;
		for(BufferEmailIdRequest single : bufferEmailIdRequest) {
			parameters.put("BufferRequestId",single.getBufferRequestId());
			parameters.put("StatusId", 3);
			parameters.put("ManagerComments", single.getManagerComments());
			parameters.put("UpdatedBy", single.getUpdatedBy());
			SqlParameterSource in = new MapSqlParameterSource().addValues(parameters);
			SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("usp_updateBufferRequestStatus");
			//SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcIntranet).withProcedureName("usp_UpdateAnnouncementStatus");
			out = jdbcCall.execute(parameters);		
			//System.out.println("id: "+single.getBufferRequestId());;
			
		}
		
	}
	@Override
	public List<BufferEmailIdRequest> getEmployee() {
		List<BufferEmailIdRequest> result =  bufferEmailIdRequestRepositry.getEmployee();
		return result;
	}
	@Override
	public List<BufferEmailIdRequest> getEmailIdRequestForUpdate() {
		List<BufferEmailIdRequest> result =  bufferEmailIdRequestRepositry.getEmailIdRequestForUpdate();
		return result;
	}
	@Override
	public List<BufferEmailIdRequest> GetEmailIdRequestStatus() {
		List<BufferEmailIdRequest> result =  bufferEmailIdRequestRepositry.GetEmailIdRequestStatus();
		return result;
	}
	@Override
	public void updateRequest(List<BufferEmailIdRequest> bufferEmailIdRequest) {
		Map parameters = new HashMap();
		Map out=new HashMap();;
		for(BufferEmailIdRequest single : bufferEmailIdRequest) {
			parameters.put("BufferRequestId",single.getBufferRequestId());
			parameters.put("StatusId", single.getStatus());
			parameters.put("Comments", single.getComments());
			parameters.put("UpdatedBy", single.getUpdatedBy());
			SqlParameterSource in = new MapSqlParameterSource().addValues(parameters);
			SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("usp_UpdateEmailIdRequest");
			//SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcIntranet).withProcedureName("usp_UpdateAnnouncementStatus");
			out = jdbcCall.execute(parameters);		
			//System.out.println("id: "+single.getBufferRequestId());;
			
		}
		
	}

	@Override
	public String insertEmailIdRequest(EmailIdRequest emailIdRequest) {
		// TODO Auto-generated method stub
		return bufferEmailIdRequestRepositry.insertEmailIdRequest(emailIdRequest);
	}
	@Override
	public List<EmailIdRequest> getEmailIdRequest() {
		List<EmailIdRequest> result =  bufferEmailIdRequestRepositry.getEmailIdRequest();
		return result;
	}
	
	@Override
	public void editEmailIdRequest(List<EmailIdRequest> emailIdRequest) {
		Map parameters = new HashMap();
		Map out=new HashMap();;
		for(EmailIdRequest single : emailIdRequest) {
			parameters.put("requestId",single.getRequestId());
			parameters.put("projectName",single.getProjectName());
			parameters.put("location", single.getLocation());
			parameters.put("ciscoMailId", single.getCiscoMailId());
			parameters.put("justification", single.getJustification());
			parameters.put("updatedBy", single.getUpdatedBy());
			SqlParameterSource in = new MapSqlParameterSource().addValues(parameters);
			SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("usp_editEmailIdRequest");
			out = jdbcCall.execute(parameters);		
			
			
		}
		
	}
	@Override
	public void deleteEmailIdRequest(List<EmailIdRequest> emailIdRequest) {
		Map parameters = new HashMap();
		Map out=new HashMap();;
		for(EmailIdRequest single : emailIdRequest) {
			parameters.put("requestId",single.getRequestId());			
			SqlParameterSource in = new MapSqlParameterSource().addValues(parameters);
			SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("usp_deleteEmailIdRequest");
			out = jdbcCall.execute(parameters);	
		}
		
	}
}
