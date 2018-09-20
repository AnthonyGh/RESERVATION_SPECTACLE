package fr.m2iformation.persistence.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.m2iformation.persistence.dao.PaymentRepository;
import fr.m2iformation.persistence.dao.ReservationRepository;
import fr.m2iformation.persistence.entity.Payment;
import fr.m2iformation.persistence.entity.Reservation;
import fr.m2iformation.persistence.service.IReservationService;

@Service
@Transactional
public class ReservationService implements IReservationService {

	@Autowired
	private PaymentRepository paymentRepository;
	
	@Autowired
	private ReservationRepository reservationRepository;

	@Override
	public Reservation makeReservation(Integer customerId, Integer sessionId, List<Integer> participantIds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void attachPayment(Integer reservationId, Payment payment) {
		Reservation reservation = reservationRepository.getOne(reservationId);
		reservation.setPayment(payment);
		reservationRepository.save(reservation);
		
	}

	@Override
	public Reservation findReservationById(Integer id) {
		
		return reservationRepository.getOne(id);
	}

	@Override
	public List<Reservation> findReservationsByCriteria(Integer customerId, Integer spectacleId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelReservation(Integer reservationId) {
		reservationRepository.deleteById(reservationId);
		
	}
}
