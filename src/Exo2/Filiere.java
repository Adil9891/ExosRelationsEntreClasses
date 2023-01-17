package Exo2;

import java.util.ArrayList;

public class Filiere {
    private static int id;
    private String code;
    private String libelle;
    private ArrayList<Etudiant> listeEtudiant = new ArrayList<Etudiant>();

    public Filiere(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;
        this.id++;
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
