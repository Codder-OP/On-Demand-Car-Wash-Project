package com.op.VO;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
	private int cid;     //Customer ID
	@Id
	private int oid;  //Order ID
	private String carNo;
	private String plan;
	private int cast;
	private String paymentType;
	private String paymentStatus;
	private String bookedSlot;  //Booked slot
	private String serviceStatus; //Either washed or Active
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public int getCast() {
		return cast;
	}
	public void setCast(int cast) {
		this.cast = cast;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getBookedSlot() {
		return bookedSlot;
	}
	public void setBookedSlot(String bookedSlot) {
		this.bookedSlot = bookedSlot;
	}
	public String getServiceStatus() {
		return serviceStatus;
	}
	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}
	

}
