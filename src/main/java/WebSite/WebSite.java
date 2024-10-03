package WebSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class WebSite {

    private static WebDriver driver;

    public WebSite(WebDriver driver) {
        WebSite.driver = driver;
    }

    public void navigateToWebsite(String url) throws InterruptedException {
        driver.get(url);

        // Use WebDriverWait para espera explícita (recomendado)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));  // Espere la carga básica de la página
    }
    //BANNER
    //validar Políticas de Privacidad
    public void validatePoliticasBanner(String urlEsperada, String nombreSeccion) throws InterruptedException {
        String handlePaginaActual = driver.getWindowHandle();
        driver.findElement(Locators.politicasbannerLink).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(handlePaginaActual)) {
                driver.switchTo().window(handle);
                String urlActual = driver.getCurrentUrl();

                if (urlActual.equals(urlEsperada)) {
                    System.out.println("URL correcta: " + urlActual + " " + nombreSeccion);
                    driver.close(); // Cerrar la ventana actual
                    driver.switchTo().window(handlePaginaActual); // Volver a la ventana inicial
                } else {
                    System.err.println("¡Error! La URL no coincide: " + urlActual);
                    driver.close(); // Cerrar la ventana actual
                    driver.switchTo().window(handlePaginaActual); // Volver a la ventana inicial
                }
            }
        }
    }
    //Validar Promociones y Novedades
    public void openPromociones() throws InterruptedException {
        driver.findElement(Locators.promoOpen).click();
        Thread.sleep(2000);
    }
    public void validatePromocionesBanner(String urlEsperada, String nombreSeccion) throws InterruptedException {
        String handlePaginaActual = driver.getWindowHandle();
        driver.findElement(Locators.promoLink).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(handlePaginaActual)) {
                driver.switchTo().window(handle);
                String urlActual = driver.getCurrentUrl();

                if (urlActual.equals(urlEsperada)) {
                    System.out.println("URL correcta: " + urlActual + " " + nombreSeccion);
                    driver.close(); // Cerrar la ventana actual
                    driver.switchTo().window(handlePaginaActual); // Volver a la ventana inicial
                } else {
                    System.err.println("¡Error! La URL no coincide: " + urlActual);
                    driver.close(); // Cerrar la ventana actual
                    driver.switchTo().window(handlePaginaActual); // Volver a la ventana inicial
                }
            }
        }
    }
    public void closePromociones() throws InterruptedException {
        driver.findElement(Locators.promoCerrar).click();
        Thread.sleep(1000);
    }

    //Ingresar datos
    public void inputFormularioBanner(String celular, String dni) {
        driver.findElement(Locators.inputb1Celular).sendKeys(celular);
        driver.findElement(Locators.inputb1DNI).sendKeys(dni);
    }
    public void submitLoquiero() throws InterruptedException {
        driver.findElement(Locators.loquieroButton).click();
        Thread.sleep(6000);
    }
    //Validación
    public String validarEnvioFormulario () {
        return driver.findElement(Locators.confirmationMessage).getText();
    }

    //PARRILLA DE PLANES
    //Acordeon
    public void Acordeon() throws InterruptedException {
        driver.findElement(Locators.IntVerBenef1).click();
        Thread.sleep(1000);
        driver.findElement(Locators.IntVerBenef2).click();
        Thread.sleep(1000);
        driver.findElement(Locators.IntVerBenef3).click();
        Thread.sleep(1000);
    }
    //Ingresar al plan
    public void quieroButton() throws InterruptedException {
        driver.findElement(Locators.quieroButton).click();
        Thread.sleep(6000);
    }
    //Validar Tratamiento de datos
    public void openTramiento() throws InterruptedException {
        driver.findElement(Locators.tratamOpen).click();
        Thread.sleep(2000);
    }
    public void validateTratamiento(String urlEsperada, String nombreSeccion) throws InterruptedException {
        String handlePaginaActual = driver.getWindowHandle();
        driver.findElement(Locators.politicasLink).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(handlePaginaActual)) {
                driver.switchTo().window(handle);
                String urlActual = driver.getCurrentUrl();

                if (urlActual.equals(urlEsperada)) {
                    System.out.println("URL correcta: " + urlActual + " " + nombreSeccion);
                    driver.close(); // Cerrar la ventana actual
                    driver.switchTo().window(handlePaginaActual); // Volver a la ventana inicial
                } else {
                    System.err.println("¡Error! La URL no coincide: " + urlActual);
                    driver.close(); // Cerrar la ventana actual
                    driver.switchTo().window(handlePaginaActual); // Volver a la ventana inicial
                }
            }
        }
    }
    public void closeTratamiento() throws InterruptedException {
        driver.findElement(Locators.promo2Cerrar).click();
        Thread.sleep(1000);
    }
    //Registrar un plan
    public void inputFormularioPlan(String dni, String celular) {
        driver.findElement(Locators.inputb1DNI1).sendKeys(dni);
        driver.findElement(Locators.inputb1Celular1).sendKeys(celular);
    }
    public void submitContacto() throws InterruptedException {
        driver.findElement(Locators.contactarButton).click();
        Thread.sleep(6000);
    }

    //Beneficios Movistar
    public void SolicitarButton() throws InterruptedException {
        driver.findElement(Locators.solicitarButton).click();
        Thread.sleep(2000);
    }
    public void SolicitaButton2() throws InterruptedException {
        driver.findElement(Locators.solicitarButton2).click();
        Thread.sleep(2000);
    }

    //Canales Exclusivos
