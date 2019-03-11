package foo.bar;

import static java.lang.System.exit;

public class Calculator {

    // public static void main(String[] args) {
    //     Calculator calculator = new Calculator();
    //     calculator.divide(2,0);
    // }

    public int add(int a, int b) {
        return a + b;
    }
    public int extract(int a, int b){

        return -1;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int  divide(int a, int b) {
        if (b==0) {
            try {
                return a / b;
            } catch (ArithmeticException e) {
                System.out.println("/ by zero");
                exit(0);
            }
        }
        return a/b;
    }
}
