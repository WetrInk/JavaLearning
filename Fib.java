public class Fib {
    public static void main(String[] args) {

        int[] fib = new int[21];
        fib[0] = fib[1] = 1; //initialize

        for (int i = 2; i < 20; i++)
            fib[i] = fib[i-1] + fib [i-2]; //formula

        System.out.println("The first 20 items of Fib array, in reversed order:");
        for (int i = 19; i >= 0; i--)
            System.out.println("#" + (i+1) + ": " + fib[i]); //output in reverse

    }
}