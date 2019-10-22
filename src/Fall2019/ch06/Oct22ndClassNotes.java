package Fall2019.ch06;
import java.util.Stack;
public class Oct22ndClassNotes {

    static public void main(String[] arg) {
        test(" 2 3 + ");           //  5
        test(" 1 2 + 5 + ");       //  8
        test(" 1 2 5 + + ");       //  8
        test(" 1 2 5 + + 4 + ");   //  12
        test(" 1 2 + 5 + 4 + ");   //  12
        test(" 1 2 + 5 4 + + ");   //  12
        test(" 2.1 3.5 + ");       //  5.6
        test(" 4 + 3 ");           // illegal
        test(" 2 + 6 + 1 ");       // illegal
        //
        // TO DO: Fix the code to evaluate the following:
        test(" 2 3 * ");             //  6
        test(" 1 2 + 5 * ");         //  15
        test(" 3 2 * 5 + ");         //  11
        test(" 10 6 - ");            //  4
        test(" 3 * 7 ");             //  illegal
        test(" 10 2 / 1 + ");        //  6
        test(" 12 5 6 * - ");        //  -18
        test(" 20 2 - 5.0 3.000 - / ");   //  9
        test(" 10 6 6 - /  ");            //  illegal
        test("1 2 + 3 4 + * 1 6 + /");    //  3
        //
        // TO DO:  Add more legal and illegal examples:
    }

    // TO DO: Fix the code so legal postfix
    //        involving + - * / are evaluated correctly
    static double eval(String postfix) {
        Stack<Double> stack = new Stack<>();
        String[] token = postfix.trim().split("\\s+");
        for (int i = 0; i < token.length; i++) {
            String tok = token[i];
            if(tok.equals("-")) {
                if(stack.empty()) {
                    return Double.NaN;
                }
                double a = stack.pop();
                if(stack.empty()) {
                    return Double.NaN;
                }
                double b = stack.pop();
                double c = b - a;
                stack.push(c);
            }
            else if(tok.equals("/")) {
                if(stack.empty()) {
                    return Double.NaN;
                }
                double a = stack.pop();
                if(stack.empty()) {
                    return Double.NaN;
                }
                double b = stack.pop();
                double c = b / a;
                stack.push(c);
            }
            else if(tok.equals("*") || tok.equals("x")) {
                if(stack.empty()) {
                    return Double.NaN;
                }
                double a = stack.pop();
                if(stack.empty()) {
                    return Double.NaN;
                }
                double b = stack.pop();
                double c = a * b;
                stack.push(c);
            }
            else if (tok.equals("+")) {
                if (stack.empty()) {
                    return Double.NaN;
                }
                double a = stack.pop();
                if (stack.empty()) {
                    return Double.NaN;
                }
                double b = stack.pop();
                double c = a + b;
                stack.push(c);
            } else {
                try {
                    double a = Double.parseDouble(tok);
                    stack.push(a);
                } catch (Exception e) {
                    return Double.NaN;
                }
            }
        }
        if (stack.empty()) {
            return Double.NaN;
        }
        double a = stack.pop();
        if (!stack.empty()) {
            return Double.NaN;
        }
        return a;
    }

    //
    //

    static void test(String postfix) {
        System.out.printf("%s ===> %6.4f\n",
                postfix, eval(postfix));
    }

}

