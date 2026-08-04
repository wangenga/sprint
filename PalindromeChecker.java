//package sprint;

public class PalindromeChecker {
    public static boolean isPalindrome(String x){
        if (x == null) return false;

        String clean = x.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reverse = new StringBuilder(clean).reverse().toString();
        return clean.equals(reverse);
    }
    
}
