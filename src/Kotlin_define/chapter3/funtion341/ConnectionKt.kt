package Kotlin_define.chapter3.funtion341

import Kotlin_define.chapter2.define23.p

/**
 * Created by Administrator on 2017/8/22 0022.
 */

fun main(args: Array<String>) {

    val listOf = listOf("args", *args , "5555"  )
    p(listOf)
    mapOf(1.to("22") ,  2 to "223")

    lang("11" , "22" , "33")
    p("""this
    |is
    |gang
    """.trimMargin("|"))


}

fun lang(vararg  temp : String){
    for ((index , ele) in temp.withIndex()){
        p("$index = $ele")
    }
}
