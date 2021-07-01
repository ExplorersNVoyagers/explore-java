package com.av.service;

import com.av.bean.RepoFactory;
import com.av.model.Person;
import com.av.repository.IPersonRepository;
import com.av.repository.PersonRepository;

public class PersonService {
    private String name;
    private IPersonRepository personRepository;

    public PersonService(IPersonRepository personRepository) {
//        RepoFactory repoFactory = new RepoFactory();
        this.personRepository = personRepository;
    }

//    public PersonService(String name) {
//        RepoFactory repoFactory = new RepoFactory();
//        personRepository = repoFactory.createPersonRepository();
//        this.name = name;
//    }

    public String getName() {
//        return "Alpha 101!!!";
        return name;
    }

    public String findPersonName() {
        String personName = personRepository.findPersonName();
        return personName;
    }

    public Person findFirstPerson() {
        return personRepository.findFirstPerson();
    }

//    public void setName(String name) {
//        this.name = name;
//    }
}
