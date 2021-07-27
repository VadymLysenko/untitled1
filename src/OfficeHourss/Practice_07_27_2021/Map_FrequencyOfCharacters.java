package OfficeHourss.Practice_07_27_2021;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_FrequencyOfCharacters {

    public static void main(String[] args) {
        FrequencyTest("apple");
        frequencyOfEachChar("apple");
        FrequencyTest("!@#$%^&*55557777");
    }

    public static void FrequencyTest(String str){


        // correct way as word
        //Map<Character,Integer> map = new LinkedHashMap<>();
        //it gives compiler order
        //Map<Character,Integer> map = new HashMap<>();
        // alphabetical order
        Map<Character,Integer> map = new TreeMap<>();

        for (Character each : str.toCharArray()) {
            if (map.containsKey(each)){
                map.put(each,map.get(each) + 1);
            }else{
                map.put(each,1);
            }
        }
        System.out.println(map);
    }

    public static void frequencyOfEachChar (String str){
        Map<Character,Integer> letters = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);

            if(!letters.containsKey(key)){
                letters.put(key,0);
            }
            letters.put(key,letters.get(key)+1);
        }
        System.out.println(letters);
    }


}
