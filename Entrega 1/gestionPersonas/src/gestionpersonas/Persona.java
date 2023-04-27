
package gestionpersonas;

/**
 *
 * @author diedr
 */
public class Persona {
    String nombre;
    String apellido;
    String Cedula;
    int anac;
   
    
    public Persona(String nombre, String apellido, String Cedula, int anac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Cedula = Cedula;
        this.anac = anac;
        
    }
    void imprimir(){
         System.out.println("-----------------------------------");
        System.out.println("nombre: " + nombre);
        System.out.println("apellido:m" + apellido);
        System.out.println("Cecula: " + Cedula);
        System.out.println("anac: " + anac);
       
    }
    int determinaredad(){
        return 2024-anac;
    }
}
