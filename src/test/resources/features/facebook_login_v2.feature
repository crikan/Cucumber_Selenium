
Feature: User's first contact with his Facebook profile
As a lonely User
In order to find new friends
I want to login into Facebook
"""
  También me gustaría mostrarte cómo hubiera redactado este test si no hubiera contado con tus indicaciones.
  Yo habitualmente suelo utilizar el Given para situar la página de partida del test y así no tengo que indicarlo a cada paso
  La contra es que siempre debe haber un step que situe antes de que se usen los demás
  """

Background:
Given I navigate to the page "FacebookLoginPage"
And   I close the modal "FacebookCookiesModal" by pressing the "Button_accept_all" element


Scenario: Successful login in Facebook
Given The page "FacebookLoginPage" has loaded
When  I fill in "Login.insert_mail" with "Usersolitario123@gmail.com"
And   I fill in "pass" with "p3p1n1ll0"
And   I click on "entrar" button
Then  the element "//div[@aria-label="Cuenta"]" is visible
And   the text of the element "//div[@class="bcvklqu9 nzypyw8j"]" is "User, te damos la bienvenida a Facebook."

