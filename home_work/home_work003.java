package home_work;
import java.io.Reader;
import java.util.Scanner;

public class home_work003 {
    public static void main(String[] args){
        double numberOne;
        double numberTwo;
        double result;
        char operation;
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter two number: ");
        numberOne = myScanner.nextDouble();
        numberTwo = myScanner.nextDouble();
        System.out.print("\nEnter operation (+,-,*,/): ");
        operation = myScanner.next().charAt(0);
        switch (operation) {
            case '+': result = numberOne + numberTwo;
                break;
            case '-': result = numberOne - numberTwo;
                break;
            case '*': result = numberOne * numberTwo;
                break;
            case '/': result = numberOne / numberTwo;
                break;
            default:
                System.out.printf("There is no such operation!!!");
                return;
        }
        System.out.printf(numberOne + " " + operation + " " + numberTwo + " = 23" + result );
    }
    
}
