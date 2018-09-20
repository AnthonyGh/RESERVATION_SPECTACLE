package fr.m2iformation.persistence.service;

import fr.m2iformation.persistence.entity.Address;
import fr.m2iformation.persistence.entity.Person;

public interface IPersonService {
	
	public Person addNewPerson(Person p);
	public Person findPersonById(Integer id);
	public void specifyPersonAdress(Integer personId, Address address);
	public void removePerson(Integer personId);
	public void updatePerson(Person p);
}
