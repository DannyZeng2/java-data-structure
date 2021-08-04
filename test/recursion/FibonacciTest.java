package recursion;

import org.junit.Test;

public class FibonacciTest {

    @Test
    public void calculate() {
        System.out.println(Fibonacci.calculate(1));
        System.out.println(Fibonacci.calculate(2));
        System.out.println(Fibonacci.calculate(3));
        System.out.println(Fibonacci.calculate(4));
        System.out.println(Fibonacci.calculate(5));
    }
}