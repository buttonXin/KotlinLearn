package Kotlin_define.chapter2.define23


import sun.security.provider.Sun

/**
 * Created by Administrator on 2017/8/15 0015.
 */
interface Expr {}

class Num (val value : Int) : Expr

class Sum (val left : Expr ,val right : Expr ) : Expr


fun main(agre : Array<String>){
    //(1+2)+4


    p( eval(Sum( Sum(Num(1) , Num(2)) ,Num(8)) )  )
    p( eval1(Sum( Sum(Num(1) , Num(2)) ,Num(9)) )  )
}


fun  eval(e : Expr) : Int{
    if (e is Num) {
        val value = e as Num
        return value.value
    }
    if (e is Sum) {
        return eval(e.left) + eval(e.right)
    }

    throw IllegalAccessException("Un known")
}

fun eval1(e: Expr) : Int =
       /* if (e is Num) {
            e.value
        } else if (e is Sum) {
            eval(e.left) + eval(e.right)
        }else{
            throw IllegalAccessException("Un known")
        }*/
    when(e){
        is Num -> e.value
        is Sum -> eval1(e.left) + eval1(e.right)
        else -> throw Exception("56666")
    }

fun p(any: Any){
    println(any)
}