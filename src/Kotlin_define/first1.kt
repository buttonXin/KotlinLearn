package Kotlin_define

import Kotlin_define.bean.Colore
import Kotlin_define.bean.Rect2
import Kotlin_define.bean.createWh
import Kotlin_define.bean.creatrRect
import Kotlin_define.bean.Colore.*



/**
 * Created by Administrator on 2017/8/11 0011.
 */


    data class People(val name :String , val age : Int?  = null)

    fun main(args : Array<String>){
        val peoples = listOf<People>(People("666" ) , People("333" , 24))

        val old = peoples.maxBy { it.age ?: 0  }
        println("the old is ${old}")


        p(creatrRect().isSquare)
        p(createWh())

        p(Rect2(50 ,23).height)

        p("")
        //mei ju
        p(Colore.BLACK.rgb())
        p(Colore.WHITH.rgb())

        p("mei ju \n")
        p(useWhen(BLACK))
        p(useWhen(WHITH))
        p(useWhen(RED))
        p(useWhen(ORANGE))
//
//        p("")
//
//        p(useWhen(WHITH , RED))
//        p(useWhen(WHITH , BLACK))
//        p(useWhen(WHITH , ORANGE))

        p("")
        p(useWhenNotArgs(RED , WHITH))
        p(useWhenNotArgs(BLACK , WHITH))
        p(useWhenNotArgs(BLACK , ORANGE))


    }

fun p(any: Any?){
    println(any)
}

fun useWhen(col : Colore): String{

    return when(col){
        BLACK ,/*-> "black gaga"*/
        WHITH ,/*-> "whith 22"*/
        RED -> "red 22"
        ORANGE -> "0000"

    }
}
fun useWhen(col : Colore , col2 :Colore): String{

    return when(setOf(col , col2)){
        setOf(RED , WHITH)  -> "0000"
        setOf(RED , ORANGE)  -> "111"
        setOf(WHITH , ORANGE)  -> "222"
        setOf(BLACK , ORANGE)  -> "333"
        else -> throw Exception("6666")

    }
}

fun useWhenNotArgs(c1 :Colore , c2 :Colore) =
        when{
            (c1 == RED && c2 == WHITH ||
                    c1 == WHITH && c2 == BLACK)
                    -> "not 111"
            (c1 == ORANGE && c2 == WHITH ||
                    c1 == RED && c2 == BLACK)
            -> "not 222"
            (c1 == BLACK && c2 == WHITH ||
                    c1 == WHITH && c2 == BLACK)
            -> "not 333"
            else -> throw Exception("6666666666")
        }





