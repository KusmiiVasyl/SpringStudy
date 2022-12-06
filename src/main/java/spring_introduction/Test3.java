package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("configApp.xml");

        Person person = context.getBean("myPerson", Person.class);
        person.callTourPet();
        System.out.println(person.getName());
        System.out.println(person.getAge());

        context.close();
    }
}
