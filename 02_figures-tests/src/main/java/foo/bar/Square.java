package foo.bar;

public class Square implements Figure {

    private int a;

    public Square(int a) {
        this.a = a;
    }

    public double area() {
        return a*a;
    }
    public double circumference() {
        return 4*a;
    }
}
