package taskthree;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** Antar att man ska spara ner till Json från denna uppgift för att sen använda i nästa */

public class Main {

    public static Person newPerson(String firstName, String lastName, String favouriteMovie){
        Person person = new Person(firstName, lastName, favouriteMovie);

        return person;
    }

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Scanner sc = new Scanner(System.in);
        //Person person = new Person();
        List<Person> people = new ArrayList<>();
        String answer;
        boolean isRunning = true;


        String firstName;
        String lastName;
        String favouriteMovie;

        do {
            System.out.println("Tryck enter för att lägga till en ny person eller tryck 1 för att avsluta");
            answer = sc.nextLine();
            if (answer.equals("1")){
                isRunning = false;
            } else {
                System.out.println("Skriv in förnamnet:");
                firstName = sc.nextLine();
                System.out.println("Skriv in efternamnet:");
                lastName = sc.nextLine();
                System.out.println("Skriv in favoritfilmen: ");
                favouriteMovie = sc.nextLine();

                people.add(newPerson(firstName, lastName, favouriteMovie));

            }

        } while (isRunning);

        mapper.writeValue(Paths.get("src/main/resources/people.json").toFile(),people);

        for (Person p : people){
            System.out.println(p.getFirstName().toString() + " " + p.getLastName().toString() + " " +
                    p.getFavouriteMovie().toString());
        }


    }
}
