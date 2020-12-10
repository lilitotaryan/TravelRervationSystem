package TourReservationSystem;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class TravelReservatonSystem {
	private List<Archive> archive = new ArrayList<Archive>();
	private TourInstance tempTourInstance = null;
	private ArrayList <TourInstance> tourInst = new ArrayList <TourInstance>();
	private TourInstanceCatalog tourInstanceCatalog = new TourInstanceCatalog();
	private Tour tour = new Tour();
	
    public TravelReservatonSystem() {
    }

    public void openTourInstance(String tourID, Date date, int numberOfParticipants, String manager) {
    	TourInstance tourInst = new TourInstance(date, numberOfParticipants, manager);
    	tourInstanceCatalog.addTourInstance(tourInst);
    	tour.addTourInst(tourID, tourInst);
    };

	public ArrayList <TourInstance> getTourInstances(String tourID, TimeInterval timeInterval, int numberOfPersons) {
		 ArrayList <TourInstance> tourInstances = tour.getTourInst().get(tourID);
		 for (TourInstance t : tourInstances) {
			 if(t.getNumberOfVacancies() >= numberOfPersons && timeInterval.check(t.getDate())) {
				 tourInst.add(t);
			 }
		 }
		for (TourInstance tInst : tourInst) {
			System.out.println(tInst);
		}
		return tourInst;
	}

    public void fixTourInstace(String tourInstanceID) {
    	tempTourInstance = tourInstanceCatalog.getTourInstance(tourInstanceID);
    	if(tempTourInstance == null) {
    		System.out.println("Wrong ID");
    	}
    }
    
    public void enterTraveller(String firstName,String lastName, String phoneNumber) {
    	assert tempTourInstance != null;
    	Traveller newTraveller = new Traveller(new PersonalData(firstName,lastName,phoneNumber));
    	tempTourInstance.addTraveller(newTraveller);
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
