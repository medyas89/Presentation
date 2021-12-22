package com.improvetn.ett.qa.calendrier.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CalendrierPage {
	
	
	final static String BUTTON_Calendrier = "menu-item-259";
	final static String Title_Calendrier = "//h1[@class=\"title\"]";
	final static String DateEvent = "tribe-bar-date";
	final static String Jour = "//li[@id='tribe-bar-views-option-day']";
	final static String Liste = "//li[@id='tribe-bar-views-option-day']";
	final static String Mois = "//li[@id='tribe-bar-views-option-day']";
	final static String Fleche = "//button[@id='tribe-bar-views-toggle']";
	final static String Formation_Selenium = "//a[@href=\"https://www.expertunisie.com/voir_formation/testeur-selenium-a4q-formation-en-ligne/\"]";
	final static String Button_Devis = "//a[@href=\"https://www.expertunisie.com/index.php/demander-un-devis/\"]";
	final static String dateFormation = "//h3[contains(text(),'5,6 et 12, 13 Septembre 2020')]";



	/* @FindBy */
	@FindBy(how = How.ID, using = BUTTON_Calendrier)
	public static WebElement btnCalendrier;
	
	@FindBy(how = How.XPATH, using = Title_Calendrier)
	public static WebElement TitleCalendrier;

	@FindBy(how = How.ID, using = DateEvent)
	public static WebElement Date;

	@FindBy(how = How.XPATH, using = Jour)
	public static WebElement jour;
	
	@FindBy(how = How.XPATH, using = Liste)
	public static WebElement liste;
	
	@FindBy(how = How.XPATH, using = Mois)
	public static WebElement mois;
	
	@FindBy(how = How.XPATH, using = Fleche)
	public static WebElement fleche;
	
	@FindBy(how = How.XPATH, using = Button_Devis)
	public static WebElement Devis;
	
	@FindBy(how = How.XPATH, using = Formation_Selenium)
	public static WebElement formationS;
	
	@FindBy(how = How.XPATH, using = dateFormation)
	public static WebElement DateformationS;
	
	/* Method */
	public void goToCalendrier() {
		btnCalendrier.click();
}
	
	public void selectDate(String dat) {
		Date.clear();
		Date.sendKeys(dat);
		Date.sendKeys(Keys.ENTER);
}
	
	public void SelectList() {
		fleche.click();
		liste.click();
		
}
	public void goToFormation() {
		formationS.click();
}
	
	public void goToDevis() {
		Devis.click();
}

}
