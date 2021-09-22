package classes.listes;

import java.util.ArrayList;

import classes.Superviseur;

public class Superviseurs {
public static ArrayList<Superviseur> superviseurList=new ArrayList<Superviseur>();

public void addToSup(Superviseur sup)
{
superviseurList.add(sup);	
}

public static void listSup()
{
for(Superviseur sup:superviseurList)
{
System.out.println(sup.toString());	
}

}

}
