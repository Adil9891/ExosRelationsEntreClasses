public class Professeur {
    private static int id;
    private String  nom;
    private String prenom;
    private String telephone;
    private String email;
    private Specialite specialite;

    public Professeur(String nom, String prenom, String telephone, String email,Specialite specialite) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
        this.specialite=specialite;
        this.id++;
    }

    public static int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public Specialite getSpecialite() {
        return specialite;
    }

    @Override
    public String toString() {
        return nom.toUpperCase() + " "+ prenom +" " +email ;
    }

}
