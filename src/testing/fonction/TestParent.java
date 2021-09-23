package testing.fonction;

import classes.Parent;
import classes.listes.Parents;
import testing.VerifAdmin;
import testing.VerifGenerale;

public class TestParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nom="admin";
		String mdp="myusername";
		String email="user@gmail.com";
		String telephone="00337689432";
		VerifGenerale vg=new VerifGenerale();
		VerifAdmin vd=new VerifAdmin();
		if(vg.verifChaine(nom)&&vg.verifChaine(mdp)&&vg.verifChaine(email)&&vg.verifChaine(telephone))
		{
			if(vd.ValidMail(email)&&vd.ValidMdp(mdp)&&vd.validTel(telephone))
			{
				Parent p=new Parent(1, email, mdp, telephone);
				Parents.parentsListe.add(p);
				Parents.showList();
								
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
