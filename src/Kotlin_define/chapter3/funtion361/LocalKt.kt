package Kotlin_define.chapter3.funtion361

import Kotlin_define.chapter2.define23.p

/**
 * Created by Administrator on 2017/8/22 0022.
 */

fun main(args: Array<String>) {

    saveUser(User(10 , "rr" , "ww"))
    saveUser(User(10 , "rr" , "ww"))
//    saveUser(User(10 , "rr" , ""))
    saveUser(User(10 , "" , "sss"))
}

class User(val age: Int , val name: String , val add: String)



fun saveUser(user: User){

    user.checkNull()

    p("ok")

}

fun User.checkNull(){

    fun isNull(value: String , fieldName: String){
        if (value.isEmpty()){
            throw Exception("User age is $age and  $fieldName is empty")
        }
    }
    isNull(name , "name")
    isNull(add , "add")
}