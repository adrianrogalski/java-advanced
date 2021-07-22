package day3;

import java.math.BigDecimal;
public class IncomeAmount {
    private final BigDecimal amount;
    // skoro chce dac warunek aby amount byl liczba neiujemna daje konstruktor prywatny a nastepnie przekazuje
    // odpowiedzialnosc na konstrukcje obiektu o odpowiednim amount na metode statyczna of
    private IncomeAmount(BigDecimal amount) {
        this.amount = amount;
    }
    // opcjonalnie throws ale w przypadku runtimmeexep nie jest to obowoazkowe
    public static IncomeAmount of(long zloty, long grosz) throws IllegalArgumentException{
        if (zloty >= 0 && grosz >= 0){
            return new IncomeAmount(
                    // dla big decimala na intach i longach nie musza byc lancuchy
                    new BigDecimal(zloty * 100 + grosz).divide(new BigDecimal(100))
            );
        } else {
            //zgłoszenie wyjątku oznacza przerwanie wykonywania tej metody
            throw new IllegalArgumentException("Kwota złotych i groszy musi być dodatnia!");
        }
    }

    public static IncomeAmount parse(String amount) {
        BigDecimal amountConverted;
        try {
             new BigDecimal(amount);
        }
        catch (NumberFormatException exception){
            throw new IllegalArgumentException("Nie podano żadnej liczby");
        }
        BigDecimal decimal = new BigDecimal(amount);
        if (decimal.compareTo(BigDecimal.ZERO) < 0) {
            throw new InvalidArgumentIncomeAmountException("Wartość nie może być mniejsza od 0");
        }
        return new IncomeAmount(decimal);
    }
    public BigDecimal getAmount() {
        return amount;
    }
}
