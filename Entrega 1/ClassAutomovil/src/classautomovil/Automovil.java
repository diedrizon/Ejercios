
package classautomovil;


public class Automovil {
  private String marca;
    private int modelo;
    private double motor;
    private String combustible;
    private String tipo;
    private int puertas;
    private int asientos;
    private double velocidadMaxima;
    private String color;
    double velocidadActual;
    
     public Automovil(String marca, int modelo, double motor, String combustible, String tipo, int puertas,
                     int asientos, double velocidadMaxima, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.combustible = combustible;
        this.tipo = tipo;
        this.puertas = puertas;
        this.asientos = asientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = 0;
    }
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public void acelerar(double cantidad) {
        if (velocidadActual + cantidad <= velocidadMaxima) {
            velocidadActual += cantidad;
        } else {
            System.out.println("No se puede acelerar más allá de la velocidad máxima permitida.");
        }
    }

    public void desacelerar(double cantidad) {
        if (velocidadActual - cantidad >= 0) {
            velocidadActual -= cantidad;
        } else {
            System.out.println("No se puede desacelerar a una velocidad negativa.");
        }
    }

    public void frenar() {
        velocidadActual = 0;
    }

    public double calcularTiempoEstimadoLlegada(double distancia) {
        return distancia / velocidadActual;
    }

    public void mostrarAtributos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor + " litros");
        System.out.println("Combustible: " + combustible);
        System.out.println("Tipo: " + tipo);
        System.out.println("Puertas: " + puertas);
        System.out.println("Asientos: " + asientos);
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Velocidad actual: " + velocidadActual + " km/h");
    }
}
