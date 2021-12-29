package co.com.tocumen.certificacion.proyectobase.stepdefinitions;

import co.com.tocumen.certificacion.proyectobase.questions.Answer;
import co.com.tocumen.certificacion.proyectobase.tasks.GoTo;
import co.com.tocumen.certificacion.proyectobase.tasks.SelectOpcion;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class TocumenStepDefinitions {
    @Before
    public void SetStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Ingreso a Tocumen Panama$")
    public void ingresoAChoucairAcademy() throws Exception {
        OnStage.theActorCalled("YO").wasAbleTo(GoTo.TocumenPanama());
    }

    @When("^Accedo a Viajar con menores$")
    public void accedoAlCursoRecursosAutomatizaciónBancolombia() throws Exception {
        OnStage.theActorCalled("YO").attemptsTo(SelectOpcion.ViajandoConMenores());
    }


    @Then("^Verifico Pagina web$")
    public void verificoTituloDelCurso() throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe()));
    }

}
