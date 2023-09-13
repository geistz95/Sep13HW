package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] descriptionCat={"Persian", "I don't know what to put"};
        String[] descriptionDog={"Shiba-Inu", "It's from japan"};
        String[] descriptionBear={"Polar Bear", "Its from the north"};
        byte ageCat= 2;
        byte ageDog=6;
        byte ageBear=12;
        Animal cat = new Animal("Cat", descriptionCat, "Meow Meow", 3273, ageCat);
        Animal dog = new Animal("Dog", descriptionDog, "Woof Woof", 7582 , ageDog);
        Animal bear = new Animal("Bear", descriptionBear, "Roar", 9182, ageBear);
        cat.printInfo();
    }
}
