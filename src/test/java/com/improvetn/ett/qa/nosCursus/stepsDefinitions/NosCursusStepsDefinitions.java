package com.improvetn.ett.qa.nosCursus.stepsDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.improvetn.ett.qa.nosCursus.pages.NosCursusPages;
import com.improvetn.ett.qa.utils.Setup;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.improvetn.ett.qa.utils.CommonMethods;


public class NosCursusStepsDefinitions extends CommonMethods {
// 
	public WebDriver driver;
	private NosCursusPages nosCursusPages = new NosCursusPages();
	private CommonMethods commonMethods = new CommonMethods();

	
	 public  NosCursusStepsDefinitions() {
			
			driver = Setup.driver;
			PageFactory.initElements(driver, NosCursusPages.class);

		    }
	 
	 @When("^I move the mouse to the menu Nos Cursus$")
	 public void iMoveTheMouseToTheMenuNosCursus() throws Throwable {
     
		 nosCursusPages.goToCursusMenu();
	 }

	 @Then("^I click on the sub menu Testeur logiciel et automatisation$")
	 public void iClickOnTheSubMenuTesteurLogicielEtAutomatisation() throws Throwable {
		 
	     logger.info("I click on the sub menu Testeur logiciel et automatisation");
		 nosCursusPages.goToSubMenuTestLogAut();
		 
	 }

	 @Then("^I  verify the page Testeur logiciel et automatisation$")
	 public void iVerifyThePageTesteurLogicielEtAutomatisation() throws Throwable {

	     logger.info("I verify the page Testeur logiciel et automatisation");
	     boolean textDisplayed = commonMethods.isElementDisplayed(NosCursusPages.txtTesteurLogauto);
			Assert.assertTrue(textDisplayed);
			
	 }

	 @Then("^I click on the button Pré inscription$")
	 public void iClickOnTheButtonPréInscription() throws Throwable {
		 
		  logger.info("I click on the button Pré inscription");
		  nosCursusPages.goToDemandeDevis();
	 }

	 @Then("^I  verify the page demander devis$")
	 public void iVerifyThePageDemanderDevis() throws Throwable {
	 
		 boolean textDisplayed = commonMethods.isElementDisplayed(NosCursusPages.txtDemandeDevis);
			Assert.assertTrue(textDisplayed);
			driver.navigate().back();
			driver.navigate().back();
	 }
	 
	 @Then("^I click on the sub menu Testeur Automaticien$")
	 public void iClickOnTheSubMenuTesteurAutomaticien() throws Throwable {

	     logger.info("I click on the sub menu Testeur Automaticien");
		 nosCursusPages.goToCursusMenu();
	     nosCursusPages.goToSubMenuTestAuto();

	 }

	 @Then("^I  verify the page Testeur Automaticien$")
	 public void iVerifyThePageTesteurAutomaticien() throws Throwable {
	    
	     logger.info("I  verify the page Testeur Automaticien");
	     boolean textDisplayed = commonMethods.isElementDisplayed(NosCursusPages.txtTesteurAuto);
			Assert.assertTrue(textDisplayed);
			driver.navigate().back();

	 }

	
	 @Then("^I click on the sub menu Développeur Full stack JS$")
	 public void iClickOnTheSubMenuDéveloppeurFullStackJS() throws Throwable {
	   
	     logger.info("I click on the sub menu Développeur Full stack JS");
	     nosCursusPages.goToCursusMenu();
	     nosCursusPages.goToSubMenuDevFullJs();
	 }

	 @Then("^I  verify the page Développeur Full stack JS$")
	 public void iVerifyThePageDéveloppeurFullStackJS() throws Throwable {
		 
	     logger.info("I  verify the page Développeur Full stack JS");
	     boolean textDisplayed = commonMethods.isElementDisplayed(NosCursusPages.txtDevFullStackJs);
			Assert.assertTrue(textDisplayed);
			driver.navigate().back();
		
	 }

