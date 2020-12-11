package TourReservationSystem;

import java.util.HashMap;
import java.util.Map;

public class TourInstanceCatalog {

	private Map <String, TourInstance> tours = new HashMap<String, TourInstance>();
	
	public TourInstanceCatalog(){};
	
	public void addTourInstance(TourInstance tourInstance) {
		tours.put(tourInstance.getTourInstanceID(), tourInstance);
	};
	
	public void removeTourInstance(TourInstance tourInstance) {
		tours.remove(tourInstance.getTourInstanceID());		
	};
	
	public TourInstance getTourInstance(String tourInstanceID) {
		return tours.get(tourInstanceID);
	}

}
