package TourReservationSystem;
import java.util.Date;

import java.util.List;
import java.util.ArrayList;

public class TourInstanceFolder {
	private int tourID;
	private Date date;
	private String manager;
	private float averageGrade;
	private List<Record> records = new ArrayList<Record>();
	
	public TourInstanceFolder(int tourID, Date date, String manager, float averageGrade) {
		this.setAverageGrade(averageGrade);
		this.setDate(date);
		this.setManager(manager);
		this.setTourID(tourID);
	}
	
	public TourInstanceFolder getTourInstenceInInterval(TimeInterval timeInterval) {
		if (timeInterval.check(this.getDate())) {
			return this;
		}
		else {
			return null;
		}
	}
	
	public Boolean hasRecord(PersonalData personalData) {
		for (int i=0; i<records.size(); ++i){
    		if (records.get(i).hasRecord(personalData)) {
    			return true;
    		}
		}
		return false;
	}
	
	public float addAverage(float average) {
		average+=this.getAverageGrade();
		return average;
	}
	
	public float getTotalAverage(String manager) {
		float resultAverageGrade = 0;
		if (manager.equals(this.getManager())) {
			resultAverageGrade = this.addAverage(resultAverageGrade);
		}
		return resultAverageGrade;
	}
	
	public int getTourID() {
		return tourID;
	}
	
	public void setTourID(int tourID) {
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
