import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Libro
{
    private String titulo;
    private int numPaginas;
    private String autor;

    public Libro(String titulo, int numPaginas, String autor)
    {
        this.titulo = titulo;
        this.numPaginas = numPaginas;
        this.autor = autor;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public String getAutor()
    {
        return autor;
    }

    public int getNumPaginas()
    {
        return numPaginas;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumPaginas(int numPaginas)
    {
        this.numPaginas = numPaginas;
    }
}

public class Ej02
{
    public static void main(String[] args)
    {
        List<Libro> libros = new ArrayList<>();

        libros.add(new Libro("El Señor de los Anillos", 800, "J.R.R. Tolkien"));
        libros.add(new Libro("El Hobbit", 350, "J.R.R. Tolkien"));
        libros.add(new Libro("Cabo Trafalgar", 320, "Arturo Pérez Reverte"));
        libros.add(new Libro("El corazón de la piedra", 560, "José María García López"));
        libros.add(new Libro("Salmos de vísperas", 95, "Esteban Hernández Castelló"));
        libros.add(new Libro("La música en las catedrales españolas del Siglo de Oro", 600, "Robert Stevenson"));
        libros.add(new Libro("Luces de bohemia", 296, "Ramón del Valle-Inclán"));
        libros.add(new Libro("Contando atardecere", 528, "La vecina rubia"));
        libros.add(new Libro("Master - Roger Federer", 456, "Christopher Clarey"));
        libros.add(new Libro("La teoría de los archipiélagos", 300, "Alice Kellen"));
        libros.add(new Libro("Esperando al diluvio", 576, "Dolores Redondo"));
        libros.add(new Libro("El italiano", 400, "Arturo Pérez Reverte"));
        libros.add(new Libro("Línea de fuego", 688, "Arturo Pérez Reverte"));

        for(Libro l: libros)
        {
            System.out.println("Título: " + l.getTitulo());
            System.out.println("Autor: " + l.getAutor());
        }

        System.out.println("Libros con más de 500 páginas:");
        libros.stream()
                .filter(lib -> lib.getNumPaginas()>500)
                .forEach(System.out::println);
        System.out.println("");

        System.out.println("Libros con menos de 300 páginas:");
        libros.stream()
            .filter(lib -> lib.getNumPaginas()<300)
            .forEach(System.out::println);
        System.out.println("");

        System.out.println("El titulo de los libros con más de 500 páginas:");
        libros.stream()
            .filter(lib -> lib.getNumPaginas()>500)
            .forEach(lib ->System.out.println(lib.getTitulo()));
        System.out.println("");

        System.out.println("Los 3 libros con mayor número de páginas:");
        libros.stream()
                .sorted(Comparator.comparing(Libro::getNumPaginas).reversed())
                .limit(3)
                .forEach(lib-> System.out.println(lib.getTitulo()));
        System.out.println("");

        System.out.println("La suma total de las páginas de todos los libros:");
        int totalpag= libros.stream().mapToInt(Libro::getNumPaginas).reduce(0,Integer::sum);
        System.out.println(totalpag+".");
        System.out.println("");

        System.out.println("libros que superen el promedio en cuanto a número de páginas:");
        double media = libros.stream().mapToInt(Libro::getNumPaginas).average().getAsDouble();
        libros.stream()
                .filter(lib -> lib.getNumPaginas() > media)
                .forEach(lib -> System.out.println(lib.getTitulo()));
        System.out.println("");


        System.out.println("Los autores de todos los libros, sin repetir nombres:");
        libros.stream()
                .map(Libro::getAutor)
                .distinct()
                .forEach(System.out::println);
        System.out.println("");

        System.out.println("Autores que tengan más de 1 libro listado:");
        libros.stream()
                .map(Libro::getAutor)
                .distinct()
                .forEach(System.out::println);
        System.out.println("");

        /*Este no lo he conseguido resolver yo mismo, lo revisamos en clase porque no acabo de entenderlo.

        System.out.println("Autores que tengan más de 1 libro listado:");
        // Agrupamos en una estructura mapa (clave -> valor) los autores con su frecuencia
        libros.stream()
                .collect(Collectors
                        .groupingBy(Libro::getAutor, Collectors.counting()))
                // Convertimos la estructura mapa en un stream
                .entrySet().stream()
                // Nos quedamos con los autores cuya frecuencia sea mayor que 1
                .filter(m -> m.getValue() > 1)
                // Extraemos los nombres de los autores y los imprimimos
                .map(Map.Entry::getKey).forEach(System.out::println);*/

        System.out.println("El libro con mayor número de páginas");
        System.out.println(libros.stream().max(Comparator.comparingInt(Libro::getNumPaginas)).get().getTitulo());
        System.out.println("");

        System.out.println("Crear una lista de Strings con todos los títulos de los libros.");
        List<String> titulos = libros.stream().map(Libro::getTitulo).toList();
        System.out.println(titulos);
        System.out.println("");










    }


}