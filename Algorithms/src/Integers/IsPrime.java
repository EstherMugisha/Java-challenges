package Integers;

public class IsPrime {
    public static boolean checkIfPrime(int num){
        boolean result = false;
        for(int i=2; i<=num/2; i++){
            if(num%i == 0){
                result =  true;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(checkIfPrime(7));
    }
}
