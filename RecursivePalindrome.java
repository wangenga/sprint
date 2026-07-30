package sprint;

public class RecursivePalindrome {
    public boolean isPalindrome(String str) {
        if (str == null){
            return false;
        }

        int begin = 0;
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int stop = str.length() - 1;
        
        return isPalindromeHelper( str, begin, stop);

    }

    private boolean isPalindromeHelper(String str, int start, int end) {
        if (start >= end){
            return true;
        }
        
        if (str.charAt(start) != str.charAt(end)){
            return false;
        }

        return isPalindromeHelper(str, start + 1, end - 1);
    }
}