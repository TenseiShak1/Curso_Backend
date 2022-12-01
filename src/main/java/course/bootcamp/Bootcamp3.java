package course.bootcamp;
/*
 * @author luis
 */
import java.util.Scanner;
public class Bootcamp3 {
    public static void main(String[] args) {
        Persona persona =new Persona();
        Scanner sc = new Scanner (System.in);
        //Variables de control.
        String newUser_name;
        int numberPhone,edad;
        //Igreso de los datos.
        System.out.print("Ingrese algun nombre para este usuario:\n==>");
        newUser_name = sc.nextLine(); 
        System.out.print("Ingrese alguna  edad para este usuario:\n==>");
        edad = sc.nextInt();
        System.out.print("Ingrese algun numero de telefono para este usuario:\n==>");
        numberPhone = sc.nextInt();
        //Aplicación de la clase persona
        //---------------------------------------------
        persona.setNombre(newUser_name);
        System.out.println("Nombre de la persona: "+persona.getNombre());
        
        persona.setEdad(edad);
        System.out.println("edad "+ persona.getEdad()+" años");
        
        persona.setTelefono(numberPhone);
        System.out.println("Este es su numero de telefono: "+persona.getTelefono());
        //---------------------------------------------
    }
}
class Persona {
    
    /*
    Metodos Privados
    */
    private String nombre;
    private int edad;
    private int telefono;
    //-----------------
    
    /*
    Metodos Publicos
    */
    //Funciones Get y Set de la propiedad nombre
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    //Funciones Get y Set de la propiedad apellido
    public void setEdad(int apellido){
        this.edad=apellido;
    }
    public int getEdad(){
        return edad;
    }
    //Funciones Get y Set de la propiedad telefono
    public void setTelefono(int telefono){
        this.telefono=telefono;
    }
    public int getTelefono(){
        return telefono;
    }
    
    //--------------------------------------------------------------------------
}
