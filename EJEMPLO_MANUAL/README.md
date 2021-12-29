# Corresponsal no Bancario

Pruebas manuales de CNB con Serenity BDD

## Pre-requisitos
- Java JDK 1.8 (variables de entorno configuradas)
- Gradle v5.2.1 o superior (variables de entorno configuradas)
- Serenity BDD Cucumber + Screenplay
- IntelliJ o Eclipse IDE

## Pasos para configurar proyecto

- Clonar el repositorio con el siguiente comando: git clone ```https://dev.azure.com/banistmo/OLA%201/_git/cnb-app-corresponsal-funcional-test```
- Importar el proyecto de gradle ```CNB_MANUAL```

## Pruebas Diseñadas

- Pagos de Servicios Offline con Tdd
- Pagos de Servicios Online con Tdd
- Pagos de TDC usando TDD
- Retiro con TDD
- Retiro con Nequi

## Flujo para la ejecución de pruebas

1. Definir Estrategia de Ejecución
2. Ejecutar pruebas
3. Generar reporte
4. Guardar reporte de ejecución en item de Plan de Pruebas del Sprint

## Ejecutar Pruebas

- Ejecutar todas las pruebas ```gradle clean test aggregate```
  
- Ejecutar prueba por Runner ```gradle test --tests com.banistmo.certificacion.runners.RunnerPagoPrestamoTdd aggregate ```

## Como contribuir al proyecto

- La pruebas manuales de CNB en este repositorio es gestionada por la célula STARKS

## Crear Pruebas

1. Definir Story
2. Crear Flujo de la Funcionalidad 
    - Se deben almacenar los archivos (png, bpm) en ```src/test/resources/flujos```
3. Definir Escenario feliz de la mano con el negocio
4. Definir Escenarios alternos usando técnicas de diseño de caja negra
5. Crear runner para su ejecución

## Estructura del proyecto

* ```src/main/java```
``` 

+ co.com.banistmo.certificacion

    + Clase: ManualTest.java
    Clase con la se realiza la ejecucón manual de los pasos
    
````
* ```src/test/java```
``` 

+ co.com.banistmo.certificacion.runners
    Clases que permiten la ejecución de las pruebas. 

+ co.com.banistmo.certificacion.stepdefinitions
    Clases donde se acopla el lenguaje Gherkin con que se escriben los escenarios y el código java que va a ser ejecutado para la automatización. 

``` 
* ```src/test/resources```
``` 

+ features
    Archivos donde se escriben los escenarios o historias que lleva a cabo el usuario a nivel de negocio.  

````
## Versionamiento

- Versionamiento basado en Trunk Based Development 

## Autores

* **Javier A. Sandrea Sandrea** - *Automatizador* - [javier.sandrea@banistmo.com]



