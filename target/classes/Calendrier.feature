
@Calendrier
Feature: Title of your feature
En tant que utilisateur je veux acceder a la calendrier des formations

  Scenario: Consulter la liste des formations pour le mois de decembre par liste 
    Given  J ouvre le site ExpertTeam
    When   je clique sur bouton Calendrier des formations
    And    je verifier que le mois affiche est le mois en cour   
    And    je choisie le mois du decembre"12/2021"
    Then   la liste des formations du decembre s affiche
    And    je clique sur la formation Testeur selenium A4Q
    And    je verifier la description de la formation
    And    je clique sur demander un devis
    And    je verifie que je suis dans la page demander devis
    
