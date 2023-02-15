public class Main {
    public static void main(String[] args) {
        Shapes triagle=new Triagle(4,6);
        triagle.findArea();
        System.out.println("Triagle");

        Shapes rectagle=new Rectagle(8,6);
        rectagle.findArea();
        System.out.println("Rectagle");

        Shapes circle=new Circle(3);
        circle.findArea();
        System.out.println("Circle");

        Shapes square=new Square(4,4);
        square.findArea();
        System.out.println("Square");
    }
}































