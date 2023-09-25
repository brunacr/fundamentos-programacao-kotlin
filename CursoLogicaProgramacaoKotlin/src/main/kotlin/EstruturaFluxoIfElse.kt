fun main() {

    println("Informe a primeira nota: ")
    val n1: Double = readln().toDouble()

    println("Informe a segunda nota: ")
    val n2: Double = readln().toDouble()

    println("Informe a terceira nota: ")
    val n3: Double = readln().toDouble()

    println("Primeira nota: $n1")
    println("Segunda nota: $n2")
    println("Terceira nota: $n3")

    val media: Double = (n1 + n2 + n3) / 3
    println("Média das notas: $media")

    if (media >= 7) {
       println("Aluno aprovado!")
    } else {
        println("Aluno reprovado!")
    }
}