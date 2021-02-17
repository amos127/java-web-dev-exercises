package org.launchcode.java.demos.lsn6inheritance;

public class Main {

    public static void main(String [] args) {

        HouseCat ben = new HouseCat("Ben");
        Cat cat = new Cat(8.6);
//        ben.eat();
        System.out.println(ben.isTired());
        System.out.println(ben.getWeight());
        System.out.println(ben.noise());
        System.out.println(cat.noise());

    }
}
