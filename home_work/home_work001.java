package home_work;
import java.util.Scanner;
public class home_work001 {

    static int indexNumber(int n){
        int sum = 0;
        for(int count = 0;count < n;count++){
            sum += count + 1;
        }
        return sum;
    }

    static int fact(int n){
        int result = 1;
        for (int count = 0;count < n;count++){
            result *= count + 1;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int n = 0;
        System.out.printf("Enter number N: ");
        n = myScanner.nextInt();
        System.out.printf("Your triangular number %d is: %s",n,indexNumber(n));
        System.out.println();
        System.out.printf("The product of your numbers %d is: %s",n,fact(n));
        myScanner.close();
    }
}
