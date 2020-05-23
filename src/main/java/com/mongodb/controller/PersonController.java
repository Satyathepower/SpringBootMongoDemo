package com.mongodb.controller;

import com.mongodb.mongodemo.Person;
import com.mongodb.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/create")
    public String create(@RequestParam String firstName, @RequestParam String lastName, @RequestParam int age){
      Person person= personService.create(firstName,lastName,age);
      return person.toString();
    }

    @RequestMapping("/get")
    public String getPersonByFirstName(@RequestParam String firstName){
       Person person= personService.getByFirstName(firstName);
       return person.toString();
    }

    @RequestMapping("/getAll")
    public List<Person> getAllPerson(){
      return  personService.getAll();
    }

    @RequestMapping("/update")
    public String updatePerson(@RequestParam String firstName, @RequestParam String lastName, @RequestParam int age){
       Person person= personService.updateDetail(firstName,lastName,age);
       return person.toString();
    }

}
