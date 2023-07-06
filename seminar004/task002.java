package seminar004;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя строку вида text~num;
//2. Рассплитить строку по ~,
//  сохранить text в связный список на позицию num;
// 3. Если введено print~num - 
// выводить строку из позиции num в связном списке и удалить её из списка.
// package seminar004;

public class task002 {
  

   static void ex2(){
        LinkedList<String> myList = new LinkedList<>();

        Scanner input = new Scanner(System.in);
        String data = "end";

        while(true) {
            System.out.printf("Input text~num, 0 <= num <= %d\n", myList.size());
            data = input.nextLine();
            if(data.equals("end")) return;
            changingList(myList, data);
            System.out.println(myList);
        }
    }

    static void changingList(LinkedList<String> myList, String data) {
        try{
            int index = Integer.parseInt(data.split("~")[1]);
            String text = data.split("~")[0];

            if(text.equals("print")){
                System.out.println(myList.get(index));
                myList.remove(index);
            } else myList.add(index, text); 
        } catch(Exception e){
            System.out.println("You have to input a correct number!");
        }        
    }
    
    static void ex3(){

        Deque<String> myList = new LinkedList<>();

        Scanner input = new Scanner(System.in);
        String data = "end";

        while(true) {
            System.out.println("Input something or print or revert or end:");
            data = input.nextLine();
            if(data.equals("end")) {
                input.close();
                return;
            }
            changingList(myList, data);
            System.out.println(myList);
        }
    }
    

    static void changingList(Deque<String> myList, String data) {
        if(data.equals("print")){
            for (String item : myList)
                System.out.println(item);            
        } else if(data.equals("revert")){
            myList.pollFirst();
        } else {
            myList.addFirst(data);
        }
    }
}

