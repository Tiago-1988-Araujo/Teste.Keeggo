#Author: tiagobaraujo4103@gmail.com

@executa
    Feature: Realizar Cadastro e Login de Usuario
       Eu como usuario quero acessar os site e realizar Cadastro e Login de usuario
 
 
    Background: Acessar site
       Given que eu esteja no site "http://advantageonlineshopping.com/#/"

    Scenario Outline: Realizar Cadastro e Login
        When realizar <realizar>
         Then eu valido o <validar>
         
    Examples: 
      | realizar           |validar             |
      | Cadastro Usuario   |Cadastro Usuario   |
      | Login com Sucesso  |Login com Sucesso  |
      | Login Invalido     |Login Invalido     |
      | Login em Branco    |Login em Branco    |
