package com.casestudy.BookingService.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "booking")
public class Booking {

	private String id;
	private int bookingid;
	private String trainnumber;
	private String trainname;
	private String name;
	private int age;
	private String gender;
	private long aadharnumber;
	private int pnr;
	private String seatnumber;
	private String updatedtime;
	private String seatclass;
	private int purchaseprice;
	private String ticketstatus;

	@Override
	public String toString() {
		return "Booking [id=" + id + ", bookingid=" + bookingid + ", trainnumber=" + trainnumber + ", trainname="
				+ trainname + ", name=" + name + ", age=" + age + ", gender=" + gender + ", aadharnumber="
				+ aadharnumber + ", pnr=" + pnr + ", seatnumber=" + seatnumber + ", updatedtime= " + updatedtime
				+ ",seatclass=" + seatclass + ", purchaseprice=" + purchaseprice + ", ticketstatus=" + ticketstatus
				+ "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getBookingid() {
		return bookingid;
	}

	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}

	public String getTrainnumber() {
		return trainnumber;
	}

	public void setTrainnumber(String trainnumber) {
		this.trainnumber = trainnumber;
	}

	public String getTrainname() {
		return trainname;
	}

	public void setTrainname(String trainname) {
		this.trainname = trainname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getAadharnumber() {
		return aadharnumber;
	}

	public void setAadharnumber(long aadharnumber) {
		this.aadharnumber = aadharnumber;
	}

	public int getPnr() {
		return pnr;
	}

	public void setPnr(int pnr) {
		this.pnr = pnr;
	}

	public String getSeatnumber() {
		return seatnumber;
	}

	public void setSeatnumber(String seatnumber) {
		this.seatnumber = seatnumber;
	}

	public String getUpdatedtime() {
		return updatedtime;
	}

	public void setUpdatedtime(String updatedtime) {
		this.updatedtime = updatedtime;
	}

	public String getSeatclass() {
		return seatclass;
	}

	public void setSeatclass(String seatclass) {
		this.seatclass = seatclass;
	}

	public int getPurchaseprice() {
		return purchaseprice;
	}

	public void setPurchaseprice(int purchaseprice) {
		this.purchaseprice = purchaseprice;
	}

	public String getTicketstatus() {
		return ticketstatus;
	}

	public void setTicketstatus(String ticketstatus) {
		this.ticketstatus = ticketstatus;
	}

}
