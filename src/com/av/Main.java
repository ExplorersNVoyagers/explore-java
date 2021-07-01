package com.av;

import com.av.bean.RepoFactory;
import com.av.repository.IPersonRepository;
import com.av.repository.PersonRepository;
import com.av.service.PersonService;
public class Main {
    public static void main(String[] args) {
        // write your code here
        //String helloStr = getName();

        RepoFactory repoFactory = new RepoFactory();
        //IPersonRepository pr = new PersonRepository();
        IPersonRepository personRepository = repoFactory.createPersonRepository();
        PersonService ps = new PersonService(personRepository);
        System.out.println(ps.findPersonName());
        PersonService ps2 = new PersonService(personRepository);
        System.out.println(ps.findFirstPerson());
    }

    private static String getName() {
        return "Alpha 101!!!";
    }
}

