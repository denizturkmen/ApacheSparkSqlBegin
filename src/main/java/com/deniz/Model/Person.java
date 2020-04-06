package com.deniz.Model;

import java.io.Serializable;

public class Person implements Serializable {

    public String name;
    public String city;
    public String dateofBirth;
    public Long age;

    public Person() {
    }

    public Person(String name, String city, String dateofBirth, Long age) {
        this.name = name;
        this.city = city;
        this.dateofBirth = dateofBirth;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", dateofBirth='" + dateofBirth + '\'' +
                ", age=" + age +
                '}';
    }
}
