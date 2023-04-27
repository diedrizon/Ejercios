
package restaurante;

/**
 *
 * @author diedr
 */
public class Restaurante {


    public static void main(String[] args) {
        Class_pedido combo1= new Class_pedido();
        combo1.Calcularpedido("Natacatamal con pan", 50 , "Cacao con leche ", 35);
        Class_pedido comba2= new Class_pedido();
        combo1.Calcularpedido("Gallo pinto con aguacate ", 80 , "Cafe con leche ", 10);
        
        
        
        System.out.println("-------------------------");
        Class_pedido combo2=new Class_pedido();
        combo2.Calcularpedido("Arroz con pollo", 80, "guacamol", 100, "cebada", 85);
        
        System.out.println("-------------------------");
        Class_pedido combo3=new Class_pedido();
        combo3.Calcularpedido("pezcado", 240, "langota", 800, "tres leche" , 140, "gaseosa", 40);
    }
    
}
