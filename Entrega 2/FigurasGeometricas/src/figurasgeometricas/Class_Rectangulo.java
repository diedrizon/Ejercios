
package figurasgeometricas;

/**
 @author diedr*/

public class Class_Rectangulo {
   float base;
    float altura; 
    
    
    public Class_Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    double calcularArea(){
        return base*altura;
    }
    
    double calcularPerimetro(){
        return 2*base + 2*altura;
    }
}
