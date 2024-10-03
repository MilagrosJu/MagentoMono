package WebSite;

import org.openqa.selenium.By;

public class Locators {
    //Definiendo Scroll
    public static final int scrollAmount = 530; // Cantidad de píxeles a desplazar
    public static final int scroll1Amount = 220; // Cantidad de píxeles a desplazar
    public static final int scroll2Amount = 1000; // Cantidad de píxeles a desplazar

    //Banner principal
    public static final By politicasbannerLink = By.xpath("/html/body/div[3]/section/swiper-container/swiper-slide/div/div/div[1]/form/div[2]/div[1]/div/label/a");// Identificador del enlace políticas
    public static final By promoOpen = By.xpath("/html/body/div[3]/section/swiper-container/swiper-slide/div/div/div[1]/form/div[2]/div[2]/div/label/span"); // Identificador del enlace promociones
    public static final By promoLink = By.xpath("/html/body/div[6]/div[2]/div/div/div[2]/a"); //Identificador de enlace
    public static final By promoCerrar = By.xpath("/html/body/div[6]/div[2]/span"); // Identificador del cerrar promociones
    public static final By inputb1DNI = By.xpath("/html/body/div[3]/section/swiper-container/swiper-slide/div/div/div[1]/form/div[1]/div[2]/input"); // Identificador del campo DNI
    public static final By inputb1Celular = By.xpath("/html/body/div[3]/section/swiper-container/swiper-slide/div/div/div[1]/form/div[1]/div[1]/input"); // Identificador del campo Celular
    public static final By loquieroButton = By.xpath("/html/body/div[3]/section/swiper-container/swiper-slide/div/div/div[1]/form/div[3]/button"); // Identificador del botón Lo quiero

    //Acordeon Planes
    public static final By IntVerBenef1 = By.xpath("/html/body/div[3]/section/div[2]/swiper-container/swiper-slide[1]/div/div[6]/div");
    public static final By IntVerBenef2 = By.xpath("/html/body/div[3]/section/div[2]/swiper-container/swiper-slide[2]/div/div[6]/div");
    public static final By IntVerBenef3 = By.xpath("/html/body/div[3]/section/div[2]/swiper-container/swiper-slide[3]/div/div[4]/div");

    //Planes De Internet
    public static final By quieroButton = By.xpath("/html/body/div[3]/section/div[2]/swiper-container/swiper-slide[2]/div/div[4]/div[3]/button");
    public static final By tratamOpen = By.xpath("/html/body/div[6]/div[2]/div/div/div[2]/form/div[3]/div/div/label/span"); // Identificador del enlace tratamientos
    public static final By politicasLink = By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/a"); //Identificador de enlace
    public static final By promo2Cerrar = By.xpath("/html/body/div[7]/div[2]/span"); // Identificador de cerrar tratamiento
    public static final By inputb1DNI1 = By.xpath("/html/body/div[6]/div[2]/div/div/div[2]/form/div[1]/label/div/input"); // Identificador del campo DNI
    public static final By inputb1Celular1 = By.xpath("/html/body/div[6]/div[2]/div/div/div[2]/form/div[2]/label/div/input"); // Identificador del campo Celular
    public static final By contactarButton = By.xpath("/html/body/div[6]/div[2]/div/div/div[2]/form/div[4]/div/button"); // Identificador del botón Lo quiero

    //Botones de beneficio Movistar
    public static final By solicitarButton = By.xpath("/html/body/div[3]/section/div[4]/div[2]/a");
    public static final By solicitarButton2 = By.xpath("/html/body/div[3]/section/div[5]/div[2]/a");


    //Mini banner Exclusivos - NO HABILITADO
//    public static final By CanalesButton = By.xpath("/html/body/div[3]/section/div[5]/div[2]/div/button");
//    public static final By inputCelular = By.xpath("/html/body/div[3]/section/div[5]/div[2]/div/form/div[2]/label/div[1]/input");
//    public static final By registrarButton = By.xpath("/html/body/div[3]/section/div[5]/div[2]/div/form/div[2]/label/div[2]/div/button"); // Identificador del botón

    //Ver Politicas - NO HABILITADO
//    public static final By terminosCheck = By.xpath("/html/body/div[3]/section/div[5]/div[2]/div/form/div[3]/div/div[1]/input");
//    public static final By terminosLink = By.xpath("/html/body/div[3]/section/div[5]/div[2]/div/form/div[3]/div/div[1]/label/span");
//    public static final By terminosLink1 = By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/a");

    //Cerrar nodal
    public static final By cerrarNodal = By.xpath("/html/body/div[6]/div[2]/span/img");
    //mensaje de confirmación
    public static final By confirmationMessage = By.xpath("/html/body/div[6]/div[2]/div/div/div/h3");

    //Legales
    public static final By verTerminos = By.xpath("/html/body/div[3]/section/div[6]/div/div[1]");
    }
