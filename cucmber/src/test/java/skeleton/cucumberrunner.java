package skeleton;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:cucumber-reports"},monochrome=true,
   features= {"src/test/resources/skeleton/demowedshop.feature"},
dryRun=false,tags= {"@invalid"},snippets=SnippetType.CAMELCASE)
public class cucumberrunner {

}
