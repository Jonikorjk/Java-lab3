package task5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        while (sentence.indexOf("  ") >= 0) {
            sentence = sentence.replaceAll("  ", " ");
        }
        String[] words = sentence.split(" ");
        SortedSet<String> ss = new TreeSet<>();
        for (var i : words) {
            ss.add(i);
        }
        while (!ss.isEmpty()) {
            System.out.println(ss.first());
            ss.remove(ss.first());
        }
    }
}
