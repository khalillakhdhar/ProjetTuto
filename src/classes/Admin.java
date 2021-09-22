package classes;

public class Admin {
	private int id;
	private String nom,login,mdp;
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
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public Admin(int id, String nom, String login, String mdp) {
		this.id = id;
		this.nom = nom;
		this.login = login;
		this.mdp = mdp;
	}
	public Admin() {
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", nom=" + nom + ", login=" + login + ", mdp=" + mdp + "]";
	}
	
	
	
	
}
