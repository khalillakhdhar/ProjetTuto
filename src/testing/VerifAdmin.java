package testing;

public class VerifAdmin {
public boolean ValidLogin(String login)
{
return !login.contains("admin");	

}
public boolean ValidMdp(String mdp)
{
if(mdp.contains("$")|| mdp.contains("&"))
	return false;
else return true;

}
public boolean ValidMail(String email)
{
int indicepoint=email.indexOf(".");
int indiceat=email.indexOf("@");
int longueur=email.length();
int espacepoint=longueur-indicepoint;
int espaceat=longueur-indiceat;
if(indicepoint<0 || indiceat<0)
	return false;
else if(espacepoint<2|| espaceat<4)
	return false;
else
	return true;
}
public boolean validTel(String telephone)
{
return telephone.length()>8;	

}
}
