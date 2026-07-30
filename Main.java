import java.util.List;

public class Main {

    public static void main(String[] args) {
        int limit = 13;
        List<Integer> primes = PrimeFinder.findPrimesUpTo(limit);
        System.out.println(primes);
    }

}