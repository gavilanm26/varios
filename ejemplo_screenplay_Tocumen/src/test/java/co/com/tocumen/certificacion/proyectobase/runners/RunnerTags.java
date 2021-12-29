package co.com.tocumen.certificacion.proyectobase.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/",
        tags = "@IngresoViajarConMenores",
        glue = "co.com.tocumen.certificacion.proyectobase.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}