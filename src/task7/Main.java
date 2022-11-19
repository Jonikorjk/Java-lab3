package task7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        OwnContainer<Integer> a = new OwnContainer<>(0, 4);
        a.add(18);
        a.add(0);
        a.add(-5);
        a.add(234);
        System.out.println("Initial array:");
        System.out.println(a);
        a.set(2, -11);
        System.out.println("Replacing the value for the third element:");
        System.out.println(a);
        a.remove(1);
        System.out.println("Removing the second element:");
        System.out.println(a);
    }
}
