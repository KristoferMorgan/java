// Написать метод, который переведет число из римского формата записи в арабский.
package seminar005;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task002 {
    public static void main(String[] args) {
        
    }
    static void ex2(){
        Map<Character,Integer> rimNums = new HashMap<>();
        rimNums.put('I',1);
        rimNums.put('V',5);
        rimNums.put('X',10);
        rimNums.put('L',50);
        rimNums.put('C',100);
        rimNums.put('D',500);
        rimNums.put('M',1000);

        Scanner input = new Scanner(System.in);

        System.out.print("Input a number in a Rome case: ");
        char[] romeNumber = input.nextLine().toUpperCase().toCharArray();
        int res = 0;

        for (int i = 0; i < romeNumber.length; i++) {
            if(i !=romeNumber.length - 1 && rimNums.get(romeNumber[i])< rimNums.get(romeNumber[i + 1])){
                res +=rimNums.get(romeNumber[i + 1]) - rimNums.get(romeNumber[i]);
                i++;
            }
             else {res += rimNums.get(romeNumber[i]);
            }

        }
        System.out.println(res);
        input.close();

    }
    
}
