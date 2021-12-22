package com.improvetn.ett.qa.devis.stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.improvetn.ett.qa.devis.pages.DevisPage;
import com.improvetn.ett.qa.utils.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DevisStepDefinitions {
	
	
	public WebDriver driver;
	private DevisPage devisPage = new DevisPage();
		
   public  DevisStepDefinitions() {
	
	driver = Setup.driver;
	PageFactory.initElements(driver, DevisPage.class);
    }


	@When("^je clique sur bouton Demander Devis$")
	public void je_clique_sur_bouton_Demander_Devis() throws Throwable {
	  
		devisPage.goToDevis();
		
	}

	@When("^je verifie que je suis dans la page demander devis$")
	public void je_verifie_que_je_suis_dans_la_page_demander_devis() throws Throwable {
		 assertEquals("Demander un devis", DevisPage.TitleDevis.getText());

	   
	}

	@When("^je coche Particulier$")
	public void je_coche_Particulier() throws Throwable {
		devisPage.clickToParticulier();
	    
	}

	@When("^je coche Exoneree de la TVA$")
	public void je_coche_Exoneree_de_la_TVA() throws Throwable {
		devisPage.clickToTVAE();
	}

	@When("^je choisie Tests de Logiciels$")
	public void je_choisie_Tests_de_Logiciels() throws Throwable {
		
		Select formation = new Select(driver.findElement(By.name("thme-formation")));
		formation.selectByVisibleText("Tests de Logiciels");
	    
	}

	@When("^j ajoute le nombre de participant\"([^\"]*)\"$")
	public void j_ajoute_le_nombre_de_participant(String nbrP) throws Throwable {
		devisPage.AjoutNombrePersonne(nbrP);
	}

	@When("^je coche Intra Entreprise$")
	public void je_coche_Intra_Entreprise() throws Throwable {
		devisPage.clickToIntraE();
	}

	@When("^j ajoute date de formation \"([^\"]*)\"$")
	public void j_ajoute_date_de_formation(String Date) throws Throwable {
		devisPage.AjoutDate(Date);
	}

	@When("^j ajoute nom et prenom \"([^\"]*)\"$")
	public void j_ajoute_nom_et_prenom(String nomP) throws Throwable {
		devisPage.AjoutNomPrenom(nomP);
	}

	@When("^j ajoute numero telephone \"([^\"]*)\"$")
	public void j_ajoute_numero_telephone(String tel) throws Throwable {
		devisPage.AjoutTelephone(tel);
	}

	@When("^j ajoute email\"([^\"]*)\"$")
	public void j_ajoute_email(String email) throws Throwable {
		devisPage.AjoutEmail(email);
	}

	@When("^je choisie \"([^\"]*)\"$")
	public void jeChoisie(String fonction) throws Throwable {
	   
		devisPage.SelectToJob(fonction);
	}

	@When("^j ajoute entreprise \"([^\"]*)\"$")
	public void j_ajoute_entreprise(String company) throws Throwable {
		devisPage.AjoutEntreprise(company);
	}

	@When("^je coche la priorite Normale$")
	public void je_coche_la_priorite_Normale() throws Throwable {
		devisPage.ClickToNormal();
	}

	@When("^je coche contacter par telephone et email$")
	public void je_coche_contacter_par_telephone_et_email() throws Throwable {
		devisPage.ClickToTel();
		devisPage.ClickToMail();
	}

	@Then("^je clique sur envoyer$")
	public void je_clique_sur_envoyer() throws Throwable {
		devisPage.ClickToEnvoyer();
	}

	@When("^je clique sur boutton envoyer$")
	public void jeCliqueSurBouttonEnvoyer() throws Throwable {
	  devisPage.ClickToEnvoyer();
	}

}
