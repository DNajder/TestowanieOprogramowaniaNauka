package foo.bar;

public class Rectangle implements Figure {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return a*b;
    }

    @Override
    public double circumference() {
        return 2*a+2*b;
    }
}
