import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner=new Scanner(System.in);
        
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println(-1);
        } else if (n == 0) {
            System.out.println(0);
        } else if (n == 1) {
            System.out.println(1);
        } else {
            int p = 0;
            int c = 1;
            for (int i = 2; i <= n; i++) {
                int next = p + c;
                p = c;
                c = next;
            }
            System.out.println(c);
        }

        long r = fibonacciRec(n);
        if (r!= -1) {
            System.out.println(r);
        } else {
            System.out.println(-1);
        }
    }
    public static long fibonacciRec(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRec(n - 1) + fibonacciRec(n - 2);
        }
    }
}