package fall2019.Ch03;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            //peek(list);
            list.add("Apple");
            //peek(list);
            list.add("Pear");
            //peek(list);
            list.add("Orange");
            //peek(list);
            String z = list.get(1);
            System.out.println(z);
            //String y = list.set(1, "Bannana");
            //System.out.println(y);
            peek(list);
            //String x = list.remove(1);
            //System.out.printf("Just removed ======> %s\n", x);
            //peek(list);
            list.add("Kiwi");
            list.add("Durian");
            list.add("peach");
            list.add("Grape");
            //x = list.remove(2);
            //System.out.printf("Just removed ======> %s\n", x);
            //peek(list);
            list.add("peach");
            //peek(list);
            list.add("cocconut");
            //peek(list);
            list.add("peach");
            //list.sort(null);
            peek(list);
            //int a = list.indexOf("peach");
            //System.out.println(a);
            System.out.println(secondIndexOf(list,"peach"));
            System.out.println(secondIndexOf(list,2,"peach"));
            //System.out.println(list.get(8));
        }


        static void peek (List < String > lst) {
            for (int i = 0; i < lst.size(); i++) {
                System.out.printf("%s ", lst.get(i));
            }
            System.out.println();
        }
        static void peek (String[]lst){
            for (int i = 0; i < lst.length; i++) {
                System.out.printf("%s", lst[i]);
            }
            System.out.println();
        }
        static public int secondIndexOf(List<String> lst, String key) {
        int count = 0;
        for(int i = 0;i<lst.size();i++) {
            if (lst.get(i).equals(key)) {
                count ++;
            }
            if (count == 2) {
                return i;
            }
        }
        return -1;
        }
    static public int secondIndexOf(List<String> lst, int keyNum,   String key) {
        int count = 0;
        for(int i = 0;i<lst.size();i++) {
            if (lst.get(i).equals(key) && count == keyNum - 1) {
                return i;
            }
            count++;


        }
        return -1;
    }

    }
