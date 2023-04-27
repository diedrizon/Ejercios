
package class_pelicula;


public class Pelicula {
    String nombre;
    String director;
    Género género;
    int duración;
    int año;
    double calificación;

    public enum Género {
        ACCIÓN,
        COMEDIA,
        DRAMA,
        SUSPENSO
    }

    public Pelicula(String nombre, String director, Género género, int duración, int año, double calificación) {
        this.nombre = nombre;
        this.director = director;
        this.género = género;
        this.duración = duración;
        this.año = año;
        this.calificación = calificación;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Género getGénero() {
        return género;
    }

    public void setGénero(Género género) {
        this.género = género;
    }

    public int getDuración() {
        return duración;
    }

    public void setDuración(int duración) {
        this.duración = duración;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getCalificación() {
        return calificación;
    }

    public void setCalificación(double calificación) {
        this.calificación = calificación;
    }

    public void imprimir() {
        System.out.println("Película: " + nombre);
        System.out.println("Director: " + director);
        System.out.println("Género: " + género);
        System.out.println("Duración: " + duración + " minutos");
        System.out.println("Año: " + año);
        System.out.println("Calificación: " + calificación);
    }

    boolean esPeliculaEpica() {
        return duración >= 180;
    }

    String calcularValoración() {
        if (calificación >= 8.0) {
            return "Excelente";
        } else if (calificación >= 6.0) {
            return "Buena";
        } else {
            return "Regular";
        }
    }

    private boolean esSimilar(Pelicula otraPelícula) {
        return género == otraPelícula.género && calificación == otraPelícula.calificación;
    }
    
}
    


