package testing.fonction;
import testing.VerifGenerale;
import classes.Suivie;
import classes.listes.Suivies;
public class TestSuivie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float temperature=(float) 37.4;
String date= "23/09/2021";
String description="aucun signe";
String heure="12:00";
VerifGenerale vg =new VerifGenerale();

if(vg.verifChaine(String.valueOf(temperature))&&vg.verifChaine(heure)&&vg.verifChaine(date))
{
Suivie s=new Suivie(1,2,temperature,date,heure,description);
Suivies.suivieListe.add(s);
Suivies.showListSuivie();
	}

}
}