package foo.bar;

public class Triangle implements Figure {
    int a;
    int b;
    int c;
    int h;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double area() {
        return a * h;
    }

    @Override
    public double circumference() {
        if (a + b > c && a + c > b && b + c > a) {
            return a + b + c;
        } else {
            System.out.println("incorrect values, you can not build a triangle");
            return 0;
        }
    }
}