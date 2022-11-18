package task1;

import java.util.*;

public class Main {

    public static void main(String args[]) {
        TreeSet<String> ts = new TreeSet<String>(new Comparator<String>()
        {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        });
        ts.add("C");
        ts.add("E");
        ts.add("D");
        ts.add("B");
        ts.add("A");
        ts.add("F");
        for (String element : ts)
            System.out.print(element + " ");
    }
}
