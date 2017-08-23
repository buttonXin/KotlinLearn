package Kotlin_define.class_onject_interface

import Kotlin_define.p

/**
 * Created by Administrator on 2017/8/23 0023.
 */
fun main(args: Array<String>) {
    p(Yong.getUsername("dsad@123.111").name)
    p(Yong.getFb(56).name)

    p(Person.fromJson("{name: 'Dmitry'}").name)
    p(Person.Loader.fromJson("{name: 'Dmitry'}").name)
    p(Person.funJson("6666").name)
}

class Yong private constructor(val name: String){
    companion object{
        fun getUsername(email: String) = Yong(email.substringBefore("@"))

        fun getFb(id: Int) = Yong(getFbname(id))
    }
}

fun getFbname(id : Int): String = "$id = id"

class Person(val name: String){
    companion object Loader{
        fun fromJson(text: String): Person = Person(text)
    }
}

fun Person.Loader.funJson(text: String) : Person = Person(text)