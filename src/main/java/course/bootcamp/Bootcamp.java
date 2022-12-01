package course.bootcamp;
/**
 *
 * @author luis mateo nieto vargas
 */
import java.util.Scanner;

public class Bootcamp {
    
    public static int suma(int a, int b, int c){
        return a+b+c;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        coche micoche = new coche ();
        //Parte #1 del ejercicio tema 3
        int parm1,parm2,parm3;
        System.out.println("Digite 3 valores para aplicar la función.");
        System.out.print("\n Parametro #1.\n==>");
        parm1 = sc.nextInt();
        System.out.print("\n Parametro #2.\n==>");
        parm2 = sc.nextInt();
        System.out.print("\n Parametro #3.\n==>");
        parm3 = sc.nextInt();
        int r;
        r = suma(parm1,parm2,parm3);
        System.out.println("\nResultado: "+r);
        
        //Parte #2 del ejercicio tema 3
        micoche.add_door();
        System.out.println("Puertas añadidas ==>"+ micoche.doors);
    }
}
class coche {
    public int doors = 0;
    public void add_door(){
        this.doors++;
    }
}