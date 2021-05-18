
Feature: User's first contact with his Facebook profile
  As a lonely User
  In order to find new friends
  I want to login into Facebook

  """
  He querido recrear de la manera más fiel posible el escenario de tu ejemplo
  se me hace raro hacerlo en mezclando idiomas y por ello lo he tratado de traducir
  """

  Background:
    Given I navigate to the page "FacebookLoginPage"
    And   I close the modal "FacebookCookiesModal" by pressing the "Button_accept_all" element


  @Logintest
  Scenario: Successful login in Facebook
    Given a registered user
    When  at endpoint "LoginPage", into input field "mail", inserts the value "pepinillosolitario123@gmail.com"
    And   at endpoint "LoginPage", into input field "pass", inserts the value "p3p1n1ll0"
    And   at endpoint "LoginPage", clicks on "Entrar" button
    Then  at endpoint "LoginPage", the element "//div[@aria-label="Cuenta"]" is visible
    And   the text of the element "//div[@class="bcvklqu9 nzypyw8j"]" is "User, te damos la bienvenida a Facebook."
