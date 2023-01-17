package Exo2;

public class Etudiant {
    private static int id;
    private String nom;
    private String prenom;
    private String dateNaissance;
    private Filiere filiere;

    public Etudiant(String nom, String prenom, String dateNaissance, Filiere filiere) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.filiere = filiere;
        this.id++;

    }

    @Override
    public String toString() {
        return "\tJe suis l'étudiant "+this.nom+" " + this.prenom + " ma date de naissance est : " + this.dateNaissance ;
    }
}
