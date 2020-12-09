package TourReservationSystem;

public class Record {
	private Object personalData;
	
	public Record(Object personalData) {
		this.setPersonalData(personalData);
	}

	public Boolean hasRecord(Object personalData) {
		return true;
	}

	public Boolean check(Object personalData) {
		return true;
	}
	
	public Object getPersonalData() {
		return personalData;
	}

	public void setPersonalData(Object personalData) {
		this.personalData = personalData;
	}
}
