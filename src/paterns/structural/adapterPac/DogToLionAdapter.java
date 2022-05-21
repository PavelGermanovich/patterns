package paterns.structural.adapterPac;

/*
    Adapter - это структурный паттерн проектирования,
    который позволяет объектам с несовместимыми интерфейсами работать вместе.
 */

public class DogToLionAdapter implements Lion{
    private WildDog wildDog;

    public DogToLionAdapter(WildDog wildDog) {
        this.wildDog = wildDog;
    }

    @Override
    public void roar() {
        this.wildDog.bark();
    }
}
