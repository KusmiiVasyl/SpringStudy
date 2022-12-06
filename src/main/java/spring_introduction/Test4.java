package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("configApp2.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person.getName());
        System.out.println(person.getAge());

        context.close();
    }
}
