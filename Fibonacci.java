import java.util.HashMap;

public class Fibonacci {

    static HashMap<Integer,Integer> map = new HashMap<>() ;
    static int fib(int n) {
        
        if ( n == 0) return 0 ;
        else if ( n == 1 ) return 1 ;
        else {
            int fib1 = 0 ;
            int fib2 = 0 ;
            if ( map.containsKey(n-1) ) {
                fib1 = map.get(n-1) ;
            }
            else {
                map.put(n-1,fib(n-1)) ;
                fib1 = map.get(n-1) ;
            }
            if ( map.containsKey(n-2) ) {
                fib2 = map.get(n-2) ;
            }
            else {
                map.put(n-2, fib(n-2));
                fib2 = map.get(n-2) ;
            }
            map.put(n, fib1+fib2) ;
            return fib1+fib2 ;
        }
    }
}
