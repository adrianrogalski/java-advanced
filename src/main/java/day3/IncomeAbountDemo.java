package day3;

class IncomeAmountDemo {
    public static void main(String[] args) {
        try {
            IncomeAmount amount = IncomeAmount.of(-4, 67);
            System.out.println(amount.getAmount());
        } catch (RuntimeException e){
            System.out.println(e.getMessage());

        }
        System.out.println("KONIEC");
    }
}