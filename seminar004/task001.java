// 1) Замерьте время, за которое в ArrayList добавятся 1000000 элементов. 
//2) Замерьте время, за которое в LinkedList добавятся 1000000 элементов. 
// Сравните с предыдущим.


package seminar004;

import java.util.ArrayList;
import java.util.LinkedList;

public class task001 {
    
    public static void main(String[] args){
        timeComparing();
    }


    static void timeComparing(){
        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();

        long start1 = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            al.add(5);
            
        }
        System.out.println(System.currentTimeMillis() - start1);

        long start2 = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            al.add(5);
            
        }
        System.out.println(System.currentTimeMillis() - start2);
    }
    
}
