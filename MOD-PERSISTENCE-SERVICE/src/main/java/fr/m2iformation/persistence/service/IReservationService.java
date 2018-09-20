package fr.m2iformation.persistence.service;

import java.util.List;

import fr.m2iformation.persistence.entity.Payment;
import fr.m2iformation.persistence.entity.Reservation;

public interface IReservationService {
	
	public Reservation makeReservation(Integer customerId,Integer sessionId,List<Integer> participantIds);
	public void attachPayment(Integer reservationId,Payment payment);
	public Reservation findReservationById(Integer id);
	public List<Reservation> findReservationsByCriteria(Integer customerId,Integer spectacleId);
	public void cancelReservation(Integer reservationId);

}
