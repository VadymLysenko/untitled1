package day_63_colections;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack<String> bookStack = new Stack<>();
        bookStack.add("Harry Potter");
        bookStack.add("Leaders eat last");

        System.out.println(bookStack.pop());

        System.out.println(bookStack);
    }
}
