package Fall2019.ch06;

import java.util.Stack;

public class StackNotes {
    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        System.out.println("1  " + stack.empty());
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

        /*try {
            String q = stack.pop();
            System.out.println("8  " + q);
        } catch(Exception e){
            System.out.println("Stack is empty cannot pop");
        }

         */
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
}
