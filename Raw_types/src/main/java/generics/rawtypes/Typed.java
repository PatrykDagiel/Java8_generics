package main.java.generics.rawtypes;

import java.util.ArrayList;
import java.util.List;

public class Typed {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("this");
        strings.add("is");
        strings.add("some");
        strings.add("string");

        for(String s: strings) {
            System.out.printf("%7s has %d characters%n", s, s.length());
        }

        List<Integer> ints = new ArrayList<>();
        ints.add(3);
        ints.add(new Integer(4));
    }
}
