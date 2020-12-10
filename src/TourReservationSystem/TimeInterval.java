package TourReservationSystem;

import java.util.Date;

public class TimeInterval {
	
	private Date startDate;
	private Date endDate;
	
	TimeInterval(Date startDate, Date endDate){
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public Boolean check(Date date) {	
		return date.after(startDate) && date.before(endDate);		
	}
	
	

}
