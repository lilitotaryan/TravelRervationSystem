package TourReservationSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Tour {
    private int tourID;
    private String descriptoin;
    private int duration;
    private Map <Integer, ArrayList <TourInstance>> tourInst = new HashMap <Integer, ArrayList <TourInstance>>();
	
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
	
	public void addTourInst(int tourID, TourInstance tourInstance) {
		if(tourInst.get(tourID) != null) {
			tourInst.get(tourID).add(tourInstance);
		}
		else {
			ArrayList <TourInstance> tInst = new ArrayList <TourInstance>();
			tInst.add(tourInstance);
			tourInst.put(tourID, tInst);
		}		
	}
		
	public Map <Integer, ArrayList <TourInstance>> getTourInst() {
		return tourInst;
	}
	
	public String toString() {
	    return (    	" Description: "+ this.getDescriptoin() +
	                    " Duration in minutes: " + this.getDuration());
	      	   }
	
	
}
