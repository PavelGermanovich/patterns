package paterns.creational.builder.internalBuilderEx;

/**
 * The main point that object we creating using Builder is immutable and does not have setters to modify it after creation
 * and we don`t want to create overwhelmed constructors
 */

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static class Builder {
        Person person;

        public Builder() {
            person = new Person();
        }

        public Builder setName(String name) {
            person.name = name;
            return this;
        }

        public Builder setAge(int age) {
            person.age = age;
            return this;
        }

        public Person build() {
            return person;
        }
    }
}
