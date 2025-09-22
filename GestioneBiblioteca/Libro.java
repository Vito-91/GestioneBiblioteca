package GestioneBiblioteca;

public class Libro extends ElementoBiblioteca implements Prestabile  {
    private String autore;
    private boolean disponibile; // Per gestire prestiti

    public Libro(String titolo, int annoPubblicazione, String autore) {
        super(titolo, annoPubblicazione);
        this.autore = autore;
        this.disponibile = true; // All'inizio è disponibile
    }

    // Implementazione del metodo astratto
    @Override
    public void mostraDettagli() {
        System.out.println("Libro: " + titolo + ", Autore: " + autore + ", Anno: " + annoPubblicazione + ", Disponibile: " + disponibile);
    }

    // Implementazione dell'interfaccia Prestabile
    @Override
    public void presta() {
        if (disponibile) {
            disponibile = false;
            System.out.println(titolo + " è stato prestato.");
        } else {
            System.out.println(titolo + " non è disponibile per il prestito.");
        }
    }

    @Override
    public void restituisci() {
        disponibile = true;
        System.out.println(titolo + " è stato restituito.");
    }
}
