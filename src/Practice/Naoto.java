package Practice;

public class Naoto {
    private int x;


    public static void main(String[] arguments) {
       System.out.println(hello("Naoto"));
       System.out.println(math(2,3));
       System.out.println(hello("Brandon"));
       System.out.println(isEven(6));
        System.out.println(isEven(7));
    }

    private static String hello(String name) {
        return "Hello " + name;
    }

    private static  double math(double x, double y) {
        double z = x + y;
        return x * y * z;
    }

    private static boolean isEven (int num){
        if (num %2 == 0){
            return true;
        }
        return false;
    }
}
