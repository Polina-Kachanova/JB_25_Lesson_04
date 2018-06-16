package by.epam.tr.start;

import java.util.Random;
import java.util.Scanner;

public class NullArray {

    private static int n = 0;
    private static int[] originalArray;
    private static int[] nullElementsArray;
    private static boolean nullArrayIsEmpty = true;

    public static void main(String[] args) {
        n = scanN();
        initializeArray(n);
        fillArrayWithRandom();
        printNullElementsMassive();
    }

    private static int scanN() {
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

    private static void initializeArray(int length) {
        originalArray = new int[length];
        nullElementsArray = new int[1];
    }

    private static void fillArrayWithRandom() {
        Random random = new Random();
        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = random.nextInt(100)%10;
            System.out.print(originalArray[i] + " ");
        }
    }

    private static void printNullElementsMassive() {
            for (int i = 0; i < originalArray.length; i++) {
                if (originalArray[i] == 0) {
                    if (nullArrayIsEmpty) {
                        nullElementsArray[0] = i;
                        nullArrayIsEmpty = false;
                    } else {
                        int[] temp = new int[nullElementsArray.length + 1];
                        System.arraycopy(nullElementsArray, 0, temp, 0, nullElementsArray.length);
                        nullElementsArray = temp;
                        nullElementsArray[nullElementsArray.length -1] = i;
                    }
                }
            }
        System.out.println();
        for (int element: nullElementsArray) {
            System.out.print(element + " ");
        }
    }
}
