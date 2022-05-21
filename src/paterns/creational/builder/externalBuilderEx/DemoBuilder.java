package paterns.creational.builder.externalBuilderEx;

public class DemoBuilder {

    public static void main(String []args) {
        HotDog hotDog = new HotDogBuilder().setBread("Fresh").setMeat("Spicy").setSouse("Garlik").build();
    }
}
