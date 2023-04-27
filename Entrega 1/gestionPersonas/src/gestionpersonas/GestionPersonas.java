
package gestionpersonas;

/** @author diedr*/
public class GestionPersonas {


    public static void main(String[] args) {
        Persona objetopersona = new Persona ("Juan", "Romero", "230-8989-09ñ" ,50);
        objetopersona.imprimir();
        System.out.println("Edad" );
        
        Persona presidente = new Persona("tere", "fabia", "230-8989-09" ,54);
        presidente.imprimir();
        
        Persona trabajador = new Persona ("dilan", "torrez", "230-5932-888" ,25);
        trabajador .imprimir();
    }
    
}
