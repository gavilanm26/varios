package co.com.tocumen.certificacion.proyectobase.questions;

import co.com.tocumen.certificacion.proyectobase.userinterface.ViajandoConMenoresPage;
import net.serenitybdd.screenplay.*;

public class Answer implements Question<Boolean> {
    ViajandoConMenoresPage viajandoConMenoresPage;
    public static Answer toThe() {
       return new Answer() ;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        viajandoConMenoresPage.CambiarVentana();
        result=true;
        return result;
    }
}
