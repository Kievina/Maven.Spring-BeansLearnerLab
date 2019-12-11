package com.beans.learner.lab.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {
    List<PersonType> personList;

    public People() {
        this.personList = new ArrayList<>();
    }

    public People(List<PersonType> personList){
        this.personList = personList;
    }

    public PersonType findById(Long id) {
        PersonType result = null;

        for (PersonType personType : personList) {
            if (personType.getId().equals(id)) {
                result = personType;
            }
        }
        return result;
    }
    public void add(PersonType personType) {
        personList.add(personType);
    }

    public void addAll(Iterable<PersonType> personTypes) {
        for(PersonType personType: personTypes)
        personList.add(personType);
    }

    public List<PersonType> findAll() { return personList; }

    public void remove(PersonType personType) {
        personList.remove(personType);
    }
    public int size() {
        return personList.size();
    }
    public void clear() {
        personList.clear();
    }

    public Iterator<PersonType> iterator() {
        return personList.iterator();
    }

    public Boolean contains(PersonType personType) {
        return personList.contains(personType);
    }

    public void removeById(Long id) {
        personList.remove(findById(id));
    }
}
