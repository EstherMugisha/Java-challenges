package Integers;

public class RecursiveFactorial {
    public static int factorial(int num){
        if(num > 1){
            return num * factorial(num - 1);
        }
        else
            return 1;
    }

    public static void main(String[] args) {
        System.out.println(factorial(6));
    }
}
