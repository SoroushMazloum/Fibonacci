import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner Sca = new Scanner(System.in);
        int in = Sca.nextInt();
        System.out.println(Fibonacci(in));
        Sca.close();
    }
    public static int Fibonacci(int n) {
        if(n == 0)
            return n;
        else if(n == 1)
            return n;
        else
            return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}