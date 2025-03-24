fun main() {
    do {
        val numero1 = pedirNumero("Ingrese un número:")
        val numero2 = pedirNumero("Ingrese otro número:")
        val operador = pedirOperador()

        val resultado = calcular(numero1, numero2, operador)
        println("El resultado es: $resultado")

        print("¿Desea hacer otra operación? (1: Sí, 2: No): ")
        val respuesta = readLine()
    } while (respuesta == "1")

}

fun pedirNumero(mensaje: String): Double {
    print("$mensaje ")
    return readLine()?.toDoubleOrNull() ?: 0.0
}

fun pedirOperador(): String {
    print("Ingrese la operación (+, -, *, /): ")
    return readLine() ?: ""
}

fun calcular(num1: Double, num2: Double, operador: String): Any {
    return when (operador) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) num1 / num2 else "No se puede dividir entre 0"
        else -> "Operador inválido"
    }
}

