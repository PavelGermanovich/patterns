package paterns.structural.flyweight;

public class Demo {
    public static void main(String[] args) {
        Animal tiger;
        Animal rabbit;
        Animal lion;
        tiger = AnimalFactory.getAnimal("Tiger");
        rabbit = AnimalFactory.getAnimal("Rabbit");
        lion = AnimalFactory.getAnimal("Lion");
        tiger.makeSound();
        rabbit.makeSound();
        lion.makeSound();
    }
}
