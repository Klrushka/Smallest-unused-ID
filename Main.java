
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int  unusedId = 0;
        int[] arr = {1,2,3,4}; // это просто для тестов и можно удалить и использовать свой массив

        HashSet<Integer> unic = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            unic.add(arr[i]);
        }
        while (unic.contains(unusedId)){
            unusedId++;
        }
        System.out.println(unusedId);

    }
}

