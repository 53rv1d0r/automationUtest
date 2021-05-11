# Autor: Manuel Alejandro Restrepo 71763120 4:40pm May 8th, 2021
# Autor: Manuel Alejandro Restrepo 71763120 8:00pm Mon May 10th, 2021
# Utest sign up automation proccess
@stories
Feature: Join Utest
  As a user i want to sign up to Utest platform
  @scenario1
  Scenario: Sign up to Utest platform
    Given than Alejandro wants to sign up at the Utest platform
      | strFName     | strLName      | strEmail |strDMonth |strDDay |strDYear | strLang  | strCity | strZipCode | strCountry | strOSystem | strOSVersion | strOSLanguage | strMobile | strMModel | strMOS | strPassword | strCPassword |
      | PrimerNombre | SegundoNombre | Email    | Month    | Day    | Year    | Language | City    | PostalCode | Country    | OSystem    | OSVersion    | OSLanguage    | Mobile    | MModel    | MOS    | Password    | CPassword    |
    When he signs in the welcome page
      | strEmail | strPassword  |
      | Email    | Password     |
    Then he access the main page
      | strEmail | strPassword  |
      | Email    | Password     |