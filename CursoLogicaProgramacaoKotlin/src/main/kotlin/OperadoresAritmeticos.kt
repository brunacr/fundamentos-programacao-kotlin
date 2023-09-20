fun main() {

    //Int, Double e Float

    var a : Float = 2.toFloat()
    var b : Float = 3f
    var c : Int = 4
    var d : Double = 5.toDouble()
    var e : Float = 100f
    var f = 15

    //Adição e plus()
    var resultado_adicao : Int = 5+11
    println(resultado_adicao)
    resultado_adicao = 5.plus(10).plus(9)
    println(resultado_adicao)
    resultado_adicao = c.plus(f)
    println(resultado_adicao)

    //Subtração e minus()
    var resultado_sub : Float = c.minus(f).minus(e)
    resultado_sub = 10.minus(5f).minus(4f)
    resultado_sub = 10f-5f-4f
    println(resultado_sub)

    //Adição por incremento
    println(f)
    println(f++) //sufixo - altera o valor da variável na próxima iteração
    println(f)

    println(b)
    println(++b) //prefixo

    //Subtração por decremento
    println(f)
    println(f--)
    println(f)

    println(b)
    println(--b)

    //Divisão e div()
    //var resultado_div: Double = 4.6/2
    //println(resultado_div)
    //resultado_div = c.toDouble()/b.toDouble()

    var resultado_div = 4f.div(2)
    println(resultado_div)

    //Multiplicação e times()
    var resultado_mult = 4f*2*12*10
    println(resultado_mult)
    resultado_mult = 4.times(2.toFloat())
    println(resultado_mult)

    //Módulo
    var resultado_modulo = 5%3
    println(resultado_modulo)

}
