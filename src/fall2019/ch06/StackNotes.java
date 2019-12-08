package fall2019.ch06;

import java.util.List;
import java.util.Stack;

public class StackNotes {
    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        Stack<String> stk = new Stack();
        stk.push("Target");
        stk.push("Item");
        stk.push("Item");
        stk.push("Item");
        stk.push("Item");
        /*System.out.println("1  " + stack.empty());
        stack.push("Apple");
        System.out.println("2  " + stack.empty());
        stack.push("Orange");
        System.out.println("3  " + stack.peek());
        stack.push("peach");
        System.out.println("4  " + stack.peek());
        //String x = stack.pop();
        //System.out.println("5  " + x);
        //String y = stack.pop();
        //System.out.println("6  " + y);
        //String z = stack.pop();
        //System.out.println("7  " + z);

       try {
            String q = stack.pop();
            System.out.println("8  " + q);
        } catch(Exception e){
            System.out.println("Stack is empty cannot pop");
        }


        stack.push("Cocconut");
        System.out.println("9  " + stack.empty());
        stack.push("Cherry");
        System.out.println("10  " + stack.peek());
        String[] src = {"bird", "cat", "dog", "fish"};
        reverseOrder(src);
        System.out.println(stack);
        System.out.println(reverseOrder2(src));
        System.out.println(Match("()"));
        System.out.println(Match("{((()))}"));
        System.out.println(Match("}((()))("));
        System.out.println(Match("[][[]][][]"));

         */


        System.out.println(FindStringR("Target",stk));
        stk.push("Target");
        stk.push("Item");
        stk.push("Item");
        stk.push("Item");
        stk.push("Item");
        System.out.println(FindStringR("Target",stk));
        stk.push("Target");
        stk.push("Item");
        stk.push("Item");
        stk.push("Item");
        stk.push("Item");
        /*System.out.println(numCHarsR(stk));
        stk.push("Target");
        System.out.println(numCHarsR(stk));

         */
    }
    static public String[] reverseOrder(String[] source) {
        String[] out = new String[source.length];
        int j = 0;
        for (int i = source .length-1; i >= 0; i-- ){
            out[j] = source[i];
        }
        return out;
    }
    static public Stack<String> reverseOrder1(Stack<String> source) {
        Stack<String> out = new Stack();
        while(source.empty() == false) {
            out.push(source.pop());
        }
        return out;
    }

    public static String[] reverseOrder2(String[] source) {
        Stack<String> buffer = new Stack();
        String[] out = new String[source.length];
        for(int i = 0 ; i < source.length; i++) {
            buffer.push(source[i]);
        }
        int j = 0;
        while (!buffer.empty()) {
          out[j++] = buffer.pop();
        }
        return out;
    }

    public static boolean Match(String exp) {
        Stack<Character> Delimiter = new Stack();
        final String open = "([{";
        final String close = ")]}";
        for(char ch : exp.toCharArray()) {
            if (open.indexOf(ch) != -1) {
                Delimiter.push(ch);
            }
            else if(close.indexOf(ch) != -1) {

                if (Delimiter.isEmpty()) {
                    return false;
                }
                Delimiter.pop();
            }

            if (close.indexOf(ch) != open.indexOf(Delimiter.pop())) {
                    return false;
                }
        }
        return Delimiter.isEmpty();
    }

    public static int numChars (Stack<String> stack) {
        int totalChars = 0;
        while (!stack.isEmpty()) {
            totalChars += stack.pop().length();
        }
        return totalChars;
    }

    //class MyBook {}
/*
    public static boolean isString (MyBook target, Stack s){
        while(!s.isEmpty()){
            if (target.equals(s.pop())){
                return true;
            }
        }
        return false;
    }

 */

    public static boolean isString(String target, Stack s){
        while(!s.isEmpty()){
            if (target.equals(s.pop())){
                return true;
            }
        }
        return false;
    }


    public static boolean FindStringR(String target, Stack s){
        if (s.isEmpty()){
            return false;
        }
        if (target.equals(s.pop())){
            return true;
        }
        return FindStringR(target,s);

    }


    public static int numCHarsR(Stack<String> s){
        if (s.isEmpty()){
            return 0;
        }
        String a = s.pop();
        return a.length() + numCHarsR(s);
    }

    static public boolean find_R(List<String> s, String Target){
        if (s.isEmpty()){
            return false;
        }
        String a = s.get(0);
        s.remove(0);
        if (Target.equals(a)){
            return true;
        }
        return find_R(s,Target);
    }

    public static void Permutations(String s) {
        return;
    }

}
