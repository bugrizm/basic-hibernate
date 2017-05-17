package com.bugra.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Address
{
    @Id
    @GeneratedValue
    private Integer id;

    private String address;

    @ManyToOne(cascade = CascadeType.ALL)
    private Person person;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public Person getPerson()
    {
        return person;
    }

    public void setPerson(Person person)
    {
        this.person = person;
    }
}
