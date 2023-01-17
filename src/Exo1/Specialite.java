package Exo1;

public class Specialite {
    private static int id;
    private String code;
    private String libelle;

    public Specialite(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;
        this.id++;
    }

    public static int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getLibelle() {
        return libelle;
    }

    @Override
    public String toString() {
        return "Specialité "+this.libelle;
    }
}
