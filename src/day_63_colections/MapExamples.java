package day_63_colections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapExamples {
    public static void main(String[] args) {

        // id, Person
        Map<Integer, Person> map2 = new LinkedHashMap<>();
        map2.put(32,new Person("MJ",32));
        map2.put(null,new Person("",0));
        map2.put(12,new Person("Nick",10));

        System.out.println(map2.get(12));
        System.out.println(map2.get(null));
        System.out.println(map2.get(32));

        System.out.println(map2);
    }
}
