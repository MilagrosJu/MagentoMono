import WebSite.Locators;
import SetUp.SetUp;
import WebSite.WebSite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExcuteTest {

    private static WebDriver driver;
    private static WebSite webSite;

    public static void main(String[] args) throws InterruptedException {
        driver = SetUp.getDriver();
        webSite = new WebSite(driver);

        // Variables Standaroup
        String url = "https://tiendaonline.movistar.com.pe/ofertas/servicioshogar/magento-mono";
        String celular = "999999999";
        String dni = "99999999";

        webSite.navigateToWebsite(url);
        //Banner Principal
        webSite.validatePoliticasBanner("https://centrodetransparencia.movistar.com.pe/politica-local-privacidad", "BANNER POLÍTICAS Y PRIVACIDAD");
        webSite.openPromociones();
        webSite.validatePromocionesBanner("https://centrodetransparencia.movistar.com.pe/derechos", "BANNER PROMOCIONES Y NOVEDADES");
        webSite.closePromociones();
        webSite.inputFormularioBanner(celular, dni);
        webSite.submitLoquiero();
        webSite.validarEnvioFormulario();
        String mensajeInternet = webSite.validarEnvioFormulario();
        if (mensajeInternet.equals("¡Gracias por contactarnos!")) {
            System.out.println("Prueba exitosa: Se verificó el mensaje de confirmación BANNER");
        } else {
            System.out.println("Prueba fallida: El mensaje de confirmación no es el esperado");
        }
        webSite.closeModal();

        webSite.scrollByPixels(Locators.scrollAmount);

        //Parrilla de Planes
        webSite.Acordeon();
        webSite.quieroButton();
        webSite.openTramiento();
        webSite.validateTratamiento("https://centrodetransparencia.movistar.com.pe/politica-local-privacidad", "POLITICA DE PRIVACIDAD");
        webSite.closeTratamiento();
        webSite.inputFormularioPlan(dni, celular);
        webSite.submitContacto();
        webSite.validarEnvioFormulario();
        String mensajeInternet2 = webSite.validarEnvioFormulario();
        if (mensajeInternet2.equals("¡Gracias por contactarnos!")) {
            System.out.println("Prueba exitosa: Se verificó el mensaje de confirmación PARRILLA DE PLANES - INTERNET");
        } else {
            System.out.println("Prueba fallida: El mensaje de confirmación no es el esperado");
        }
        webSite.closeModal();
        webSite.Acordeon();

        webSite.scrollByPixels(Locators.scroll2Amount);

        //BENEFICIOS MOVISTAR
        webSite.SolicitarButton();
        webSite.scrollByPixels(Locators.scroll2Amount);
        webSite.scrollByPixels(Locators.scrollAmount);
        webSite.SolicitaButton2();
        webSite.scrollByPixels(Locators.scroll2Amount);
        webSite.scrollByPixels(Locators.scrollAmount);

        //CANALES EXCLUSIVOS
//        webSite.CanalesExclusivos();
//        webSite.openTratamiento();
//        webSite.validarPoliticas("https://centrodetransparencia.movistar.com.pe/politica-local-privacidad", "CANALES EXCLUSIVOS");
//        webSite.closeModal();
//        webSite.inputFormulario(celular);
//        webSite.submitLoquiero();
//        String mensajeInternet2 = webSite.validarPedido();
//        if (mensajeInternet.equals("¡Gracias por contactarnos!")) {
//            System.out.println("Prueba exitosa: Se verificó el mensaje de confirmación INTERNET FIBRA");
//        } else {
//            System.out.println("Prueba fallida: El mensaje de confirmación no es el esperado");
//        }
//        webSite.closeModal();

        //Términos y condiciones
        webSite.verLegales();
        webSite.verLegales();

        SetUp.closeDriver();
    }
}
