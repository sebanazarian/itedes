import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio1BurbujeoDesc{

    public static void main(String args[]){
        ArrayList<Integer> vector  = new ArrayList<Integer>();

        for(Integer i=0;i<100;i++){
            Integer randomvector = ThreadLocalRandom.current().nextInt(0, 100 + 1);
            vector.add(randomvector);
        }

        for(Integer i=0;i<vector.size()-1;i++){
            for(Integer k=i+1;k<vector.size();k++){
                if(vector.get(i) < vector.get(k)) {
                   Integer auxiliar = vector.get(k);
                   vector.set(k, vector.get(i));
                   vector.set(i, auxiliar);
                }
            }
        }

        System.out.println(vector);
    }
}
