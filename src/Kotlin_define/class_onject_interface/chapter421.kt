package Kotlin_define.class_onject_interface

import Kotlin_define.p

/**
 * Created by Administrator on 2017/8/22 0022.
 */

fun main(args: Array<String>) {

    p(User("qqq").name)
    p(User1("wwww").name1)
    p(User1("qqqq").copy(name1 = "333").name1)

}



class User (_name : String){
   val name = _name

}

data class User1 (val name1: String){
}

open class Button1

class Text : Button1()

open class View{
    constructor(cox: Button1)
    constructor(cox: Button1 , cox1: Button1)
}

class Box : View{

    constructor(cox: Button1) : super(cox){

    }
    constructor(cox: Button1, cox1: Button1) : super(cox, cox1)
}