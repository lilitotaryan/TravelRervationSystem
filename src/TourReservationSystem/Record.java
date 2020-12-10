package TourReservationSystem;

public class Record {
	private PersonalData personalData;
	
	public Record(PersonalData personalData) {
		this.setPersonalData(personalData);
	}

	public Boolean check(PersonalData personalData) {
		return personalData.equalsEachOther(this.getPersonalData());
	}
	
	public PersonalData getPersonalData() {
		return this.personalData;
	}

	public void setPersonalData(PersonalData personalData) {
		this.personalData = personalData;
	}
	
	public Boolean hasRecord(PersonalData personalData) {
		return check(personalData);
	}
}
