package day3;

public class InvalidArgumentIncomeAmountException extends RuntimeException {
    // opcjonalnie zazwyczaj tworze wyjatek tylko dla nazwy(dla typowania/ wyróżnienia osobnej klasy)
    private String message;

    public InvalidArgumentIncomeAmountException(String message) {
        this.message = message;
    }

}
