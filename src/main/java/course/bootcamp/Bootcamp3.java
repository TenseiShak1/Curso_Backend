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
        String newUser_name,newUser_lastname;
        int numberPhone;
        //Igreso de los datos.
        System.out.print("Ingrese algun nombre para este usuario:\n==>");
        newUser_name = sc.nextLine(); 
        System.out.print("Ingrese algun apellido para este usuario:\n==>");
        newUser_lastname = sc.nextLine();
        System.out.print("Ingrese algun numero de telefono para este usuario:\n==>");
        numberPhone = sc.nextInt();
        //Aplicación de la clase persona
        //---------------------------------------------
        persona.setNombre(newUser_name);
        System.out.println(persona.getNombre());
        
        persona.setApellido(newUser_lastname);
        System.out.println(persona.getApellido());
        
        persona.setTelefono(numberPhone);
        System.out.println(persona.getTelefono());
        //---------------------------------------------
    }
}
class Persona {
    
    /*
    Metodos Privados
    */
    private String nombre;
    private String apellido;
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
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public String getApellido(){
        return apellido;
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
