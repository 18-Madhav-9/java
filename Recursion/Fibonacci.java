import java.util.HashMap;

public class Fibonacci {

    static HashMap<Integer,Integer> map = new HashMap<>() ;
    static int fib(int n) {
        
        if ( n == 0) return 0 ;
        else if ( n == 1 ) return 1 ;
        int result = 0 ;
        if ( map.containsKey(n) ){
            result = map.get(n);
        }
        result = fib(n-1)+fib(n-2) ;
        map.put(n, result);
        return result ;
    }
}
