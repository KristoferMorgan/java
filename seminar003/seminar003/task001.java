package seminar003;

import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;
public class task001 {
  public static void main(String[] args) {

    createAndSortArray(10, 100);
 

  }

  static void createAndSortArray(int n, int maxValue) {
    // заполнить список n случайными числами, отсортировать список методом сорт и
    // вывести на экран
    ArrayList<Integer> myList = new ArrayList<>();
    Random random = new Random();

    for (int i = 0; i < n; i++) {
      myList.add(random.nextInt(maxValue));
    }
    System.out.println(myList);
    myList.sort(null);

    Iterator<Integer> iterator = myList.iterator(); // для того, чтобы посмотреть как работает итератор
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + " ");
    }

     System.out.println(myList);

  }
}

