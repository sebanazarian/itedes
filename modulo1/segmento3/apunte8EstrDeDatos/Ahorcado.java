import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;


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
    
    public static ArrayList<String> convertStringToArraylist(String palabra) {
        ArrayList<String> stringList = new ArrayList<String>();      
        stringList=Arrays.asList(palabra);
        // for(int i = 0; i<palabra.length();i++){
        //     stringList.add(palabra.(i));
        // }
        return stringList;
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

        //Convierto palabra en lista para ir comparando
        ArrayList<String> palabraLista  = new ArrayList<String>();
        palabraLista=convertStringToArraylist(palabra);

        //Inicializo variables
        Integer vidas = 6;
        Integer faltan= palabraLista.size();
        System.out.println(faltan);
        ArrayList<String> palabraMostrar  = new ArrayList<String>();
        
        //CREO LISTA VACIA
        for(int i=0;i<palabraLista.size();i++){
            palabraMostrar.add("-");
        }
        System.out.println(palabraMostrar);

        while(vidas>0 && faltan>0){
            System.out.println(palabraMostrar);//LISTA VACIA
            System.out.print("Ingrese una letra: ");
            String letra=  teclado.nextLine();
            System.out.println(faltan);
            System.out.println(letra);
            System.out.println(palabraLista);
            if (palabraLista.contains("o")){
                faltan=faltan - Collections.frequency(palabraLista,letra);
                System.out.print("Letras Restantes: "+ faltan);

                // for(i=0;i<palabraLista.size();i++){
                //     if()
                // }
            }

        }

    }

}
