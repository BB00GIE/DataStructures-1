package Fall2019.ch05;

public class Recursion {
    public static void main(String[] args) {
        for(int n = 1; n<=11; n++) {
            System.out.printf("FactorialD(%d) = %d \n" , n , FactorialD(n));
            System.out.printf("FactorialR(%d) = %d \n" , n , FactorialR(n));

        }
    }
    // Recursion
    static public int FactorialR(int n) {
        int ans = 0;
        int x = n;
        if (n <= 0) {
            x = 1;
            return x;
        }
         x *= FactorialR(x-1);
        return x;
    }
    static public int FactorialD(int n) {
        int x = 1;
        for(int i = 1; i<=n;i++){
            x *= i;
        }
        return x;
    }


}
