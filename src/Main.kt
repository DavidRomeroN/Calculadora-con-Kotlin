fun main() {

    var continuar = true
    while (continuar) {
        println("Ingrese un Número:")
        val Numero1 = readLine()?.toDoubleOrNull() ?: 0.0
        println("Ingrese otro Número:")
        val Numero2 = readLine()?.toDoubleOrNull() ?: 0.0

        println("Ingrese la operación: +, *, /, -")
        val Operador = readLine()

        val resultado = when (Operador) {
            "+" -> Numero1 + Numero2
            "*" -> Numero1 * Numero2
            "/" -> if (Numero2 != 0.0) Numero1 / Numero2 else "No se puede dividir entre 0"
            "-" -> Numero1 - Numero2
            else -> "Operador invalido"
        }

        println("El resultado es: $resultado ")
        println("Desea hacer otra operacion?: 1:Si , 2:No")
        val respuesta = readLine()

        if (respuesta != "1") {
            continuar = false
        }
    }

}
