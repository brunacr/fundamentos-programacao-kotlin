fun main() {
    /*
    *Crie variáveis para salvar os seguintes dados de uma pessoa:
    * 1. Nome
    * 2. Sobrenome
    * 3. Peso
    * 4. Altura
    * 5. Possui carro?
    * Em seguida imprima o valor na tela do computador.
    *
    * ********** Como criar uma variável? **********
    *
    * <var ou val> <nome_da_variavel> : <tipo_de_dado> = <valor_inicial>
    *
    */

    /*var ou val
    * var armazena valores mutavéis, enquanto val armazena valores imutáveis
    */
    val nome : String = "Maria"
    println("Nome: " + nome)

    //Inferência de Tipos
    var sobrenome = "Silva"
    println("Sobrenome: " + sobrenome)

    var peso : Double = 77.90
    println("Peso: " + peso)

    var altura : Float = 1.67f
    println("Altura: " + altura)

    var possui_carro : Boolean = false
    println("Possui carro: " + possui_carro)
}
