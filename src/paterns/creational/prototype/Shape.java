package paterns.creational.prototype;

import java.util.Objects;

public abstract class Shape {
    public String name;
    public String color;
    public int x;
    public int y;

    public Shape() {
    }

    public Shape(Shape copy) {
        if (copy != null) {
            this.name = copy.name;
            this.color = copy.color;
            this.x = copy.x;
            this.y = copy.y;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return x == shape.x && y == shape.y && Objects.equals(name, shape.name) && Objects.equals(color, shape.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, x, y);
    }
}
