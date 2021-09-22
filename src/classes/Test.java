package classes;

public class Test {
private int id,id_malade,jour,mois,annee;
private String titre,resultat,description;
public Test(int id, int id_malade, int jour, int mois, int annee, String titre, String resultat, String description) {
	this.id = id;
	this.id_malade = id_malade;
	this.jour = jour;
	this.mois = mois;
	this.annee = annee;
	this.titre = titre;
	this.resultat = resultat;
	this.description = description;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getId_malade() {
	return id_malade;
}
public void setId_malade(int id_malade) {
	this.id_malade = id_malade;
}
public int getJour() {
	return jour;
}
public void setJour(int jour) {
	this.jour = jour;
}
public int getMois() {
	return mois;
}
public void setMois(int mois) {
	this.mois = mois;
}
public int getAnnee() {
	return annee;
}
public void setAnnee(int annee) {
	this.annee = annee;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getResultat() {
	return resultat;
}
public void setResultat(String resultat) {
	this.resultat = resultat;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@Override
public String toString() {
	return "Test [id=" + id + ", id_malade=" + id_malade + ", jour=" + jour + ", mois=" + mois + ", annee=" + annee
			+ ", titre=" + titre + ", resultat=" + resultat + ", description=" + description + "]";
}
public Test() {
}






}
