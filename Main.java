public class Main {

    public static void main(String[] args) {
        ParenthesesBalanceChecker checker = new ParenthesesBalanceChecker();
        System.out.println(checker.isBalanced("(())"));
        System.out.println(checker.isBalanced("(a()b()c)"));
        System.out.println(checker.isBalanced("(()"));
        System.out.println(checker.isBalanced(")("));
        System.out.println(checker.isBalanced(""));
        System.out.println(checker.isBalanced(null));
    }

}