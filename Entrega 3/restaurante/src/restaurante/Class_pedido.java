
package restaurante;

/** @author diedr
 */
public class Class_pedido {
    
    
   public void Calcularpedido(String primerPlato, double costoPrimerPlato, String bebida,double costobebida){
       double total=costoPrimerPlato+costobebida;
       System.out.println("El costo de su pedido ("+primerPlato+ " y " +bebida+"es :"+total);
   }
   
   
 public void Calcularpedido(String primerPalto, double costoPrimerPlato,String SegundoPlato,double costoSegundoPlato, String bebida,double costoBebida){
     double total=costoPrimerPlato+costoSegundoPlato+costoBebida;
     System.out.println("El costo de su pedido ("+ primerPalto + " y " +SegundoPlato+ " y "  + bebida+" es :"+total);

 }
 
 
  public void Calcularpedido(String primerPalto, double costoPrimerPlato,String SegundoPlato,double costoSegundoPlato,String postre,double costoProste,String bebida,double costoBebida){
   double total=costoPrimerPlato+costoSegundoPlato+costoBebida+costoProste;
    System.out.println("El costo de su pedido ("+ primerPalto + " y " +SegundoPlato+ " y "  + bebida+  " y " +postre+" es :"+total);


  }
   }
