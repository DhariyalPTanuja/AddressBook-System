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


        Collection<PersonalInfo> contactBook = new ArrayList<PersonalInfo>();
        contactBook.add (new PersonalInfo("Rahul" , "Roy", 9812345675l, "rahulroy20@xyz.com","Bangalore","Karnataka",563322));
        contactBook.add (new PersonalInfo("Sachin" , "Bhatt", 9812345875l, "sachinbhatt1@xyz.com","Mangalore","Karnataka",563322));

        PersonalInfo person1 = addPerson();
        contactBook.add( person1);
        Iterator<PersonalInfo> personalInfoIterator = contactBook.iterator();

        while(personalInfoIterator.hasNext()){
            System.out.println(personalInfoIterator.next());
        }


    }
    private static PersonalInfo addPerson(){
        Scanner scanobj = new Scanner(System.in);
        System.out.println("Enter the User first name : ");
        fname = scanobj.next();
        System.out.println("Enter the User last name : ");
        lname = scanobj.next();
        System.out.println("Enter the User phone number : ");
        phoneNumber = scanobj.nextInt();
        System.out.println("Enter the User email : ");
        email = scanobj.next();
        System.out.println("Enter the city name : ");
        city = scanobj.next();
        System.out.println("Enter the state name : ");
        state = scanobj.next();
        System.out.println("Enter the zip code : ");
        zipCode = scanobj.nextInt();

        return new PersonalInfo(fname,lname,phoneNumber,email,city,state,zipCode);
    }
}