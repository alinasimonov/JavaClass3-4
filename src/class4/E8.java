package class4;

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your Name");
        String name = scanner.nextLine();
        if (name.equals("Jamel")) {
            System.out.println("Senior SDET in 2 years");
        } else if (name.equals("Ayesha")) {
            System.out.println("I live in Canada");

        }
    }
}
