package Kotlin_define.chapter2.define25

import Kotlin_define.p
import java.io.BufferedReader
import java.io.StringReader

/**
 * Created by Administrator on 2017/8/15 0015.
 */

fun main(ada:Array<String>){

    readNumber(BufferedReader(StringReader("sgsg")))
}

fun readNumber(reader : BufferedReader){
    val num = try {
        Integer.parseInt(reader.readLine())

    }catch (e : Exception){
        "dasd ${reader.readLine()} "
    }

    p(num)
}