	 @Then("^I click on the sub menu Développeur Applications Mobiles$")
	 public void iClickOnTheSubMenuDéveloppeurApplicationsMobiles() throws Throwable {
		 
	     logger.info("I click on the sub menu Développeur Applications Mobiles");
	     nosCursusPages.goToCursusMenu();
	     nosCursusPages.goToSubMenuDevAppliMobile();

	 }

	 @Then("^I  verify the page Développeur Applications Mobiles$")
	 public void iVerifyThePageDéveloppeurApplicationsMobiles() throws Throwable {
		 
	     logger.info("I  verify the page Développeur Applications Mobiles");
	     boolean textDisplayed = commonMethods.isElementDisplayed(NosCursusPages.txtDevAppMob);
			Assert.assertTrue(textDisplayed);
			driver.navigate().back();
	
	 }

	 @Then("^I click on the sub menu UX/UI Designer$")
	 public void iClickOnTheSubMenuUXUIDesigner() throws Throwable {
		 
	     logger.info("I click on the sub menu UX/UI Designer");
	     nosCursusPages.goToCursusMenu();
	     nosCursusPages.goToSubMenuUxUiDesigner();

	 }

	 @Then("^I  verify the page UX/UI Designer$")
	 public void iVerifyThePageUXUIDesigner() throws Throwable {
		 
	     logger.info("I  verify the page UX/UI Designer");
	     boolean textDisplayed = commonMethods.isElementDisplayed(NosCursusPages.txtUxUiDes);
			Assert.assertTrue(textDisplayed);
			driver.navigate().back();

	 }

	 @Then("^I click on the sub menu Marketing digital$")
	 public void iClickOnTheSubMenuMarketingDigital() throws Throwable {
		 
	     logger.info("I click on the sub menu Marketing digital");
	     nosCursusPages.goToCursusMenu();
	     nosCursusPages.goToSubMenuMarketingDig();

	 }

	 @Then("^I  verify the page Marketing digital$")
	 public void iVerifyThePageMarketingDigital() throws Throwable {
		 
	     logger.info("I  verify the page Marketing digital");
	     boolean textDisplayed = commonMethods.isElementDisplayed(NosCursusPages.txtMarketingDigital);
			Assert.assertTrue(textDisplayed);
			driver.navigate().back();
	   
	 }

	 @Then("^I click on the sub menu Responsable commerciale$")
	 public void iClickOnTheSubMenuResponsableCommerciale() throws Throwable {
		 
	     logger.info("I click on the sub menu Responsable commerciale");
	     nosCursusPages.goToCursusMenu();
	     nosCursusPages.goToSubMenuRespCommercial();

	 }

	 @Then("^I  verify the page Responsable commerciale$")
	 public void iVerifyThePageResponsableCommerciale() throws Throwable {
		 
	     logger.info("I  verify the page Responsable commerciale");
	     boolean textDisplayed = commonMethods.isElementDisplayed(NosCursusPages.txtResComm);
			Assert.assertTrue(textDisplayed);
			driver.navigate().back();
	   

	 }

	 @Then("^I click on the sub menu IT Acquisition Talent$")
	 public void iClickOnTheSubMenuITAcquisitionTalent() throws Throwable {
		 
	     logger.info("I click on the sub menu IT Acquisition Talent");
	     nosCursusPages.goToCursusMenu();
	     nosCursusPages.goToSubMenuAcquiTalent();


	 }

	 @Then("^I  verify the page IT Acquisition Talent$")
	 public void iVerifyThePageITAcquisitionTalent() throws Throwable {
		 
		 logger.info("I  verify the page IT Acquisition Talent");
		 boolean textDisplayed = commonMethods.isElementDisplayed(NosCursusPages.txtItAcquiTalent);
			Assert.assertTrue(textDisplayed);
			driver.navigate().back();
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
}
