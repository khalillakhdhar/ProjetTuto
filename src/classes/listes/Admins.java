package classes.listes;

import java.util.ArrayList;
import classes.Admin;
public class Admins {
public static ArrayList<Admin> listadmins =new ArrayList<Admin>();

public static void addToList(Admin adm)
{
listadmins.add(adm);	
}
public static void showList()
{
for(Admin ad: listadmins)
{
System.out.println(ad.toString());	
}

}


}
