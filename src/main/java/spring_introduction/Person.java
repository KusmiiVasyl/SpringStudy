package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Autowired
    @Qualifier("dog")
    private Pet pet;
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;

//    @Autowired
//    public Person(Pet pet) {
//        this.pet = pet;
//    }

    public void setPet(Pet pet) {
        System.out.println("Person set Pet");
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callTourPet() {
        System.out.println("Hello, my Pet.");
        pet.say();
    }
}
