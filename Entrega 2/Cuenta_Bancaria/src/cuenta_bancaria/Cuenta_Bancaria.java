
package cuenta_bancaria;

/**
 *
 * @author diedr
 */
public class Cuenta_Bancaria {

 
    public static void main(String[] args) {


        Class_CuentaBancaria cuenta1 = new Class_CuentaBancaria("Juan", "Pérez", 123456789, "Corriente");

        cuenta1.imprimirDatos();

        cuenta1.consignar(5000);

        cuenta1.imprimirDatos();

        cuenta1.retirar(3000);

        cuenta1.imprimirDatos();

        cuenta1.retirar(8000);
    }
}

    
    

