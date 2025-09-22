package GestioneBiblioteca;

public abstract class ElementoBiblioteca {
    protected String titolo;
    protected int annoPubblicazione;

    // Costruttore
    public ElementoBiblioteca(String titolo, int annoPubblicazione) {
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
    }

    // Metodo astratto da implementare nelle sottoclassi
    public abstract void mostraDettagli();
}
