package Chapter22;

import java.util.ArrayList;
import java.util.List;

public class PerformanceTest<fori> {
    public static void main(String[] args) {

//        System.out.println(getTime(6E8));
//        System.out.println(tower(3));
        //System.out.println(fibo(2));
        //fibo(3);
        //System.out.println(GCD(12, 24));
        //System.out.println(isPrime(1234567));
        //primeFinder(1000);
        System.out.println(primes(1000));
    }
public static List primes(int num){
        List<Integer> list=new ArrayList<>();
   for(int i=2;i<=num;i++){
       if(isPrime(i))
           list.add(i);
   }
return list;
}




    public static List primeFinder(int num) {
        List<Integer> list = new ArrayList<>();

        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                list.add(i);
                num/=i;
                i--;
            }
        }
        System.out.println(list);


        return list;
    }

    public static boolean isPrime(int num) {
        int divisor = 1;
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                divisor = i;
                System.out.println(divisor);
                return false;
            }
        }

        return true;


    }


    public static int GCD(int num1, int num2) {
        int gcd = 1;
        int min = num1 < num2 ? num1 : num2;
        int max = num1 > num2 ? num1 : num2;
        if (max % min == 0) return min;
        for (int i = (min / 2); i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }


    public static long fibo(int num) {
        if (num <= 1) {
            return 1;
        }
        return fibo(num - 1) + fibo(num - 2);
    }


    public static int tower(int disk) {
        if (disk == 1) {
            return 1;
        }
        return 2 * tower(disk - 1) + 1;
    }


    public static long getTime(double num) {
        long start = System.currentTimeMillis();
        int k = 1;
        for (int i = 0; i < num; i++) {
            k = k + 5;
        }
        long finish = System.currentTimeMillis();
        return finish - start;


    }


}
