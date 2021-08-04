package Recursion;

public class Fibonacci {

    // 1 1 2 3 5 8 13...
    public static long calculate(int num) {
        if(num == 0 || num ==1) {
            return 1;
        }
        return calculate(num-1) +calculate(num -2);

    }
}
