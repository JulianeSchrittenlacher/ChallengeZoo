package org.example;

public class Main {
    public static void main(String[] args) {
       Animal dog1 = new Animal("1","Bello", "dog",12);
       Animal dog2 = new Animal("2","Hasso", "dog",2);
       Animal cat1 = new Animal("3","Mauz", "cat",3);
       Animal cow1 = new Animal("4","Emma", "cow",25);
       Animal cow2 = new Animal("4","Emma", "cow",25);


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