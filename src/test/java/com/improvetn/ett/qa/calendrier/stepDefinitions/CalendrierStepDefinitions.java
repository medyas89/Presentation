package com.improvetn.ett.qa.calendrier.stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.improvetn.ett.qa.calendrier.pages.CalendrierPage;
import com.improvetn.ett.qa.devis.pages.DevisPage;
import com.improvetn.ett.qa.utils.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalendrierStepDefinitions {
	
	
	public WebDriver driver;
	private CalendrierPage calendrierPage = new CalendrierPage();
		
   public  CalendrierStepDefinitions() {
	
	driver = Setup.driver;
	PageFactory.initElements(driver, CalendrierPage.class);
    }
   
   
   @When("^je clique sur bouton Calendrier des formations$")
   public void je_clique_sur_bouton_Calendrier_des_formations() throws Throwable {
	   
	   calendrierPage.goToCalendrier();
       
   }

   @When("^je verifier que le mois affiche est le mois en cour$")
   public void je_verifier_que_le_mois_affiche_est_le_mois_en_cour() throws Throwable {
      
		 assertEquals("Évènements en novembre 2021", CalendrierPage.TitleCalendrier.getText());

   }

   @When("^je choisie le mois du decembre\"([^\"]*)\"$")
   public void jeChoisieLeMoisDuDecembre(String mois) throws Throwable {
	   calendrierPage.selectDate(mois);
   }

   @Then("^la liste des formations du decembre s affiche$")
   public void la_liste_des_formations_du_decembre_s_affiche() throws Throwable {
       
   }

   @Then("^je clique sur la formation Testeur selenium A(\\d+)Q$")
   public void je_clique_sur_la_formation_Testeur_selenium_A_Q(int arg1) throws Throwable {
	  
	   WebDriverWait wait = new WebDriverWait(driver,30);
	   wait.until(ExpectedConditions.elementToBeClickable(CalendrierPage.formationS));
	   calendrierPage.goToFormation();
   }

   @Then("^je verifier la description de la formation$")
   public void je_verifier_la_description_de_la_formation() throws Throwable {
		
	   assertEquals("É5,6 et 12, 13 Septembre 2021", CalendrierPage.DateformationS.getText());
     

   }

   @Then("^je clique sur demander un devis$")
   public void je_clique_sur_demander_un_devis() throws Throwable {
	  
	   calendrierPage.goToDevis();

   }

}
