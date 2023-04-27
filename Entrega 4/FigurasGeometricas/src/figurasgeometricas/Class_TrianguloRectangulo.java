
package figurasgeometricas;

/** @author diedr*/

public class Class_TrianguloRectangulo {

    double base;
    double altura;
    
    
    public Class_TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    double calcularArea(){
      return base+altura/2;  
      
    }
    
    double calcularPerimetro(){
      return base+altura+calcularHipo(); 
    }
    double calcularHipo(){
        return Math.pow(base*base+altura*altura,0.5);
    }
    
    void tipoTriangulo(){
        if (base==altura && base==calcularHipo()){;
        System.out.println("El triangulo es equilatero");
    }else if(altura==base || altura ==calcularHipo() || base==calcularHipo()){
            System.out.println("EL TRIANGULO ES ISOCELE");
    }else {
            System.out.println("El TRIANGULO ES ESCALENO");
}
    }}

