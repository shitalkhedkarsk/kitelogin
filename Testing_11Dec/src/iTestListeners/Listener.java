package iTestListeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{
@Override
public void onTestStart(ITestResult result) {
	Reporter.log("Your Tc is started",true);
	ITestListener.super.onTestStart(result);
}
@Override
	public void onTestSuccess(ITestResult result) {
	Reporter.log("Congrats, your Tc is passed",true);
		ITestListener.super.onTestSuccess(result);
	}
@Override
	public void onTestSkipped(ITestResult result) {
	Reporter.log("Your Tc is skipped",true);
		ITestListener.super.onTestSkipped(result);
	}
@Override
	public void onTestFailure(ITestResult result) {
	Reporter.log("Sorry, your Tc is failed",true);
		ITestListener.super.onTestFailure(result);
	}
}
