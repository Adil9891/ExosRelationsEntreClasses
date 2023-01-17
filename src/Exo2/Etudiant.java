package Exo2;

public class Etudiant {
    private static int idEtudiant;
    private int id;
    private String nom;
    private String prenom;
    private String dateNaissance;
    private Filiere filiere;

    public Etudiant(String nom, String prenom, String dateNaissance, Filiere filiere) {
        idEtudiant++;
        this.id=idEtudiant;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.filiere = filiere;
        this.filiere.addEtudiant(this);


    }

    @Override
    public String toString() {
        return "\tJe suis l'étudiant "+this.nom+" " + this.prenom + " ma date de naissance est : " + this.dateNaissance ;
    }
}
