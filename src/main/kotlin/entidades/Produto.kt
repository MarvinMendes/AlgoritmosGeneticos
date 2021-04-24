package entidades

class Produto(val nome: String, val espaco: Double, val valor: Double) {

    override fun toString(): String {
        return "Nome do Produto: $nome - Espaço em m³ $espaco - Valor: R$$valor"
    }
}