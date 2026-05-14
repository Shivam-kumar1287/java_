import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class hashmap {

    public static void main(String[] args) {

        // HashMap<Integer, String> map = new HashMap<>();

        // map.put(101, "Shivam");
        // map.put(102, "Rahul");
        // map.put(102, "Rahul");
        // map.put(103, "Aman");

        // System.out.println(map);

        // System.out.println(map.get(101));

        // map.remove(102);

        // System.out.println(map.containsKey(103));

        // for(Map.Entry<Integer,String> e : map.entrySet()) {
        //     System.out.println(e.getKey()+" "+e.getValue());
        // }

        // HashMap<Integer, Integer> map2 = new HashMap<>();
        // map2.put(1, 10);
        // map2.put(2, 20);
        // System.out.println(map2);

    //     
    
     
        int[] arr = {1, 2,  3, 2,  4};

        // Create HashMap
        HashMap<Integer, Integer> map = new HashMap<>();

        // Frequency Count
        for (int num : arr) {

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Print Key and Value
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
            if(map.get(key) > 1) {
                System.out.println("Duplicate: " + key);
            }
        }
}
}