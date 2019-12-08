package fall2019.FinalPractice;

import java.util.*;

public class FinalPractice {

    private static void main(String[] args) {

    }

    public static Queue<String> merge(Queue<String> A , Queue<String> B , boolean StartA) {
        Queue<String> out = new LinkedList<String>();
        while (!A.isEmpty() || !B.isEmpty()) {
            //Alternate enqueueing into out
        }
        return out;
    }

    public static String bottom(Stack<String> stack) {
        String out = "";
        Stack<String> buffer = new Stack<>();
        while (!stack.isEmpty()) {
            out = stack.pop();
            buffer.push(out);
        }

        while (!buffer.isEmpty()) {
            stack.push(buffer.pop());
        }
        return out;
    }
}

    class PrintJob {
        int priority;//1 = highest, 2 = Medium, 3 = lowest
        String text;



        public static Queue<PrintJob> printJobQueue(List<PrintJob> list) {
            Queue<PrintJob> out = new LinkedList<>();
            for (int i = 1; i<=3; i++){
            for (PrintJob j : list) { // Could use an iterator
                if (j.priority == i) {
                    out.add(j);
                }
            }
        }
            return out;
    }
    }


