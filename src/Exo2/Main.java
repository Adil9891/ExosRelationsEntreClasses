package Exo2;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        // Création des filières de l'école :

        Filiere filiere1 = new Filiere("INF","Informatique");
        Filiere filiere2 = new Filiere("TIC","Techno de l'info et de communication");
        Filiere filiere3 = new Filiere("GC","Génie civil");

        List<Filiere> listeFiliere = new ArrayList<>();
        listeFiliere.add(filiere1);
        listeFiliere.add(filiere2);
        listeFiliere.add(filiere3);

        // Création des étudiants :

        Etudiant etudiant1 = new Etudiant("Rachid","Mohammed","10/10/2000",filiere1);
        Etudiant etudiant2 = new Etudiant("Chakib","Yves","05/12/2004",filiere1);
        Etudiant etudiant3 = new Etudiant("Alaoui","Manal","02/03/2011",filiere2);
        Etudiant etudiant4 = new Etudiant("Safi","Meriem","18/03/2009",filiere3);
        Etudiant etudiant5 = new Etudiant("Rami","Mouad","18/12/2006",filiere3);

        // affectation des étudinats par filière :

//        filiere1.addEtudiant(etudiant1);
//        filiere1.addEtudiant(etudiant2);
//        filiere2.addEtudiant(etudiant3);
//        filiere3.addEtudiant(etudiant4);
//        filiere3.addEtudiant(etudiant5);

        // Affichage de la liste des étudiants par filière :

        for (Filiere filiere : listeFiliere) {
            System.out.println(filiere);
                for (Etudiant etudiant : filiere.getListeEtudiant()){
                    System.out.println(etudiant);
                }
            System.out.println();
        }
    }
}
