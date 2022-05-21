package paterns.creational.factoryMethod;

public abstract class Form {
    public void renderForm() {
        Button button = createButton();
        button.clickButton();
        System.out.println("Form is rendered");
    }

    public abstract Button createButton();
}
