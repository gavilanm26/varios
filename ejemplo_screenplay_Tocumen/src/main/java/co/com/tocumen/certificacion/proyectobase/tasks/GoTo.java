package co.com.tocumen.certificacion.proyectobase.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class GoTo implements Task {
    co.com.tocumen.certificacion.proyectobase.userinterface.TocumenPage TocumenPage;
    public static Performable TocumenPanama() {

            return Tasks.instrumented(GoTo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(TocumenPage));
    }
}
