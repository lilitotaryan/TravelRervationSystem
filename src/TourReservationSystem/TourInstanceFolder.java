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
	
	public List <TourInstanceFolder> getTourInstenceInInterval(Object timestamp) {
		return null;
	}
	
	public void addAverage() {
		
	}
	
	public float getTotalAverage(String manager) {
		return 0;
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
