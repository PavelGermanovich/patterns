package paterns.structural.decoratorPac;

public class MilkCoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public MilkCoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int getCost() {
        return this.coffee.getCost() + 2;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + " Milk!";
    }
}
