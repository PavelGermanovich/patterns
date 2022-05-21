package paterns.creational.prototype;

public class Demo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.name = "circle one";
        circle.radius = 12;
        circle.color = "Orange";
        Circle circle2 = circle.clone();
        System.out.println(circle.equals(circle2));
    }
}
