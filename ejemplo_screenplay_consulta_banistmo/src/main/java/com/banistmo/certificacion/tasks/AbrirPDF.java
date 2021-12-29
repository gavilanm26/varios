package com.banistmo.certificacion.tasks;

import com.banistmo.certificacion.userinterface.TarifaCuentaDepositoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AbrirPDF implements Task {

    public static Performable TarifaCuentasDeposito (){
        return Tasks.instrumented(AbrirPDF.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TarifaCuentaDepositoPage.LINK_TARIFATIO),
                Click.on(TarifaCuentaDepositoPage.BOTON_ABRIR_PDF));
    }
}
