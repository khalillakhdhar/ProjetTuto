package classes.listes;

import java.util.ArrayList;
import classes.Test;
public class Tests {
public static ArrayList<Test> testList=new ArrayList<Test>();

public void addtoTests(Test t)
{
testList.add(t);	

}
public static void showlist()
{
for(Test tes:testList)
	System.out.println(tes.toString());


}


}
