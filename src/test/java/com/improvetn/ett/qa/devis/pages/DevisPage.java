package com.improvetn.ett.qa.devis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class DevisPage {

	final static String BUTTON_Devis = "menu-item-181";
	final static String Title = "//h1[@class=\"title\"]";
	final static String Entreprise_VALUE = "//input[@value='Entreprise']";
	final static String Particulier_VALUE = "//input[@value='Particulier']";
	final static String TVAA_VALUE = "//input[@value=\"Assujettie à la TVA\"]";
	final static String TVAE_VALUE = "//input[@value=\"Exonérée de la TVA\"]";
	final static String Formation_NAME = "thme-formation";
	final static String nbrPersonne_NAME = "nombre_personnes";
	final static String Intra_VALUE = "//input[@value=\"Intra-Entreprise\"]";
	final static String Inter_VALUE = "//input[@value=\"Inter-Entreprise\"]";
	final static String DATA_NAME = "your-date";
	final static String NOM_NAME = "your-name";
	final static String TELEPHONE_NAME = "your-tel";
	final static String MAIL_NAME = "your-email";
	final static String JOB_NAME = "your-job";
	final static String COMPANY_NAME = "your-company";
	final static String Urgente_VALUE = "//input[@value='Urgente']";
	final static String Moyenne_VALUE = "//input[@value='Moyenne']";
	final static String Normale_VALUE = "//input[@value='Normale']";
	final static String Email_VALUE = "//input[@value='Email']";
	final static String TEL_VALUE = "//input[@value='Tél']";
	final static String Direct_VALUE = "//input[@value='Contact Direct']";
	final static String BUTTON_ENVOYER = "//input[@value=\"Envoyer\" ]";


	
	/* @FindBy */
	@FindBy(how = How.ID, using = BUTTON_Devis)
	public static WebElement btnDevis;
	
	@FindBy(how = How.XPATH, using = Title)
	public static WebElement TitleDevis;
	
	@FindBy(how = How.XPATH, using = Entreprise_VALUE)
	public static WebElement Entreprise;
	
	@FindBy(how = How.XPATH, using = Particulier_VALUE)
	public static WebElement Particulier;
	
	@FindBy(how = How.XPATH, using = TVAA_VALUE)
	public static WebElement TVAA;
	
	@FindBy(how = How.XPATH, using = TVAE_VALUE)
	public static WebElement TVAE;
	
	@FindBy(how = How.NAME, using = Formation_NAME)
	public static WebElement Formation;
	
	@FindBy(how = How.NAME, using = nbrPersonne_NAME)
	public static WebElement nbrPersonne;
	
	@FindBy(how = How.XPATH, using = Intra_VALUE)
	public static WebElement IntraE;
	
	@FindBy(how = How.XPATH, using = Inter_VALUE)
	public static WebElement IntreE;
	
	@FindBy(how = How.NAME, using = DATA_NAME)
	public static WebElement Date;
	
	@FindBy(how = How.NAME, using = NOM_NAME)
	public static WebElement Nom;
	
	@FindBy(how = How.NAME, using = TELEPHONE_NAME)
	public static WebElement Telephone;
	
	@FindBy(how = How.NAME, using = MAIL_NAME)
	public static WebElement Mail;
	
	@FindBy(how = How.NAME, using = JOB_NAME)
	public static WebElement Job;
	
	@FindBy(how = How.NAME, using = COMPANY_NAME)
	public static WebElement Company;
	
	@FindBy(how = How.XPATH, using = Urgente_VALUE)
	public static WebElement Urgente;
	
	@FindBy(how = How.XPATH, using = Moyenne_VALUE)
	public static WebElement Moyenne;
	
	@FindBy(how = How.XPATH, using = Normale_VALUE)
	public static WebElement Normale;
	
	@FindBy(how = How.XPATH, using = Email_VALUE)
	public static WebElement Email;
	
	@FindBy(how = How.XPATH, using = TEL_VALUE)
	public static WebElement TEL;

	@FindBy(how = How.XPATH, using = Direct_VALUE)
	public static WebElement Direct;
	
	@FindBy(how = How.XPATH, using = BUTTON_ENVOYER)
	public static WebElement Envoyer;
	
	/* Method */
	public void goToDevis() {
		btnDevis.click();
}
	
	public void clickToEntreprise() {
		Entreprise.click();
}
	
	public void clickToParticulier() {
		Particulier.click();
}
	
	public void clickToTVAA() {
		TVAA.click();
}
	
	public void clickToTVAE() {
		TVAE.click();
}
	
	public void SelectToFormation() {
		

}
	
	public void AjoutNombrePersonne(String nbr) {
		nbrPersonne.sendKeys(nbr);
}
	
	public void clickToIntraE() {
		IntraE.click();
}
	
	public void clickToIntreE() {
		IntreE.click();
}
	
	public void AjoutDate(String Dat) {
		Date.sendKeys(Dat);
}
	
	public void AjoutNomPrenom(String nom) {
		Nom.sendKeys(nom);
}
	
	public void AjoutTelephone(String telephone) {
		Telephone.sendKeys(telephone);
}
	
	public void AjoutEmail(String mail) {
		Mail.sendKeys(mail);
}
	
	public void SelectToJob(String job) {
		
		Job.sendKeys(job);
	
}
	public void AjoutEntreprise(String comp) {
		Company.sendKeys(comp);
}
	
	public void ClickToNormal() {
		Normale.click();
}
	
	public void ClickToTel() {
		TEL.click();
}
	public void ClickToMail() {
		Email.click();
}
	public void ClickToEnvoyer() {
		Envoyer.click();
}
}
