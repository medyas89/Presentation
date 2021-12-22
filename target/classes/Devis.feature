Feature: Devis - Experteam
  En tant que utilisateur je souhaite demander un devis de formation

  @Devis
  Scenario: Creer Devis sans captcha
    Given J ouvre le site ExpertTeam
    When je clique sur bouton Demander Devis
    And je verifie que je suis dans la page demander devis
    And je coche Particulier
    And je coche Exoneree de la TVA
    And je choisie Tests de Logiciels
    And j ajoute le nombre de participant"6"
    And je coche Intra Entreprise
    And j ajoute date de formation "15/11/2021"
    And j ajoute nom et prenom "nouha jendoubi"
    And j ajoute numero telephone "21456987"
    And j ajoute email"test@gmail.com"
    And je choisie "Salarié"
    And j ajoute entreprise "ExpertTeam"
    And je coche la priorite Normale
    And je coche contacter par telephone et email
    Then je clique sur envoyer

  @Devis2
  Scenario: Creer Devis - Donnees vide
    Given J ouvre le site ExpertTeam
    When je clique sur bouton Demander Devis
    And je clique sur boutton envoyer
