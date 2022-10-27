package taskthree;
/** Det här är en klass för en Person */

public class Person {

    private String firstName;
    private String lastName;
    private String favouriteMovie;

    public Person() {
    }

    public Person(String firstName, String lastName, String favouriteMovie) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.favouriteMovie = favouriteMovie;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFavouriteMovie() {
        return favouriteMovie;
    }

    public void setFavouriteMovie(String favouriteMovie) {
        this.favouriteMovie = favouriteMovie;
    }
}
