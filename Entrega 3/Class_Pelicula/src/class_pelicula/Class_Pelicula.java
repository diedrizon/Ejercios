
package class_pelicula;


public class Class_Pelicula {


    public static void main(String[] args) {
     Pelicula película1 = new Pelicula("Inception", "Christopher Nolan", Pelicula.Género.SUSPENSO, 148, 2010, 8.8);
        Pelicula película2 = new Pelicula("The Dark Knight", "Christopher Nolan", Pelicula.Género.ACCIÓN, 152, 2008, 9.0);

        System.out.println("Película 1:");
        System.out.println("Nombre: " + película1.nombre);
        System.out.println("Director: " + película1.director);
        System.out.println("Género: " + película1.género);
        System.out.println("Duración: " + película1.duración + " minutos");
        System.out.println("Año: " + película1.año);
        System.out.println("Calificación: " + película1.calificación);
        System.out.println("-------------------------");
        System.out.println("Película 2:");
        System.out.println("Nombre: " + película2.nombre);
        System.out.println("Director: " + película2.director);
        System.out.println("Género: " + película2.género);
        System.out.println("Duración: " + película2.duración + " minutos");
        System.out.println("Año: " + película2.año);
        System.out.println("Calificación: " + película2.calificación);
        System.out.println("-------------------------");

        System.out.println("Película 1 es épica: " + película1.esPeliculaEpica());
        System.out.println("Película 2 es épica: " + película2.esPeliculaEpica());
        System.out.println("-------------------------");

        System.out.println("Valoración de la película 1: " + película1.calcularValoración());
        System.out.println("Valoración de la película 2: " + película2.calcularValoración());
               
    }   
}
