package classes.listes;

import java.util.ArrayList;

import classes.Suivie;

public class Suivies {
public static ArrayList<Suivie> suivieListe=new ArrayList<Suivie>();

public void addToMyList(Suivie s)
{
suivieListe.add(s);	
}
public static void showListSuivie()
{
for(Suivie su:suivieListe)
	System.out.println(su.toString());

}
}
