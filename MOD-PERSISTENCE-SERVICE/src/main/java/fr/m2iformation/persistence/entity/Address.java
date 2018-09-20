package fr.m2iformation.persistence.entity;



import javax.persistence.Entity;

@Entity
public class Address extends AbstractEntity {
	
	

	private static final long serialVersionUID = 1L;
	private String street;
	private Integer zip;
	private String town;
	private String country;
	
	
	
	public Address() {
		this(null,null,null,null);
	
	}
	public Address( String street, Integer zip, String town, String country) {
	
		
		this.street = street;
		this.zip = zip;
		this.town = town;
		this.country = country;
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(Integer zip) {
		this.zip = zip;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", zip=" + zip + ", town=" + town + ", country=" + country + "]";
	}

	

}
