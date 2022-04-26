package com.tut7;

public class BagTest {
    public static void main(String[] args) {
        BagInterface<String> city = new ArrayBag<String>();
        System.out.println("Bag is empty?" +city.isEmpty());//return true
        city.add("Ha Noi");
        city.add("Da Nang");
        System.out.println("Bag is still empty?" +city.isEmpty());//return false
        System.out.println("Curent bag size: " +city.getCurrentSize()); //return 2
        city.add("Ha Noi");
        System.out.println("Total of Ha noi object: " +city.getFrequencyOf("Ha Noi")); // return 2
        city.remove("Da Nang");
        System.out.println("Current bag size: " +city.getCurrentSize());//return 2
    }
}
