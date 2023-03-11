/**
 * Version 1.0
 * Author Sequoyah Schaefer
 * Since 3/11/2023
 */
import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
            System.out.println("Input Number:");
            int x = scanner.nextInt();
            int [] number = {x,36,87,4,6,8};
            for(int i : number) {
                sum+= i;
            }
            System.out.println(sum);
    }

    public static void rangeSum() {
        int sum = 0;
        int [] number = {98,36,87,4,6,8};
        for(int i : number) {
            sum+= i;
        }
        System.out.println(sum);
    }

    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long factorial = 1;
        for(int i = 1; i <= n; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", n, factorial);
    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
