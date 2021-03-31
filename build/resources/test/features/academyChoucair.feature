#Autor Julian Garzon
  @stories

  Feature: Academy Choucair
    As a user, I want to learn how to automate in screenplay at the choucair academy with the automation course

  @scenario1

  Scenario: Search for the automation course
    Given Than Julian wants to learn automation at the academy choucair
    | strUser   | strPassword   |
    | 1073700583| Choucair2021* |
    When He search for the course on the choucair academy platform
    | strCourse             |
    | Foundation Express    |
    Then he finds the course called resources
    | strCourse             |
    | Foundation Express    |