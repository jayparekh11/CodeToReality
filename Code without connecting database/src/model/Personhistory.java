/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author jaypa
 */
public class Personhistory 
{
    
    
    private ArrayList<Person> personlist;
    
    public Personhistory() 
    {
       // ArrayList<Person>
        this.personlist = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonlist() {
        return personlist;
    }

    public void setPersonlist(ArrayList<Person> personlist) {
        this.personlist = personlist;
    }

    public Person addPerson()
    {
        Person person = new Person();
        personlist.add(person);
        return person; 
    }
    
    public void deletePerson(Person person)
    {
        personlist.remove(person);
    }
    
    public Person searchPerson(String nuid)
    {
        for(Person person : personlist)
        {
            if (person.getNuid().equals(nuid))
            {
                return person;
            }
        }
        return null;
        
    }
}
