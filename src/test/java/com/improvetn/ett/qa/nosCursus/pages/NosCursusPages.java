package com.improvetn.ett.qa.nosCursus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.improvetn.ett.qa.utils.Setup;

public class NosCursusPages {
	WebDriver driver;

	public NosCursusPages() {

		driver = Setup.driver;

	}

	/* @Constant */
	final static String MENU_NOSCURSUS = "menu-item-6024";
	final static String SUB_MENU_TESTEUR_LOGICIELS_AUTOMATISATION = "menu-item-6232";
	final static String SUB_MENU_TESTEUR_AUTOMATICIEN = "menu-item-6368";
	final static String SUB_MENU_DEV_FULL_STACK_JS = "menu-item-6237";
	final static String SUB_MENU_DEV_APPLI_MOBILES = "menu-item-6240";
	final static String SUB_MENU_UX_UI_DESIGNER = "menu-item-6336";
	final static String SUB_MENU_MARKETING_DIGITAL = "menu-item-6248";
	final static String SUB_MENU_RES_COMM = "menu-item-6243";
	final static String SUB_MENU_IT_ACQUISITION_TALENT = "menu-item-6249";
	final static String BTN_PRES_INSCRIPTION = "//a[@class='button button__link button_size_2 button_js']";

	// TODO you have to change the xpath adsolute by id or by relative xpath
	final static String TXT_TESTEUR_LOGICIELS_AUTOMATISATION = "//*[@id=\"Subheader\"]/div/div/h1";
	final static String TXT_DEMANDE_DEVIS = "//*[@id=\"Subheader\"]/div/div/h1";
	final static String TXT_TESTEUR_AUTOMATICIEN ="//*[@id=\"Subheader\"]/div/div/h1";
	final static String TXT_DEV_FULL_STACK_JS ="//*[@id=\"Subheader\"]/div/div/h1";
	final static String TXT_DEV_APPLI_MOBILES ="//*[@id=\"Subheader\"]/div/div/h1";
	final static String TXT_UX_UI_DESIGNER ="//*[@id=\"Subheader\"]/div/div/h1";
	final static String TXT_MARKETING_DIGITAL ="//*[@id=\"Subheader\"]/div/div/h1";
	final static String TXT_RES_COMM ="//*[@id=\"Subheader\"]/div/div/h1";
	final static String TXT_IT_ACQUISITION_TALENT ="//*[@id=\"Subheader\"]/div/div/h1";
	final static String TXT_PRES_INSCRIPTION ="//*[@id=\"Subheader\"]/div/div/h1";

	/* @FindBy */
	@FindBy(how = How.ID, using = MENU_NOSCURSUS)
	public static WebElement menuCursus;
	@FindBy(how = How.ID, using = SUB_MENU_TESTEUR_LOGICIELS_AUTOMATISATION)
	public static WebElement subMenuTestLog;
	@FindBy(how = How.ID, using = SUB_MENU_TESTEUR_AUTOMATICIEN)
	public static WebElement subMenuTestAut;
	@FindBy(how = How.ID, using = SUB_MENU_DEV_FULL_STACK_JS)
	public static WebElement subMenuDevFullJs;
	@FindBy(how = How.ID, using = SUB_MENU_DEV_APPLI_MOBILES)
	public static WebElement subMenuDevAppMob;
	@FindBy(how = How.ID, using = SUB_MENU_UX_UI_DESIGNER)
	public static WebElement subMenuuxUiDesigner;
	@FindBy(how = How.ID, using = SUB_MENU_MARKETING_DIGITAL)
	public static WebElement subMenumarketingDig;
	@FindBy(how = How.ID, using = SUB_MENU_RES_COMM)
	public static WebElement subMenuRespComme;
	@FindBy(how = How.ID, using = SUB_MENU_IT_ACQUISITION_TALENT)
	public static WebElement subMenuitAcquiTalent;
	@FindBy(how = How.XPATH, using = TXT_TESTEUR_LOGICIELS_AUTOMATISATION)
	public static WebElement txtTesteurLogauto;
	@FindBy(how = How.XPATH, using = BTN_PRES_INSCRIPTION)
	public static WebElement btnPresInscri;
	@FindBy(how = How.XPATH, using = TXT_DEMANDE_DEVIS)
	public static WebElement txtDemandeDevis;
	@FindBy(how = How.XPATH, using = TXT_TESTEUR_AUTOMATICIEN)
	public static WebElement txtTesteurAuto;
	@FindBy(how = How.XPATH, using = TXT_DEV_FULL_STACK_JS)
	public static WebElement txtDevFullStackJs;
	@FindBy(how = How.XPATH, using = TXT_DEV_APPLI_MOBILES)
	public static WebElement txtDevAppMob;
	@FindBy(how = How.XPATH, using = TXT_UX_UI_DESIGNER)
	public static WebElement txtUxUiDes;
	@FindBy(how = How.XPATH, using = TXT_MARKETING_DIGITAL)
	public static WebElement txtMarketingDigital;
	@FindBy(how = How.XPATH, using = TXT_RES_COMM)
	public static WebElement txtResComm;
	@FindBy(how = How.XPATH, using = TXT_IT_ACQUISITION_TALENT)
	public static WebElement txtItAcquiTalent;
	@FindBy(how = How.XPATH, using = TXT_PRES_INSCRIPTION)
	public static WebElement txtPresInscri;


	/* Method */
	public void goToCursusMenu() {

		Actions actions = new Actions(driver);
		actions.moveToElement(menuCursus).perform();

	}

	public void goToSubMenuTestLogAut() {

		subMenuTestLog.click();

	}

	public void goToSubMenuTestAuto() {

		subMenuTestAut.click();

	}

	public void goToSubMenuDevFullJs() {

		subMenuDevFullJs.click();

	}

	public void goToSubMenuDevAppliMobile() {

		subMenuDevAppMob.click();

	}

	public void goToSubMenuUxUiDesigner() {

		subMenuuxUiDesigner.click();

	}

	public void goToSubMenuMarketingDig() {

		subMenumarketingDig.click();

	}

	public void goToSubMenuRespCommercial() {

		subMenuRespComme.click();

	}

	public void goToSubMenuAcquiTalent() {

		subMenuitAcquiTalent.click();

	}
	
	public void goToDemandeDevis() {

		btnPresInscri.click();

	}

}
