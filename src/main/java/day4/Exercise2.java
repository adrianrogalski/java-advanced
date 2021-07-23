package day4;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {
        List<Character> names = new ArrayList<>(List.of('A', 'C', 'D'));

        // names.add('@');
        names.add(0,'@');
        System.out.println(names);
        // names.set(names.size() - 1, '$');
        names.add('$');
        names.set(1, '^');
        System.out.println(names);
        names.remove(1);
        System.out.println(names);
        String string = "";
        for (Character character: names) {
            string += character;
        }
        System.out.println(string);
    }
}
