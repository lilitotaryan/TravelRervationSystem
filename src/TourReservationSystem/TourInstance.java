package TourReservationSystem;

import java.util.Date;

public class TourInstance {

	private String tourInstanceID;
	private Date date;
	private int numberOfVacancies;
	private String manager;
	private List<Traveller> travellers = new ArrayList<Traveller>();
	
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
	
	TourInstance(Date date, int numberOfVacancies, String manager){
		this.tourInstanceID = generateID();
		this.date = date;
		this.numberOfVacancies = numberOfVacancies;
		this.manager = manager;
	};
	
	public Boolean match(Object timeInterval, int numberOfPersons){
		return null;
	};
	
	private String generateID(){
		return "";
	};

}

