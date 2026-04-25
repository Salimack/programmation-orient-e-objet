package tp12bis.exo1;

public class Contact {

    // Attributs
    private int numero;
    private String prenom;
    private String nom;
    private String email;

    // Constructeur avec 4 arguments
    public Contact(int numero, String prenom, String nom, String email) {
        this.numero=numero;
        this.prenom=prenom;
        this.nom=nom;
        this.email=email;
    }

    // Constructeur sans argument
    public Contact() {
        this(0,"","","");
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setNumero(int numero) {
        this.numero=numero;
    }

    public void setPrenom(String prenom) {
        this.prenom=prenom;
    }

    public void setNom(String nom) {
        this.nom=nom;
    }

    public void setEmail(String email) {
        this.email=email;
    }

    // Redéfinition de toString()
    @Override
    public String toString() {
        return "numero : "+numero+"\n prenom : "+prenom+"\n nom : "+nom+"\n email : "+email;
    }
}
