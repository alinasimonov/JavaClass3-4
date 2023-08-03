package class4;

import java.util.Scanner;

public class Alina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your Name");
        String name = scanner.nextLine();
        if (name.equals("Alina")) {
            System.out.println("Alina mom of 5?");
            System.out.println("Dream big, Alina. You deserve it!");
        }
    }
}