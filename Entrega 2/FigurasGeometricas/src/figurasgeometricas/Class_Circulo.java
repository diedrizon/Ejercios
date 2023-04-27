
package figurasgeometricas;

/** @author diedr*/

public class Class_Circulo {
    float radio;

    public Class_Circulo(float radio) {
        this.radio = radio;
    }
    
    double calcularArea(){
        return Math.PI*Math.pow(radio, 2);
    }
    double calcularPerimetro(){
        return 2*Math.PI*radio;
    }
    
    
}
