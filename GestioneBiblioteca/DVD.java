package GestioneBiblioteca;

public class DVD extends ElementoBiblioteca implements Prestabile {

    private String regista;
    private boolean disponibile;

    public DVD(String titolo, int annoPubblicazione, String regista) {
        super(titolo, annoPubblicazione);
        this.regista = regista;
        this.disponibile = true;
    }

    @Override
    public void mostraDettagli() {
        System.out.println("DVD: " + titolo + ", Regista: " + regista + ", Anno: " + annoPubblicazione + ", Disponibile: " + disponibile);
    }

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
