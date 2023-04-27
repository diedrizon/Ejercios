
package claseplaneta;


public class Planeta {
    private String nombre;
    private int cantidadSatelites;
    private double masa;
    private double volumen;
    private int diametro;
    private int distanciaMediaSol;
    public enum TipoPlaneta {  GASEOSO, TERRESTRE, ENANO  }
    private TipoPlaneta tipo;
    private boolean observableSimpleVista;
    
    
    
    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaMediaSol, TipoPlaneta tipo, boolean observableSimpleVista) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaMediaSol = distanciaMediaSol;
        this.tipo = tipo;
        this.observableSimpleVista = observableSimpleVista;
    }
    
    public void imprimirDatos() {
        System.out.println("-------------------------------------");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Cantidad de satélites: " + this.cantidadSatelites);
        System.out.println("Masa: " + this.masa + " kg");
        System.out.println("Volumen: " + this.volumen + " km³");
        System.out.println("Diámetro: " + this.diametro + " km");
        System.out.println("Distancia media al Sol: " + this.distanciaMediaSol + " millones de km");
        System.out.println("Tipo de planeta: " + this.tipo);
        System.out.println("Observable a simple vista: " + this.observableSimpleVista);
    }
    
    public double calcularDensidad() {
        return this.masa / this.volumen; 
    }

    public boolean esExterior() {
        double distanciaMediaSolKm = 3.4*149597870;
        double limite = 0;
        if (distanciaMediaSolKm>limite)
            return true;
        else
            return false;
    }
    

}

 
          
    

