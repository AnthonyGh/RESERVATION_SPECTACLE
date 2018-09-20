package fr.m2iformation.persistence.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Reservation extends AbstractEntity{

	
	private static final long serialVersionUID = 1L;

	private LocalDate date;
	
	private Double globalAmount;
	
	@OneToOne(fetch=FetchType.EAGER,cascade= {CascadeType.REMOVE})
	@JoinColumn(name="id_payment",unique=true)
	private Payment payment;

	public Reservation(LocalDate date, Double globalAmount) {
		super();
		this.date = date;
		this.globalAmount = globalAmount;
	}

	public Reservation() {
	
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getGlobalAmount() {
		return globalAmount;
	}

	public void setGlobalAmount(Double globalAmount) {
		this.globalAmount = globalAmount;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((globalAmount == null) ? 0 : globalAmount.hashCode());
		result = prime * result + ((payment == null) ? 0 : payment.hashCode());
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
		Reservation other = (Reservation) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (globalAmount == null) {
			if (other.globalAmount != null)
				return false;
		} else if (!globalAmount.equals(other.globalAmount))
			return false;
		if (payment == null) {
			if (other.payment != null)
				return false;
		} else if (!payment.equals(other.payment))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Reservation [date=" + date + ", globalAmount=" + globalAmount + ", payment=" + payment + "]";
	}
	
	
	
	
	
	
}
