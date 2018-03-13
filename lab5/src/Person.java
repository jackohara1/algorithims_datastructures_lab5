import java.util.GregorianCalendar;

public class Person {
    private String firstName;
    private String surname;
    private GregorianCalendar DOB;

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public GregorianCalendar getDOB() {
        return DOB;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDOB(GregorianCalendar DOB) {
        this.DOB = DOB;
    }



    public Person(String firstName, String surname, GregorianCalendar DOB) {
        this.firstName = firstName;
        this.surname = surname;
        this.DOB = DOB;
    }
}