package paterns.creational.factoryMethod;

public class WindowsForm extends Form{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
