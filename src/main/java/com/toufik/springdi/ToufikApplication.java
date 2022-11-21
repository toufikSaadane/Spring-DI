package com.toufik.springdi;

import com.toufik.springdi.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.toufik.springdi", "com.toufik.pets"})
public class ToufikApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ToufikApplication.class, args);

        System.out.println("==== ApplicationContext");
        MyController myController = context.getBean(MyController.class);
        String hi_folks = myController.sayHello();
        System.out.println(hi_folks);

        System.out.println("==== property");
        PropertyInjectionController propertyInjectionController = context.getBean(PropertyInjectionController.class);
        System.out.println(propertyInjectionController.getGreetingService());

        System.out.println("==== setter");
        SetterInjectedController setterInjectedController = context.getBean(SetterInjectedController.class);
        System.out.println(setterInjectedController.getGreetingService());

        System.out.println("==== Constructor");
        ConstructorInjectedController constructorInjectedController = context.getBean(ConstructorInjectedController.class);
        System.out.println(constructorInjectedController.getGreetingService());

        System.out.println("==== PrimaryBean");
        PrimaryBeanController primaryBeanController = context.getBean(PrimaryBeanController.class);
        System.out.println(primaryBeanController.getGreetingService());

        System.out.println("==== Profile");
        ProfileInjectionController profileInjectionController = context.getBean(ProfileInjectionController.class);
        System.out.println(profileInjectionController.getGreetingService());

        System.out.println("==== Profile Exercise");
        PetController petController = context.getBean(PetController.class);
        System.out.println(petController.getGreetingService());
    }

}
