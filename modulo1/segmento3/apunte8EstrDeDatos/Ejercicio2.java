import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio2{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> miListaImpar = new ArrayList<Integer>();

        for(Integer i =0 ; i<=100;i++){
            if(i%2 !=0){
                miListaImpar.add(i);
            }
        }

        for(Integer i=0; i<miListaImpar.size()-1;i++){
            for(Integer k=i+1;k<miListaImpar.size();k++){
                if(miListaImpar.get(i)>miListaImpar.get(k)){
                    Integer auxiliar = miListaImpar.get(k);
                    miListaImpar.set(k,miListaImpar.get(i));
                    miListaImpar.set(i,auxiliar);
                }
        
            }
        }
        System.out.print(miListaImpar);

    }
}
