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
<<<<<<< HEAD
=======
        String horario = "2024-10-03 10:00:00"; //Se debe actualizar la fecha
>>>>>>> 1c12bbd3e491364a0717e897c4668da98ee07a60

        webSite.navigateToWebsite(url);
<<<<<<< HEAD
        //Banner Principal
        webSite.validatePoliticasBanner("https://centrodetransparencia.movistar.com.pe/politica-local-privacidad", "BANNER POLÍTICAS Y PRIVACIDAD");
        webSite.openPromociones();
        webSite.validatePromocionesBanner("https://centrodetransparencia.movistar.com.pe/derechos", "BANNER PROMOCIONES Y NOVEDADES");
        webSite.closePromociones();
=======
//        webSite.validate20DTO("https://centrodetransparencia.movistar.com.pe/politica-local-privacidad", "POPUP 20% DTO"); // Replace with the link URL
//        webSite.selectLegal20DTO();
//        webSite.inputFormulatio20DTO(celular, dni);
//        WebSite.selectHorario20DTO(horario);
//        webSite.submitPedido20DTO();
//        String mensaje20DTO = webSite.validatePedido20STO();
//        if (mensaje20DTO.equals("¡Gracias por contactarnos!")) {
//            System.out.println("Prueba exitosa: Se verificó el mensaje de confirmación M20%");
//        } else {
//            System.out.println("Prueba fallida: El mensaje de confirmación no es el esperado");
//        }
//        webSite.closeModal20DTO();

        // Popup DELIVERY
        webSite.validateTerminosDelivery("https://www.movistar.com.pe/movil/postpago/portabilidad?utm_source=%28direct%29&amp;utm_medium=%28none%29&amp;utm_campaign=%28direct%29&amp;utm_content=undefined&amp;utm_term=undefined&amp;gclid=&amp;_gl=1*14w1h6w*_gcl_au*MTYxOTMzODg0OS4xNzIxMjM3NzA5*_ga*NDkzMTU1NjI0LjE3MjEyMzc3MDk.*_ga_8Q7MD06RY0*MTcyMTMzMTE0MS43LjEuMTcyMTMzMTE2Ni4zNS4wLjA.#portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_jb7ddqEUWB7j", "POPUP DELIVERY"); // Replace with the link URL
        webSite.openFormularioDelivery();
        webSite.validatePoliticas("https://centrodetransparencia.movistar.com.pe/politica-local-privacidad", "POPUP DELIVERY"); // Replace with the link URL
        webSite.selectPromNove();
        webSite.selectRestricciones();
        webSite.inputFormulario(celular, dni);
        WebSite.selectHorario(horario);
        webSite.submitPedido();
        String mensajeDelivery = webSite.validarPedido();
        if (mensajeDelivery.equals("¡Gracias por contactarnos!")) {
            System.out.println("Prueba exitosa: Se verificó el mensaje de confirmación MDELIVERY");
        } else {
            System.out.println("Prueba fallida: El mensaje de confirmación no es el esperado");
        }
        webSite.closeModal();
        webSite.closeModalDelivery();

        // Banner
        //webSite.cerrarModales(); //Quitar en grupo
        webSite.selecB1Bullet(1);
        webSite.validatePoliticasBanner("https://centrodetransparencia.movistar.com.pe/politica-local-privacidad", "BANNER"); // Replace with the link URL
        webSite.selectPromNoveBanner();
>>>>>>> 1c12bbd3e491364a0717e897c4668da98ee07a60
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
