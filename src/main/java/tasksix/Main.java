package tasksix;

import java.util.Scanner;

/** Det här är uppgift 6*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer;
        int point = 0;



        System.out.println("1. Nämn en av rollerna som finns inom Scrum: ");
        answer = sc.nextLine();

        if (answer.equalsIgnoreCase("Scrum master")){
            System.out.println("Rätt svar!");
            point++;
        } else {
            System.out.println("Fel svar ingen poäng");
        }

        System.out.println("2. Nämn en av cermonierna som finns inom Scrum: ");
        answer = sc.nextLine();

        if (answer.equalsIgnoreCase("standup meeting")){
            System.out.println("Rätt svar!");
            point++;
        } else {
            System.out.println("Fel svar ingen poäng");
        }

        System.out.println("3. Vad är rekomenderat antal personer i ett team? ");
        answer = sc.nextLine();

        if (answer.equalsIgnoreCase("5")){
            System.out.println("Rätt svar!");
            point++;
        } else {
            System.out.println("Fel svar ingen poäng");
        }

        System.out.println("4. Scrum har ett dokument där ALL information om Scrum finns, vad heter det dokumentet?");
        answer = sc.nextLine();

        if (answer.equalsIgnoreCase("Book of Scrum")){
            System.out.println("Rätt svar!");
            point++;
        } else {
            System.out.println("Fel svar ingen poäng");
        }

        System.out.println("5. Vem är den enda personen som får avbryta en Sprint?");
        answer = sc.nextLine();

        if (answer.equalsIgnoreCase("Scrum leader")){
            System.out.println("Rätt svar!");
            point++;
        } else {
            System.out.println("Fel svar ingen poäng");
        }

        /**Skriver ut om användaren klarat provet*/

        if (point < 3 ){
            System.out.println("Du fick " + point + " poäng, du borde läsa på lite mer");
        } else if (point == 3) {
            System.out.println("Grattis! Du fick alla rätt.");
        } else {
            System.out.println("Du fick " + point + " poäng, bra jobbat");
        }

    }

}
