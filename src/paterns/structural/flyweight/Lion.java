package paterns.structural.flyweight;

public class Lion implements Animal{
    private int size;

    public Lion(int size) {
        this.size = size;
    }

    @Override
    public void makeSound() {
        System.out.println("I am a Lion! and my weight is " + size);
    }
}
