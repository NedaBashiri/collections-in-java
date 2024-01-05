package list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static <T extends Number> void sumElements(List<T> list1, List<T> list2) {

        int size = (list1.size() >= list2.size()) ? list2.size() : list1.size();
        long sum = 0;

        for (int i = 0; i < size; i++) {
            T element1 = list1.get(i);
            T element2 = list2.get(i);
            sum = sum + (element1.longValue() + element2.longValue());
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        List<Integer> intList1 = new ArrayList<>();
        intList1.add(1);
        intList1.add(8);
        intList1.add(10);
        intList1.add(4);
        List<Integer> intList2 = new ArrayList<>();
        intList2.add(9);
        intList2.add(2);
        intList2.add(0);
        intList2.add(6);
        intList2.add(4);
        intList2.add(6);

        sumElements(intList1, intList2);
    }
}



