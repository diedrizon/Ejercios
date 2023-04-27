
package cuenta_bancaria;

/**
 *
 * @author diedr
 */
public class Class_CuentaBancaria {
  
    private String nombres;
    private String apellidos;
    private int numeroCuenta;
    private String tipoCuenta;
    private double saldo;

    public Class_CuentaBancaria(String nombres, String apellidos, int numeroCuenta, String tipoCuenta) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0.0;
    }

    public void imprimirDatos() {
        System.out.println("Titular: " + nombres + " " + apellidos);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo: $" + saldo);
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void consignar(double valor) {
        saldo += valor;
        System.out.println("Se ha consignado $" + valor + " en la cuenta.");
    }

    public void retirar(double valor) {
        if (valor > saldo) {
            System.out.println("No se puede retirar $" + valor + ". El saldo actual es de $" + saldo + ".");
        } else {
            saldo -= valor;
            System.out.println("Se ha retirado $" + valor + " de la cuenta.");
        }
    }
}
 
