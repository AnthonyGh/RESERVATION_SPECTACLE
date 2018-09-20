package fr.m2iformation.persistence.entity;



import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="personType",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("person")
public class Person extends AbstractEntity{
	

	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private LocalDate birthday;
	
	@OneToOne(cascade= {CascadeType.REMOVE,CascadeType.PERSIST},fetch=FetchType.EAGER)
	@JoinColumn(name="id_address")
	private Address address;
	
	
	protected Person() {
		this(null ,null,null,null,null);
	}
	public Person( String firstName, String lastName, String email, String phoneNumber, LocalDate birthday) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", birthday=" + birthday + ", address=" + address + "]";
	}
	
	
}
