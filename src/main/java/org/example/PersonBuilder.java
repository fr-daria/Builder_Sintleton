package org.example;

public class PersonBuilder {
    public String name;
    public String lastName;
    public int age;
    public String city;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        try {
            return new Person(name, lastName, age, city);
        } catch (IllegalStateException e) {
            System.out.println("Недостаточно данных");
        } catch (IllegalArgumentException d) {
            System.out.println("Недкорректные данных");
        }
        return null;
    }
}
