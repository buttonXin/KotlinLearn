package Kotlin_define.class_onject_interface

import Kotlin_define.p

/**
 * Created by Administrator on 2017/8/23 0023.
 */
fun main(args: Array<String>) {

    val client = Client("name", 12)
    val client1 = Client("name", 12)
    p(client.equals(client1))

    p(hashSetOf(client).contains(client1))
    val client2 = client.copy(age = 4)
    p(client.copy(name = "6666"))
    p(client.equals(client2))

}

data class Client(val name: String , val age: Int){
//    override fun toString(): String {
//        return "Client( name = $name , age = $age)"
//    }
//
//    override fun equals(other: Any?): Boolean {
//        if (other == null || other !is Client)
//            return false
//        return name == other.name && age == other.age
//
//    }
//
//    override fun hashCode(): Int {
//        return name.hashCode() *31 + age
//    }
}