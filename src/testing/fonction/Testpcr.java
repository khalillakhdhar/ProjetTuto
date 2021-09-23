package testing.fonction;
import classes.Test;
import classes.listes.Tests;
import testing.VerifGenerale;
import testing.VerifTeste;
public class Testpcr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String titre="teste23";
int jour=2;
int mois= 7;
String resultat="teste+";
String description="teste positif numéro 2 du malade";
VerifTeste vt=new VerifTeste();
if(vt.validResult(resultat)&&vt.validDay(jour, mois)&& vt.validDescription(description))
{
Test t = new Test(1, 2, jour, mois, 2020, titre, resultat, description);
Tests.testList.add(t);
Tests.showlist();

}
else
	System.out.println("paramétres incorrecte!");

	}

}
