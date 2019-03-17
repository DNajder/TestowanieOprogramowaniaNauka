package foo.bar;

import static java.lang.System.exit;

public class Calculator {

    public static void main(String[] args) {
   //     Calculator calculator = new Calculator();
   //     calculator.divide(2,0);
   //     System.out.println(calculator.power(2, 10));
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return -1;
    }

    public int correctSubstract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            try {
                return a / b;
            } catch (ArithmeticException e) {
                String replace = e.getMessage().replace("/ by zero", "Nie dziel przez 0");
                throw new RuntimeException(replace, e.getCause());
                // System.out.println("/ by zero");
                //exit(0);
            }
        }
        return a / b;
    }

    public long power(int a, int b) {
        int sum=1;
        switch (b) {
            case 0:
               sum = 1;
                break;
            case 1:
              sum = a;
                break;
            default:
                for (int i = 0; i < b; i++) {
                   sum= sum * a;
                }
        }
        return sum;
    }
}