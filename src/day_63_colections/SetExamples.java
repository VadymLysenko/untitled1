package day_63_colections;

import java.util.*;

public class SetExamples {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); // HashSet <> most common one
        // list -> ArrayList

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);

        System.out.println("set = " + set);

        Set<String> words = new HashSet<>();
        words.add("hello");
        words.add("world");
        words.add("java");
        words.add("java");
        words.add("collection");
        System.out.println("words = " + words);
        words.remove("java");
        words.remove("hello");
        System.out.println("words = " + words);

        for(String word : words){

        }

        List<String> wordsList = new ArrayList<>(words);
        wordsList.add("world");
        System.out.println(wordsList);


        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("24");
        linkedHashSet.add("java");
        linkedHashSet.add("$#");
        linkedHashSet.add("$#");
        linkedHashSet.add("$53");
        linkedHashSet.add("apple");
        linkedHashSet.add("apple");
        linkedHashSet.add("cucumber");

        System.out.println("linkedHashSet = " + linkedHashSet);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("24");
        treeSet.add("java");
        treeSet.add("$#");
        treeSet.add("$^");
        treeSet.add("$53");
        treeSet.add("apple");
        treeSet.add("apple");
        treeSet.add("cucumber");

        System.out.println("treeSet = " + treeSet);
        //((TreeSet)treeSet).first(); // stores elements into natural order



    }
}
