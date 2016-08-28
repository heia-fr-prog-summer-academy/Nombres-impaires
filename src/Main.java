public class Main {

    private static final int MAX_NUMBER = 100;
    
    public static int fib (int x) {
        if (x <= 1) {
            return x;
        } else {
            return fib(x-1) + fib(x-2);
        }
    }
    
    public static void main(String[] args) {
        int x = 0;
        while (true) {
            System.out.println(x);
            int f = fib(x++);
            if (f > MAX_NUMBER) break;
            System.out.println(f);
	    }
    }
}
