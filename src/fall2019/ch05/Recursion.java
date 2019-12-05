package fall2019.ch05;
/*
Recursion is using a function within itself until it reaches one of the base cases.
 */
public class Recursion {
    public static void main(String[] args) {
        for (int num = 1; num<=10; num++){
            System.out.println(FibR(num));
        }
        //System.out.print(divider(12,3));
        //for (int n = 0; n <= 12; n ++) {
            //System.out.printf("FactorialD(%d) = %d \n" , n , FactorialD(n));
            //System.out.printf("FactorialR(%d) = %d \n" , n , FactorialR(n));
            //System.out.printf("sqSumD(%d) = %d \n" , n , sqSumD(n));
            //System.out.printf("sqSumD(%d) = %d \n" , n , sqSumR(n));
        //}
    }
    // Recursion
    static public int FactorialR(int n) {
        if (n == 0) {
            return 1;
        }
        return n * FactorialR(n-1);
    }
    static public int FactorialD(int n) {
        int x = 1;
        for(int i = 1; i<=n;i++){
            x *= i;
        }
        return x;
    }

    public static int sqSumD(int n) {
        int x = 0;
        for (int i = 1 ; i <= n; i++) {
            x += i * i;
        }
        return x;
    }
    public static int sqSumR(int n) {
        if (n == 0) {
            return 0;
        }

        return n * n + sqSumR(n-1);
    }

    public static int addArryD(int[] n) {
        int sum = 0;
        for (int i = 0; i< n.length; i++) {
            sum+=n[i];
        }
        return sum;
    }
    public static int addArryR(int[] data, int n) {
        if(n==0) {
            return 0;
        }
        return addArryR(data, n-1) + data[n-1];
    }

    public static int multiPos(int a, int b) {
        if( b == 0) {
            return 0;
        }
        return a + multiPos(a,b-1);
    }

    public static int Pow(int a, int pow) {
        if(pow == 0){
            return 1;
        }
        return a * Pow(a, pow-1);
    }

    public static int divider (int a, int b) {
        if (a < b){
            return 0;
        }
        return 1 + divider(a-b,b);
    }

    public static void Fib(int num) {
        int a = 1;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < num; i++) {
            b = a + b;
            a = b - a;
            System.out.println(b);
        }
    }

    public static int FibR(int num) {

    if (num == 1 || num == 2) {
        return 1;
    }
    return FibR(num - 2) + FibR(num-1);
    }

    public static int permutations(String s){
        return FactorialR(s.length());
    }

}

