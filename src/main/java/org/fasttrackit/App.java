package org.fasttrackit;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to the Animal Rescue!" );

        Adopter adopter1 = new Adopter();
        adopter1.adopterName = "M. Savin";
        adopter1.money = 2555.20;

        System.out.println(" The sum is : "+ adopter1.money + "lei");
        System.out.println(" The name is : "+ adopter1.adopterName);


        Food food1 =  new Food();
        food1.expirationDate = LocalDate.now() .plusMonths(4);
        food1.foodName = "Pedigree";
        food1.price = 350;
        food1.quantity = 1.5;
        food1.stock = false;

        System.out.println("Expiration Date is :" + food1.expirationDate);

        System.out.println("The food :" + food1.foodName);
        System.out.println("The price is  :" + food1.price);
        System.out.println("Stock: " + food1.stock);


        Vet vet1 = new Vet();
        vet1.vetName = "M. Savin";
        vet1.specialization = "Doctor";

        Animal animal1 = new Animal();
        animal1.age = 7;
        animal1.animalName = "Lisa";
        animal1.foodName = "Pedigree";
        animal1.moodlevel = 8;
        animal1.recreationalActivity = "Happy";

    }


}
