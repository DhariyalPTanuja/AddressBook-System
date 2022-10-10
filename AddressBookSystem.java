package com.addressbooksystem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBookSystem {
    private  static String fname,lname, email, city , state;
    private  static int zipCode;
    private  static long  phoneNumber;
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
       Collection<PersonalInfo> contactBook = new ArrayList<PersonalInfo>();
        contactBook.add (new PersonalInfo("Rahul" , "Roy", 9812345675l, "rahulroy20@xyz.com","Bangalore","Karnataka",563322));
        contactBook.add (new PersonalInfo("Sachin" , "Bhatt", 9812345875l, "sachinbhatt1@xyz.com","Mangalore","Karnataka",563322));

        Iterator<PersonalInfo> personalInfoIterator = contactBook.iterator();

        while(personalInfoIterator.hasNext()){
            System.out.println(personalInfoIterator.next());
        }


        }
}
