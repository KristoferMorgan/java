// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре 
// будут повторяющиеся имена с разными телефонами,
// их необходимо считать, как одного человека с разными телефонами.
//  Вывод должен быть отсортирован по убыванию числа телефонов.
package seminar005.home_work;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class task {

    public static void main(String[] args) {
        Map<String,LinkedList<String>> NameAndTelephone = new HashMap<>();
         Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number for the action:\n 1 = Record a contact\n2 = Read the phone book\n3 = delete contact\n 4 = exit\n:");
        try {
            int key = myScanner.nextInt();
            myScanner.close();
            switch(key){
                case(1):
                    record(NameAndTelephone);
                    break;
                case(2):
                    reader(NameAndTelephone);
                    break;
                case(3):
                    delete(NameAndTelephone);
                    break;
                case(4):
                    break;
            
                default:
                    System.out.println("You entered an incorrect value");
            }
        } catch (Exception e) {
            System.out.println("You didn't enter a number");
            myScanner.close();
        }
        System.out.println(NameAndTelephone);
    }

    static Map<String,LinkedList<String>> record(Map<String,LinkedList<String>>telephonBook) {
        Scanner myScanner = new Scanner(System.in);
        int countRecord = 0;
        System.out.println("Enter the number of contacts you want to add to the phone book:");
        int contactCounterMax = myScanner.nextInt();
        while(countRecord < contactCounterMax){
            System.out.println("Enter Your Last Name");
            String lastName = myScanner.next();
            System.out.println("Enter your name");
            String name = myScanner.next();
            System.out.println("Enter your Patronymic");
            String patronymic = myScanner.next();
            String resultName = lastName + " " + name + " " + patronymic;
            System.out.println("How many phone numbers do you want to add to this contact?");
            countRecord++;
            int countTelephonNumberMax = myScanner.nextInt();
            int countTelephonNumber = 1;
            while(countTelephonNumber <= countTelephonNumberMax){
                System.out.printf("Enter the %s phone number\nThe phone number is entered from 8, not from +7",countTelephonNumber);
                String tephonNumber = myScanner.next();
                try {
                    if (telephonBook.containsKey(resultName)) {
                        telephonBook.get(name).add(tephonNumber);
                        } else {
                            telephonBook.put(name, new LinkedList<>());
                            telephonBook.get(name).add(tephonNumber);
                        }
                    
                } catch (Exception e) {
                    System.out.println("Incorrect phone number input.It is worth entering only numbers starting from 8 instead of +7");
                }
                
            }
            myScanner.close();
        }

        
        
        return(telephonBook);
    }

    static void reader(Map<String,LinkedList<String>>telephonBook) {
    }

    static Map<String,LinkedList<String>> delete(Map<String,LinkedList<String>>telephonBook) {
        return(telephonBook);
    }
    

    
}
