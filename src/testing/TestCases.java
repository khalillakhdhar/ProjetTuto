package testing;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestCases {
@Rule
public ExpectedException exception=ExpectedException.none();
public VerifAdmin va;
public VerifGenerale vg;
public VerifTeste vt;
@Before
public void beforeCoding()
{
this.va=new VerifAdmin();
this.vg=new VerifGenerale();
this.vt=new VerifTeste();

}
@Test
public void testInt()
{
	
exception.expect(NumberFormatException.class);
vg.convertToInt("11a");
}
@Test
public void testPositif()
{
assertTrue(vg.verifPositif(4));	
}
@Test
public void testNotEmpty()
{
assertTrue(vg.verifChaine("bonjour"));	
}
@Test
public void testDate()
{
assertTrue(vt.validDay(31, 5));	

}
@Test
public void verifResultat()
{
assertTrue(vt.validResult("teste"));	
}

	
	
	
	
	
}
