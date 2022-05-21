package paterns.structural.decoratorPac;

public class VanillaCoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public VanillaCoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int getCost() {
        return this.coffee.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + " Vanilla!";
    }
}
