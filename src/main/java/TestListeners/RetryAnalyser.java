package TestListeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import Base.BaseClass;



public class RetryAnalyser extends BaseClass implements IRetryAnalyzer{
	
	int count = 0;
	int retrylimit = 0;

	public boolean retry(ITestResult arg0) {
		if(count<retrylimit) {
			count++;
			return true;
		}
		return false;
	}

}
