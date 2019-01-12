import java.util.Scanner;
import java.util.ArrayList;

public class BurbujeoString {
    public static void main(String args[]) {
    Scanner teclado = new Scanner(System.in);
    ArrayList<String> nombres = new ArrayList<String>();
    
    for (Integer i = 0; i < 5; i++) {

        System.out.print("Ingrese su Nombre: ");
        String nombre = teclado.nextLine();
    
        nombres.add(nombre);
    }
    System.out.println(ordenadorNombre(nombres));
    }
    public static ArrayList<String> ordenadorNombre(ArrayList<String> nombres) {
        for (Integer i = 0; i < nombres.size()-1; i++){
            for (Integer k = i+1;k<nombres.size();k++){
                if (nombres.get(i).compareTo(nombres.get(k))>0){
                    String aux = nombres.get(k);
                    nombres.set(k,nombres.get(i));
                    nombres.set(i,aux);
                }
            }
        }
        return nombres;
    }
}