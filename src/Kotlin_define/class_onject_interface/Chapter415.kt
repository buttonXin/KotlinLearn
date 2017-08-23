package Kotlin_define.class_onject_interface

import Kotlin_define.p


/**
 * Created by Administrator on 2017/8/22 0022.
 */

fun main(args: Array<String>) {

    p(cacu(Expr.Num(3)))
    p( cacu(Expr.Sum(Expr.Sum(Expr.Num(2), Expr.Num(5)), Expr.Num(4))) )


}

sealed class Expr{

    class Num(val num : Int ) : Expr()

    class Sum(val left : Expr , val right: Expr) : Expr()

}

fun cacu(e : Expr): Int =
        when(e){
            is Expr.Num ->e.num
            is Expr.Sum -> cacu(e.left) + cacu(e.right)
        }


/*fun cacu(e : Expr): Int =
    when(e){
        is Num ->e.num
        is Sum -> cacu(e.left) + cacu(e.right)
        else ->{
            throw Exception("xxxxxxx")
        }
    }


interface Expr{}

class Num(val num: Int) :Expr

class Sum(val left: Expr , val right : Expr) : Expr*/
