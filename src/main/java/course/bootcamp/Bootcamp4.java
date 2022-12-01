package course.bootcamp;
/*
 * @author luis
 */
public class Bootcamp4 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente ();
        Trabajador trabajador = new Trabajador();
        //Datos de un cliente al azar.
        cliente.nombre= "Luis";
        cliente.edad= 20;
        cliente.telefono= 4051234;
        cliente.credito= 125.41;
        System.out.println("Cliente: "+cliente.nombre+" tiene "+cliente.edad+" años y su telefono es: "
                +cliente.telefono+" Credito disponible."+cliente.credito);      
        //Datos de un trabajador al azar.
        trabajador.nombre= "Edgar";
        trabajador.edad= 22;
        trabajador.telefono=2152453;
        trabajador.salario=1235.50;
        System.out.println("Cliente: "+trabajador.nombre+" tiene "+trabajador.edad+" años y su telefono es: "
                +trabajador.telefono+" Credito disponible."+trabajador.salario);
    }  
}
class Persona{
    String nombre;
    int edad,telefono;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona{
    double salario;
}     
