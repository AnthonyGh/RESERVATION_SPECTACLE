package fr.m2iformation.persistence.service.impl;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.m2iformation.persistence.entity.Address;
import fr.m2iformation.persistence.entity.Person;
import fr.m2iformation.persistence.service.IPersonService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {fr.m2iformation.config.AppConfig.class})
public class PersonServiceTest {

	@Autowired
	private IPersonService service;
	
	@Test
	public void testAddNewPerson() {
		Person p = new Person("doe", "john", "johnDoe@gmail.com", "0625478963", LocalDate.of(1980, 02, 03));
		service.addNewPerson(p);
		Assert.assertNotNull(p.getId());
	}

	@Test
	public void testFindPersonById() {
		Assert.assertNotNull(service.findPersonById(1));
	}

	@Test
	public void testSpecifyPersonAdress() {
		Address address = new Address("place de l'ellipse", 92000, "Nanterre", "France");
		Person person = service.findPersonById(1);
		Assert.assertNotNull("Objet Person null",person);
		service.specifyPersonAdress(person.getId(), address);
		Assert.assertNotNull("Objet Address non attaché",service.findPersonById(1).getAddress());
		
	}

	@Test
	public void testRemovePerson() {
		
	}

	@Test
	public void testUpdatePerson() {
		
	}

}
