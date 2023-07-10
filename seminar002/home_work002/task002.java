package seminar002.home_work002;

import java.io.IOException;
import java.util.logging.*;
public class task002 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task002.class.getName());
        FileHandler fh = new FileHandler("logTask2.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Sort Array");
        int [] array = {2, 5, 1, -7, 3, 64, 0};
        printArrayInt(array);
        int[] newArr = listSort(array);
        System.out.printf("\n Отсортированный массив: \n");
        printArrayInt(newArr);
    }
    private static void printArrayInt(int[] array) {
 
        for (int i = 0; i < array.length; i++) 
            System.out.println(array[i]);
    }
    public static int[] listSort(int [] arr){
        for(int k = 0; k < arr.length-1; k++) {
            
            for (int i = 0; i < arr.length - k-1; i++){
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }
    
}