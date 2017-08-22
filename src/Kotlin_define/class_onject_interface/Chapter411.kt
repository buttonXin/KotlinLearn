package Kotlin_define.class_onject_interface

import Kotlin_define.chapter2.define23.p

/**
 * Created by Administrator on 2017/8/22 0022.
 */

fun main(args: Array<String>) {

    Button().click()
    Button().showOff()
    Button().setFocues(true)

    val animated = UAnim() as Animated
    animated.ani()
}

class Outer{

    inner class Inner{
        fun getOuter():Outer = this@Outer
    }
}
class Outer1{

     class Inner1{
        fun getOuter():Outer = Outer()
    }
}

class UAnim :  Animated(){
    override fun animate() {

    }

    override fun anim() {
        super.anim()
    }

}

abstract class Animated{
    abstract fun animate()

    fun ani(){
        p("333333333")}

    open fun anim(){}
}

class Button : Click ,Focus{
    override fun click() {
        p("i is button")
    }

    override fun showOff() {
        super<Click>.showOff()
        super<Focus>.showOff()

    }



}

interface Click{
    fun click()

    fun showOff(){
        p("i is click showOff")
    }
}

interface Focus{
    fun setFocues(b : Boolean){
        p("i is ${if (b) "dui" else "cuo"}")
    }
    fun showOff(){
        p("i is focus showOff")
    }
}