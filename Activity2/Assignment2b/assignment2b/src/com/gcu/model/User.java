/**
 * 
 */
package com.gcu.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author zachs
 *
 */
public class User {

	@NotNull(message = "please enter your FirstName")
	@Size(min=3, max=15, message ="Your FirstName has to be between 3 and 15 characters")
	private String firstName;
	
	@NotNull(message = "please enter your LastName")
	@Size(min=3, max=15, message ="Your LastName has to be between 3 and 15 characters")
	private String lastName;
	
	@NotNull(message= "please enter your Gender")
	@Min(value = 1)
	@Max(value = 2)
	private int gender;

	/**
	 * @return the firstName
	 */
	
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public User() {
		getFirstName();
		getLastName();
		getGender();
	}

	public User(String firstName, String lastName,int Gender){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = Gender;
		
	}

	/**
	 * @return the gender
	 */
	public int getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(int gender) {
		this.gender = gender;
	}
	
}
