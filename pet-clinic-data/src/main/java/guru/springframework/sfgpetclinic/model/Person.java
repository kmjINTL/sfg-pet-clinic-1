package guru.springframework.sfgpetclinic.model;

public class Person extends BaseEntity {
    private String Firstname;
    private String lastName;

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
