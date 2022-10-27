package taskfive;

public class Car {
    private String color;
    private String brand;
    private static int COUNTER;

    public Car(String color, String brand) {
        this.color = color;
        this.brand = brand;
        COUNTER++;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public static int getCOUNTER() {
        return COUNTER;
    }

    public static void setCOUNTER(int COUNTER) {
        Car.COUNTER = COUNTER;
    }
}
