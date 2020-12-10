package TourReservationSystem;

import java.util.Objects;

public class PersonalData {
	private String firstName;
	private String lastName;
	private String phoneNumber;
	
	public PersonalData(String firstName, String lastName, String phoneNumber){
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}
	
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setLastName(String lastName){
		this.lastName = firstName;
	}
	
	public String getPhoneNumber(){
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	public Boolean equalsEachOther(PersonalData personalData) {
		return (this.getFirstName().equals(personalData.getFirstName()) 
				&& this.getLastName().equals(personalData.getLastName()) 
				&& this.getPhoneNumber().equals(personalData.getPhoneNumber()));
	}
}
