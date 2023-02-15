public class Triagle extends Shapes{
    private double longg;
    private double right;

    public Triagle(double longg, double right) {
        this.longg = longg;
        this.right = right;

    }

    public double getLongg() {
        return longg;
    }

    public void setLongg(double longg) {
        this.longg = longg;
    }

    public double getRight() {
        return right;
    }

    public void setRight(double right) {
        this.right = right;
    }

    @Override
    public void findArea() {
        super.findArea();
        System.out.println(longg*right/2);
    }
}
