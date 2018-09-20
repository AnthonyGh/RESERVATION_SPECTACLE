package fr.m2iformation.persistence.entity;

import javax.persistence.Entity;

@Entity
public class Payment extends AbstractEntity {

	
	private static final long serialVersionUID = 1L;
	
	private String details ;

	public Payment() {
		
	}

	public Payment(String details) {
		super();
		this.details = details;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((details == null) ? 0 : details.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		if (details == null) {
			if (other.details != null)
				return false;
		} else if (!details.equals(other.details))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Payment [details=" + details + "]";
	}
	
	
	
	

}
