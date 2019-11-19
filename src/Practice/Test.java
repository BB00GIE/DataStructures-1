package Practice;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        System.out.print(reverse("cherry"));
        List<String> lstStr = new ArrayList<String>();
    }

    public static String reverse(String message){
        int a = message.length()-1;
        int b = 0;
        if (a < b){
            return message;
        }
        return message.charAt(a) + reverse(message.substring(b,a));
    }


}
