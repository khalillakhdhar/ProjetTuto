package testing;

import java.util.Arrays;
import java.util.List;

public class VerifTeste {
private List<Integer> big= Arrays.asList(1,3,5,7,8,10,12);
private List<Integer> small=Arrays.asList(4,6,9,11);
public boolean valideJour(int jour)
{
return jour>0 && jour<=31;

}
public boolean validMois(int month)
{
return month<=12 && month>0;	
}
public boolean validDay(int day,int month)
{
if(!valideJour(day)||!validMois(month))
	return false;
else if(small.contains(month)&&day >30)
	return false;
else if(month==2 && day>29)
	return false;
else
	return true;

}
public boolean validResult(String resultat)
{
if(resultat.equals("test+")||resultat.equals("teste-"))
	return true;
else 
	return false;
}
public boolean validDescription(String description)
{
if(description.contains("positif")||description.contains("negatif"))
return true;
else 
	return false;

}





}
