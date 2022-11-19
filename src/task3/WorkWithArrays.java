package task3;

public class WorkWithArrays {
    public static<T> void swapGroupsOfElements(T[] arr1, T[] arr2) {
        if (arr1 == null || arr2 == null || arr1.length != arr2.length) {
            System.out.println("Bad arrays");
            return;
        }
        for (int i = 0; i < arr1.length; i++) {
            T temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp;
        }
    }
    public static<T> void swapPairsOfElements(T[] arr) {
        if (arr == null) {
            System.out.println("Bad array");
            return;
        }
        for (int i = 0; i < arr.length - 1; i += 2) {
            T temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

    }
    public static<T> void replaceGroupOfElements(T[] arr1, T[] arr2) {
        if (arr1 == null || arr2 == null || arr1.length != arr2.length) {
            System.out.println("Bad arrays");
            return;
        }
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr2[i];
        }
    }
}
