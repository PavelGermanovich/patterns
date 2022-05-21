package paterns.creational.singleton;

public class Environment {
    boolean envIsCreated;
    static Environment environment;

    private Environment() {
        envIsCreated = true;
    }

    public static Environment getEnvironment() {
        if (environment == null) {
            environment = new Environment();
        }
        return environment;
    }
}
