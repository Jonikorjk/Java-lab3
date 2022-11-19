package task3;

import java.util.*;

public class Main {
    public static <T> void test(T[] arr1, T[] arr2) {
        System.out.println("\nINITIAL ARRAYS:\n");
        System.out.println(Arrays.asList(arr1));
        System.out.println(Arrays.asList(arr2));
        System.out.println("\nINTERCHANGE OF TWO GROUP OF ELEMENTS:\n");
        WorkWithArrays.swapGroupsOfElements(arr1, arr2);
        System.out.println(Arrays.asList(arr1));
        System.out.println(Arrays.asList(arr2));
        System.out.println("\nEXCHANGE OF PLACES OF ALL PAIRS OF ADJACENT ELEMENTS (with even and odd index):\n");
        WorkWithArrays.swapPairsOfElements(arr1);
        WorkWithArrays.swapPairsOfElements(arr2);
        System.out.println(Arrays.asList(arr1));
        System.out.println(Arrays.asList(arr2));
        System.out.println("\nREPLACING aA GROUP OF ELEMENTS WITH ANOTHER ARRAY OF ELEMENTS:\n");
        WorkWithArrays.replaceGroupOfElements(arr1, arr2);
        System.out.println(Arrays.asList(arr1));
        System.out.println(Arrays.asList(arr2));
    }


    public static void main(String[] args) {
        Integer[] intArr1 = {-1, 2, 3};
        Integer[] intArr2 = {6, 7, -68};
        Double[] doubleArr1 = {1.1, -1.2, 1.3};
        Double[] doubleArr2 = {32.1, 23.12, -75.3, 66.4};
        Double[] doubleArr3 = {1.1, -1.2, 1.3};
        Double[] doubleArr4 = {32.1, 23.12, -75.4};
        String[] stringArr1 = {"Hi", "there"};
        String[] stringArr2 = {"bye", "here"};

        System.out.println("\nInteger:");
        test(intArr1, intArr2);
        System.out.println("\nDouble:");
        test(doubleArr1, doubleArr2);
        test(doubleArr3, doubleArr4);
        System.out.println("\nString:");
        test(stringArr1, stringArr2);
    }

}

