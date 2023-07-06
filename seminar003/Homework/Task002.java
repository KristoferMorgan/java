package seminar003.Homework;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Task002 {

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

        Set<String> mySet = Set.copyOf(randPlaners);
        System.out.printf("List without repetitions: %s\n",mySet);
    }
}