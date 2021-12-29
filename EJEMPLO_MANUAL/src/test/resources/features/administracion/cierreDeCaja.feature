# language: es
# encoding: UTF-8
@CierreCaja
Característica: Cierre de caja
    Yo como usuario de CNB
    Quiero realizar un cierre de caja
    Para conocer las transacciones que he realizado

    Antecedentes: Iniciar Sesión
        Dado que inicio sesión en CNB

    @pruebaManual
    Escenario: Cierre del caja por fecha
        Cuando realizo un cierre de caja con la fecha del dia
        Entonces se debe observar en el recibo todas las transacciones
        Y se debe observar la sumatoria correcta de débitos y créditos

    @pruebaManual
    Escenario: Cierre del caja desde ultimo cierre
        Cuando realizo un cierre de caja desde el ultimo cierre
        Entonces se debe observar en el recibo todas las transacciones
        Y se debe observar la sumatoria correcta de débitos y créditos desde el ultimo cierre