package com.av.repository;

import com.av.model.Person;

public interface IPersonRepository {
    Person findFirstPerson();
    String findPersonName();
}
