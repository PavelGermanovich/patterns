package paterns.structural.proxy;

public class ProxyDemo {
    /**
     * A Decorator is always passed its delegatee. A Proxy might create it himself, or he might have it injected.
     */
    public static void main(String[] args) throws Exception {
        Internet internet = new InternetProxy();
        internet.connectTo("ab.cdo");
    }
}
