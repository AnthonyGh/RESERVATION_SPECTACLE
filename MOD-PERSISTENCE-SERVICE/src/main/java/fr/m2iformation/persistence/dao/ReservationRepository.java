package fr.m2iformation.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.m2iformation.persistence.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

}
