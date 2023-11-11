package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name;
    private int age;

    public Person() {
        this("", 0 );
    }

    public Person(int age) {

        this.age = 0;
    }

    public Person(String name) {
         this.name = name;
    }

    public Person(String name, int age) {
              this.name = name;
              this.age = 0;
    }

    public void setName(String name) {
        this.name =name;
    }

    public void setAge(int age) {
        this.age= age;
    }

    public String getName() {
        
        return name;
    }

    public Integer getAge() {
        int age = 5;
        return age;
    }
}
