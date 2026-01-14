## Gestione Biblioteca – Java

### Descrizione
Progetto Java console che simula la gestione di una biblioteca.
Il sistema utilizza classi astratte, sottoclassi e interfacce per modellare gli elementi disponibili.

### Struttura del progetto
- Classe astratta `ElementoBiblioteca` con attributi comuni (titolo, annoPubblicazione)
- Sottoclassi: `Libro`, `Rivista`, `DVD`
- Interfaccia `Prestabile` con i metodi `presta()` e `restituisci()`
- Alcuni elementi (Libro, DVD) implementano l’interfaccia `Prestabile`

### Funzionalità
- Simulazione di prestiti e restituzioni
- Stampa del catalogo
- Gestione del flusso tramite metodo `main`

### Argomenti trattati
- Programmazione orientata agli oggetti (OOP)
- Classi astratte e interfacce
- Ereditarietà e polimorfismo
- Logica applicativa in Java

### Come eseguirlo
1. Clona il repository
2. Aprilo con IntelliJ
3. Avvia la classe che contiene il metodo `main`

### Obiettivo
Applicare i concetti fondamentali dell’OOP in Java attraverso un progetto pratico.
