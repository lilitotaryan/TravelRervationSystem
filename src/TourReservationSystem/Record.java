package TourReservationSystem;

public class Record {
	private Object personalData;
	
	public Record(Object personalData) {
		this.setPersonalData(personalData);
	}

	public Boolean check(Object personalData) {
		return personalData == this.getPersonalData();
	}
	
	public Object getPersonalData() {
		return personalData;
	}

	public void setPersonalData(Object personalData) {
		this.personalData = personalData;
	}
	
	public Boolean hasRecord(Object personalData) {
		return check(personalData);
	}
}
