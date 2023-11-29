package org.example;
@Service
public class PersonService {
    public Person getPerson(String name, int age, Location location) {
        return new Person(name, age, location);
    }
}
