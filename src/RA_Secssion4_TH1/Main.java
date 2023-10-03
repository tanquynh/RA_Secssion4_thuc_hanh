package RA_Secssion4_TH1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the size of the array (not exceeding 20):");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20.");
            }
        } while (size > 20);

        array = new int[size];
        int i = 0; // Initialize i here
        while (i < array.length) { // Remove 'int' from this line
            System.out.println("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.printf("%-20s%s%n", "Elements in array:", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }

        System.out.printf("%-20s%s%n", "Reverse array:", "");

        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
