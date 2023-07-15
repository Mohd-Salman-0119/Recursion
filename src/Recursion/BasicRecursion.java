package Recursion;

public class BasicRecursion {
    public static int printNaturals(int start, int end, int sum) { // function will print the naturals numbers till n;
        if (start == end) {
            sum += start;
            return start;
        }
        int num = printNaturals(start + 1, end, sum);
        sum += start + num;
        return sum;
    }

    public static void printNumber1ToN(int i, int n) { // function will print the numbers from 1 to N;
        if (i == n) {
            return;
        }
        System.out.println(i);
        printNumber1ToN(i + 1, n);
    }

    public static int calculateFactorial(int n) { // function will calculate fibonacci series till N;
        if (n == 1 || n==0) {
            return 1;
        }
        int factorial = calculateFactorial(n - 1);
        System.out.println("factorial: " + n*factorial);
        return n * factorial;
    }

    public static void main(String[] args) {
        /*
        // Print Naturals Numbers
        int ans = printNaturals(1,5,0);
        System.out.println(ans);

        // Print Number from 1 ot N;
        printNumber1ToN(1,11);
        */
        // Calculate Fibonacci Series
        int ans = calculateFactorial(5);
        System.out.println(ans);

    }


}
