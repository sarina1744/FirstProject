package collectionsdemo;

import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        List names = new LinkedList();

        names.add("Sameer");
        names.add("Attaputta");
        names.add("Tufail");
        names.add("Daniel");
        names.add("Attaputta");
        names.add("Richard");

        names.remove("Tufail");

        System.out.println(names.size());
    }
}