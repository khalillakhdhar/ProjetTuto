package classes;

public class Parent {
private int id;
private String email,mdp,telephone;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public String getTelephone() {
	return telephone;
}
public void setTelephone(String telephone) {
	this.telephone = telephone;
}
@Override
public String toString() {
	return "Parent [id=" + id + ", email=" + email + ", mdp=" + mdp + ", telephone=" + telephone + "]";
}

public Parent(int id, String email, String mdp, String telephone) {
	this.id = id;
	this.email = email;
	this.mdp = mdp;
	this.telephone = telephone;
}
public Parent() {
}

}
