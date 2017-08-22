package Kotlin_define.bean

import java.util.*

/**
 * Created by Administrator on 2017/8/14 0014.
 */
class Rectbean (val height :Int , val width :Int) {
    val isSquare :Boolean
        get() = width == height



}
fun creatrRect():Rectbean{
    val ran = Random()
    return Rectbean(ran.nextInt() , ran.nextInt())
}
fun createWh():Int{
    return creatrRect().height
}

class Rect2(val height :Int , val width :Int)