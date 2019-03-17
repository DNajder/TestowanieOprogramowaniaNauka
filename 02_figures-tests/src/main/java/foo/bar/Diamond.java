package foo.bar;

public class Diamond implements Figure{
    private int a;
    private int h;

    public Diamond(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double area() {
        return a*h;
    }

    @Override
    public double circumference() {
        return a*4;
    }
}
