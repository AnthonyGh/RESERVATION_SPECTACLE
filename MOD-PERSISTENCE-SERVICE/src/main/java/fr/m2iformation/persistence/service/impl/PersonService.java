package fr.m2iformation.persistence.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.m2iformation.persistence.dao.PersonRepository;
import fr.m2iformation.persistence.entity.Address;
import fr.m2iformation.persistence.entity.Person;
import fr.m2iformation.persistence.service.IPersonService;


@Service
@Transactional
public class PersonService implements IPersonService {
	
	@Autowired
	private PersonRepository personRepository;

	@Override
	public Person addNewPerson(Person p) {
		
		return personRepository.save(p);
	}

	@Override
	public Person findPersonById(Integer id) {
		Person p = personRepository.getOne(id);
		return p;
	}

	@Override
	public void specifyPersonAdress(Integer personId, Address address) {
		Person p = this.findPersonById(personId);
		p.setAddress(address);
		personRepository.save(p);
	}

	@Override
	public void removePerson(Integer personId) {
		personRepository.deleteById(personId);
		
	}

	@Override
	public void updatePerson(Person p) {
		personRepository.save(p);
		
	}

}
