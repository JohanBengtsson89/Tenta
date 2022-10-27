package taskfour;

import com.fasterxml.jackson.databind.ObjectMapper;
import taskthree.Person;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/** Uppgift 4 */

public class Main{
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Person> peopleList = new ArrayList<>();

        /** Hämtar från JSON*/
        peopleList = List.of(mapper.readValue(Paths.get("src/main/resources/people.json").toFile(),
                Person[].class));

        for (Person p : peopleList){
            System.out.println(p.getFirstName().toString() + " " + p.getLastName().toString() + " " +
                    p.getFavouriteMovie().toString());
        }
    }
}
