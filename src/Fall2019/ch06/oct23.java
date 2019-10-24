package Fall2019.ch06;
import java.util.ArrayList;

public class oct23 {

    public static int HappyNum(String num){
            ArrayList<Integer> list = new ArrayList<Integer>();
            String [] arr = num.split("");
            int ans = 0;
            int sum = 0;
            int i = 0;
            while( sum != 1 || i<100) {
                sum = 0;
                for (String a : arr) {
                    Integer number = Integer.valueOf(a);
                    sum += number * number;
                }
                if (list.contains(sum)) {
                    return ans;
                }
                if (sum == 1) {
                    ans = 1;
                    return ans;
                }
                arr = Integer.toString(sum).split("");
                list.add(sum);
                System.out.println(sum);
                i++;
            }
            return ans;
        }
        public static void main(String[] args) {
            int a = HappyNum("7");
            int b = HappyNum("12");
            System.out.println(a);
    }
    /*
    public static void testHappy(String num) {
        System.out.printf("the num %s is ====>  ", num, );
    }

     */
}

