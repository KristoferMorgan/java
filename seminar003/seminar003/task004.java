///Каталог товаров книжного магазина сохранен в виде двумерного списка 
///List<ArrayList<String>> так, что на 0й позиции каждого внутреннего списка 
//содержится название жанра, а на остальных позициях - названия книг.
// Напишите метод для заполнения данной структуры/


package seminar003;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task004 {
    public static void main(String[] args) {
        
 



    }


    static void crateTable(int size){
        List<String> genres = List.of("Фантастика", "Комедия", "Детектив", "Ужасы");
        List<ArrayList<String>> table = new ArrayList<>(genres.size());
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < genres.size(); i++) {
            ArrayList<String> booksOfGenre = new ArrayList<>(size);
            booksOfGenre.add(genres.get(i));
            System.out.printf("Input %d titles of %s genre down here:\n", size, genres.get(i));
            for (int j = 0; j < size; j++) 
                booksOfGenre.add(input.nextLine());

            table.add(booksOfGenre);           
        }

        input.close();

        for (ArrayList<String> books : table) {
            for (String book : books) {
                System.out.print(book + " ");
            }
            System.out.println();
        }
    }
    
}
