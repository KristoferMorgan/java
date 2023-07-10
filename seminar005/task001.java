//  Создать структуру для хранения номеров паспортов и фамилий сотрудников.
package seminar005;

import java.util.HashMap;
import java.util.Map;

public class task001 {
    public static void main(String[] args) {
        ex1();
    }
    static void ex1(){
        Map<String, String> workers = new HashMap<>();
        workers.put("100","Ivanov");
        workers.put("101","Petrov");
        workers.put("102","Sidorov");
        workers.put("103","Pupkin");
        workers.put("104","Gusev");
        workers.put("105","Kim");

        for (Map.Entry <String,String> worker : workers.entrySet()) {
            if(worker.getValue().equals("Ivanov"))
                System.out.printf("Passport number:%s,Worker surname:%s\n",worker.getKey(),worker.getValue());
        }

    }
}
