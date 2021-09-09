package com.casestudy.TrainSearch.models;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "trains")
public class Trains {

	private String id;
	private String trainName;
	private String trainNumber;
	private String destination;
	private String source;
	private String departuretime;
	private String arrivaltime;
	private int sleeperseatsavailable;
	private int sleeper;
	private int ac3tierseatsavailable;
	private int ac3tier;
	private int ac2tierseatsavailable;
	private int ac2tier;
	private int acfirstclassseatsavailable;
	private int acfirstclass;
	private List<String> runs;

	@Override
	public String toString() {
		return "Trains [id=" + id + ", trainName=" + trainName + ", trainNumber=" + trainNumber + ", destination="
				+ destination + ", source=" + source + ", departuretime=" + departuretime + ", arrivaltime="
				+ arrivaltime + ", sleeperseatsavailable=" + sleeperseatsavailable + ", sleeper=" + sleeper
				+ ", ac3tierseatsavailable=" + ac3tierseatsavailable + ", ac3tier=" + ac3tier
				+ ", ac2tierseatsavailable=" + ac2tierseatsavailable + ", ac2tier=" + ac2tier
				+ ", acfirstclassseatsavailable=" + acfirstclassseatsavailable + ", acfirstclass=" + acfirstclass
				+ ", runs=" + runs + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDeparturetime() {
		return departuretime;
	}

	public void setDeparturetime(String departuretime) {
		this.departuretime = departuretime;
	}

	public String getArrivaltime() {
		return arrivaltime;
	}

	public void setArrivaltime(String arrivaltime) {
		this.arrivaltime = arrivaltime;
	}

	public int getSleeperseatsavailable() {
		return sleeperseatsavailable;
	}

	public void setSleeperseatsavailable(int sleeperseatsavailable) {
		this.sleeperseatsavailable = sleeperseatsavailable;
	}

	public int getSleeper() {
		return sleeper;
	}

	public void setSleeper(int sleeper) {
		this.sleeper = sleeper;
	}

	public int getAc3tierseatsavailable() {
		return ac3tierseatsavailable;
	}

	public void setAc3tierseatsavailable(int ac3tierseatsavailable) {
		this.ac3tierseatsavailable = ac3tierseatsavailable;
	}

	public int getAc3tier() {
		return ac3tier;
	}

	public void setAc3tier(int ac3tier) {
		this.ac3tier = ac3tier;
	}

	public int getAc2tierseatsavailable() {
		return ac2tierseatsavailable;
	}

	public void setAc2tierseatsavailable(int ac2tierseatsavailable) {
		this.ac2tierseatsavailable = ac2tierseatsavailable;
	}

	public int getAc2tier() {
		return ac2tier;
	}

	public void setAc2tier(int ac2tier) {
		this.ac2tier = ac2tier;
	}

	public int getAcfirstclassseatsavailable() {
		return acfirstclassseatsavailable;
	}

	public void setAcfirstclassseatsavailable(int acfirstclassseatsavailable) {
		this.acfirstclassseatsavailable = acfirstclassseatsavailable;
	}

	public int getAcfirstclass() {
		return acfirstclass;
	}

	public void setAcfirstclass(int acfirstclass) {
		this.acfirstclass = acfirstclass;
	}

	public List<String> getRuns() {
		return runs;
	}

	public void setRuns(List<String> runs) {
		this.runs = runs;
	}

}