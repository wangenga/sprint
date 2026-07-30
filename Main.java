public class Main {

    public static void main(String[] args) {
        RecursivePalindrome checker = new RecursivePalindrome();
        System.out.println(checker.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(checker.isPalindrome("race a car"));
        System.out.println(checker.isPalindrome(""));
        System.out.println(checker.isPalindrome("a"));
        System.out.println(checker.isPalindrome("   "));
        System.out.println(checker.isPalindrome(null));
    }

}