//    public void CanalesExclusivos() throws InterruptedException {
//        driver.findElement(Locators.CanalesButton).click();
//        Thread.sleep(500);
//    }

    //Validar links
//    public void openTratamiento() throws InterruptedException {
//        driver.findElement(Locators.terminosCheck).click();
//        Thread.sleep(2000);
//        driver.findElement(Locators.terminosCheck).click();
//        Thread.sleep(1000);
//        driver.findElement(Locators.terminosLink).click();
//        Thread.sleep(2000);
//    }
//    public void validarPoliticas(String urlEsperada, String nombreSeccion) throws InterruptedException {
//        String handlePaginaActual = driver.getWindowHandle();
//        driver.findElement(Locators.terminosLink1).click();
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//
//        for (String handle : driver.getWindowHandles()) {
//            if (!handle.equals(handlePaginaActual)) {
//                driver.switchTo().window(handle);
//                String urlActual = driver.getCurrentUrl();
//
//                if (urlActual.equals(urlEsperada)) {
//                    System.out.println("URL correcta: " + urlActual + " " + nombreSeccion);
//                    driver.close(); // Cerrar la ventana actual
//                    driver.switchTo().window(handlePaginaActual); // Volver a la ventana inicial
//                } else {
//                    System.err.println("¡Error! La URL no coincide: " + urlActual);
//                    driver.close(); // Cerrar la ventana actual
//                    driver.switchTo().window(handlePaginaActual); // Volver a la ventana inicial
//                }
//            }
//        }
//    }
//    public void inputFormulario(String celular) {
//        driver.findElement(Locators.inputCelular).click();
//        driver.findElement(Locators.inputCelular).sendKeys(celular);
//    }
//    public void submitCanales() throws InterruptedException {
//        driver.findElement(Locators.registrarButton).click();
//        Thread.sleep(6000);
//    }

    //HERRAMIENTAS
    // Scroll
    public void scrollByPixels(int amount) throws InterruptedException {
        // Desplazar la ventana verticalmente por la cantidad especificada
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, " + amount + ")");
        Thread.sleep(4000);
    }
    //cerrar nodales
    public void closeModal() throws InterruptedException {
        driver.findElement(Locators.cerrarNodal).click();
        Thread.sleep(4000);
    }

    public void verLegales() throws  InterruptedException {
        driver.findElement(Locators.verTerminos).click();
        Thread.sleep(3000);
    }
}