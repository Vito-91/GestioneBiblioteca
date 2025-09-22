package GestioneBiblioteca;

public class BibliotecaMain {

    public static void main(String[] args) {
        // Creiamo oggetti
        Libro libro1 = new Libro("I Promessi Sposi", 1840, "Alessadro Manzoni");
        Rivista rivista1 = new Rivista("Focus", 2025, 7);
        DVD dvd1 = new DVD("Inception", 2010, "Christopher Nolan");

        // Array di ElementoBiblioteca
        ElementoBiblioteca[] catalogo = {libro1, rivista1, dvd1};

        // Mostriamo il catalogo iniziale
        System.out.println("Catalogo iniziale:");
        for (ElementoBiblioteca elemento : catalogo) {
            elemento.mostraDettagli();
        }

        System.out.println("\nPrestiti:");
        libro1.presta();
        dvd1.presta();

        System.out.println("\nCatalogo dopo prestiti:");
        for (ElementoBiblioteca elemento : catalogo) {
            elemento.mostraDettagli();
        }

        System.out.println("\nRestituzioni:");
        libro1.restituisci();

        System.out.println("\nCatalogo finale:");
        for (ElementoBiblioteca elemento : catalogo) {
            elemento.mostraDettagli();
        }
    }
}
