package Kotlin_define.class_onject_interface

import Kotlin_define.p

/**
 * Created by Administrator on 2017/8/23 0023.
 */

fun main(args: Array<String>) {

    val name = Name("beijing")
    p(name.address)
    name.address = "luo dun"
    p(name.address)

    val counter = lengthCounter()
    counter.addCount("ewqef")
    p(counter.counter)
    counter.addCount("ewqef111")
    p(counter.counter)
}


class Name(val name: String){
    var address : String = "china"
        set(value) {
            p("""
name is $name
$field was change -> $value
""".trimIndent())
            field = value
        }
}

class lengthCounter(){
    var counter : Int = 0
        private set

    fun addCount(value: String){
        counter += value.length
    }
}