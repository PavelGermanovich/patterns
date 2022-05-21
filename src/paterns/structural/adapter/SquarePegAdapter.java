package paterns.structural.adapter;

public class SquarePegAdapter extends RoundedPeg{
    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public int getPegRadius() {
        return (int) (Math.sqrt(squarePeg.getSize()*squarePeg.getSize()*2) / 2);
    }
}
