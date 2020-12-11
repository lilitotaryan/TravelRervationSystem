package TourReservationSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class TourInstance {

	private String tourInstanceID;
	private Date date;
	private int numberOfVacancies;
	private String manager;
	private int tourID;
	private ArrayList<Traveller> travellers = new ArrayList<Traveller>();
  
	public int getTourID() {
		return tourID;
	}

	public void setTourID(int tourID) {
		this.tourID = tourID;
	}

	public ArrayList<Traveller> getTravellers() {
		return travellers;
	}

	public void setTravellers(ArrayList<Traveller> travellers) {
		this.travellers = travellers;
	}

	public String getTourInstanceID() {
		return tourInstanceID;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public int getNumberOfVacancies() {
		return numberOfVacancies;
	}
	
	public void setNumberOfVacancies(int numberOfVacancies) {
		this.numberOfVacancies = numberOfVacancies;
	}
	
	public String getManager() {
		return manager;
	}
	
	public void setManager(String manager) {
		this.manager = manager;
	}
	
	public void addTraveller(Traveller traveller) {
		travellers.add(traveller);
	}
	
	TourInstance(int tourID, Date date, int numberOfVacancies, String manager){
		this.tourID = tourID;
		this.tourInstanceID = generateID();
		this.date = date;
		this.numberOfVacancies = numberOfVacancies;
		this.manager = manager;
	};
	
	public Boolean match(Object timeInterval, int numberOfPersons){
		return null;
	};
	
	private String generateID(){
		return UUID.randomUUID().toString();
	};
	
	public String toString() {
	    return (		"ID: " + this.getTourInstanceID() +
	    				" Date: "+ this.getDate() +
	                    " Number of Vacancies: "+ this.getNumberOfVacancies() +
	                    " Manager : " + this.getManager());
	      	   }

}

