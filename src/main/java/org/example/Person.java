package org.example;

public class Person {
    private final String name;
    private final String lastName;
    private final int age;
    private String city;

    public Person(String name, String lastName, int age, String city) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
    }

    public Person(String name, String lastName, String city) {
        this(name, lastName, 10, city);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        hasAge();
        return age;
    }

    public int happyBirthday(int age) {
        if (age > 0) {
            age++;
        }
        return age;
    }

    public boolean hasAge() {
        if (age < 0) {
            return false;
        }
        return true;
    }

    public String getCity() {
        hasAddress();
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean hasAddress() {
        if (city.equals(null)) {
            return false;
        }
        return true;
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder person = new PersonBuilder();
        person.setName(name);
        person.setLastName(lastName);
        person.setAge(0);
        person.setCity(city);
        return person;
    }

    @Override
    public String toString() {
        return "Персона {" + "Имя: " + name +
                " Фамилия: " + lastName +
                " Возраст:" + age +
                " Город проживаня: " + city
                + " }";
    }
}
