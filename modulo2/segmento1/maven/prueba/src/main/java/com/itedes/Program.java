package com.itedes;

import java.util.ArrayList;

public class Program{
    public static void main(String args[]){
        Dog myDog = new Dog("Jack",2.0,"Mediano");
        Cat myCat = new Cat("Luna",1.0,"Pelo corto");

        System.out.println(myDog.getName());
        System.out.println(myDog.getSize());
        System.out.println(myDog.getWeight());
        System.out.println("Años: " + myDog.getAge());
        myDog.getOlder();
        myDog.eat(3.0);
        myDog.poop(2.0);
        System.out.println("Años: " + myDog.getAge());
        System.out.println(myDog.getWeight());

        System.out.println();
        
        System.out.println(myCat.getName());
        System.out.println(myCat.getWeight());
        System.out.println(myCat.getAge());
        System.out.println(myCat.getHairLength());
        
        ArrayList<Animal> mylist = new ArrayList<Animal>();

        mylist.add(myDog);
        mylist.add(myCat);

        for(Animal myAnimal:mylist){
            System.out.println(myAnimal.getName());
            System.out.println(myAnimal.getWeight());
            System.out.println(myAnimal.getAge());
            myAnimal.talk();
            System.out.println();
        }
    }
}