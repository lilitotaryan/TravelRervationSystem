package TourReservationSystem;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class TravelSystem {
	private List<Archive> archive = new ArrayList<Archive>();
	private TourInstanceCatalog tourInstCat = new TourInstanceCatalog();
	private ArrayList <TourInstance> tourInst = new ArrayList <TourInstance>();
	private Tour tour = new Tour();
	
	
    public TravelSystem() {
    }

    public void openTourInstance(String tourID, Date date, int numberOfParticipants, String manager) {
    	TourInstance tourInst = new TourInstance(date, numberOfParticipants, manager);
    	tourInstCat.addTourInstance(tourInst);
    	tour.addTourInst(tourID, tourInst);
    };

	public ArrayList <TourInstance> getTourInstances(String tourID, TimeInterval timeInterval, int numberOfPersons) {
		 ArrayList <TourInstance> tourInstances = tour.getTourInst().get(tourID);
		 System.out.println(tourInstances);
//		 for (TourInstance t : tourInstances) {
//			 if(t.getNumberOfVacancies() >= numberOfPersons && timeInterval.check(t.getDate())) {
//				 tourInst.add(t);
//			 }
//		 }
//		for (TourInstance tInst : tourInst) {
//			System.out.println(tInst);
//		}
		return tourInst;
	}

    public Boolean fixTourInstace(int tourInstanceID) {
        return true;
    }
    
    public void enterTraveller(Object personalData) {
   
    }

	public void closeTourInstance(double tourInstanceID, int averageGrade){
		
	};

    public  ArrayList <TourInstanceFolder> participantActivity(Object petrsonalData, TimeInterval timeInterval) {
        return null;
    }

    public float managerAssesment(String manager) {
        return 0;
    }
    
    public void addArchive(Archive arch) 
    { 
    	archive.add(arch); 
    } 
       
    public void removeArchive(Archive arch) 
    { 
    	archive.remove(arch); 
    } 
}
