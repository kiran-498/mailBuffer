package com.hcl.email.repositry;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.hcl.email.entity.BufferEmailIdRequest;
import com.hcl.email.entity.EmailIdRequest;

public interface BufferEmailIdRequestRepositry {

	public BufferEmailIdRequest getMailDataById(Long id);
	
	public String save(@RequestBody BufferEmailIdRequest bufferEmailIdRequest);

	public List<BufferEmailIdRequest> getEmailData();
	
	public List<BufferEmailIdRequest> getEmployee();
	public List<BufferEmailIdRequest> getEmailIdRequestForUpdate();
	public List<BufferEmailIdRequest> GetEmailIdRequestStatus();
	
	public String insertEmailIdRequest(@RequestBody EmailIdRequest emailIdRequest);
	public List<EmailIdRequest> getEmailIdRequest();
}
