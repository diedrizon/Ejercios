
package articulocientifico;


public class ArticuloCientifico {


     public static void main(String[] args) {
        String[] palabrasClaves = {"ciencia", "investigación", "artículo"};
        String nombreArticulo = "Título del artículo";
        String autor = "Nombre del autor";
        String nombrePublicacion = "Nombre de la publicación";
        int año = 2023;
        String resumen = "Resumen del artículo";

        Class_ArticuloCientificos articulo = new Class_ArticuloCientificos(nombreArticulo, autor, palabrasClaves, nombrePublicacion, año, resumen);
        articulo.imprimirAtributos();
    }
    
}
