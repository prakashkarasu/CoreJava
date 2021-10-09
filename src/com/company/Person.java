package com.company;

public class Person {
    protected boolean male;
    protected String name;
    protected Phone phone;
    protected int yob;

    public Person(String name, boolean male, int yob){
        this.name = name ;
        this.male = male ;
        this.yob = yob;
    }

    public String getName()
    {
        return name;
    }

    public Phone getPhone()
    {
        return phone;
    }

    public int getYob()
    {
        return yob;
    }
    public boolean isMale()
    {
        return male;
    }

    public void setPhone(Phone phone){
        this.phone = phone ;
    }
}

