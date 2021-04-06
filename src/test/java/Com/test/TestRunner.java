package Com.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Adacati.feature\\Adacatin.feature",
                  glue="Com.step")
             
                    
   public class TestRunner {

}
	

