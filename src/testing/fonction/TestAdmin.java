package testing.fonction;
import testing.VerifGenerale;
import testing.VerifAdmin;
import classes.Admin;
import classes.listes.Admins;
public class TestAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nom="admin";
		String login="myusername";
		String mdp="user";
		VerifGenerale vg=new VerifGenerale();
		VerifAdmin vd=new VerifAdmin();
		if(vg.verifChaine(nom)||vg.verifChaine(login)||vg.verifChaine(mdp))
		{
			if(vd.ValidLogin(login)&&vd.ValidMdp(mdp))
			{
				Admin ad=new Admin(1, nom, login, mdp);
				Admin ad2=new Admin(2, nom, login, mdp);

				Admins.listadmins.add(ad);
				Admins.listadmins.add(ad2);
				Admins.showList();
				
			}
			else
			{
				System.out.println("login ou mot de passe incorrectes!");
			}
			
		}
		else
			System.out.println("login ou mot de passe vide!");

		

	}

}
