package com.banistmo.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.DriverTask;
import net.serenitybdd.screenplay.actions.Switch;

import java.util.ArrayList;

public class PDF implements Question<Boolean> {
    public static PDF abreCorrectamente() {
        return new PDF() ;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Object[] newTab = BrowseTheWeb.as(actor).getDriver().getWindowHandles().toArray();
        actor.attemptsTo(Switch.toWindow(newTab[newTab.length-1].toString()));
        return true;
    }
}
