package UpcastingDownCasting;

class Animal{
    void makeSound(){
        System.out.println("Animal Makes Noise");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog Barks");
    }
    void guardHouse(){
        System.out.println("Dog Guards the House");
    }
}
class Cat extends Animal {
    void makeSound(){
        System.out.println("I meow i meow");
    }
    void huntMouse(){
        System.out.println("Cat is Hunting Mouse");
    }
}
class AnimalDowncast{
    public static void main(String[] args) {
        // assign child to parent
        Animal cAnimal = new Dog();
        Dog cdaDog = (Dog) cAnimal;
        cdaDog.guardHouse();
    }
}