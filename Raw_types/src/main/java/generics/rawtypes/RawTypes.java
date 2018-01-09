package main.java.generics.rawtypes;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("UnnecessaryBoxing")
public class RawTypes {
    public static void main(String[] args) {
        List strings = new ArrayList();
        strings.add("This");
        strings.add("is");
        strings.add("a");
        strings.add("RAW");
        strings.add("list");
        strings.add("of");
        strings.add("strings");

        for (Object o: strings) {
            String s = (String) o;
            System.out.printf("%7s has %d characters%n", s, s.length());
        }

        List<Integer> ints = new ArrayList<>();
        ints.add(3);
        ints.add(new Integer(4));
        int x = ints.get(0);
        int y = ints.get(1);
    }
}