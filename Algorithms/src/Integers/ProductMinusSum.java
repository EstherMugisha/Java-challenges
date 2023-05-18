package Integers;

public class ProductMinusSum {
    public static int productMinusSum(int num){
        int sum=0;
        int product=1;
        while(num !=0){
            sum =sum + (num%10);
            product = product * (num%10);
            num = num/10;
        }
        return product - sum;
    }

    public static void main(String[] args) {
        System.out.println(productMinusSum(324));
    }
}
