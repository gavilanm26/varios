#Author: Juan David Galeano
Feature: Reto Bancolombia
  Yo como usuario de los servicios de Tocumen
  Deseo ingresar a la seccion de Viajar con menores
  para acceder a la pagina de migración

  @IngresoViajarConMenores
  Scenario: Ingresar a Viajar con menores
    Given Ingreso a Tocumen Panama
    When Accedo a Viajar con menores
    Then Verifico Pagina web