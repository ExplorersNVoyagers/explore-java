package com.av.bean;

import com.av.repository.IPersonRepository;
import com.av.repository.PersonMemoryRepository;
import com.av.repository.PersonRepository;

public class RepoFactory {
    public IPersonRepository createPersonRepository() {
        //return new PersonRepository();
        return  new PersonMemoryRepository();
    }
}
