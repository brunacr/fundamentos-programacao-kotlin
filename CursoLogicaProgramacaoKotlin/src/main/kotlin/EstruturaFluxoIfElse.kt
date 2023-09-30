fun main() {

    /*println("Informe a primeira nota: ")
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

    println("------")

    val altura_atleta = 1.75
    val idade_atleta = 24
    val sexo_atleta = "F"

    val condicao_altura = altura_atleta >= 1.75
    val condicao_idade = idade_atleta >= 18 && idade_atleta <= 24
    val condicao_sexo = sexo_atleta == "F"

    if (! (altura_atleta >= 1.75)) {
        println("Atleta não atingiu a altura necessária para a seleção do time.")
    }

    if (! condicao_idade) {
        println("O atleta não tem a idade necessária para a seleção do time.")
    }

    if (! (sexo_atleta == "F")) {
        println("O sexo do atleta não corresponde ao desejado para seleção do time.")
    }

    if (condicao_altura && condicao_idade && condicao_sexo) {
        println("Atleta selecionado.")
    } else {
        println("Atleta não selecionado.")
    }*/

    val segunda: String = "seg"
    val terca: String = "ter"
    val quarta: String = "qua"
    val quinta: String = "qui"
    val sexta: String = "sex"
    val sabado: String = "sab"
    val domingo: String = "dom"

    val dia = sexta

    if (dia == sabado || dia == domingo) {
        println("Dia de descanso.")
    } else {
        println("Dia de trabalho.")
    }

}