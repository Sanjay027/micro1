package Com.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Adacati.feature\\Adacatin.feature",
                  glue="Com.step",
                  monochrome  = true,
                  dryRun      = false,
                  snippets    = SnippetType.UNDERSCORE,
                  plugin   = {
                		  
                  
                    "pretty",
                    "html:C:\\Users\\G Sree Mamatha\\eclipse-workspace\\Gradle\\AdacaTin.Gladle\\lib\\Reports\\html",
                    "json:C:\\Users\\G Sree Mamatha\\eclipse-workspace\\Gradle\\AdacaTin.Gladle\\lib\\Reports\\json\\adac.json",
                    "xml:C:\\Users\\G Sree Mamatha\\eclipse-workspace\\Gradle\\AdacaTin.Gladle\\lib\\Reports\\xml\\adac.xml"})
                    
                    
                  





public class TestRunner {

	
	
}
