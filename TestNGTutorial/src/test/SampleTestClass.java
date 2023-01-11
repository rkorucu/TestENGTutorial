package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestClass {

    @Test(retryAnalyzer = SampleRetryAnalyzer.class)
    public void testMethod() {
        Assert.fail();
    }
}