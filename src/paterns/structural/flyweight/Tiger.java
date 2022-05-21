package paterns.structural.flyweight;

public class Tiger implements Animal{
    private int size;

    public Tiger(int size) {
        this.size = size;
    }

    @Override
    public void makeSound() {
        System.out.println("I am tiger! and my weight is " + size);
    }
}
