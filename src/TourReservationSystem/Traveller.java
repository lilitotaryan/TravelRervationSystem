package TourReservationSystem;

public class Traveller{
	private PersonalData personalData;
	
	public Traveller(PersonalData personalData){
		this.personalData = personalData;
	}

	public PersonalData getPersonalData() {
		return personalData;
	}


	public void setPersonalData(PersonalData personalData) {
		this.personalData = personalData;
	}
}

