package paterns.creational.builder.internalBuilderEx;

public class DemoBuilder {
    public static void main(String[] args) {
        Person newPerson =  new Person.Builder().setAge(12).setName("Name").build();
    }
}
