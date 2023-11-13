public class Fibonacci {
    public static void main(String[] args) {
        // Ignoring invalid inputs as its just for demonstration
        int n = Integer.parseInt(args[0]);
        long result = fibonacci(n);
        System.out.println(n + "-te Fibonacci-Zahl: " + result);
    }

    public static long fibonacci(int n) {
        return n <= 1 ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }
}