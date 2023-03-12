package Comparator;

import java.util.Comparator;

import model.Person;

public class CompareByDateOfBirth implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        // TODO Auto-generated method stub
        return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
    }
    
}