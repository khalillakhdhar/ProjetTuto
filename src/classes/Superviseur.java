package classes;

public class Superviseur {
private int id;
private String nom,telephone,email,mdp;
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
public String getTelephone() {
	return telephone;
}
public void setTelephone(String telephone) {
	this.telephone = telephone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMdp() {
	return mdp;
}
public void setMdp(String mdp) {
	this.mdp = mdp;
}
public Superviseur(int id, String nom, String telephone, String email, String mdp) {
	this.id = id;
	this.nom = nom;
	this.telephone = telephone;
	this.email = email;
	this.mdp = mdp;
}
public Superviseur() {
}
@Override
public String toString() {
	return "Superviseur [id=" + id + ", nom=" + nom + ", telephone=" + telephone + ", email=" + email + ", mdp=" + mdp
			+ "]";
}

}
