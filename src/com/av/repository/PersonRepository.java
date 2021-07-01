package com.av.repository;

import com.av.model.Person;

public class PersonRepository implements  IPersonRepository {
    public String findPersonName() {
        //talk to db
        // get first person name
        return "First Person Name";
    }

    public Person findFirstPerson() {
        //talk to db
        // get first person name

        Person p = new Person();
        p.setFirstName("Supriya");
        p.setLastName("Chukka");
        p.setCountry("India");
        return p;
    }
}
