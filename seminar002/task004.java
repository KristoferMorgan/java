// Напишите метод,который напишет строку из ста повторений слова test
// метод  который запишет эту строку в простой текстовый файл
// обработать исключения.
package seminar002;

import java.io.File;
import java.io.FileWriter;

public class task004 {
   public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir");
        String pahtFile = pathProject.concat("\\seminar2_task4.txt");
        addingToFile(pahtFile,longStringCreator("Hello!", 10));
    }
    static String longStringCreator(String word, int iters){
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < iters; i++) {
            newStr.append(word);
        }
        return newStr.toString() + "\n";
    }

    static void addingToFile(String filePath, String text){
        try {
            File myFile = new File(filePath);
            FileWriter writer = new FileWriter(myFile,true);

            writer.write(text);
            writer.close();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
