package TourReservationSystem;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class TravelReservatonSystem {
	private Archive archive = new Archive();
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
    
    public void enterTraveller(String firstName, String lastName, String phoneNumber) {
    	assert tempTourInstance != null;
    	Traveller newTraveller = new Traveller(new PersonalData(firstName,lastName,phoneNumber));
    	tempTourInstance.addTraveller(newTraveller);
    }
   
    public void closeTourInstance(String tourInstanceID, float averageGrade){
		TourInstance tInst = tourInstanceCatalog.getTourInstance(tourInstanceID); 
		TourInstanceFolder tFolder = new TourInstanceFolder(tInst.getTourID(), tInst.getDate(), tInst.getManager(), averageGrade);
		ArrayList <Traveller> travellers = tInst.getTravellers();
		for (Traveller tr : travellers) {
			Record record = new Record(tr.getPersonalData());
			tFolder.addRecords(record);
		}
		archive.addFolders(tFolder);
		tourInstanceCatalog.removeTourInstance(tInst);
    };

    public List <TourInstanceFolder> participantActivity(String firstName, String lastName, String phoneNumber, Date start, Date end) {
    	List <TourInstanceFolder> result = archive.partcipantActivity(new PersonalData(firstName,lastName,phoneNumber), new TimeInterval(start, end));
    	if (result.isEmpty()) {
    		System.out.print("No data is found with specified input!!!");
    	}
        return result;
    }

    public float managerAssesment(String manager) {
    	float averageGrade = archive.managerAssesment(manager);
    	if (averageGrade == 0) {
    		System.out.print("No data is found with specified input!!!");
    	}
    	return averageGrade;
    }
}
