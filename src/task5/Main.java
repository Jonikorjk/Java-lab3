package task5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        Set<Character> delimiters = new HashSet<Character>(
                Arrays.asList(' ', '.', ',', ':', ';', '?', '!', '-', '(', ')', '\"'));
        SortedSet<String> words = new TreeSet<String>();
        String temp = "";
        for (int i = 0; i < sentence.length(); i++) {
            if (!delimiters.contains(sentence.charAt(i))) {
                temp += sentence.charAt(i);
                if (i < sentence.length() - 1) continue;
            }
            if (temp != "") words.add(temp);
            temp = "";
        }
        System.out.println(words);
    }
}



