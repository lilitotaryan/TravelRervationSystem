package TourReservationSystem;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class System {
	private List<Archive> archive = new ArrayList<Archive>();
	private TourInstance tempTourInstance = null
	private TourInstanceCatalog tourInstanceCatalog = new TourInstanceCatalog();
	
    public System() {
    }

    public void openTourInstance( double tourID, Date date, int numberOfParticipants, String manager ) {
    	
    };

	public ArrayList <TourInstance> getTourInstances(double tourID, Object timeInterval, int numberOfPersons){
		return null;
	}

    public Boolean fixTourInstace(String tourInstanceID) {
    	tempTourInstance = tourinstanceCatalog.getTourInstance(tourInstanceID)
    			
    	if(tempTourInstace == null) {
    		System.out.println("Wrong ID");
    	}
    }
    
    public void enterTraveller(String firstName,String lastName, String phoneNumber) {
    	assert tempTourInstance != null;
    	
    	Traveller newTraveller = new Traveller(firstName,lastName,phoneNumber);
    	tempTourInstace.addTraveller(newTraveller);
    }

	public void closeTourInstance(double tourInstanceID, int averageGrade){
		
	};

    public  ArrayList <TourInstanceFolder> participantActivity(Object petrsonalData, Object timeInterval) {
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
