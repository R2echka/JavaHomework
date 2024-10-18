public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String toString() {
        return "name " + this.name + ", surname " + this.surname;
    }

    public boolean equals(Author other) {
        return this.name.equals(other.name) && this.surname.equals(other.surname);
    }

    public int hashCode() {
        return 31 * (name.hashCode() + surname.hashCode());
    }
}
