package foo.bar;

public class Trapeze implements Figure{

    int a;
    int b;
    int c;
    int d;
    int h;

    public Trapeze(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public Trapeze(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double area() {
        return (a+b)/2*h;
    }

    @Override
    public double circumference() {
        return a+b+c+d;
    }
}
