package fr.m2iformation.persistence.entity;



import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("customer")
public class Customer extends Person {
	
	private static final long serialVersionUID = 1L;
	private Integer password;
	private String username;
	
	
	public Customer() {
		this(null,null);
	}
	
	
	
	public Customer(Integer password, String username) {
		super();
		this.password = password;
		this.username = username;
	}





	public Integer getPassword() {
		return password;
	}
	public void setPassword(Integer password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	

}
