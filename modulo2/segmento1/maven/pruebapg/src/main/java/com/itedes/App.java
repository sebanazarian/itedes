package com.itedes;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class App 
{
    private static Connection connection ;
    private static Statement statement;
    private static ResultSet resulset ;
    
    public static void listarCategorias(){
        try {
            resulset = statement.executeQuery("SELECT * FROM categorias"); //espera resultado

            System.out.println("Categorias presentes en la base de datos:");
            System.out.println("========== ========= == == ==== == =====");
            System.out.println();
            
            while(resulset.next()){
                Integer categoriaid= resulset.getInt("categoriaid");
                String  descripcionCat = resulset.getString("nombrecat");
    
                System.out.println("ID =" + categoriaid);
                System.out.println("nombre =" + descripcionCat);
                System.out.println();
            }
    
            resulset.close();
                
        } catch (Exception e) {
            System.out.println("Error al listar categoria");
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        } 
        
    }

    public static void initializeConnection(){
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/Pedidos",
                    "dba", 
                    "1234"
            );

            System.out.println("Opened database successfully");
            
            statement = connection.createStatement();   
            
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        
    }

    public static void closeConnection(){
        try {
            statement.close();
            connection.close();
        } catch (Exception e) {
        } 
        
    }
    public static void main( String[] args ) {
        initializeConnection();
        Scanner teclado = new Scanner(System.in);
        Integer  opcion= 99;

        while(opcion!=0){
            System.out.println("1-Alta de Categoria");
            System.out.println("2-Editar Categoria");
            System.out.println("3-Eliminar Categoria");
            System.out.println("4-Listar Categorias");
            System.out.println("---------------------");
            System.out.println("Ingrese una opcion: ");
            
            try {
                opcion = Integer.parseInt(teclado.nextLine());
            } catch (Exception e) {

            } 
            if(opcion ==1){
                //ALTA
                // System.out.println("Ingrese un codigo de categoria");
                // Integer categoriaid = Integer.parseInt(teclado.nextLine());
                // System.out.println("Ingrese un nombre de categoria");
                // String nombreCat = teclado.nextLine();
            }else if(opcion==2){
                //EDITAR
            }else if(opcion==3){
                //BAJA
            }else if(opcion==4){
                listarCategorias();
            }
        }
        closeConnection();                    
        // String queryString = "INSERT INTO categorias(categoriaid,nombrecat) "
        //     + "VALUES(800,'GOLOSINAS')";

        // statement.executeUpdate(queryString); // no espera que vuelvan resultados



        

    }
}

