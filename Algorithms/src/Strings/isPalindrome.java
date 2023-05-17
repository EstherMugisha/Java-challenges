package Strings;

//A word is a palindrome if it reads the same going forward and backward
public class isPalindrome {
    public static boolean checkIfPalindrome(String str){
        int leng = str.length();
        String result = "";
        for (int i=leng-1; i>=0; i--){
            result = result+str.charAt(i);
        }
        if(result.equals(str))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(checkIfPalindrome("Esther"));

    }
}
