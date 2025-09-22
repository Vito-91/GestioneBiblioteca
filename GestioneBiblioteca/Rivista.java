package GestioneBiblioteca;

public class Rivista extends ElementoBiblioteca {

    private int numero;

    public Rivista(String titolo, int annoPubblicazione, int numero) {
        super(titolo, annoPubblicazione);
        this.numero = numero;
    }

    @Override
    public void mostraDettagli() {
        System.out.println("Rivista: " + titolo + ", Numero: " + numero + ", Anno: " + annoPubblicazione);
    }
}
