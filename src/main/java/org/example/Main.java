package org.example;

public class Main {
    public static void main(String[] args) {
        Owner owner1 = new Owner("Klara", 12, "Warder Weg 13");
        Owner owner2 = new Owner("Felix", 20, "Kluge Straße 1");

        Species dog = new Species("dog",500);
        Species cat = new Species("cat",500);
        Species cow = new Species("cow",5000);

       Animal dog1 = new Animal("1","Bello", "dog",12, owner1, dog);
       Animal dog2 = new Animal("2","Hasso", "dog",2, owner1, dog);
       Animal cat1 = new Animal("3","Mauz", "cat",3, owner1, cat);
       Animal cow1 = new Animal("4","Emma", "cow",25, owner2, cow);
       Animal cow2 = new Animal("4","Emma", "cow",25, owner2, cow);


        System.out.println("---------------------------------");
        System.out.println(" Testen der Equals-Methode:");
        System.out.println("---------------------------------");
        System.out.println("Ist der " + dog1 +" identisch mit " + dog2 +"?\n"
               + dog2.equals(dog1));
        System.out.println("Ist der " + cow1 +" identisch mit " + cow2 +"?\n"
                + cow2.equals(cow1));

        System.out.println("---------------------------------");
        System.out.println(" Testen der toString-Methode:");
        System.out.println("---------------------------------");
        System.out.println(cat1.toString());









    }
}