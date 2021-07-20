package day1.model;

import java.time.LocalDate;

public class Person{
    String firstName;
    String lastName;
    LocalDate birthDate;

    public Person(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public final void setFirstName(String firstName){
        this.firstName = firstName;
    }


    // konstruktor ten zwywolywany jest niejawnie w klasach pochodnych ktore nie maja odwolania do konstuktora super z parametrami
    public Person() {
        this.firstName = "sad";
    }

    public String getFirstName(){
        return firstName;
    }

    @Override
    public String toString(){
        return firstName + ", " + lastName + ", " + birthDate;
    }
}
