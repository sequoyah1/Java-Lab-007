/**
 * Version 1.0
 * Author Sequoyah Schaefer
 * Since 3/11/2023
 */

import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);




    public static void eoCount() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input:");
        int n = scanner.nextInt();

        while (n > 1) {
            if (n % 2 == 0) {
                System.out.println(n + " " + "=" + "\s" + "Is Even."); }
            else {
                System.out.println(n + " " + "=" + "\s" + "Is Odd.");


                    }
            int numbersRead = 0;
            int sum =0;
                    while (true) {

                        if (numbersRead == 100) {
                            break;
                }
                        sum = sum + Integer.valueOf(scanner.nextLine());
                        numbersRead = numbersRead + 1;
            }

            }
    }

    public static void mean() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        while (true) {
            if (x < 0) {
                break;
            }

        System.out.println("Input 6 total numbers:");
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        float num3 = scanner.nextFloat();
        float num4 = scanner.nextFloat();
        float num5 = scanner.nextFloat();
        float num6 = scanner.nextFloat();
        float mean;
        int sum, i;
        int n = 5;
        float a[] = {num1,num2,num3,num4,num5,num6};
        sum = 0;

        for(i = 0; i < n; i++) {
            sum+=a[i];
        }
        System.out.println("Mean ::"+ sum/(float)n);

    }
    }




    public static void main(String[] args) {

        eoCount();
        mean();
    }
}
