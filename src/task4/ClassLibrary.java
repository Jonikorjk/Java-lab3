package task4;

import java.util.List;

public class ClassLibrary {
    public static <T extends Number> int findIndexOfFirstZeroElem(List<T> list)  {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(0)) {
                return i;
            }
        }
        return -1;
    }

    public static <T extends Number> int countOfNegativeNumbers(List<T> list) {
        int negativeNumberCounter = 0;
        for (int i = 0; i < list.size(); i++) {
                if  (list.get(i).doubleValue() < 0) {
                negativeNumberCounter++;
            }
        }
        return  negativeNumberCounter;
    }

    public static <T extends Number> T lastNegativeElement(List<T> list) {
        T lastNegativeNumber = null;
        for (int i = 0; i < list.size(); i++) {
            if  (list.get(i).doubleValue() < 0) {
                lastNegativeNumber = list.get(i);
            }
        }
        return lastNegativeNumber;
    }
}
