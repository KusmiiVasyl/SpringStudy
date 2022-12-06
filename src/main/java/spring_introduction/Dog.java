package spring_introduction;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet{
    public Dog() {
        System.out.println("Dog constructor is called.");
    }
    public void init(){
        System.out.println("Method init.");
    }
    public void destroy(){
        System.out.println("Method destroy.");
    }
    @Override
    public void say() {
        System.out.println("Gav-gav");
    }
}

