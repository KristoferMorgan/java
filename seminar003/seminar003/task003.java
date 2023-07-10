///Заполнить список названиями планет
// Солнечной системы в произвольном порядке с повторениями. 
//Вывести название каждой планеты и количество его повторений в списке


package seminar003;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task003 {

      public static void main(String[] args) {
    planetsCounter(7);
    }

    static void planetsCounter(int n){
        List<String> listPlanets = List.of("Metcuty","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune");
        List<String> randPlaners = new ArrayList<String>(n);
        int[] counts = new int[listPlanets.size()];

        Random rand = new Random();
        for ( int i = 0 ;i < n;i++ ){
            randPlaners.add(listPlanets.get(rand.nextInt(listPlanets.size())));
            System.out.print(randPlaners.get(i) + " ");
            counts[listPlanets.indexOf(randPlaners.get(i))]++;
        }
        System.out.println();
        

        for ( int i = 0;i< counts.length;i++)
            System.out.printf("%s - %s\n", listPlanets.get(i),counts[i]);
    }
    
}


