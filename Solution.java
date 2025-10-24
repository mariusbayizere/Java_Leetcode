import  java.util.*;

public  class Solution{

    public static  String isPalindrome(int x){
        if (x < 0){
            return  "Invalid Number. Please Provide the Positive Number";
        }
        int ReversedNumber = 0;
        int storedNumber = x;
        while (x > 0){
            ReversedNumber = (ReversedNumber * 10) + (x % 10);
            x = x / 10;
        }
        if (ReversedNumber == storedNumber){
            return  "is Pendrome";
        }
        return  "is not perndorne Number";
    }

}

class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(Solution.isPalindrome(number));
    }
}