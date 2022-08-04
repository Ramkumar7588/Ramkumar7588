package TestNGsample;

import org.testng.annotations.Test;

public class dependencies {

@Test
public void highschool()
{
System.out.println("highschool");
}

@Test(dependsOnMethods ="highschool" )
public void highersecondaryschool()
{
System.out.println("highersecondaryschool");
}
@Test(dependsOnMethods = "highersecondaryschool")
public void engg()
{
System.out.println("engg");
}
}