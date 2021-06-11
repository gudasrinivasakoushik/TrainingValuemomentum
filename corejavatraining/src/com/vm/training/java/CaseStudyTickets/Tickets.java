package com.vm.training.java.CaseStudyTickets;

public class Tickets {

	private int trainNo;
	private String trainName;
	private String source;
	private String destination;
	private double ticketprice;
	public Tickets(int trainNo, String trainName, String source, String destination, double ticketprice) {
		super();
		this.trainNo = trainNo;
		this.trainName = trainName;
		this.source = source;
		this.destination = destination;
		this.ticketprice = ticketprice;
	}
	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getTicketprice() {
		return ticketprice;
	}
	public void setTicketprice(double ticketprice) {
		this.ticketprice = ticketprice;
	}
	@Override
	public String toString() {
		return "Tickets [trainNo=" + trainNo + ", trainName=" + trainName + ", source=" + source + ", destination="
				+ destination + ", ticketprice=" + ticketprice + "]";
	}
	
	public int calcPassengerFare(int age,double price)
	{
		if(age<+12)
		{
			return price=price/2;
		}
	}
	
	
}
