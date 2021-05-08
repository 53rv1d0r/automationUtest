# Autor: Manuel Alejandro Restrepo 71763120 8 de Mayo 2021 4:40pm
@stories
Feature: Academy Utest
  As a user i want to learn how to use Utest at the Utest Academy
  @scenario1
  Scenario: Search for introduction to utest course
    Given than Alejandro wants to learn use utest at the Utest Academy
      | strUser   | strPassword  |
      | TuUsuario | TuClave      |
    When he search for the course on the Utest Academy platform
      | strCourse             |
      | Introduction to uTest |
    Then he finds the course called
      | strCourse             |
      | Introduction to uTest |