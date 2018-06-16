package by.epam.tr.start;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class IncreasingArray {

    public static int n = 0;
    public static double[] array;

    public static void main(String[] args) {

        n = scanN();
        initializeArray(n);
        fillArrayWithRandom();
        analyseIncreasing();

    }

    public static int scanN() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        while(!sc.hasNextInt()) {
            sc.next();
            System.out.print("Enter array size: ");
        }
        n = sc.nextInt();
        System.out.println();
        return n;
    }

    public static void initializeArray(int length) {
        array = new double[n];
    }

    public static void fillArrayWithRandom() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble()*10;
            String formattedDouble = new DecimalFormat("#0.00").format(array[i]);
            System.out.print(formattedDouble + " ");
        }
    }

    public static int analyseIncreasing() {
        System.out.println();
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] >= array[i+1]) {
                System.out.println("Array is not increasing!");
                return 0;
            }
        }
        System.out.println("Array is increasing!");
        return 0;
    }
}


