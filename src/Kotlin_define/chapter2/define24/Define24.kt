package Kotlin_define.chapter2.define24

import Kotlin_define.p
import java.io.BufferedReader
import java.util.*

/**
 * Created by Administrator on 2017/8/15 0015.
 */

fun main(agrs : Array<String>){

    val treeMap = TreeMap<Char, String>()

    for (c in 'A'.. 'F'){
        val string = Integer.toBinaryString(c.toInt())
        treeMap[c] = string
    }

    for ((l , b) in treeMap){
        p("$l = $b")
    }

    for (a in 0 .. 5 ){
        p(a)
    }
    p("www" in setOf("www" , "wwws"))

    p(throwNum(8))
//    p(throwNum(-8))


}

fun throwNum(num : Int) : Int =
        if (num in 0.. 100)
            num
        else
            throw Exception("6666 $num")





