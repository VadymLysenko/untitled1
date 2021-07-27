package OfficeHourss.Practice_07_27_2021;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {
        System.out.println(isBalanced("[]{}()[]{}()"));
        System.out.println(isBalanced2("{}[]()"));
    }

    public static boolean isBalanced(String exp) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');


        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(exp.charAt(i));
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty())
                    return false;
            } else if (exp.charAt(i) != map.get(stack.pop())) {
                return false;
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean isBalanced2(String str){
        String open = "{[(";
        Stack<Character> stack =new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put('{','}'); map.put('[',']'); map.put('(',')');

        for (int i = 0; i < str.length(); i++) {
            if(open.contains(""+str.charAt(i))){
                stack.push(str.charAt(i));
            }else{
                if (stack.isEmpty()||str.charAt(i)!=map.get(stack.pop())){
                    return false;
                }
            }

        }
        return stack.isEmpty();

    }
}
