
package figurasgeometricas;

/** @author diedr*/
public class FigurasGeometricas {

    public static void main(String[] args) {
       Class_Circulo circulo1 = new Class_Circulo(3);
        System.out.println("EL AREA DEL CIRCULO CREADO ES : "+circulo1.calcularArea());
        System.out.println("EL AREA DEL CIRCULO CREADO ES : "+circulo1.calcularPerimetro());
      
        
        Class_Cuadrado cuadrado1 = new Class_Cuadrado(4);
        System.out.println("EL ARE DEL CUADRADO ES :"+cuadrado1.calcularArea());
        System.out.println("EL ARE DEL CUADRADO ES :"+cuadrado1.calcularPerimetro());
    }
    
}
