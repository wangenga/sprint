package sprint;

public class ParenthesesBalanceChecker {
    public boolean isBalanced(String str) {
        if (str == null){
            return false;
        }

        

        if (str.length() % 2 != 0 ){
            return false;
        }
        
        return checkBalance(str, 0, 0);
        

    }

    private boolean checkBalance(String str, int index, int balance) {
        
        if(balance < 0){
            return false;
        }
        
        if (str.length() == index ){
            return balance ==  0;
        }
        
        if (str.charAt(index) == '('){
                balance = balance + 1;
            }else if (str.charAt(index) == ')'){
                balance = balance - 1;
        } 

        return checkBalance(str, index + 1, balance);
    }
}