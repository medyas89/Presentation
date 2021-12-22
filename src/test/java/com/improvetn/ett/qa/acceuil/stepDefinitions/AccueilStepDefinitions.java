package com.improvetn.ett.qa.acceuil.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.improvetn.ett.qa.acceuil.pages.AccueilPage;
import com.improvetn.ett.qa.utils.CommonMethods;
import com.improvetn.ett.qa.utils.Setup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccueilStepDefinitions extends CommonMethods {
	public WebDriver driver;
	private AccueilPage acceuilPage = new AccueilPage();
	private CommonMethods commonMethods = new CommonMethods();

	public AccueilStepDefinitions() {

		driver = Setup.driver;
		PageFactory.initElements(driver, AccueilPage.class);
	}

	@Given("^I navigates to ExpertTeam$")
	public void iNavigatesToExpertTeam() throws Throwable {

		logger.info("J ouvre le site ExpertTeam");
		commonMethods.openURLWithConfigFile("url1");

	}

	@Then("^I check the home page$")
	public void i_check_the_home_page() throws Throwable {

		logger.info("^Je verifie l ouverture de site est effectue$");
		String url1 = commonMethods.readUrl();
		String actualUrl = driver.getCurrentUrl();
		Assert.assertTrue(actualUrl.equals(url1));

	}

	@When("^I click on the button en savoir plus cursus$")
	public void i_click_on_the_button_en_savoir_plus_cursus() throws Throwable {

		logger.info("^I click on the button en savoir plus cursus$");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(AccueilPage.btnSPC));
		acceuilPage.goToCursus();
		driver.navigate().back();

	}

	@When("^I click on the button en savoir plus ExperTest$")
	public void i_click_on_the_button_en_savoir_plus_ExperTest() throws Throwable {

		logger.info("^I click on the button en savoir plus ExperTest$");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(AccueilPage.btnSPT));
		acceuilPage.goToExperTest();
		commonMethods.scrollerBottomdown(400);

	}

	@Then("^I check  site expertest is opening$")
	public void i_check_site_expertest_is_opening() throws Throwable {

		logger.info("^I check  site expertest is opening$");
		Assert.assertTrue(isElementDisplayed(AccueilPage.imgEXPT));
		driver.navigate().back();

	}

	@Then("^I click on the button Inscription$")
	public void i_click_on_the_button_Inscription() throws Throwable {

		logger.info("^I click on the button Inscription$");
		commonMethods.switchHandles();
		commonMethods.scrollerBottomup();
		logger.info("^je clique sur le bouton Inscription$");
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(AccueilPage.btnSPI));
		acceuilPage.goToInscription();
		commonMethods.scrollerBottomdown(400);
		driver.navigate().back();

	}

	@When("^I check section \"([^\"]*)\"$")
	public void i_check_section(String TxtDomaine) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBePresentInElement(AccueilPage.txtDomaine, TxtDomaine));
		String sectionDomaineFormation = AccueilPage.txtDomaine.getText();
		Assert.assertTrue(sectionDomaineFormation.equals(TxtDomaine));
	}

	@Then("^I click on  domaine Cursus de Formation$")
	public void i_click_on_domaine_Cursus_de_Formation() throws Throwable {

		logger.info("^je verifie la domaine Cursus de Formation$");
		acceuilPage.clickImgCursus();
		driver.navigate().back();
	}

	@Then("^I click on domaine TestLogiciel de Formation$")
	public void i_click_on_domaine_TestLogiciel_de_Formation() throws Throwable {

		logger.info("^je verifie la domaine TestLogiciel de Formation$");
		commonMethods.scrollerBottomdown(750);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(AccueilPage.imgTestLog));
		acceuilPage.clickImgTestLogiciels();
		driver.navigate().back();
	}

	@Then("^I click on domaine Ingenierie des exigences de Formation$")
	public void i_click_on_domaine_Ingenierie_des_exigences_de_Formation() throws Throwable {

		logger.info("^je verifie la domaine Ingenierie des exigences de Formation$");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(AccueilPage.imgTestLog));
		acceuilPage.clickImgIngenierieLogiciels();
		driver.navigate().back();

	}

	@Then("^I click on domaine Dévelepements Applications$")
	public void i_click_on_domaine_Dévelepements_Applications() throws Throwable {

		logger.info("^je verifie la domaine Dévelepements Applications$");
		acceuilPage.clickImgDeveloppementApplication();
		driver.navigate().back();
	}

	@Then("^I click on domaine Gestion de Projet$")
	public void i_click_on_domaine_Gestion_de_Projet() throws Throwable {

		logger.info("^I click on domaine Gestion de Projet$");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(AccueilPage.gesPro));
		acceuilPage.clickImgGestionProjet();
		driver.navigate().back();

	}

	@When("^I click on page Nos Valeurs$")
	public void i_click_on_page_Nos_Valeurs() throws Throwable {

		acceuilPage.goToNosValeurs();

	}

	@Then("^I check page nos valeurs is open$")
	public void i_check_page_nos_valeurs_is_open() throws Throwable {

		commonMethods.scrollerBottomdown(100);
		Assert.assertTrue(isElementDisplayed(AccueilPage.messagePkExp));

	}

	@When("^I click on page Des Metiers d avenir$")
	public void i_click_on_page_Des_Metiers_d_avenir() throws Throwable {

		acceuilPage.goToMetiersDavenir();

	}

	@Then("^J I check page Des Metiers d avenir is open$")
	public void j_I_check_page_Des_Metiers_d_avenir_is_open() throws Throwable {

		commonMethods.scrollerBottomdown(100);
		Assert.assertTrue(isElementDisplayed(AccueilPage.txtCursusTesteurFonctionnels));

	}

	@When("^I enter a  mail \"([^\"]*)\"$")
	public void i_enter_a_mail(String mail) throws Throwable {

		acceuilPage.fillMail(mail);

	}

	@When("^I click in chekbox$")
	public void i_click_in_chekbox() throws Throwable {

		acceuilPage.cheked();

	}

	@When("^I click on the  boutton sabonner$")
	public void i_click_on_the_boutton_sabonner() throws Throwable {

		acceuilPage.clikBtn();

	}

}