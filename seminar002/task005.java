// Напишите метод,который вернет содржимое текущей папки в виде массива строк
// Напишите метод,который запишет массив возвращенный предыдущем методом в файл
// Обработать ошибки с помощью Try/catch
// В случае возникновение исключений,оно должно записаться в log файл



package seminar002;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class task005 {
    public static void main(String[] args) throws SecurityException, IOException {
        String pathProject = System.getProperty("user.dir");
        String pathFile1 = pathProject.concat("Seminar2_task4.txt");
        String pathFile2 = pathProject.concat("Seminar2_task5_2.txt");
        addListToFile( pathFile2, showCurrentFiles(pathProject));
        
    }
        
    static String[] showCurrentFiles(String dirPath){
        File currentDir = new File(dirPath);
        return currentDir.list();
    }

    static void addListToFile(String filePath,String[] list) throws SecurityException, IOException{
        Logger logger = Logger. getLogger(task005.class.getName());
        FileHandler fh = new FileHandler("Seminar2_task5_3(log).txt");

        logger.addHandler(fh);

        SimpleFormatter simple = new SimpleFormatter();
        fh.setFormatter(simple);

        try {
            File myFile = new File( filePath);
            FileWriter writer = new FileWriter(myFile);


            for (String str : list) 
                writer.write(str + "\n");

            writer.close();
                
            
        }
        catch (Exception e){
            logger.warning(e.getMessage());
        }   
        
    }
}
