package paterns.structural.flyweight;

public class Rabbit implements Animal{
    private int size;

    public Rabbit(int size) {
        this.size = size;
    }

    @Override
    public void makeSound() {
        System.out.println("I am a Rabbit! and my weight is " + size);
    }
}
