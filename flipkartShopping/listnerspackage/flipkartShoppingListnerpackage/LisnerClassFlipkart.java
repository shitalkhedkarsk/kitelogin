package flipkartShoppingListnerpackage;

import org.testng.ITestListener;
import org.testng.ITestResult;

import base_package.Brouser_setup;

public class LisnerClassFlipkart extends Brouser_setup implements ITestListener
{
	public void onTestFailure(ITestResult result)
	{
		String tcName = result.getName();
		System.out.println("failed tc name is "+tcName);
		try {
			takescreenshotforTC(tcName);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("pass tc name is "+result.getName());
	}
	public void onTestStart(ITestResult result)
	{
		System.out.println("start tc name is "+result.getName());
	}
}
