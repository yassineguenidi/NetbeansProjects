public class Produit{
    int id;
    String libelle;
    int prix;

    public Produit(int id, String libelle, int prix) {
        this.id = id;
        this.libelle = libelle;
        this.prix = prix;
    }

    public Produit() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
    
}