package taskfive;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
/** Uppgift 5 */

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Car> cars = new ArrayList<>();


        Car car1 = new Car("Blå", "Volvo");
        System.out.println(car1.getColor() + " " + car1.getBrand());
        System.out.println("Du har skapat " + Car.getCOUNTER() + " bil.");

        Car car2 = new Car("Vit", "Saab");
        System.out.println(car2.getColor() + " " + car2.getBrand());
        System.out.println("Du har skapat " + Car.getCOUNTER() + " bil.");

        Car car3 = new Car("Röd", "BMW");
        System.out.println(car3.getColor() + " " + car3.getBrand());
        System.out.println("Du har skapat " + Car.getCOUNTER() + " bil.");

        Car car4 = new Car("Grön", "Jaguar");
        System.out.println(car4.getColor() + " " + car4.getBrand());
        System.out.println("Du har skapat " + Car.getCOUNTER() + " bil.");

        /** Lägger till i listan cars*/
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        mapper.writeValue(Paths.get("src/main/resources/cars.json").toFile(), cars);



    }

}
