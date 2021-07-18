package day_63_colections;

import java.util.HashMap;
import java.util.Map;

public class MapsExample {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"James");
        map.put(2,"Anna");
        map.put(3,"Daria");
        map.put(100,"Maxim");


        System.out.println("map = " + map);
        System.out.println(map.get(100));

        map.remove(1);
        System.out.println(map);
        map.put(1,"Kinga");
        map.remove(2);
        map.put(2,"Kinga");
        map.remove(3);
        map.put(3,"Kinga");
        map.remove(100);
        System.out.println(map);
        map.remove("Maxim");

        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Anna"));

        for(Integer key : map.keySet()){
            System.out.println(key + " - " + map.get(key));

            if(map.get(key).equals("Kinga")){
                System.out.println("our key " + key);
            }
        }



    }
}
