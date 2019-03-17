package foo.bar;

public class Circle implements Figure {
    Integer r;
    double pi = 3.14;

    public Circle(Integer r) {
        this.r = r;
    }


    @Override
    public double area() {
        return r*r*pi;
    }

    @Override
    public double circumference() {
        return 2*pi*r;
    }
}
