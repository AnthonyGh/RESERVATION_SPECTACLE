package fr.m2iformation.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.m2iformation.persistence.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
