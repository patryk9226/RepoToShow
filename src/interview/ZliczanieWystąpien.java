package interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;

public class ZliczanieWystąpien {

    // int[] numbers = new int[] {1,2,3,2,5,3}
    public static void main(String[] args) {
        liczWystapenia(new int[] {1,3,21});

    }

    public static void liczWystapenia(int[] numbers) {
        Map<Integer, Integer> occurances = new HashMap<>();
        for (int i=0; i<numbers.length; i++ ) {
            if (occurances.containsKey(numbers[i])) {
                Integer value = occurances.get(numbers[i]);
                occurances.put(numbers[i], value+1);
            } else {
                occurances.put(numbers[i],1);
            }
        }
        for (Integer key : occurances.keySet()) {
            System.out.println("Liczba " + key + " występuje " + occurances.get(key));
        }
    }
}
