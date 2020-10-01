package com.hcl.email.service;


import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;


import com.hcl.email.entity.BufferEmailIdRequest;
import com.hcl.email.entity.EmailIdRequest;

public interface BufferEmailIdRequestService {

	public BufferEmailIdRequest getMailDataById(Long id);
	
	
	public String save(@RequestBody BufferEmailIdRequest bufferEmailIdRequest);


	public List<BufferEmailIdRequest> getEmailData();
	
	public void bufferApprove(List<BufferEmailIdRequest> bufferEmailIdRequest);
	
	public void bufferReject(List<BufferEmailIdRequest> bufferEmailIdRequest);
	
	public List<BufferEmailIdRequest> getEmployee();
	public List<BufferEmailIdRequest> getEmailIdRequestForUpdate();
	public List<BufferEmailIdRequest> GetEmailIdRequestStatus();
	public void updateRequest(List<BufferEmailIdRequest> bufferEmailIdRequest);
	
	public String insertEmailIdRequest(@RequestBody EmailIdRequest emailIdRequest);
	public List<EmailIdRequest> getEmailIdRequest();
	public void editEmailIdRequest(List<EmailIdRequest> emailIdRequest);
	public void deleteEmailIdRequest(List<EmailIdRequest> emailIdRequest);
}
