package classes;

public class Suivie {
private int id,id_malade;
private float temperature;
private String date,heure,description;
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
public float getTemperature() {
	return temperature;
}
public void setTemperature(float temperature) {
	this.temperature = temperature;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getHeure() {
	return heure;
}
public void setHeure(String heure) {
	this.heure = heure;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@Override
public String toString() {
	return "Suivie [id=" + id + ", id_malade=" + id_malade + ", temperature=" + temperature + ", date=" + date
			+ ", heure=" + heure + ", description=" + description + "]";
}
public Suivie(int id, int id_malade, float temperature, String date, String heure, String description) {
	this.id = id;
	this.id_malade = id_malade;
	this.temperature = temperature;
	this.date = date;
	this.heure = heure;
	this.description = description;
}
public Suivie() {
}




}
