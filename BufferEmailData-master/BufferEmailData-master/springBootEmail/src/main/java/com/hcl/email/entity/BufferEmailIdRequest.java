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
//@Table(name = "bufferEmailIdRequest")
public class BufferEmailIdRequest /* implements Serializable */{


	//private static final long serialVersionUID = 1L;
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name="BufferRequestId")
	private Long bufferRequestId;
	//@Column(name="EmpName")
	private String empName;
	//@Column(name="DisplayName")
	private String displayName;
	//@Column(name = "Band")
	private String band;
	//@Column(name="Designation")
	private String designation;
	//@Column(name="EmpNo")
	private Integer empNo;
	//@Column(name="HCLEmailId")
	private String hCLEmailId;
	//@Column(name="EmpType")
	private String empType;
	//@Column(name="CiscoEmailId")
	private String ciscoEmailId;
	//@Column(name="CiscoMailId")
	private String ciscoMailId;
	//@Column(name="PlannedBillableProject")
	private String plannedBillableProject;
	//@Column(name="WorkLocation")
	private String workLocation;
	//@Column(name="Duration")
	private String duration;
	//@Column(name="ExpectedBillingDate")
	private String expectedBillingDate;
	//@Column(name="Justification")
	private String justification;
	//@Column(name="CreatedDate")
	private Date createdDate;
	//@Column(name="CreatedBy")
	private String createdBy;	
	//@Column(name="ManagerComments")
	private String managerComments;
	//@Column(name="status")
	private Integer status;
	//@Column(name="comments")	
	private String comments;
	//@Column(name="UpdatedBy")
	private String updatedBy;
	
	
	public Long getBufferRequestId() {
		return bufferRequestId;
	}
	public void setBufferRequestId(Long bufferRequestId) {
		this.bufferRequestId = bufferRequestId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	public String gethCLEmailId() {
		return hCLEmailId;
	}
	public void sethCLEmailId(String hCLEmailId) {
		this.hCLEmailId = hCLEmailId;
	}
	public String getEmpType() {
		return empType;
	}
	public void setEmpType(String empType) {
		this.empType = empType;
	}
	public String getCiscoEmailId() {
		return ciscoEmailId;
	}
	public String getCiscoMailId() {
		return ciscoMailId;
	}
	public void setCiscoEmailId(String ciscoEmailId) {
		this.ciscoEmailId = ciscoEmailId;
	}
	public void setCiscoMailId(String ciscoMailId) {
		this.ciscoMailId = ciscoMailId;
	}
	public String getPlannedBillableProject() {
		return plannedBillableProject;
	}
	public void setPlannedBillableProject(String plannedBillableProject) {
		this.plannedBillableProject = plannedBillableProject;
	}
	public String getWorkLocation() {
		return workLocation;
	}
	public void setWorkLocation(String workLocation) {
		this.workLocation = workLocation;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getExpectedBillingDate() {
		return expectedBillingDate;
	}
	public void setExpectedBillingDate(String expectedBillingDate) {
		this.expectedBillingDate = expectedBillingDate;
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
	public String getManagerComments() {
		return managerComments;
	}
	public void setManagerComments(String managerComments) {
		this.managerComments = managerComments;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	
	
	@Override
	public String toString() {
		return "BufferEmailIdRequest [bufferRequestId=" + bufferRequestId + ", empName=" + empName + ",displayName=" + displayName + ", band=" + band
				+ ", designation=" + designation + ", empNo=" + empNo + ", hCLEmailId=" + hCLEmailId + ", empType="
				+ empType + ", ciscoEmailId=" + ciscoEmailId + ",ciscoMailId=" + ciscoMailId + ", plannedBillableProject=" + plannedBillableProject
				+ ", workLocation=" + workLocation + ", duration=" + duration + ", expectedBillingDate="
				+ expectedBillingDate + ", justification=" + justification + ", createdDate=" + createdDate
				+ ", createdBy=" + createdBy + ",managerComments="+ managerComments +",status="+status+",comments="+comments+",updatedBy="+updatedBy+"]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((band == null) ? 0 : band.hashCode());
		result = prime * result + ((bufferRequestId == null) ? 0 : bufferRequestId.hashCode());
		result = prime * result + ((ciscoEmailId == null) ? 0 : ciscoEmailId.hashCode());
		result = prime * result + ((ciscoMailId == null) ? 0 : ciscoMailId.hashCode());
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + ((displayName == null) ? 0 : displayName.hashCode());
		result = prime * result + ((empNo == null) ? 0 : empNo.hashCode());
		result = prime * result + ((empType == null) ? 0 : empType.hashCode());
		result = prime * result + ((expectedBillingDate == null) ? 0 : expectedBillingDate.hashCode());
		result = prime * result + ((hCLEmailId == null) ? 0 : hCLEmailId.hashCode());
		result = prime * result + ((justification == null) ? 0 : justification.hashCode());
		result = prime * result + ((plannedBillableProject == null) ? 0 : plannedBillableProject.hashCode());
		result = prime * result + ((workLocation == null) ? 0 : workLocation.hashCode());
		result = prime * result + ((managerComments == null) ? 0 : managerComments.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
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
		BufferEmailIdRequest other = (BufferEmailIdRequest) obj;
		if (band == null) {
			if (other.band != null)
				return false;
		} else if (!band.equals(other.band))
			return false;
		if (bufferRequestId == null) {
			if (other.bufferRequestId != null)
				return false;
		} else if (!bufferRequestId.equals(other.bufferRequestId))
			return false;
		if (ciscoEmailId == null) {
			if (other.ciscoEmailId != null)
				return false;
		} else if (!ciscoEmailId.equals(other.ciscoEmailId))
			return false;
		if (ciscoMailId == null) {
			if (other.ciscoMailId != null)
				return false;
		} else if (!ciscoMailId.equals(other.ciscoMailId))
			return false;
		if (createdBy == null) {
			if (other.createdBy != null)
				return false;
		} else if (!createdBy.equals(other.createdBy))
			return false;
		if (createdDate == null) {
			if (other.createdDate != null)
				return false;
		} else if (!createdDate.equals(other.createdDate))
			return false;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (displayName == null) {
			if (other.displayName != null)
				return false;
		} else if (!displayName.equals(other.displayName))
			return false;
		if (empNo == null) {
			if (other.empNo != null)
				return false;
		} else if (!empNo.equals(other.empNo))
			return false;
		if (empType == null) {
			if (other.empType != null)
				return false;
		} else if (!empType.equals(other.empType))
			return false;
		if (expectedBillingDate == null) {
			if (other.expectedBillingDate != null)
				return false;
		} else if (!expectedBillingDate.equals(other.expectedBillingDate))
			return false;
		if (hCLEmailId == null) {
			if (other.hCLEmailId != null)
				return false;
		} else if (!hCLEmailId.equals(other.hCLEmailId))
			return false;
		if (justification == null) {
			if (other.justification != null)
				return false;
		} else if (!justification.equals(other.justification))
			return false;
		if (plannedBillableProject == null) {
			if (other.plannedBillableProject != null)
				return false;
		} else if (!plannedBillableProject.equals(other.plannedBillableProject))
			return false;
		if (workLocation == null) {
			if (other.workLocation != null)
				return false;
		} else if (!workLocation.equals(other.workLocation))
			return false;
		if (managerComments == null) {
			if (other.managerComments != null)
				return false;
		} else if (!managerComments.equals(other.managerComments))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (updatedBy == null) {
			if (other.updatedBy != null)
				return false;
		} else if (!updatedBy.equals(other.updatedBy))
			return false;
		return true;
	}
	
	

}
