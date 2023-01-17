package Exo2;

import java.util.ArrayList;

public class Filiere {
    private static int idFiliere;
    private  int id;
    private String code;
    private String libelle;
    private ArrayList<Etudiant> listeEtudiant = new ArrayList<>();

    public Filiere(String code, String libelle) {
        idFiliere ++;
        this.id=idFiliere;
        this.code = code;
        this.libelle = libelle;

    }
    public void addEtudiant(Etudiant etudiant) {
        listeEtudiant.add(etudiant);
    }

    @Override
    public String toString() {
        return "Filière : " + libelle ;
    }

    public ArrayList<Etudiant> getListeEtudiant() {
        return listeEtudiant;
    }
}
