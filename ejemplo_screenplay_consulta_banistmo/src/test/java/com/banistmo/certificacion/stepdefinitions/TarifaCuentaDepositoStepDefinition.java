package com.banistmo.certificacion.stepdefinitions;

import com.banistmo.certificacion.exceptions.QuestionErrors;
import com.banistmo.certificacion.questions.PDF;
import com.banistmo.certificacion.tasks.AbrirPDF;
import com.banistmo.certificacion.tasks.GoTo;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TarifaCuentaDepositoStepDefinition {
    @Before
    public void SetStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Ingreso a portal personas banistmo$")
    public void ingreso_a_portal_personas_banistmo() throws Exception {
        theActorCalled("Usuario").wasAbleTo(GoTo.PortalPersonas());
    }


    @When("^ingreso a la opcion tarifario para abrir PDF$")
    public void ingreso_a_la_opcion_tarifario_para_abrir_PDF() throws Exception {
        theActorInTheSpotlight().attemptsTo(AbrirPDF.TarifaCuentasDeposito());
    }

    @Then("^Verifico que el pdf se abra correctamente$")
    public void verifico_que_el_pdf_se_abra_correctamente() throws Exception {
        theActorInTheSpotlight().should(seeThat(PDF.abreCorrectamente()).
                orComplainWith(QuestionErrors.class,QuestionErrors.FALLO_PREPARACION_PAGO));
    }
}
