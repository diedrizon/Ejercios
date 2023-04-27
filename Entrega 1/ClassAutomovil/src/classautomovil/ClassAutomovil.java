
package classautomovil;


public class ClassAutomovil {

 
    public static void main(String[] args) {
        Automovil auto = new Automovil("Toyota", 2022, 2.0, "gasolina", "compacto", 4, 5, 200, "blanco");

        auto.velocidadActual = 100;
        System.out.println("Velocidad actual: " + auto.velocidadActual + " km/h");

        auto.acelerar(20);
        System.out.println("Velocidad actual: " + auto.velocidadActual + " km/h");

        auto.desacelerar(50);
        System.out.println("Velocidad actual: " + auto.velocidadActual + " km/h");

        auto.frenar();
        System.out.println("Velocidad actual: " + auto.velocidadActual + " km/h");
    }

    
}
