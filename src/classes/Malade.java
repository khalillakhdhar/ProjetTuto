package classes;

public class Malade {
private int id;
private String nom,prenom,adresse,telephone;
private int id_parent;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getTelephone() {
	return telephone;
}
public void setTelephone(String telephone) {
	this.telephone = telephone;
}
public int getId_parent() {
	return id_parent;
}
public void setId_parent(int id_parent) {
	this.id_parent = id_parent;
}




@Override
public String toString() {
	return "Malade [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", telephone="
			+ telephone + ", id_parent=" + id_parent + "]";
}
public Malade(int id, String nom, String prenom, String adresse, String telephone, int id_parent) {
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
	this.adresse = adresse;
	this.telephone = telephone;
	this.id_parent = id_parent;
}
public Malade() {
}




}
