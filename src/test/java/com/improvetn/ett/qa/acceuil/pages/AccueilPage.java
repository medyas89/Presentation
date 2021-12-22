package com.improvetn.ett.qa.acceuil.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.improvetn.ett.qa.utils.Setup;

public class AccueilPage {
	WebDriver driver;

	public AccueilPage() {
		driver = Setup.driver;
	}

	final static String BUTTON_ACCUEIL = "menu-item-142";
	final static String BUTTON_EN_SAVOIR_PLUS_CURSUS = "slide-51-layer-2";
	final static String BUTTON_EN_SAVOIR_PLUS_TEST = "slide-52-layer-1";
	final static String BUTTON_INSCRIPTION = "slide-53-layer-2";
	final static String NOS_VALEURS = "//strong[contains(text(),'Nos Valeurs')]";
	final static String MESSAGE_PORKOI_EXPERTEAM = "//h1[contains(text(),'Pourquoi Expert Team ?')]";
	final static String IMG_NOS_VALEURS = "//img[@src='https://www.expertunisie.com/wp-content/uploads/2019/11/expert-3.png']";
	final static String METIERS_DAVENIR = "//a[@href='https://www.expertunisie.com/index.php/cursus-testeur-fonctionnel/']";
	final static String TEXT_CURSUS_TESTEUR_FONCTIONNELS = "//h1[contains(text(),'Cursus Testeur Fonctionnel')]";
	final static String INPUT_MAIL = "//input[@class='tnp-email']";
	final static String CHEKED = "//input[@type='checkbox']";
	final static String BUTTON_SABONNER = "//input[@class='tnp-submit']";
	
	// TODO you have to change the xpath adsolute by id or by relative xpath
	final static String IMG_EXPERTEST = "//*[@id=\"logo\"]";
	final static String TEST_lOGICIELS = "//*[@id=\"Content\"]/div/div/div/div[1]/div/div[2]/div/div[2]/div/div/div/a";
	final static String INGEN_LOGICIELS = "//*[@id=\"Content\"]/div/div/div/div[1]/div/div[2]/div/div[3]/div/div/div/a";
	final static String DEV_APPL = "//*[@id=\"Content\"]/div/div/div/div[1]/div/div[2]/div/div[4]/div/div/div/a";
	final static String GESTION_PROJET = "//*[@id=\"Content\"]/div/div/div/div[1]/div/div[2]/div/div[5]/div/div/div/a";
	final static String Txt_Nbre_Demaine = "//*[@id=\"Content\"]/div/div/div/div[1]/div/div[1]/div/div[3]/div";
	final static String IMG_NOS_CURSUS = "//a[contains(@href,'cursus')]";

	
	
	/* @FindBy */
	
	@FindBy(how = How.ID, using = BUTTON_ACCUEIL)
	public static WebElement btnACC;
	@FindBy(how = How.ID, using = BUTTON_EN_SAVOIR_PLUS_CURSUS)
	public static WebElement btnSPC;
	@FindBy(how = How.ID, using = BUTTON_EN_SAVOIR_PLUS_TEST)
	public static WebElement btnSPT;
	@FindBy(how = How.ID, using = BUTTON_INSCRIPTION)
	public static WebElement btnSPI;
	@FindBy(how = How.XPATH, using = IMG_EXPERTEST)
	public static WebElement imgEXPT;
	@FindBy(how = How.XPATH, using = Txt_Nbre_Demaine)
	public static WebElement txtDomaine;
	@FindBy(how = How.XPATH, using = IMG_NOS_CURSUS)
	public static WebElement imgCursus;
	@FindBy(how = How.XPATH, using = TEST_lOGICIELS)
	public static WebElement imgTestLog;
	@FindBy(how = How.XPATH, using = INGEN_LOGICIELS)
	public static WebElement ingLog;
	@FindBy(how = How.XPATH, using = DEV_APPL)
	public static WebElement devApp;
	@FindBy(how = How.XPATH, using = GESTION_PROJET)
	public static WebElement gesPro;
	@FindBy(how = How.XPATH, using = NOS_VALEURS)
	public static WebElement nosValeurs;
	@FindBy(how = How.XPATH, using = MESSAGE_PORKOI_EXPERTEAM)
	public static WebElement messagePkExp;
	@FindBy(how = How.XPATH, using = METIERS_DAVENIR)
	public static WebElement metiersDavenir;
	@FindBy(how = How.XPATH, using = TEXT_CURSUS_TESTEUR_FONCTIONNELS)
	public static WebElement txtCursusTesteurFonctionnels;
	@FindBy(how = How.XPATH, using = INPUT_MAIL)
	public static WebElement sendMail;
	@FindBy(how = How.XPATH, using = CHEKED)
	public static WebElement chek;
	@FindBy(how = How.XPATH, using = BUTTON_SABONNER)
	public static WebElement btnSabonner;

	/* Method */
	public void goToAccueil() {
		btnACC.click();
	}

	public void goToCursus() {

		btnSPC.click();

	}

	public void goToExperTest() {

		btnSPT.click();

	}

	public void goToInscription() {

		btnSPI.click();

	}

	public void clickImgCursus() {

		imgCursus.click();

	}

	public void clickImgTestLogiciels() {

		imgTestLog.click();

	}

	public void clickImgIngenierieLogiciels() {

		ingLog.click();

	}

	public void clickImgDeveloppementApplication() {

		devApp.click();

	}

	public void clickImgGestionProjet() {

		gesPro.click();

	}

	public void goToNosValeurs() {

		nosValeurs.click();

	}

	public void goToMetiersDavenir() {

		metiersDavenir.click();

	}
	public void fillMail(String s) {

		sendMail.sendKeys(s);

	}
	public void cheked() {

		chek.click();

	}
	public void clikBtn() {

		btnSabonner.click();

	}
}
