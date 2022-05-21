package paterns.structural.decoratorPac;

public class Main {

    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());

        coffee = new MilkCoffeeDecorator(coffee);
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());

        coffee = new VanillaCoffeeDecorator(coffee);
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());
    }
}
