package TestNGsample;

import org.testng.annotations.Test;

public class priority {
@Test(priority = 1)
public void firstTestcase()
{
System.out.println("run my first test case");
}

@Test(priority = 2)
public void secondTestcase()
{
System.out.println("run my second test case");
}

@Test(priority = 3)
public void thirdTestcase()
{
System.out.println("run my third test case");
}

}