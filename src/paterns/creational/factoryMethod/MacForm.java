package paterns.creational.factoryMethod;

public class MacForm extends Form{
    @Override
    public Button createButton() {
        return new MacButton();
    }
}
