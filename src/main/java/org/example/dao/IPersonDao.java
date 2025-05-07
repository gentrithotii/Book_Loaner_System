package org.example.dao;

import org.example.model.Person;

public interface IPersonDao {
    void save(Person person);

    Person findPersonById(int id);

    void updatePerson(int id);

    boolean delete(int id);
}
