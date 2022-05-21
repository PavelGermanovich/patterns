package paterns.structural.adapter;

public class Demo {
    public static void main(String[] args) {
        Hole hole = new Hole(10);
        RoundedPeg roundedPegApplicable = new RoundedPeg(9);
        RoundedPeg roundedPegNotApplicable = new RoundedPeg(11);
        System.out.println("First peg applicable -> " + hole.isPegFits(roundedPegApplicable));
        System.out.println("Second peg applicable -> " + hole.isPegFits(roundedPegNotApplicable));

        SquarePeg squarePegApplic = new SquarePeg(10);
        System.out.println("First square applicable -> " + hole.isPegFits(new SquarePegAdapter(squarePegApplic)));
        SquarePeg squarePegNotApplic = new SquarePeg(20);

        System.out.println("Second square applicable -> " + hole.isPegFits(new SquarePegAdapter(squarePegNotApplic)));

    }
}
