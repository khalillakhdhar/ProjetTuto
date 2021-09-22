package classes.listes;
import java.util.ArrayList;

import classes.Malade;
public class Malades {
public static ArrayList<Malade> maladesList=new ArrayList<Malade>();
public static void addToList(Malade m)
{
	maladesList.add(m);
	

}

public static void ShowMalades()
{
for(Malade ma: maladesList)
{
System.out.println(ma.toString());	

}
}
}
