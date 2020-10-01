package com.hcl.email.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "emailIdRequest")
public class EmailIdRequest /* implements Serializable */{


	//private static final long serialVersionUID = 1L;
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	//@Column(name="RequestId")
	private Integer requestId;
	
	//@Column(name="EmployeeName")
	private String employeeName;	

	//@Column(name="Du")
	private String du;	

	
	//@Column(name="EmployeeNo")
	private String employeeNo;	

	
	//@Column(name="Role")
	private Integer role;
	
	//@Column(name = "RequirementType")
	private Integer requirementType;
	
	//@Column(name="ProjectName")
	private String projectName;
	
	//@Column(name="ProjectId")
	private Integer projectId;
	
	//@Column(name="Location")
	private String location;
	
	//@Column(name="MailExist")
	private String mailExist;
	
	//@Column(name="CiscoMailId")
	private String ciscoMailId;
	
	//@Column(name="Justification")
	private String justification;	

	//@Column(name="CreatedDate")
	private Date createdDate;
	
	//@Column(name="CreatedBy")
	private String createdBy;
	
	//@Column(name="UpdatedBy")
	private String updatedBy;

	
	
	public Integer getRequestId() {
		return requestId;
	}
	public void setRequestId(Integer requestId) {
		this.requestId = requestId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDu() {
		return du;
	}
	public void setDu(String du) {
		this.du = du;
	}

	public String getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}
	
	public Integer getRole() {
		return role;
	}
	public void setRole(Integer role) {
		this.role = role;
	}
	
	public Integer getRequirementType() {
		return requirementType;
	}
	public void setRequirementType(Integer requirementType) {
		this.requirementType = requirementType;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getMailExist() {
		return mailExist;
	}
	public void setMailExist(String mailExist) {
		this.mailExist = mailExist;
	}
	
	public String getCiscoMailId() {
		return ciscoMailId;
	}
	public void setCiscoMailId(String ciscoMailId) {
		this.ciscoMailId = ciscoMailId;
	}
	
	
	public String getJustification() {
		return justification;
	}
	public void setJustification(String justification) {
		this.justification = justification;
	}	
	
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	
	
	
	@Override
	public String toString() {
		return "EmailIdRequest [requestId=" + requestId + ",employeeName=" + employeeName + ",du=" + du + ",employeeNo=" + employeeNo + ",role=" + role + ", requirementType=" + requirementType
				+ ",projectName="+projectName+", projectId=" + projectId + ", location=" + location + ", mailExist=" + mailExist + ", ciscoMailId="
				+ ciscoMailId + ", justification=" + justification + ",createdBy=" + createdBy + ",updatedBy=" + updatedBy + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((requestId == null) ? 0 : employeeNo.hashCode());
		result = prime * result + ((employeeName == null) ? 0 : employeeNo.hashCode());
		result = prime * result + ((du == null) ? 0 : employeeNo.hashCode());
		result = prime * result + ((employeeNo == null) ? 0 : employeeNo.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + ((requirementType == null) ? 0 : requirementType.hashCode());
		result = prime * result + ((projectName == null) ? 0 : projectName.hashCode());
		result = prime * result + ((projectId == null) ? 0 : projectId.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((mailExist == null) ? 0 : mailExist.hashCode());
		result = prime * result + ((ciscoMailId == null) ? 0 : ciscoMailId.hashCode());
		result = prime * result + ((justification == null) ? 0 : justification.hashCode());
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((updatedBy == null) ? 0 : updatedBy.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmailIdRequest other = (EmailIdRequest) obj;
		if (requestId == null) {
			if (other.requestId != null)
				return false;
		} else if (!requestId.equals(other.requestId))
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (du == null) {
			if (other.du != null)
				return false;
		} else if (!du.equals(other.du))
			return false;
		
		if (employeeNo == null) {
			if (other.employeeNo != null)
				return false;
		} else if (!employeeNo.equals(other.employeeNo))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (requirementType == null) {
			if (other.requirementType != null)
				return false;
		} else if (!requirementType.equals(other.requirementType))
			return false;
		if (projectName == null) {
			if (other.projectName != null)
				return false;
		} else if (!projectName.equals(other.projectName))
			return false;
		if (projectId == null) {
			if (other.projectId != null)
				return false;
		} else if (!projectId.equals(other.projectId))
			return false;
		
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		
		if (mailExist == null) {
			if (other.mailExist != null)
				return false;
		} else if (!mailExist.equals(other.mailExist))
			return false;
		if (ciscoMailId == null) {
			if (other.ciscoMailId != null)
				return false;
		} else if (!ciscoMailId.equals(other.ciscoMailId))
			return false;
		
		if (justification == null) {
			if (other.justification != null)
				return false;
		} else if (!justification.equals(other.justification))
			return false;
		
		if (createdBy == null) {
			if (other.createdBy != null)
				return false;
		} else if (!createdBy.equals(other.createdBy))
			return false;	
		
		if (updatedBy == null) {
			if (other.updatedBy != null)
				return false;
		} else if (!updatedBy.equals(other.updatedBy))
			return false;	
		
		return true;
	}
	
	

}
