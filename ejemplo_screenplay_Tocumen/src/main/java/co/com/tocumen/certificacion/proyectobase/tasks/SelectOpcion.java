package co.com.tocumen.certificacion.proyectobase.tasks;

import co.com.tocumen.certificacion.proyectobase.userinterface.ViajandoConMenoresPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class SelectOpcion implements Task {

    public static SelectOpcion  ViajandoConMenores() {
        return Tasks.instrumented(SelectOpcion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ViajandoConMenoresPage.BUTTON_SERVICIOS),
                Click.on(ViajandoConMenoresPage.BUTTON_IFNOVIAJERO),
                Click.on(ViajandoConMenoresPage.BUTTON_OBJETOS),
                JavaScriptClick.on(ViajandoConMenoresPage.BUTTON_POLITICAS));
    }
}
