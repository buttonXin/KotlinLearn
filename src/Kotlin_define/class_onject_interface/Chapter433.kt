package Kotlin_define.class_onject_interface

import Kotlin_define.p
import java.util.*

/**
 * Created by Administrator on 2017/8/23 0023.
 */
fun main(args: Array<String>) {

    val delegate = Delegate<Int>()
    delegate.addAll(listOf(1, 2, 3))
    p("${delegate.count} delegate.count    ${delegate.size} ")
}

class Delegate<T> ( val inner : MutableCollection<T> = HashSet<T>())
    : MutableCollection<T> by inner{

    var count = 0
    override fun add(element: T): Boolean {
        count++
        return inner.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        count += elements.size
        return inner.addAll(elements)
    }


}

class DelegaCollect<T> : Collection<T>{
    private val inner = arrayListOf<T>()

    override fun containsAll(elements: Collection<T>): Boolean {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isEmpty(): Boolean {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun iterator(): Iterator<T> {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun contains(element: T): Boolean {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override val size: Int
        get() = inner.size

}