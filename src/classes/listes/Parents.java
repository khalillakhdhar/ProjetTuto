package classes.listes;

import java.util.ArrayList;

import classes.Parent;

public class Parents {
public static ArrayList<Parent> parentsListe=new ArrayList<Parent>();
public void addToList(Parent p)
{
parentsListe.add(p);	
}
public static void showList()
{
for(Parent p: parentsListe)
{
System.out.println(p);	

}
}

}
