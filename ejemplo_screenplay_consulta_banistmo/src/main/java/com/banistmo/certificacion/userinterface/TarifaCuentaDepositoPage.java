package com.banistmo.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TarifaCuentaDepositoPage {
    public static final Target LINK_TARIFATIO = Target.the("Acceso rapido a Tarifario")
            .locatedBy("//a[contains(text(),'Tarifario')]");
    public static final Target BOTON_ABRIR_PDF = Target.the("Boton para abrir pdf Tarifas Cuentas Deposito")
            .locatedBy("//span[contains(text(),'Tarifas de Cuentas de Depósitos')]//following::img[1]");

}
