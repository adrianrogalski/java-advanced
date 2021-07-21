package day2.app;

import java.util.List;

public class Menu {
    private final List<MenuItem> itemList;

    public Menu(List<MenuItem> itemList) {
        this.itemList = itemList;
    }
    // tworze wygodne metody kotre wyswietla mi cale menu
    public void print() {
        for (MenuItem item : itemList){
            System.out.println(item.getOptionNumber()  + " " + item.getLabel());
        }
    }

    public void executeAction(int option) {
        for (MenuItem item: itemList) {
            if (item.getOptionNumber() == option) {
                item.getAction().execute();
            }
        }
    }
}
