package kotlin1

import java.util.*
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

/**
 * Created by Administrator on 2017/6/12 0012.
 */



fun main(args :Array<String>){




    //基础语法
    Basicgrammar()

}

fun Basicgrammar() {

    val name :String = "gao" //一次赋值 等同于final   <--->  val
    val name2 :String
    name2 = "gao2"

    val  other = 3  //自动哪个判断 类型
    val  other2 = "33"

    println("""name = $name
    name2 = $name2
    other = $other
    other2 = $other2""")


    var age :Int       // var 可变变量
    age = 4+6
    sop(age)


    sop("${name.replace("gao" , "lao")} , but is $name")

    sop("a  and b is max = ${maxOf(5 , 6)}")

    printProduct("2" , "4")
    printProduct("2" , "bb")
    printProduct("a3" , "b4")

    sop("判断类型 \"${getStringLen("1111")}\"")
    sop("判断类型 \"${getStringLen(1111)}\"")
    sop("判断类型 \"${getStringLen(listOf(Any()))}\"")

    //for 循环
    val listOf = listOf("apple ", "name ", "yellow")
    for (item in  listOf.indices){
        sop("item at $item is ${listOf[item]}")
    }


}

fun getStringLen(obj :Any) :Int ? {
    if (obj is String){
        return obj.length
    }

    return null
}

fun parseInt(str :String ): Int? {

    try {
       return str.toInt()
    }catch (e :Exception){
        return null
    }


}

fun printProduct(a :String , b :String){
    val m = parseInt(a)
    val n = parseInt(b)
   /* if (m != null && n != null) sop( m *n)
    else sop(" m = $m , n = $n")*/
    if (m == null){
        sop("m is null so  args1 = $a")
        return
    }
    if (n == null){
        sop("n is null so  args2 = $b")
        return
    }

    sop("  ${m * n}")

}

/* fun maxOf(a : Int , b : Int ) : Int{
     if (a > b ) {
         return  a
     }else{
         return b
     }

 }*/

fun  maxOf(a :Int , b :Int) = if (a > b ) a else b


fun sop(temp :Any) = println(temp)

