package testing.fonction;

import classes.Superviseur;

import classes.listes.Superviseurs;
import testing.VerifAdmin;
import testing.VerifGenerale;

public class TestSuperviseur {
	// TODO Auto-generated method stub
	public static void main(String args[])
	{
		String nom="admin";
		String mdp="myusername";
		String email="user@gmail.com";
		String telephone="00337689432";
	VerifGenerale vg=new VerifGenerale();
	VerifAdmin va=new VerifAdmin();
	if(vg.verifChaine(nom)&&vg.verifChaine(mdp)&&vg.verifChaine(email)&&vg.verifChaine(telephone))
	{
		if(va.ValidMail(email)&&va.ValidMdp(mdp)&&va.validTel(telephone))
		{
			Superviseur s=new Superviseur(0, nom, telephone, email, mdp);
			Superviseurs.superviseurList.add(s);
			Superviseurs.listSup();
							
		}
		else
		{
			System.out.println("les paramétres sont incorrectes!");
		}
		
	}
	else
		System.out.println("l'un des paramétre est  vide!");

	


		
		
		
	}
}
