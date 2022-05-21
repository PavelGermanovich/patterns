package paterns.structural.adapter;

public class Hole {
    private int radius;

    public Hole(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public boolean isPegFits(RoundedPeg peg) {
        return radius >= peg.getPegRadius();
    }
}
