package com.mongodb.service;

import com.mongodb.mongodemo.Person;
import com.mongodb.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    public Person create(String firstName, String lastName, int age){
      return  personRepository.save(new Person(firstName,lastName,age));

    }

    public Person updateDetail(String firstName ,String lastName, int age){
        Person person= personRepository.findByFirstName(firstName);
        person.setLastName(lastName);
        person.setAge(age);
        return personRepository.save(person);
    }

    public Person getByAge(int age){
       return personRepository.findByAge( age);
    }

    public List<Person> getAll(){
        return personRepository.findAll();
    }

    public Person getByFirstName(String firstName){
        return personRepository.findByFirstName(firstName);
    }

    public void deleteAll(){
        personRepository.deleteAll();
    }

    public void deleteByFirstName(String firstName){
        Person person=personRepository.findByFirstName(firstName);
        personRepository.delete(person);
    }
}
