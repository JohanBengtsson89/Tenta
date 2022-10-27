package Taskone;

import java.util.Scanner;

/** Uppgift 1 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        char firstLetter = 'l';
        boolean isRunning = true;


        /** Tar emot input från användare*/

        while (name.equals("")){
            System.out.println("Skriv in ditt namn: ");
            name = sc.nextLine();
        }

        firstLetter = name.charAt(0);


        if (firstLetter == 'ö' || firstLetter == 'Ö') {
            System.out.println("Namnet börjar på " + firstLetter + " och det är den sista bokstaven i alfabetet");
        } else {
            System.out.println("Namner börjar på " + firstLetter);
        }


    }
}
