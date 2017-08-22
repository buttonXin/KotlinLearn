package Kotlin_define.chapter3.funtion334_335

import Kotlin_define.chapter2.define23.p
import Kotlin_define.chapter3.funtion1_333.lastChar

/**
 * Created by Administrator on 2017/8/21 0021.
 */

fun main(agrs :Array<String>){

    val button: View = Button()
    button.click()

    button.show()

    p("Kotlin".lastChar())
    val sb = StringBuilder("kotlin ?")
    sb.lastChar = '!'
    p(sb)
}

open class View{
    open fun click()  = p("view click")
}

class Button : View() {


    override fun click()  = p(" button click")
}

fun View.show() = p("i is View")
fun Button.show() = p("i is Button")

var StringBuilder.lastChar : Char
        get() = get(length - 1)
        set(value : Char) {
            this.setCharAt(length - 1 , value)
        }