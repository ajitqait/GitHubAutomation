package com.franconnect.test;
import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//@Listeners(ListenerTest.class)
public class Check {

@Parameters
@BeforeGroups()
public void main()
{
	System.out.println("Before Group");
//	Assert.assertFalse(true);
}
@BeforeGroups
public void main1()
{
	System.out.println("Group");
}
@Test(groups= {"demo"})
public void demo()
{
	System.out.println("Before demo");
}
}
