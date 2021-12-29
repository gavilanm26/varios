package com.banistmo.certificacion.tasks;

import com.banistmo.certificacion.userinterface.BanistmoPortalPersonasPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class GoTo implements Task {

    public static Performable PortalPersonas(){
        return Tasks.instrumented(GoTo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn().the(BanistmoPortalPersonasPage.class));
    }
}
