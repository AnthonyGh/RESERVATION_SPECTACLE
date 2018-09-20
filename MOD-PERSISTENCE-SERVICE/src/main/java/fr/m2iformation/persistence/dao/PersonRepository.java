package fr.m2iformation.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.m2iformation.persistence.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
