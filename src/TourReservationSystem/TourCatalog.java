package TourReservationSystem;

import java.util.HashMap;
import java.util.Map;

public class TourCatalog {
	
	private Map <Integer, Tour> tours = new HashMap <Integer, Tour>();
	
	public TourCatalog() {
		for (int i=0;i<=10; i++) {
			this.addTours(new Tour("description" + i, i*60, i)); 
		} 
	}
	
	public void addTours(Tour tour) {
		tours.put(tour.getTourID(), tour);
	}
	
}
