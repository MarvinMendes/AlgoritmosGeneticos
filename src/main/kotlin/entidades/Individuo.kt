package entidades

import kotlin.random.Random

class Individuo(val espacos: Int, val valores: Double, val limiteEspacos: Double,
                val geracao: Long =0, val notaAvaliacao: Double = 0.0) {

    var cromossomo: Array<String?> = arrayOfNulls(espacos)
    fun randomiza() {
        for (i in 0.. espacos -1)
        {
            if ((0..1).random() < 0.5) {
                cromossomo[i] = "0"
             }
            else{
                cromossomo[i] = "1"
            }
        }
        cromossomo.forEach { println(it) }
    }
}