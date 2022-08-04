package TestNGsample;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {
@Test
@Parameters("Name")
public void printname(String Name)
{
	System.out.println("name is:" + Name );
}

}
