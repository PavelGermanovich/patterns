package paterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class AnimalFactory {
    static Map<String, Animal> animalInZoom = new HashMap<>();

    public static Animal getAnimal(String name) {
        Animal animal = animalInZoom.get(name);
        if (animal == null) {
            switch (name) {
                case "Tiger": {
                    animal = new Tiger(30);
                    break;
                }
                case "Lion": {
                    animal = new Lion(40);
                    break;
                }
                case "Rabbit": {
                    animal = new Rabbit(11);
                    break;
                }
            }
            animalInZoom.put(name, animal);
        }
        return animal;
    }
}
