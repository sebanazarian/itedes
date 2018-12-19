import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
 


public class Ahorcado{

    public static ArrayList<String> generarBaseDatos(){
        Scanner teclado = new Scanner(System.in);
        String seguir="si";
        String palabras;
        ArrayList<String> listaPalabras  = new ArrayList<String>();

        while(seguir.equals("si")){
            System.out.print("Ingrese las palabras para jugar: ");
            palabras=teclado.nextLine();
            listaPalabras.add(palabras);

            System.out.print("Desea agregar otra palabra(si/no): ");
            seguir= teclado.nextLine();
        }
        return listaPalabras;
    }

    public static String sortear(ArrayList<String>listaJuego){
        Random palabraAleatoria = new Random();
        int n = palabraAleatoria.nextInt(listaJuego.size());
        //System.out.println(listaJuego.get(n));
        return listaJuego.get(n);
    }
    
    public static ArrayList<Character> convertStringToArraylist(String str) {
        ArrayList<Character> charList = new ArrayList<Character>();      
        for(int i = 0; i<str.length();i++){
            charList.add(str.charAt(i));
        }
        return charList;
    }

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        //Genero lista de palabras
        ArrayList<String> listaJuego  = new ArrayList<String>();
        listaJuego=generarBaseDatos();

        //Sorteo la palabra de la lista ingresada
        String palabra;
        palabra=sortear(listaJuego);
        System.out.println(palabra);

        //Convierto palabra en lista
        ArrayList<Character> palabraLista  = new ArrayList<Character>();
        palabraLista=convertStringToArraylist(palabra);

        //Inicializo variables
        Integer vidas = 6;
        Integer faltan= palabraLista.size();
        System.out.println(faltan);
        ArrayList<String> palabraMostrar  = new ArrayList<String>();

        for(int i=0;i<palabraLista.size();i++){
            palabraMostrar.add("-");
        }
        System.out.println(palabraMostrar);
        while(vidas>0 and faltan>0){
            System.otra.println(palabraMostrar);
            System.out.print("Ingrese una letra");
            String letra=  teclado.nextLine();

        }

    }

}
