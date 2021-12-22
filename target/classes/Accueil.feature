@accueil
Feature: Accueil - Experteam
  ETQ utilisateur je souhaite de acceder a la page Accueil

  Background: 
     Given I navigates to ExpertTeam

    Then I check the home page 

  @accueil-slider
  Scenario: Accueil-Slider
    When I click on the button en savoir plus cursus
    And I click on the button en savoir plus ExperTest
    Then I check  site expertest is opening
    And I click on the button Inscription

  @accueil-domaine-formation
  Scenario: Accueil-Section les Domaines De Formations
    When I check section "Plus que 50 Formations dans 5 Domaines de formation"
   Then I click on  domaine Cursus de Formation
    And I click on domaine TestLogiciel de Formation
    And I click on domaine Ingenierie des exigences de Formation
    And I click on domaine Dévelepements Applications
    And I click on domaine Gestion de Projet

  @accueil-nos-valeurs
  Scenario: Accueil-Nos Valeurs
    When  I click on page Nos Valeurs
    Then  I check page nos valeurs is open

    
    
   @accueil-metier-avenir
 Scenario: Accueil-metier-avenir
  When  I click on page Des Metiers d avenir
  Then J I check page Des Metiers d avenir is open
  When I enter a  mail "test@test.com"
  And  I click in chekbox 
   And I click on the  boutton sabonner

 