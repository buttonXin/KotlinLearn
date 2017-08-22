package Kotlin_define.bean

/**
 * Created by Administrator on 2017/8/14 0014.
 */
enum class Colore(val a: Int,val  b: Int) {

    RED(200, 8) , WHITH(200, 8), BLACK(230, 8), ORANGE(200, 8) ;


    fun rgb():Int = a + b
}