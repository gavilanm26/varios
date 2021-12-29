package co.com.tocumen.certificacion.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import java.util.ArrayList;

public class ViajandoConMenoresPage extends PageObject {
    public static final Target BUTTON_SERVICIOS = Target.the("Boton ingreso universidad choucair").located(By.xpath("//a[contains(text(),'SERVICIOS')]"));
    public static final Target BUTTON_IFNOVIAJERO = Target.the("Boton ingreso universidad choucair").located(By.xpath("//a[contains(text(),'Información del Viajero')]"));
    public static final Target BUTTON_OBJETOS = Target.the("Boton ingreso universidad choucair").located(By.xpath("//a[contains(text(),'Viajando con Menores')]"));
   public static final Target BUTTON_POLITICAS = Target.the("Boton ingreso universidad choucair").located(By.xpath("(//a[contains(text(),'Servicio Nacional de Migración')])[1]"));

public  void CambiarVentana(){
    ArrayList<String> ventanaNueva = new ArrayList<String>(getDriver().getWindowHandles());
    getDriver().switchTo().window(ventanaNueva.get(1));
}

}
