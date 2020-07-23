package resources;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends base implements ITestListener{
	ThreadLocal<ExtentTest> extenttest = new ThreadLocal<ExtentTest>();
	ExtentTest test;
	public  ExtentReports report = ExtentReportTest.getExtentReport();
	public void onFinish(ITestContext arg0) {
		report.flush();
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Started");
		test = report.createTest(result.getMethod().getMethodName());
		extenttest.set(test);
		extenttest.get().log(Status.INFO, "Test Execution Started");
		returnThreadLocal();
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("x");
		try{
			System.out.println(result.getTestName());
			System.out.println(result.getName());
			System.out.println(result.getStatus());
			System.out.println(result.getMethod().getMethodName());
			extenttest.get().log(Status.PASS, "Test Executed Successfully");
		
		}catch(Exception exp){
			exp.printStackTrace();
		}

}
	public ThreadLocal<ExtentTest> returnThreadLocal(){
		return this.extenttest;
	}
}
