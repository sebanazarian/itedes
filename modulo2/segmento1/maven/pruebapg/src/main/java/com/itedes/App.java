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
    
    public static void clearScreen() {  
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
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
        Integer  opcionSub= 99;
        Integer categoriaid = 0;

        while(opcion!=0){
            opcionSub=99;
            clearScreen();
            System.out.println("----Menu Principal------");
            System.out.println("1-Categorias");
            System.out.println("2-Clientes");
            System.out.println("3-Proveedores");
            System.out.println("4-");
            System.out.println("0-Salir");
            System.out.println("---------------------");
            System.out.println("Ingrese una opcion: ");
            
            try {
                opcion = Integer.parseInt(teclado.nextLine());
            } catch (Exception e) {

            } 

            if(opcion ==1){
                while(opcionSub!=0){
                    clearScreen();
                    System.out.println("1-Alta de Categoria");
                    System.out.println("2-Editar Categoria");
                    System.out.println("3-Eliminar Categoria");
                    System.out.println("4-Listar Categorias");
                    System.out.println("0-Salir");
                    System.out.println("---------------------");
                    System.out.println("Ingrese una opcion: ");
                    
                    try {
                        opcionSub = Integer.parseInt(teclado.nextLine());
                    } catch (Exception e) {
        
                    } 
                    
                    if(opcionSub ==1){
                        //ALTA
                        clearScreen();
        
                        System.out.println("Alta de categoria:");
                        System.out.println("==== == =========");
                        System.out.println();
                        try {
                            System.out.println("Ingrese id de Categoria");
                            categoriaid =Integer.parseInt(teclado.nextLine());
                        
                        } catch (Exception e) {
                            System.out.println("Error en el ingreso de datos");
                        }
                        System.out.println("Ingrese nombre de Categoria");
                        String descripcionCat = teclado.nextLine();
        
                        addCategoria(categoriaid, descripcionCat);
        
                        System.out.println();
                        System.out.println("Alta de categoria exitosa!");
                        System.out.println("Presione ENTER para continuar...");
                        teclado.nextLine();
        
        
                    }else if(opcionSub==2){
                        //EDITAR
                        clearScreen();
        
                        System.out.println("Modificar categoria:");
                        System.out.println("==== == =========");
                        System.out.println();
                        try {
                            listarCategorias();
                            System.out.println("Ingrese el id de Categoria a modificar");
                            categoriaid =Integer.parseInt(teclado.nextLine());
                        } catch (Exception e) {
                            System.out.println("Error en el ingreso de datos");
                        }
                        System.out.println("Ingrese nombre de Categoria");
                        String descripcionCat = teclado.nextLine();
        
                        updateCategoria(categoriaid,descripcionCat);
        
                    }else if(opcionSub==3){
                        //BAJA
                        clearScreen();
        
                        System.out.println("Baja de categoria:");
                        System.out.println("==== == =========");
                        System.out.println();
                        try {
                            System.out.println("Ingrese id de Categoria");
                            categoriaid =Integer.parseInt(teclado.nextLine());
                        
                        } catch (Exception e) {
                            System.out.println("Error en el ingreso de datos");
                        }
                        
                        removeCategoria(categoriaid);
        
                    }else if(opcionSub==4){
                        listarCategorias();
                        System.out.println("Presione Enter para Continuar");
                        teclado.nextLine();
                    }
                }
            //fin if MENU CATEGORIAS
            }else if (opcion==2){
                while(opcionSub!=0){
                    clearScreen();
                    System.out.println("1-Alta de cliente");
                    System.out.println("2-Editar Cliente");
                    System.out.println("3-Eliminar Cliente");
                    System.out.println("4-Listar Cliente");
                    System.out.println("0-Salir");
                    System.out.println("---------------------");
                    System.out.println("Ingrese una opcion: ");
                    
                    try {
                        opcionSub = Integer.parseInt(teclado.nextLine());
                    } catch (Exception e) {
        
                    } 
                    
                    if(opcionSub ==1){
                        //ALTA
                        clearScreen();
        
                        System.out.println("Alta de Cliente:");
                        System.out.println("==== == =========");
                        System.out.println();
                        System.out.println("Ingrese id del cliente: ");
                        Integer idCliente = Integer.parseInt(teclado.nextLine());
                        System.out.println("Ingrese dni del cliente: ");
                        String dniCliente = teclado.nextLine();
                        System.out.println("Ingrese nombrecia del cliente: ");
                        String nombreciaCliente = teclado.nextLine();
                        System.out.println("Ingrese nombre de contacto del cliente: ");
                        String contactocliente = teclado.nextLine();
                        System.out.println("Ingrese direccion del cliente: ");
                        String direccionCliente = teclado.nextLine();
                        System.out.println("Ingrese fax del cliente: ");
                        String faxCliente = teclado.nextLine();
                        System.out.println("Ingrese email del cliente: ");
                        String emailCliente = teclado.nextLine();
                        System.out.println("Ingrese celular del cliente: ");
                        String celularCliente = teclado.nextLine();
                        System.out.println("Ingrese fijo del cliente: ");
                        String fijoCliente = teclado.nextLine();
        
                        addCliente(idCliente,dniCliente,nombreciaCliente,contactocliente,direccionCliente,faxCliente,emailCliente,celularCliente,fijoCliente);
        
                        System.out.println();
                        System.out.println("Alta de cliente exitosa!");
                        System.out.println("Presione ENTER para continuar...");
                        teclado.nextLine();
        
        
                    }else if(opcionSub==2){
                        //EDITAR
                        clearScreen();
        
                        System.out.println("Modificar categoria:");
                        System.out.println("==== == =========");
                        System.out.println();
                        try {
                            listarCategorias();
                            System.out.println("Ingrese el id de Categoria a modificar");
                            categoriaid =Integer.parseInt(teclado.nextLine());
                        } catch (Exception e) {
                            System.out.println("Error en el ingreso de datos");
                        }
                        System.out.println("Ingrese nombre de Categoria");
                        String descripcionCat = teclado.nextLine();
    
                        updateCategoria(categoriaid,descripcionCat);
        
                    }else if(opcionSub==3){
                        //BAJA
                        clearScreen();
        
                        System.out.println("Baja de categoria:");
                        System.out.println("==== == =========");
                        System.out.println();
                        try {
                            System.out.println("Ingrese id de Categoria");
                            categoriaid =Integer.parseInt(teclado.nextLine());
                        
                        } catch (Exception e) {
                            System.out.println("Error en el ingreso de datos");
                        }
                        
                        //removeCliente(categoriaid);
        
                    }else if(opcionSub==4){
                        //listarClientes();
                        System.out.println("Presione Enter para Continuar");
                        teclado.nextLine();
                    }
                }
            }
                

        }
        
        
        closeConnection();       
        teclado.close();
      
    }


    public static void addCategoria(Integer categoriaid, String descripcionCat){
        try {
			String queryString = "INSERT INTO categorias (categoriaid, nombrecat) "
				+ "VALUES(" + categoriaid + ", '" + descripcionCat + "');";
			
			statement.executeUpdate(queryString);
		} catch(Exception e) {
            System.out.println("ERROR AL CREAR CATEGORIAS");
        }
    }
    
    public static void updateCategoria(Integer categoriaid,String descripcionCat){
        try {
            String queryString = "Update categorias "
                                + "set nombrecat = '"+ descripcionCat +"'" 
                                + "where categoriaid ="+ categoriaid;
            statement.executeUpdate(queryString);

        } catch (Exception e) {
            System.out.println("Error al modificar una categoria ");
        }

    }

    public static void removeCategoria(Integer categoriaid){
        try{
            String queryString = "Delete FROM categorias where categoriaid = " + categoriaid;
            
            statement.executeUpdate(queryString);
        }catch(Exception e){
            System.out.println("Error al eliminar una categoria ");
        }
    }
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

    public static void addCliente(Integer clienteid,String dniCliente,String nombreciaCliente,String contactocliente,String direccionCliente,String faxCliente,String emailCliente,String celularCliente,String fijoCliente){
        try {
			String queryString = "INSERT INTO clientes (clienteid,cedula_ruc, nombrecia, nombrecontacto, direccioncli,fax,email,celular,fijo) "
				+ "VALUES("+ clienteid +",'" + dniCliente + "'', '" + nombreciaCliente + "' , '"+ contactocliente+"','"+direccionCliente+"','"+faxCliente+"','"+ emailCliente +"','"+ celularCliente +"','"+ fijoCliente +"')";
			
			statement.executeUpdate(queryString);
		} catch(Exception e) {
            System.out.println("ERROR AL CREAR CLIENTE");
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
        }
    }

}

