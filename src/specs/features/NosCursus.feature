@nos-cursus
Feature: Our Cursus
  As a user I want to access the courses

  Scenario: - Verification Of Our Cursus Functionality
    Given I navigates to ExpertTeam
    When I move the mouse to the menu Nos Cursus
    And I click on the sub menu Testeur logiciel et automatisation
    Then I  verify the page Testeur logiciel et automatisation
    And I click on the button Pré inscription 
    Then I  verify the page demander devis
    And I click on the sub menu Testeur Automaticien
    Then I  verify the page Testeur Automaticien
    And I click on the sub menu Développeur Full stack JS
    Then I  verify the page Développeur Full stack JS
    And I click on the sub menu Développeur Applications Mobiles
    Then I  verify the page Développeur Applications Mobiles
    And I click on the sub menu UX/UI Designer
    Then I  verify the page UX/UI Designer
    And I click on the sub menu Marketing digital
    Then I  verify the page Marketing digital
    And I click on the sub menu Responsable commerciale
    Then I  verify the page Responsable commerciale
    And I click on the sub menu IT Acquisition Talent
    Then I  verify the page IT Acquisition Talent
