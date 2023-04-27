
package claseplaneta;

import claseplaneta.Planeta.TipoPlaneta;


public class ClasePlaneta {

 
    public static void main(String[] args) {
        Planeta tierra = new Planeta("Tierra", 1, 5.97e24, 1.08e12, 12756, 149, TipoPlaneta.TERRESTRE, true);
        Planeta jupiter = new Planeta("Júpiter", 79, 1.90e27, 1.43e15, 142984, 778, TipoPlaneta.GASEOSO, false);
        
        tierra.imprimirDatos();
        System.out.println("Densidad: " + tierra.calcularDensidad() + " kg/km³");
        System.out.println("¿Es un planeta exterior? " + tierra.esExterior());
        
        System.out.println();
        
        jupiter.imprimirDatos();
        System.out.println("Densidad: " + jupiter.calcularDensidad() + " kg/km³");
        System.out.println("¿Es un planeta exterior? " + jupiter.esExterior());
    }
    
}
