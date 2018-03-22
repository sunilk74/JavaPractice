package com.sunil.javapractice;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sunil.utils.DataSourceUtils;

import junit.framework.Assert;

public class PyramidsTest extends DataSourceUtils{
	
	Pyramids py = new Pyramids();
	
	@BeforeTest
	public void beforeTest()
	{
		Pyramids py = new Pyramids();
	}
	
	//@Test()
	public void pyramid1Test1()
	{
		//Pyramids py = new Pyramids();
		String op = py.pyramid1(5);
		Assert.assertEquals("PASS", op);
	}
	
	@Test()
	public void pyramid1Test2()
	{
		//Pyramids py = new Pyramids();
		String op = py.pyramid1(0);
		Assert.assertEquals("Number of rows cannot be zero", op);
	}
	
	@Test()
	public void pyramid1Test3()
	{
		//Pyramids py = new Pyramids();
		String op = py.pyramid1(-5);
		Assert.assertEquals("Number of rows cannot be negative", op);
	}

	@Test(dataProvider= "pyramid1testcase")
	public void pyramid1Test(String num, String result)
	{
		//Pyramids py = new Pyramids();
		String op = py.pyramid1(Integer.parseInt(num));
		Assert.assertEquals(result, op);
	}
	
	@Test(dataProvider= "pyramid2testcase")
	public void pyramid2Test(String num, String result)
	{
		//Pyramids py = new Pyramids();
		String op = py.pyramid2(Integer.parseInt(num));
		Assert.assertEquals(result, op);
	}
	
	@Test(dataProvider= "pyramid3testcase")
	public void pyramid3Test(String num, String result)
	{
		//Pyramids py = new Pyramids();
		String op = py.pyramid3(Integer.parseInt(num));
		Assert.assertEquals(result, op);
	}
	
	@Test(dataProvider= "pyramid4testcase")
	public void pyramid4Test(String num, String result)
	{
		//Pyramids py = new Pyramids();
		String op = py.pyramid4(Integer.parseInt(num));
		Assert.assertEquals(result, op);
	}
	
	@Test(dataProvider= "pyramid5testcase")
	public void pyramid5Test(String num, String result)
	{
		//Pyramids py = new Pyramids();
		String op = py.pyramid5(Integer.parseInt(num));
		Assert.assertEquals(result, op);
	}
	
	@Test(dataProvider= "pyramid6testcase")
	public void pyramid6Test(String num, String result)
	{
		//Pyramids py = new Pyramids();
		String op = py.pyramid6(Integer.parseInt(num));
		Assert.assertEquals(result, op);
	}
	
	@Test(dataProvider= "pyramid7testcase")
	public void pyramid7Test(String num, String result)
	{
		//Pyramids py = new Pyramids();
		String op = py.pyramid7(Integer.parseInt(num));
		Assert.assertEquals(result, op);
	}
	
	@DataProvider
	public Object[][] pyramid1testcase() throws IOException
	{
		Object[][] data = testCaseFile("/data/pyramid1/testcase.txt");
		return data;
	}
	
	@DataProvider
	public Object[][] pyramid2testcase() throws IOException
	{
		Object[][] data = testCaseFile("/data/pyramid2/testcase.txt");
		return data;
	}
	
	@DataProvider
	public Object[][] pyramid3testcase() throws IOException
	{
		Object[][] data = testCaseFile("/data/pyramid3/testcase.txt");
		return data;
	}
	
	@DataProvider
	public Object[][] pyramid4testcase() throws IOException
	{
		Object[][] data = testCaseFile("/data/pyramid4/testcase.txt");
		return data;
	}
	
	@DataProvider
	public Object[][] pyramid5testcase() throws IOException
	{
		Object[][] data = testCaseFile("/data/pyramid5/testcase.txt");
		return data;
	}
	
	@DataProvider
	public Object[][] pyramid6testcase() throws IOException
	{
		Object[][] data = testCaseFile("/data/pyramid6/testcase.txt");
		return data;
	}
	
	@DataProvider
	public Object[][] pyramid7testcase() throws IOException
	{
		Object[][] data = testCaseFile("/data/pyramid7/testcase.txt");
		return data;
	}

}
