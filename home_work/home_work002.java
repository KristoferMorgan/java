package home_work;
import java.util.Scanner;

public class home_work002 {
    public static  void main(String[] args){
        int count = 0;

        System.out.println("Enter number n:");
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();

            for(int i = 1;i < n;i++ ){
                if(isPrimeNum(i)){
                    System.out.print(i+"\f");
                    count++;
                if(count % 10 == 0){
                    System.out.println();
                }
            }
        }
        myScanner.close();
    }


    public static boolean isPrimeNum(int i){
        boolean f = false;
        for(int j = 2;j < i;j++){
            if(j == (i - 1)){
                f = true;
            }
        if ((i % j) == 0){
            break;
            }
        }
    return f;
    }
    
}