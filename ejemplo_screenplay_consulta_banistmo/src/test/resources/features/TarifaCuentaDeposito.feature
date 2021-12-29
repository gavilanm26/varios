#Author: Juan David Galeano
Feature: Tarifas de cuenta de deposito
  Yo como usuario de banistmo
  Deseo ingresar al portal banistmo personas
  para abrir pdf de tarifas

  @PDFTarifasCuentasDeposito
  Scenario: Descargar PDF Tarifas cuentas deposto
    Given Ingreso a portal personas banistmo
    When ingreso a la opcion tarifario para abrir PDF
    Then Verifico que el pdf se abra correctamente