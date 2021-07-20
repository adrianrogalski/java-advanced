package day1.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class InheritanceDemo {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.birthDate = LocalDate.of(2000,10,1);
        worker.firstName = "Adam";
        worker.lastName = "Kowalski";
        worker.position = "mag. inż.";
        // bezpieczniej jest tworzyć BigDecimala jako nowy łańcuch a nie np. BigDecimal.valueof(1500.5)
        worker.salary = new BigDecimal("1500.5");

    }
}
