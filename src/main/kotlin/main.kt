import entidades.Individuo
import entidades.Produto
import java.util.Collections


fun main(args: Array<String>) {
    var produtos = arrayListOf<Produto>()
    produtos.add(
        Produto("Geladeira Eletrolux", espaco = 0.751, valor = 999.90)
    )
    produtos.add(
        Produto("Iphone 12", espaco = 0.751, valor = 2911.12)
    )
    produtos.add(
        Produto("TV 55", espaco = 0.400, valor = 4346.99)
    )
    produtos.add(
        Produto("TV 50", espaco = 0.290, valor = 3999.90)
    )
    produtos.add(
        Produto("TV 42", espaco = 0.200, valor = 2999.00)
    )
    produtos.add(
        Produto("Notebook Acer", espaco = 0.00350, valor = 2499.90)
    )
    produtos.add(
        Produto("Ventilador Eletrolux", espaco = 0.496, valor = 199.90)
    )
    produtos.add(
        Produto("Microondas Eletrolux", espaco = 0.0424, valor = 308.66)
    )
    produtos.add(
        Produto("Microondas LG", espaco = 0.0544, valor = 429.90)
    )
    produtos.add(
        Produto("Microondas Samsung", espaco = 0.0319, valor = 299.29)
    )
    produtos.add(
        Produto("Geladeira Brastemp", espaco = 0.635, valor = 849.90)
    )
    produtos.add(
        Produto("Geladeira Consul", espaco = 0.870, valor = 1199.80)
    )
    produtos.add(
        Produto("Notebook Lenovo", espaco = 0.498, valor = 1999.90)
    )
    produtos.add(
        Produto("Notebook Asus", espaco = 0.527, valor = 3999.00)
    )

    produtos.forEach({ println(it) })
    var individuo = Individuo(3, 10.000, 2.0, 1, 1.0)
    individuo.randomiza()
}