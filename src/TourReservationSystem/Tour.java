package TourReservationSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Tour {
    private int tourID;
    private String descriptoin;
    private int duration;
    private Map <String, ArrayList <TourInstance>> tourInst = new HashMap <String, ArrayList <TourInstance>>();
	
	Tour(){};
	public Tour(String description, int duration, int tourID) {
		this.setDescriptoin(description);
		this.setDuration(duration);
		this.setTourID(tourID);
    }

	public int getTourID() {
		return tourID;
	}

	public void setTourID(int tourID) {
		this.tourID = tourID;
	}

	public String getDescriptoin() {
		return descriptoin;
	}

	public void setDescriptoin(String descriptoin) {
		this.descriptoin = descriptoin;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public void addTourInst(String tourID, TourInstance tourInstance) {
		ArrayList <TourInstance> tInst = new ArrayList <TourInstance>();
		tInst.add(tourInstance);
		tourInst.put(tourID, tInst);		
	}
	
	public void removeTourInst() {
		
	}
	
	public Map <String, ArrayList <TourInstance>> getTourInst() {
		return tourInst;
	}
	
	
}
