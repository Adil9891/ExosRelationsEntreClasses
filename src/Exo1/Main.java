package Exo1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Specialite specialite1 = new Specialite ("JEE","JAVA/JEE");
        Specialite specialite2 = new Specialite (".NET",".net");
        Specialite specialite3 = new Specialite ("GP","Gestion de projet");
        Specialite specialite4 = new Specialite ("CISCO","CISCO");
        Specialite specialite5 = new Specialite ("PHP","PHP");


        Professeur p1 = new Professeur ("Safi","Amal","0666666666","safi@gmail.com",specialite1);
        Professeur p2 = new Professeur ("Alami","Said","077777777","alami@yahoo.fr",specialite1);
        Professeur p3 = new Professeur ("ALaoui","Reda","099999999","alaoui@uahoofr.com",specialite4);
        Professeur p4 = new Professeur ("Kamali","Imane","0555555555","i.kamali@gmail.com",specialite4);
        List<Specialite> listeSpecialite = new ArrayList();
        listeSpecialite.add(specialite1);
        listeSpecialite.add(specialite2);
        listeSpecialite.add(specialite3);
        listeSpecialite.add(specialite4);
        listeSpecialite.add(specialite5);


        List<Professeur> listeProfesseur = new ArrayList();
        listeProfesseur.add(p1);
        listeProfesseur.add(p2);
        listeProfesseur.add(p3);
        listeProfesseur.add(p4);


        System.out.println("\nProfesseurs par spécialité :\n");
        boolean trouver = false;
        for (Specialite s : listeSpecialite){

            System.out.println(s);


            for(Professeur p:listeProfesseur){
                if(p.getSpecialite().getLibelle().equals(s.getLibelle())){
                    System.out.println(" - "+ p);
                    trouver=true;
                }
            }
            if (trouver==false){
                System.out.println("Aucun professeur dans cette spécialité");
            }
            System.out.println();
            trouver=false;

        }



    }
}