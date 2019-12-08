package fall2019.ch06;
import java.util.Stack;
public class Oct17ClassNotes {


    public static void main(String[] args) {
        //test_split_string();
        //test_parsing();
        double a = eval("3.0 2.0 +");
        System.out.printf("___%4.2f___" , a);
    }

    static void test_split_string() {
        String expr = " 12 3.4 + 4.5 * ";
        // split by any number of consecutive spaces
        String[] token = expr.trim().split("\\s+");
        for(int i = 0 ; i<token.length; i++) {
            System.out.printf("___%s___\n", token[i]);
        }
    }

    static void test_parsing() {
        String numString = "  34.5";
        double num = Double.parseDouble(numString);
        System.out.printf("the number in %4.2f\n", num);
        try {
            numString = " 34.5.7";
            num = Double.parseDouble(numString);
            System.out.printf("the number in %4.2f\n" , num);
        } catch (NumberFormatException e) {
            System.out.println("This is not a number");
        }
    }
    static double eval(String postfix) {
        Stack<Double> calc = new Stack();
        String[] token = postfix.trim().split("\\s+");
        for (int i = 0 ;i < token.length; i++) {
            String tok = token[i];
            if (tok.equals("*")) {
                if(calc.empty()) {
                    return Double.NaN;
                }
                double a = calc.pop();
                if (calc.empty()) {
                    return Double.NaN;
                }
                double b = calc.pop();
                double c = a * b;
                calc.push(c);
            }
            if (tok.equals("/")) {
                if(calc.empty()) {
                    return Double.NaN;
                }
                double a = calc.pop();
                if (calc.empty()) {
                    return Double.NaN;
                }
                double b = calc.pop();
                double c = a / b;
                calc.push(c);
            }
            if (tok.equals("-")) {
                if(calc.empty()) {
                    return Double.NaN;
                }
                double a = calc.pop();
                if (calc.empty()) {
                    return Double.NaN;
                }
                double b = calc.pop();
                double c = a - b;
                calc.push(c);
            }
            if (tok.equals("+")) {
                if(calc.empty()) {
                    return Double.NaN;
                }
                double a = calc.pop();
                if (calc.empty()) {
                    return Double.NaN;
                }
                double b = calc.pop();
                double c = a + b;
                calc.push(c);
            } else {
                try {
                    double a = Double.parseDouble(tok);
                    calc.push(a);
                } catch (Exception e) {
                    return Double.NaN;
                }
            }
        }
        if (calc.empty()) {
            return Double.NaN;
        }
        double a = calc.pop();
        if(!calc.empty()) {
            return Double.NaN;
        }
        return a;
    }
}
