
package figurasgeometricas;

/** @author diedr*/

public class Class_Cuadrado {

    float lado;
    
    public Class_Cuadrado(float lado) {
        this.lado = lado;
    }
 
   double calcularArea(){
       return lado*lado;
   }
   
   double calcularPerimetro(){
       return 4*lado;
   }
}
