package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
	
	@Test(retryAnalyzer = com.crm.comcast.genericlib.RetryAnalyzer.class)
	public void sampleTest() {
		Assert.assertTrue(false);
	}

}
