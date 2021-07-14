package day_62_collections;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> friends = new LinkedList<>();
        //polymorphism
        List<Integer> scores = new LinkedList<>();
        scores.add(5);
        scores.add(42);
        scores.add(23);
        scores.add(42);
        System.out.println(scores);
        System.out.println(scores.get(0));
        System.out.println(scores.get(2));

        friends.add("Mahliya");
        friends.add("Abbas");
        friends.add("Nevzat");
        System.out.println(friends);
    }
}
