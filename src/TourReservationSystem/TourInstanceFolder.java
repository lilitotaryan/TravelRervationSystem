package TourReservationSystem;
import java.util.Date;

import java.util.List;
import java.util.ArrayList;

public class TourInstanceFolder {
	private String tourID;
	private Date date;
	private String manager;
	private float averageGrade;
	private List<Record> records = new ArrayList<Record>();
	
	public TourInstanceFolder(String tourID, Date date, String manager, float averageGrade) {
		this.setAverageGrade(averageGrade);
		this.setDate(date);
		this.setManager(manager);
		this.setTourID(tourID);
	}
	
	public TourInstanceFolder getTourInstenceInInterval(TimeInterval timeInterval) {
		if (this.getDate().after(timeInterval.getStartDate()) && this.getDate().before(timeInterval.getEndDate())) {
			return this;
		}
		else {
			return null;
		}
	}
	
	public Boolean hasRecord(Object personalData) {
		for (int i=0; i<records.size(); ++i){
    		if (!records.get(i).hasRecord(personalData)) {
    			return false;
    		}
		}
		return true;
	}
	
	public float addAverage(double average) {
		averageGrade+=this.getAverageGrade();
		return averageGrade;
	}
	
	public float getTotalAverage(String manager) {
		if (manager == this.getManager()) {
			averageGrade = this.addAverage(averageGrade);
		}
		return averageGrade;
	}
	
	public String getTourID() {
		return tourID;
	}
	
	public void setTourID(String tourID) {
		this.tourID = tourID;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getManager() {
		return manager;
	}
	
	public void setManager(String manager) {
		this.manager = manager;
	}
	
	public float getAverageGrade() {
		return averageGrade;
	}
	
	public void setAverageGrade(float averageGrade) {
		this.averageGrade = averageGrade;
	}
	
    public void addRecords(Record record) 
    { 
    	records.add(record); 
    } 
       
    public void removeRecords(Record record) 
    { 
    	records.add(record); 
    } 
}
