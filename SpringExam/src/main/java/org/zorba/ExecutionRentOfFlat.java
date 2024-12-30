package org.zorba;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExecutionRentOfFlat {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");

        Property property = applicationContext.getBean(Property.class);
        RentOfFlat rentOfFlat = applicationContext.getBean(RentOfFlat.class);
        RentOfOneBHKFlat rentOfOneBHKFlat = applicationContext.getBean(RentOfOneBHKFlat.class);
        System.out.println(rentOfOneBHKFlat.calculateRentOfFlat(5));

       SelfOwnedTwoBHKFlat selfOwnedTwoBHKFlat = applicationContext.getBean(SelfOwnedTwoBHKFlat.class);
        System.out.println( selfOwnedTwoBHKFlat.finalPriceOfFlat());


    }
}
