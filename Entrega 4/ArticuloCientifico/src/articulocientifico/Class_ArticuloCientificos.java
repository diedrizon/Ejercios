
package articulocientifico;


public class Class_ArticuloCientificos {
    private String nombreArticulo;
    private String autor;
    private String[] palabrasClaves;
    private String nombrePublicacion;
    private int año;
    private String resumen;

    public Class_ArticuloCientificos(String nombreArticulo, String autor) {
        this.nombreArticulo = nombreArticulo;
        this.autor = autor;
    }

    public Class_ArticuloCientificos(String nombreArticulo, String autor, String[] palabrasClaves, String nombrePublicacion, int año) {
        this(nombreArticulo, autor);
        this.palabrasClaves = palabrasClaves;
        this.nombrePublicacion = nombrePublicacion;
        this.año = año;
    }

    public Class_ArticuloCientificos(String nombreArticulo, String autor, String[] palabrasClaves, String nombrePublicacion, int año, String resumen) {
        this(nombreArticulo, autor, palabrasClaves, nombrePublicacion, año);
        this.resumen = resumen;
    }

    public void imprimirAtributos() {
        System.out.println("Nombre del artículo: " + nombreArticulo);
        System.out.println("Autor: " + autor);
        System.out.println("Palabras claves:");
        for (String palabraClave : palabrasClaves) {
            System.out.println("- " + palabraClave);
        }
        System.out.println("Nombre de la publicación: " + nombrePublicacion);
        System.out.println("Año: " + año);
        System.out.println("Resumen: " + resumen);
    }

   
    

}
