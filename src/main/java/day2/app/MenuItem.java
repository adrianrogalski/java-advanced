package day2.app;

// Klasa służąca do pojedynczego polecenia w menu
public class MenuItem {
    private final String label;
    private final int optionNumber;
    private MenuAction action;

    public MenuItem(String label, int optionNumber, MenuAction action) {
        this.label = label;
        this.optionNumber = optionNumber;
        this.action = action;
    }

    public String getLabel() {
        return label;
    }

    public int getOptionNumber() {
        return optionNumber;
    }

    public MenuAction getAction() {
        return action;
    }
}
