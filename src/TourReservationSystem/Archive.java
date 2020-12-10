package TourReservationSystem;
import java.util.List;
import java.util.ArrayList;

public class Archive {
	private List<TourInstanceFolder> folders = new ArrayList<TourInstanceFolder>();
	
	public Archive() {
		
	}
	
	public List <TourInstanceFolder> partcipantActivity(Object personalData, TimeInterval timeInterval) {
		List<TourInstanceFolder> tourInstances = new ArrayList<TourInstanceFolder>();
    	for (int i=0; i<folders.size(); ++i){
    		if (folders.get(i).getTourInstenceInInterval(timeInterval) != null) {
    			if (folders.get(i).hasRecord(personalData)) {
    				tourInstances.add(folders.get(i));
    			}
    		}
    	}
    	return tourInstances;
	}
	
    public float managerAssesment(String manager) {
    	float totalAverage = 0;
    	for (int i=0; i<folders.size(); ++i){
    		totalAverage+= folders.get(i).getTotalAverage(manager);
    	}
    	
        return this.calculateMean(totalAverage);
    }
    
    public float calculateMean(float totalAverage) {
    	return totalAverage/folders.size();
    }
	
    public void addFolders(TourInstanceFolder folder) 
    { 
    	folders.add(folder); 
    } 
       
    public void removeFolders(TourInstanceFolder folder) 
    { 
    	folders.remove(folder); 
    } 
}
