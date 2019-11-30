package com.kamaldwip.coding.hashtable.simple;

public class Main {

    public static void main(String[] args) {

        Employee kamal = new Employee("Kamaldwip","Choudhury",585199);
        Employee kishore = new Employee("Kishore","Choudhury",687125);
        Employee prateek = new Employee("Prateek","Sahu",565312);
        Employee parag = new Employee("Parag","Roy",654123);

        SimpleHashtable ht = new SimpleHashtable();

        ht.put("Choudhury",kishore);
        ht.put("Choudhury",kamal);
        ht.put("Sahu",prateek);
        ht.put("Roy",parag);

        ht.printHashtable();

        System.out.println("Retrieve value for Roy : "+ht.get("Roy"));


    }
}
