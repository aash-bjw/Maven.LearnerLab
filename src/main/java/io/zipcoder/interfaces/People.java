package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People <E extends Person> implements Iterable<E> {

    private List<E> personList = new ArrayList<E>();

    public People(){
        this.personList = new ArrayList<E>();
    }

    public void addPerson(E person){
        personList.add(person);
    }

    public E findById(long id){
        for(E person : personList){
            if(person.getId() == id)
            return person;
        }
        return null;
    }

    public Boolean contains(E person){
        return personList.contains(person);
    }

    public void remove(E person){
        personList.remove(person);
    }

    public void removeId(long id){
        for(E person : personList){
            if (person.getId() == id)
                personList.remove(person);

        }
    }

    public void removeAll(){
        personList.clear();
    }

    public Integer count(){
        return personList.size();
    }

    public Person[] makeArray(){
        Person[] newArr = new Person[personList.size()];
        return personList.toArray(newArr);
    }

    public Iterator<E> iterator(){
        return this.iterator();
    }

}
