package org.example.dao;

import org.example.model.Person;

public interface PersonDao {
    void save(Person person);

    Person findPersonById(int id);

    void updatePerson(int id);

    boolean delete(int id);
}
