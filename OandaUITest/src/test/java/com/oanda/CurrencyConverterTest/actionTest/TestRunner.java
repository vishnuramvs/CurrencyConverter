package com.oanda.CurrencyConverterTest.actionTest;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;



import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"/Users/vsampathkumar/Desktop/OandaUITest/src/main/resources/com/oanda/CurrencyConverterTest/actionTest/classes/positiveFlow.feature"})
//		"src/main/resource/com/apple/tesla/PeopleServiceTest/actionTest/classes/gradeBrowse.feature"})


public class TestRunner {
	@BeforeClass
	public static void  beforeAll()
	{
		
	}    
}
