package Taskone;

import java.util.Scanner;

/** Halloj */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        char firstLetter = 'l';
        boolean isRunning = true;

        System.out.println("Skriv in ditt namn: ");
        name = sc.nextLine();
        firstLetter = name.charAt(0);

        if (name.equals("")) {
            System.out.println("Skriv in ditt namn: ");
            name = sc.nextLine();
            firstLetter = name.charAt(0);

        }

        System.out.println("Namnet börjar på " + firstLetter);


    }
}
