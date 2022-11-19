package task6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int minLengthOfPassword = 6;
        Map<String, String> kv = new TreeMap<>();
        kv.put("jkm", "password1");
        kv.put("lazy", "123");
        kv.put("liquid", "5abc");
        kv.put("krytiska", "ahaha123");

        for (var i : kv.entrySet()) {
            if (i.getValue().length() > minLengthOfPassword) {
                System.out.println("User name: " + i.getKey() + " . Password: " + i.getValue());
            }
        }
    }
}
