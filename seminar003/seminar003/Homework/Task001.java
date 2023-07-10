// 1.Пусть дан произвольный список целых чисел.

//  1) Нужно удалить из него чётные числа
//  2) Найти минимальное значение
//  3) Найти максимальное значение
//  4) Найти среднее значение


package seminar003.Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task001 {
    public static void main(String[] args) {
    ArrayList<Integer> mylList = new ArrayList<Integer>();
    listRandom(mylList);
    System.out.printf("This is your array: %s\n",mylList);
    deleteEvenNumbers(mylList);
    System.out.printf("This is your array without even numbers: %s\n",mylList);
    System.out.printf("This is your maximum value: %s\n",Collections.max(mylList));
    System.out.printf("This is your minimum value: %s\n",Collections.min(mylList));
    System.out.printf("This is the average value: %s\n",getAverage(mylList));

    }
    
    static void prinArrayList(ArrayList<Integer>arr){
        for(int number: arr ){
        System.out.println(number);
        }
    }


    static ArrayList<Integer>  listRandom(ArrayList<Integer> arr){
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int variable = r.nextInt(1,100);
            arr.add(variable);
        }
        return arr;
    }
    
    
    static ArrayList<Integer> deleteEvenNumbers(ArrayList<Integer> arr){
        int count = 0;
        while(count < arr.size())
            if (arr.get(count) % 2 == 0){
                arr.remove(count);
            }
            else{
                count++;
            }
            return arr;
            
        }
        static double getAverage(List<Integer> list) {
        return list.stream()
                .mapToInt(a -> a)
                .average().orElse(0);
    }

}


