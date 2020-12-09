package TourReservationSystem;
import java.util.List;
import java.util.ArrayList;

public class Archive {
	private List<TourInstanceFolder> folders = new ArrayList<TourInstanceFolder>();
	
	public Archive() {
		
	}
	
	public List <TourInstanceFolder> partcipantActivity(Object petrsonalData, Object timeInterval) {
		return null;
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
