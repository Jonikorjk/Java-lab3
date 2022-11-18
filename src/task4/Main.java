package task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Integer[] arr = {1,0,3,4,5,0};
        list.addAll(Arrays.asList(arr));
        int a = ClassLibrary.findIndexOfFirstZeroElem(list);


        List<Byte> byteList = new ArrayList<>();
        Byte[] byteArr = {0,1,-5, 5, 1, 5};
        byteList.addAll(Arrays.asList(byteArr));
        int b = ClassLibrary.countOfNegativeNumbers(byteList);
        System.out.println(a);
        System.out.println(b);

        List<Double> doubleList = new LinkedList<>();
        Double[] doubleArr = {-3.0, -100.0, 4.0, -5.0};
        doubleList.addAll(Arrays.asList(doubleArr));
        var c = ClassLibrary.lastNegativeElement(doubleList);
        System.out.println(c);

    }
}
