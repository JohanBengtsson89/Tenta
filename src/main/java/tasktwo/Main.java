package tasktwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = "";
        char firstLetter = 'l';
        boolean isRunning = true;

        System.out.println("Skriv in ditt namn: ");
        name = sc.nextLine();
        firstLetter = name.charAt(0);

        switch (firstLetter) {
            case 'ö':
                System.out.println("Namnet börjar på " + firstLetter + " och det är sista bokstaven i alfabetet");
                break;
            case 'Ö':
                System.out.println("Namnet börjar på " + firstLetter + " och det är sista bokstaven i alfabetet");
                break;
            default:
                System.out.println("Namnet börjar på " + firstLetter);
        }
    }
}
