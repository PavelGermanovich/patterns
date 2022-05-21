package paterns.creational.builder.externalBuilderEx;

public class HotDogBuilder {
    HotDog hotDog;

    public HotDogBuilder() {
        hotDog = new HotDog();
    }

    public HotDogBuilder setSouse(String souse) {
        hotDog.setSouse(souse);
        return this;
    }

    public HotDogBuilder setBread(String bread) {
        hotDog.setBread(bread);
        return this;
    }

    public HotDogBuilder setMeat(String meat) {
        hotDog.setMeat(meat);
        return this;
    }

    public HotDog build() {
        return hotDog;
    }
}
