package testing;

public class VerifGenerale {
public boolean verifChaine(String x)
{
return !x.isEmpty();	

}
public double conversibleDouble(String y)
{
	//conversion de String en double
	//si y="21,3" => return =21,3
	//si y="21a,3" => return exception 
return Double.parseDouble(y);	
}
}
