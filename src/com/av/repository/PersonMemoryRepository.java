package com.av.repository;

import com.av.model.Person;

public class PersonMemoryRepository implements  IPersonRepository {
    @Override
    public Person findFirstPerson() {
        return new Person();
    }

    @Override
    public String findPersonName() {
        return "memory first name";
    }
}
