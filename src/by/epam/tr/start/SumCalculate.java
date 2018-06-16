package by.epam.tr.start;

import java.util.Random;
import java.util.Scanner;

public class SumCalculate {
    static int n = 0;
    static int k = 0;
    static int sum = 0;
    static int[] array;

    public static void main(String[] args) {
        n = scanN();
        initializeArray(n);
        fillArrayWithRandom();
        k = scanK();
        calculateSumOfElementsMultipleByK();
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

    public static int scanK() {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a multiple: ");
        while(!sc.hasNextInt()) {
            sc.next();
            System.out.print("Enter a multiple: ");
        }
        if (sc.nextInt() == 0) {
            sc.next();
            System.out.print("0 is invalid value! ");
            scanK();
        } else {
            k = sc.nextInt();
        }
        return k;
    }

    public static void initializeArray(int length) {
        array = new int[n];
    }

    public static void fillArrayWithRandom() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
    }

    public static boolean isMultipleByK(int element) {
        if(element != 0 && element%k == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void calculateSumOfElementsMultipleByK() {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if(isMultipleByK(array[i])) {
                System.out.print(array[i] + " ");
                sum += array[i];
            }
        }
        System.out.println();
        System.out.println("Sum of elements multiple by " + k + " = " + sum);
    }
}


