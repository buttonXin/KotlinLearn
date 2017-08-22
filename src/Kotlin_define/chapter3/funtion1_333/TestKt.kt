package Kotlin_define.chapter3.funtion1_333
import Kotlin_define.chapter3.funtion1_333.addName as last

import Kotlin_define.p
import javafx.scene.control.Separator

/**
 * Created by Administrator on 2017/8/21 0021.
 */

const val UNIX = "\n";

fun main(agrs :Array<String>){


    val setOf = hashSetOf(1, 3, 33)

    val listOf = arrayListOf(1, 3, 44)

    val mapOf = hashMapOf(1 to "one", 2 to "33", 55 to " rwqrqw")

//    p(setOf.javaClass)
//    p(listOf.javaClass)
//    p(joinToString(listOf ,separator =  "," , prefix = "(", postfix = ")"))
//    p(joinToString(listOf ))
//    p(joinToString(listOf , "?"))
//    p(joinToString(listOf , separator = "_" , postfix = "<---"))

    p("kotlin".lastChar())

    p(Pelple("name" , 3).last())

    p(listOf.joinToString1("  "))

}

class Pelple (var name: String, var age : Int){

}

fun <T> Collection<T>.joinToString1(  separator: String = ",",
                                     prefix: String  = "",
                                     postfix: String = ""
                                ): String{

    val sb = StringBuilder(prefix)

    for ((index , ele) in this.withIndex()){
        if (index > 0 ) sb.append(separator)
        sb.append(ele)
    }

    sb.append(postfix)

    return sb.toString()
}

fun Pelple.addName() : String = "name =  $name, age = $age"

fun String.lastChar() : Char = get(length - 1)



fun <T> joinToString(collection: Collection<T> ,
                     separator: String = ",",
                     prefix: String  = "",
                     postfix: String = ""
):String{

    val sb = StringBuilder(prefix)

    for ((index , ele) in collection.withIndex()){
        if (index > 0 ) sb.append(separator)
        sb.append(ele)
    }

    sb.append(postfix)

    return sb.toString()
}



